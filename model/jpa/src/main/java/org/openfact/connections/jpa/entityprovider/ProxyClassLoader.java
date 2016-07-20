package org.openfact.connections.jpa.entityprovider;

import java.net.URL;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * Classloader implementation to facilitate loading classes and resources from a collection of other classloaders.
 * Effectively it forms a proxy to one or more other classloaders.
 * 
 * The way it works:
 * - Get all (unique) classloaders from all provided classes
 * - For each class or resource that is 'requested':
 *   - First try all provided classloaders and if we have a match, return that
 *   - If no match was found: proceed with 'normal' classloading in 'current classpath' scope
 * 
 * In this particular context: only loadClass and getResource overrides are needed, since those
 * are the methods that a classloading and resource loading process will need.
 */
public class ProxyClassLoader extends ClassLoader {

    private Set<ClassLoader> classloaders;

    public ProxyClassLoader(Collection<Class<?>> classes, ClassLoader parentClassLoader) {
    	super(parentClassLoader);
    	init(classes);
    }
    
    public ProxyClassLoader(Collection<Class<?>> classes) {
    	init(classes);
    }

    private void init(Collection<Class<?>> classes) {
        classloaders = new HashSet<>();
        for (Class<?> clazz : classes) {
            classloaders.add(clazz.getClassLoader());
        }
    }
    
    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        for (ClassLoader classloader : classloaders) {
            try {
                return classloader.loadClass(name);
            } catch (ClassNotFoundException e) {
                // This particular class loader did not find the class. It's expected behavior that
                // this can happen, so we'll just ignore the exception and let the next one try.
            }
        }
        // We did not find the class in the proxy class loaders, so proceed with 'normal' behavior.
        return super.loadClass(name);
    }

    @Override
    public URL getResource(String name) {
        for (ClassLoader classloader : classloaders) {
            URL resource = classloader.getResource(name);
            if (resource != null) {
                return resource;
            }
            // Resource == null means not found, so let the next one try.
        }
        // We could not get the resource from the proxy class loaders, so proceed with 'normal' behavior.
        return super.getResource(name);
    }

}
