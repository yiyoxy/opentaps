package org.opentaps.domain.base.services;

/*
 * Copyright (c) 2009 - 2009 Open Source Strategies, Inc.
 *
 * Opentaps is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Opentaps is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Opentaps.  If not, see <http://www.gnu.org/licenses/>.
 */

// DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY WHEN THE SERVICE MODEL CHANGES
// EXTEND THIS CLASS INSTEAD.

import org.opentaps.foundation.infrastructure.InfrastructureException;
import org.opentaps.foundation.service.ServiceWrapper;

import java.math.BigDecimal;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import javolution.util.FastMap;
import javolution.util.FastSet;
import org.ofbiz.entity.GenericValue;
import org.ofbiz.entity.condition.EntityCondition;

/**
 * Retrieves requirements information for suppliers.
 * Auto generated base service entity getRequirementsForSupplier.
 *
 * Engine: java
 * Location: org.ofbiz.order.requirement.RequirementServices
 * Invoke: getRequirementsForSupplier
 * Defined in: file:/home/jeremy/programmation/opentaps-git/applications/order/servicedef/services_requirement.xml
 */
public class GetRequirementsForSupplierService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "getRequirementsForSupplier";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.FALSE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        currencyUomId("currencyUomId"),
        locale("locale"),
        partyId("partyId"),
        requirementConditions("requirementConditions"),
        statusIds("statusIds"),
        timeZone("timeZone"),
        unassignedRequirements("unassignedRequirements"),
        userLogin("userLogin");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        amountTotal("amountTotal"),
        distinctProductCount("distinctProductCount"),
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        locale("locale"),
        quantityTotal("quantityTotal"),
        requirementsForSupplier("requirementsForSupplier"),
        responseMessage("responseMessage"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    /**
     * Creates a new <code>GetRequirementsForSupplierService</code> instance.
     */
    public GetRequirementsForSupplierService() {
        super();
    }


    private String inCurrencyUomId;
    private Locale inLocale;
    private String inPartyId;
    private EntityCondition inRequirementConditions;
    private List inStatusIds;
    private TimeZone inTimeZone;
    private String inUnassignedRequirements;
    private GenericValue inUserLogin;
    private BigDecimal outAmountTotal;
    private Integer outDistinctProductCount;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private BigDecimal outQuantityTotal;
    private List outRequirementsForSupplier;
    private String outResponseMessage;
    private String outSuccessMessage;
    private List outSuccessMessageList;
    private TimeZone outTimeZone;
    private GenericValue outUserLogin;

    private Set<String> inParameters = FastSet.newInstance();
    private Set<String> outParameters = FastSet.newInstance();

    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCurrencyUomId() {
        return this.inCurrencyUomId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Locale</code>
     */
    public Locale getInLocale() {
        return this.inLocale;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPartyId() {
        return this.inPartyId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>EntityCondition</code>
     */
    public EntityCondition getInRequirementConditions() {
        return this.inRequirementConditions;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getInStatusIds() {
        return this.inStatusIds;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>TimeZone</code>
     */
    public TimeZone getInTimeZone() {
        return this.inTimeZone;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInUnassignedRequirements() {
        return this.inUnassignedRequirements;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>GenericValue</code>
     */
    public GenericValue getInUserLogin() {
        return this.inUserLogin;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getOutAmountTotal() {
        return this.outAmountTotal;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Integer</code>
     */
    public Integer getOutDistinctProductCount() {
        return this.outDistinctProductCount;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutErrorMessage() {
        return this.outErrorMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getOutErrorMessageList() {
        return this.outErrorMessageList;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Locale</code>
     */
    public Locale getOutLocale() {
        return this.outLocale;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getOutQuantityTotal() {
        return this.outQuantityTotal;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getOutRequirementsForSupplier() {
        return this.outRequirementsForSupplier;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutResponseMessage() {
        return this.outResponseMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutSuccessMessage() {
        return this.outSuccessMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getOutSuccessMessageList() {
        return this.outSuccessMessageList;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>TimeZone</code>
     */
    public TimeZone getOutTimeZone() {
        return this.outTimeZone;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>GenericValue</code>
     */
    public GenericValue getOutUserLogin() {
        return this.outUserLogin;
    }

    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCurrencyUomId the inCurrencyUomId to set
    */
    public void setInCurrencyUomId(String inCurrencyUomId) {
        this.inParameters.add("currencyUomId");
        this.inCurrencyUomId = inCurrencyUomId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLocale the inLocale to set
    */
    public void setInLocale(Locale inLocale) {
        this.inParameters.add("locale");
        this.inLocale = inLocale;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPartyId the inPartyId to set
    */
    public void setInPartyId(String inPartyId) {
        this.inParameters.add("partyId");
        this.inPartyId = inPartyId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRequirementConditions the inRequirementConditions to set
    */
    public void setInRequirementConditions(EntityCondition inRequirementConditions) {
        this.inParameters.add("requirementConditions");
        this.inRequirementConditions = inRequirementConditions;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inStatusIds the inStatusIds to set
    */
    public void setInStatusIds(List inStatusIds) {
        this.inParameters.add("statusIds");
        this.inStatusIds = inStatusIds;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTimeZone the inTimeZone to set
    */
    public void setInTimeZone(TimeZone inTimeZone) {
        this.inParameters.add("timeZone");
        this.inTimeZone = inTimeZone;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inUnassignedRequirements the inUnassignedRequirements to set
    */
    public void setInUnassignedRequirements(String inUnassignedRequirements) {
        this.inParameters.add("unassignedRequirements");
        this.inUnassignedRequirements = inUnassignedRequirements;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inUserLogin the inUserLogin to set
    */
    public void setInUserLogin(GenericValue inUserLogin) {
        this.inParameters.add("userLogin");
        this.inUserLogin = inUserLogin;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outAmountTotal the outAmountTotal to set
    */
    public void setOutAmountTotal(BigDecimal outAmountTotal) {
        this.outParameters.add("amountTotal");
        this.outAmountTotal = outAmountTotal;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outDistinctProductCount the outDistinctProductCount to set
    */
    public void setOutDistinctProductCount(Integer outDistinctProductCount) {
        this.outParameters.add("distinctProductCount");
        this.outDistinctProductCount = outDistinctProductCount;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outErrorMessage the outErrorMessage to set
    */
    public void setOutErrorMessage(String outErrorMessage) {
        this.outParameters.add("errorMessage");
        this.outErrorMessage = outErrorMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outErrorMessageList the outErrorMessageList to set
    */
    public void setOutErrorMessageList(List outErrorMessageList) {
        this.outParameters.add("errorMessageList");
        this.outErrorMessageList = outErrorMessageList;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outLocale the outLocale to set
    */
    public void setOutLocale(Locale outLocale) {
        this.outParameters.add("locale");
        this.outLocale = outLocale;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outQuantityTotal the outQuantityTotal to set
    */
    public void setOutQuantityTotal(BigDecimal outQuantityTotal) {
        this.outParameters.add("quantityTotal");
        this.outQuantityTotal = outQuantityTotal;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outRequirementsForSupplier the outRequirementsForSupplier to set
    */
    public void setOutRequirementsForSupplier(List outRequirementsForSupplier) {
        this.outParameters.add("requirementsForSupplier");
        this.outRequirementsForSupplier = outRequirementsForSupplier;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outResponseMessage the outResponseMessage to set
    */
    public void setOutResponseMessage(String outResponseMessage) {
        this.outParameters.add("responseMessage");
        this.outResponseMessage = outResponseMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outSuccessMessage the outSuccessMessage to set
    */
    public void setOutSuccessMessage(String outSuccessMessage) {
        this.outParameters.add("successMessage");
        this.outSuccessMessage = outSuccessMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outSuccessMessageList the outSuccessMessageList to set
    */
    public void setOutSuccessMessageList(List outSuccessMessageList) {
        this.outParameters.add("successMessageList");
        this.outSuccessMessageList = outSuccessMessageList;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outTimeZone the outTimeZone to set
    */
    public void setOutTimeZone(TimeZone outTimeZone) {
        this.outParameters.add("timeZone");
        this.outTimeZone = outTimeZone;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outUserLogin the outUserLogin to set
    */
    public void setOutUserLogin(GenericValue outUserLogin) {
        this.outParameters.add("userLogin");
        this.outUserLogin = outUserLogin;
    }

    /** {@inheritDoc} */
    public String name() {
        return NAME;
    }

    /** {@inheritDoc} */
    public Boolean requiresAuthentication() {
        return REQUIRES_AUTHENTICATION;
    }

    /** {@inheritDoc} */
    public Boolean requiresNewTransaction() {
        return REQUIRES_NEW_TRANSACTION;
    }

    /** {@inheritDoc} */
    public Boolean usesTransaction() {
        return USES_TRANSACTION;
    }

    /** {@inheritDoc} */
    public Map<String, Object> inputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (inParameters.contains("currencyUomId")) mapValue.put("currencyUomId", getInCurrencyUomId());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("partyId")) mapValue.put("partyId", getInPartyId());
        if (inParameters.contains("requirementConditions")) mapValue.put("requirementConditions", getInRequirementConditions());
        if (inParameters.contains("statusIds")) mapValue.put("statusIds", getInStatusIds());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("unassignedRequirements")) mapValue.put("unassignedRequirements", getInUnassignedRequirements());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("amountTotal")) mapValue.put("amountTotal", getOutAmountTotal());
        if (outParameters.contains("distinctProductCount")) mapValue.put("distinctProductCount", getOutDistinctProductCount());
        if (outParameters.contains("errorMessage")) mapValue.put("errorMessage", getOutErrorMessage());
        if (outParameters.contains("errorMessageList")) mapValue.put("errorMessageList", getOutErrorMessageList());
        if (outParameters.contains("locale")) mapValue.put("locale", getOutLocale());
        if (outParameters.contains("quantityTotal")) mapValue.put("quantityTotal", getOutQuantityTotal());
        if (outParameters.contains("requirementsForSupplier")) mapValue.put("requirementsForSupplier", getOutRequirementsForSupplier());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("currencyUomId")) setInCurrencyUomId((String) mapValue.get("currencyUomId"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("partyId")) setInPartyId((String) mapValue.get("partyId"));
        if (mapValue.containsKey("requirementConditions")) setInRequirementConditions((EntityCondition) mapValue.get("requirementConditions"));
        if (mapValue.containsKey("statusIds")) setInStatusIds((List) mapValue.get("statusIds"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("unassignedRequirements")) setInUnassignedRequirements((String) mapValue.get("unassignedRequirements"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("amountTotal")) setOutAmountTotal((BigDecimal) mapValue.get("amountTotal"));
        if (mapValue.containsKey("distinctProductCount")) setOutDistinctProductCount((Integer) mapValue.get("distinctProductCount"));
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("quantityTotal")) setOutQuantityTotal((BigDecimal) mapValue.get("quantityTotal"));
        if (mapValue.containsKey("requirementsForSupplier")) setOutRequirementsForSupplier((List) mapValue.get("requirementsForSupplier"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>GetRequirementsForSupplierService</code> from the input values of the given <code>GetRequirementsForSupplierService</code>.
     * @param input a <code>GetRequirementsForSupplierService</code>
     */
    public static GetRequirementsForSupplierService fromInput(GetRequirementsForSupplierService input) {
        GetRequirementsForSupplierService service = new GetRequirementsForSupplierService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>GetRequirementsForSupplierService</code> from the output values of the given <code>GetRequirementsForSupplierService</code>.
     * @param output a <code>GetRequirementsForSupplierService</code>
     */
    public static GetRequirementsForSupplierService fromOutput(GetRequirementsForSupplierService output) {
        GetRequirementsForSupplierService service = new GetRequirementsForSupplierService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>GetRequirementsForSupplierService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static GetRequirementsForSupplierService fromInput(Map<String, Object> mapValue) {
        GetRequirementsForSupplierService service = new GetRequirementsForSupplierService();
        service.putAllInput(mapValue);
        return service;
    }

    /**
     * Construct a <code>GetRequirementsForSupplierService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static GetRequirementsForSupplierService fromOutput(Map<String, Object> mapValue) {
        GetRequirementsForSupplierService service = new GetRequirementsForSupplierService();
        service.putAllOutput(mapValue);
        return service;
    }
}
