package org.openfact.models.jpa.entities.ubl;

import org.openfact.models.jpa.entities.ublType.IdentifierType;

/**
 * A class describing identifiers or references relating to customs procedures.
 * 
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:14:17 a. m.
 */
public class CustomsDeclarationEntity {

    /**
     * An identifier associated with customs related procedures.
     */
    private IdentifierType ID;
    private PartyEntity IssuerParty;

}
