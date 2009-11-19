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

import java.sql.Timestamp;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import javolution.util.FastMap;
import javolution.util.FastSet;
import org.ofbiz.entity.GenericValue;

/**
 * Update a ReturnHeader.
 * Auto generated base service entity updateReturnHeader.
 *
 * Engine: simple
 * Location: component://order/script/org/ofbiz/order/order/OrderReturnServices.xml
 * Invoke: updateReturnHeader
 * Defined in: file:/home/jeremy/programmation/opentaps-git/applications/order/servicedef/services_return.xml
 */
public class UpdateReturnHeaderService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "updateReturnHeader";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.FALSE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        billingAccountId("billingAccountId"),
        carrierReturnServiceId("carrierReturnServiceId"),
        comments("comments"),
        createdBy("createdBy"),
        currencyUomId("currencyUomId"),
        destinationFacilityId("destinationFacilityId"),
        entryDate("entryDate"),
        estimatedWeight("estimatedWeight"),
        estimatedWeightUomId("estimatedWeightUomId"),
        finAccountId("finAccountId"),
        fromPartyId("fromPartyId"),
        locale("locale"),
        needsInventoryReceive("needsInventoryReceive"),
        originContactMechId("originContactMechId"),
        originPhoneContactMechId("originPhoneContactMechId"),
        paymentMethodId("paymentMethodId"),
        primaryOrderId("primaryOrderId"),
        returnHeaderTypeId("returnHeaderTypeId"),
        returnId("returnId"),
        statusId("statusId"),
        timeZone("timeZone"),
        toPartyId("toPartyId"),
        userLogin("userLogin");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        currentStatusId("currentStatusId"),
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        locale("locale"),
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
     * Creates a new <code>UpdateReturnHeaderService</code> instance.
     */
    public UpdateReturnHeaderService() {
        super();
    }


    private String inBillingAccountId;
    private String inCarrierReturnServiceId;
    private String inComments;
    private String inCreatedBy;
    private String inCurrencyUomId;
    private String inDestinationFacilityId;
    private Timestamp inEntryDate;
    private Double inEstimatedWeight;
    private String inEstimatedWeightUomId;
    private String inFinAccountId;
    private String inFromPartyId;
    private Locale inLocale;
    private String inNeedsInventoryReceive;
    private String inOriginContactMechId;
    private String inOriginPhoneContactMechId;
    private String inPaymentMethodId;
    private String inPrimaryOrderId;
    private String inReturnHeaderTypeId;
    private String inReturnId;
    private String inStatusId;
    private TimeZone inTimeZone;
    private String inToPartyId;
    private GenericValue inUserLogin;
    private String outCurrentStatusId;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
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
    public String getInBillingAccountId() {
        return this.inBillingAccountId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCarrierReturnServiceId() {
        return this.inCarrierReturnServiceId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInComments() {
        return this.inComments;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCreatedBy() {
        return this.inCreatedBy;
    }
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
     * @return <code>String</code>
     */
    public String getInDestinationFacilityId() {
        return this.inDestinationFacilityId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInEntryDate() {
        return this.inEntryDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Double</code>
     */
    public Double getInEstimatedWeight() {
        return this.inEstimatedWeight;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInEstimatedWeightUomId() {
        return this.inEstimatedWeightUomId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInFinAccountId() {
        return this.inFinAccountId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInFromPartyId() {
        return this.inFromPartyId;
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
    public String getInNeedsInventoryReceive() {
        return this.inNeedsInventoryReceive;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInOriginContactMechId() {
        return this.inOriginContactMechId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInOriginPhoneContactMechId() {
        return this.inOriginPhoneContactMechId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPaymentMethodId() {
        return this.inPaymentMethodId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPrimaryOrderId() {
        return this.inPrimaryOrderId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInReturnHeaderTypeId() {
        return this.inReturnHeaderTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInReturnId() {
        return this.inReturnId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInStatusId() {
        return this.inStatusId;
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
    public String getInToPartyId() {
        return this.inToPartyId;
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
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getOutCurrentStatusId() {
        return this.outCurrentStatusId;
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
     * @param inBillingAccountId the inBillingAccountId to set
    */
    public void setInBillingAccountId(String inBillingAccountId) {
        this.inParameters.add("billingAccountId");
        this.inBillingAccountId = inBillingAccountId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCarrierReturnServiceId the inCarrierReturnServiceId to set
    */
    public void setInCarrierReturnServiceId(String inCarrierReturnServiceId) {
        this.inParameters.add("carrierReturnServiceId");
        this.inCarrierReturnServiceId = inCarrierReturnServiceId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inComments the inComments to set
    */
    public void setInComments(String inComments) {
        this.inParameters.add("comments");
        this.inComments = inComments;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCreatedBy the inCreatedBy to set
    */
    public void setInCreatedBy(String inCreatedBy) {
        this.inParameters.add("createdBy");
        this.inCreatedBy = inCreatedBy;
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
     * @param inDestinationFacilityId the inDestinationFacilityId to set
    */
    public void setInDestinationFacilityId(String inDestinationFacilityId) {
        this.inParameters.add("destinationFacilityId");
        this.inDestinationFacilityId = inDestinationFacilityId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inEntryDate the inEntryDate to set
    */
    public void setInEntryDate(Timestamp inEntryDate) {
        this.inParameters.add("entryDate");
        this.inEntryDate = inEntryDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inEstimatedWeight the inEstimatedWeight to set
    */
    public void setInEstimatedWeight(Double inEstimatedWeight) {
        this.inParameters.add("estimatedWeight");
        this.inEstimatedWeight = inEstimatedWeight;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inEstimatedWeightUomId the inEstimatedWeightUomId to set
    */
    public void setInEstimatedWeightUomId(String inEstimatedWeightUomId) {
        this.inParameters.add("estimatedWeightUomId");
        this.inEstimatedWeightUomId = inEstimatedWeightUomId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFinAccountId the inFinAccountId to set
    */
    public void setInFinAccountId(String inFinAccountId) {
        this.inParameters.add("finAccountId");
        this.inFinAccountId = inFinAccountId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFromPartyId the inFromPartyId to set
    */
    public void setInFromPartyId(String inFromPartyId) {
        this.inParameters.add("fromPartyId");
        this.inFromPartyId = inFromPartyId;
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
     * @param inNeedsInventoryReceive the inNeedsInventoryReceive to set
    */
    public void setInNeedsInventoryReceive(String inNeedsInventoryReceive) {
        this.inParameters.add("needsInventoryReceive");
        this.inNeedsInventoryReceive = inNeedsInventoryReceive;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inOriginContactMechId the inOriginContactMechId to set
    */
    public void setInOriginContactMechId(String inOriginContactMechId) {
        this.inParameters.add("originContactMechId");
        this.inOriginContactMechId = inOriginContactMechId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inOriginPhoneContactMechId the inOriginPhoneContactMechId to set
    */
    public void setInOriginPhoneContactMechId(String inOriginPhoneContactMechId) {
        this.inParameters.add("originPhoneContactMechId");
        this.inOriginPhoneContactMechId = inOriginPhoneContactMechId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPaymentMethodId the inPaymentMethodId to set
    */
    public void setInPaymentMethodId(String inPaymentMethodId) {
        this.inParameters.add("paymentMethodId");
        this.inPaymentMethodId = inPaymentMethodId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPrimaryOrderId the inPrimaryOrderId to set
    */
    public void setInPrimaryOrderId(String inPrimaryOrderId) {
        this.inParameters.add("primaryOrderId");
        this.inPrimaryOrderId = inPrimaryOrderId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inReturnHeaderTypeId the inReturnHeaderTypeId to set
    */
    public void setInReturnHeaderTypeId(String inReturnHeaderTypeId) {
        this.inParameters.add("returnHeaderTypeId");
        this.inReturnHeaderTypeId = inReturnHeaderTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inReturnId the inReturnId to set
    */
    public void setInReturnId(String inReturnId) {
        this.inParameters.add("returnId");
        this.inReturnId = inReturnId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inStatusId the inStatusId to set
    */
    public void setInStatusId(String inStatusId) {
        this.inParameters.add("statusId");
        this.inStatusId = inStatusId;
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
     * @param inToPartyId the inToPartyId to set
    */
    public void setInToPartyId(String inToPartyId) {
        this.inParameters.add("toPartyId");
        this.inToPartyId = inToPartyId;
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
     * This parameter is required.
     * @param outCurrentStatusId the outCurrentStatusId to set
    */
    public void setOutCurrentStatusId(String outCurrentStatusId) {
        this.outParameters.add("currentStatusId");
        this.outCurrentStatusId = outCurrentStatusId;
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
        if (inParameters.contains("billingAccountId")) mapValue.put("billingAccountId", getInBillingAccountId());
        if (inParameters.contains("carrierReturnServiceId")) mapValue.put("carrierReturnServiceId", getInCarrierReturnServiceId());
        if (inParameters.contains("comments")) mapValue.put("comments", getInComments());
        if (inParameters.contains("createdBy")) mapValue.put("createdBy", getInCreatedBy());
        if (inParameters.contains("currencyUomId")) mapValue.put("currencyUomId", getInCurrencyUomId());
        if (inParameters.contains("destinationFacilityId")) mapValue.put("destinationFacilityId", getInDestinationFacilityId());
        if (inParameters.contains("entryDate")) mapValue.put("entryDate", getInEntryDate());
        if (inParameters.contains("estimatedWeight")) mapValue.put("estimatedWeight", getInEstimatedWeight());
        if (inParameters.contains("estimatedWeightUomId")) mapValue.put("estimatedWeightUomId", getInEstimatedWeightUomId());
        if (inParameters.contains("finAccountId")) mapValue.put("finAccountId", getInFinAccountId());
        if (inParameters.contains("fromPartyId")) mapValue.put("fromPartyId", getInFromPartyId());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("needsInventoryReceive")) mapValue.put("needsInventoryReceive", getInNeedsInventoryReceive());
        if (inParameters.contains("originContactMechId")) mapValue.put("originContactMechId", getInOriginContactMechId());
        if (inParameters.contains("originPhoneContactMechId")) mapValue.put("originPhoneContactMechId", getInOriginPhoneContactMechId());
        if (inParameters.contains("paymentMethodId")) mapValue.put("paymentMethodId", getInPaymentMethodId());
        if (inParameters.contains("primaryOrderId")) mapValue.put("primaryOrderId", getInPrimaryOrderId());
        if (inParameters.contains("returnHeaderTypeId")) mapValue.put("returnHeaderTypeId", getInReturnHeaderTypeId());
        if (inParameters.contains("returnId")) mapValue.put("returnId", getInReturnId());
        if (inParameters.contains("statusId")) mapValue.put("statusId", getInStatusId());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("toPartyId")) mapValue.put("toPartyId", getInToPartyId());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("currentStatusId")) mapValue.put("currentStatusId", getOutCurrentStatusId());
        if (outParameters.contains("errorMessage")) mapValue.put("errorMessage", getOutErrorMessage());
        if (outParameters.contains("errorMessageList")) mapValue.put("errorMessageList", getOutErrorMessageList());
        if (outParameters.contains("locale")) mapValue.put("locale", getOutLocale());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("billingAccountId")) setInBillingAccountId((String) mapValue.get("billingAccountId"));
        if (mapValue.containsKey("carrierReturnServiceId")) setInCarrierReturnServiceId((String) mapValue.get("carrierReturnServiceId"));
        if (mapValue.containsKey("comments")) setInComments((String) mapValue.get("comments"));
        if (mapValue.containsKey("createdBy")) setInCreatedBy((String) mapValue.get("createdBy"));
        if (mapValue.containsKey("currencyUomId")) setInCurrencyUomId((String) mapValue.get("currencyUomId"));
        if (mapValue.containsKey("destinationFacilityId")) setInDestinationFacilityId((String) mapValue.get("destinationFacilityId"));
        if (mapValue.containsKey("entryDate")) setInEntryDate((Timestamp) mapValue.get("entryDate"));
        if (mapValue.containsKey("estimatedWeight")) setInEstimatedWeight((Double) mapValue.get("estimatedWeight"));
        if (mapValue.containsKey("estimatedWeightUomId")) setInEstimatedWeightUomId((String) mapValue.get("estimatedWeightUomId"));
        if (mapValue.containsKey("finAccountId")) setInFinAccountId((String) mapValue.get("finAccountId"));
        if (mapValue.containsKey("fromPartyId")) setInFromPartyId((String) mapValue.get("fromPartyId"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("needsInventoryReceive")) setInNeedsInventoryReceive((String) mapValue.get("needsInventoryReceive"));
        if (mapValue.containsKey("originContactMechId")) setInOriginContactMechId((String) mapValue.get("originContactMechId"));
        if (mapValue.containsKey("originPhoneContactMechId")) setInOriginPhoneContactMechId((String) mapValue.get("originPhoneContactMechId"));
        if (mapValue.containsKey("paymentMethodId")) setInPaymentMethodId((String) mapValue.get("paymentMethodId"));
        if (mapValue.containsKey("primaryOrderId")) setInPrimaryOrderId((String) mapValue.get("primaryOrderId"));
        if (mapValue.containsKey("returnHeaderTypeId")) setInReturnHeaderTypeId((String) mapValue.get("returnHeaderTypeId"));
        if (mapValue.containsKey("returnId")) setInReturnId((String) mapValue.get("returnId"));
        if (mapValue.containsKey("statusId")) setInStatusId((String) mapValue.get("statusId"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("toPartyId")) setInToPartyId((String) mapValue.get("toPartyId"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("currentStatusId")) setOutCurrentStatusId((String) mapValue.get("currentStatusId"));
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>UpdateReturnHeaderService</code> from the input values of the given <code>UpdateReturnHeaderService</code>.
     * @param input a <code>UpdateReturnHeaderService</code>
     */
    public static UpdateReturnHeaderService fromInput(UpdateReturnHeaderService input) {
        UpdateReturnHeaderService service = new UpdateReturnHeaderService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>UpdateReturnHeaderService</code> from the output values of the given <code>UpdateReturnHeaderService</code>.
     * @param output a <code>UpdateReturnHeaderService</code>
     */
    public static UpdateReturnHeaderService fromOutput(UpdateReturnHeaderService output) {
        UpdateReturnHeaderService service = new UpdateReturnHeaderService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>UpdateReturnHeaderService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static UpdateReturnHeaderService fromInput(Map<String, Object> mapValue) {
        UpdateReturnHeaderService service = new UpdateReturnHeaderService();
        service.putAllInput(mapValue);
        return service;
    }

    /**
     * Construct a <code>UpdateReturnHeaderService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static UpdateReturnHeaderService fromOutput(Map<String, Object> mapValue) {
        UpdateReturnHeaderService service = new UpdateReturnHeaderService();
        service.putAllOutput(mapValue);
        return service;
    }
}
