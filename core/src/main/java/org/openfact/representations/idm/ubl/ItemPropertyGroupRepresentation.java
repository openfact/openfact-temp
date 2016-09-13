package org.openfact.representations.idm.ubl;

import org.openfact.representations.idm.ubl.type.CodeRepresentation;
import org.openfact.representations.idm.ubl.type.IdentifierRepresentation;
import org.openfact.representations.idm.ubl.type.NameRepresentation;

/**
 * A class to describe a property group or classification.
 * 
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:15:51 a. m.
 */
public class ItemPropertyGroupRepresentation {

    /**
     * An identifier for this group of item properties.
     */
    private IdentifierRepresentation ID;
    /**
     * A code signifying the importance of this property group in using it to
     * describe a required Item.
     */
    private CodeRepresentation importanceCode;
    /**
     * The name of this item property group.
     */
    private NameRepresentation name;

}
