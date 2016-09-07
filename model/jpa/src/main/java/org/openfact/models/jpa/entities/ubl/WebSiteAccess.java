package org.openfact.models.jpa.entities.ubl;

/**
 * A class to describe access to a web site.
 * 
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:18:57 a. m.
 */
public class WebSiteAccess {

    /**
     * Text describing login details.
     */
    private String login;
    /**
     * A password to the web site.
     */
    private String password;
    /**
     * The Uniform Resource Identifier (URI) for this web site; i.e., its
     * Uniform Resource Locator (URL).
     */
    private String URIID;

    public WebSiteAccess() {

    }

    public void finalize() throws Throwable {

    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getURIID() {
        return URIID;
    }

    /**
     * 
     * @param newVal
     */
    public void setLogin(String newVal) {
        login = newVal;
    }

    /**
     * 
     * @param newVal
     */
    public void setPassword(String newVal) {
        password = newVal;
    }

    /**
     * 
     * @param newVal
     */
    public void setURIID(String newVal) {
        URIID = newVal;
    }
}// end Web Site Access