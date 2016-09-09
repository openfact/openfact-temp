package org.openfact.models.jpa.entities.ubl;

import org.openfact.models.jpa.entities.ublType.CodeType;
import org.openfact.models.jpa.entities.ublType.NameType;
import org.openfact.models.jpa.entities.ublType.TextType;

/**
 * A class to describe a requirement for execution of a contract.
 * 
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:14:01 a. m.
 */
public class ContractExecutionRequirementEntity {

    /**
     * Text describing this requirement.
     */
    private TextType Description;
    /**
     * A code signifying the type of party independent of its role.
     */
    private CodeType ExecutionRequirementCode;
    /**
     * A name for this requirement.
     */
    private NameType Name;

}