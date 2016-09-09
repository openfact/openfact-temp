package org.openfact.models.jpa.entities.ubl;

import org.openfact.models.jpa.entities.ublType.IdentifierType;
import org.openfact.models.jpa.entities.ublType.NameType;
import org.openfact.models.jpa.entities.ublType.TextType;

/**
 * A class to describe a regulation.
 * 
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:17:20 a. m.
 */
public class RegulationEntity {

    /**
     * Text describing a legal reference.
     */
    private TextType LegalReference;
    /**
     * A name for this regulation.
     */
    private NameType Name;
    /**
     * The Uniform Resource Identifier (URI) of an ontology related to this
     * regulation.
     */
    private IdentifierType OntologyURIID;

}