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
import org.opentaps.foundation.service.ServiceWrapperWithAuth;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import javolution.util.FastMap;
import javolution.util.FastSet;
import org.ofbiz.entity.GenericValue;
import org.opentaps.foundation.infrastructure.User;

/**
 * Update OrderHeader.
 * Auto generated base service entity updateOrderHeader.
 *
 * Engine: simple
 * Location: component://order/script/org/ofbiz/order/order/OrderServices.xml
 * Invoke: updateOrderHeader
 * Defined in: file:/home/jeremy/programmation/opentaps-git/applications/order/servicedef/services.xml
 */
public class UpdateOrderHeaderService extends ServiceWrapperWithAuth {

    /** The service name as used by the service engine. */
    public static final String NAME = "updateOrderHeader";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        autoOrderShoppingListId("autoOrderShoppingListId"),
        billFromPartyId("billFromPartyId"),
        billToPartyId("billToPartyId"),
        billingAccountId("billingAccountId"),
        createdBy("createdBy"),
        currencyUom("currencyUom"),
        entryDate("entryDate"),
        externalId("externalId"),
        firstAttemptOrderId("firstAttemptOrderId"),
        grandTotal("grandTotal"),
        internalCode("internalCode"),
        isRushOrder("isRushOrder"),
        locale("locale"),
        needsInventoryIssuance("needsInventoryIssuance"),
        orderDate("orderDate"),
        orderId("orderId"),
        orderName("orderName"),
        orderTypeId("orderTypeId"),
        originFacilityId("originFacilityId"),
        priority("priority"),
        productStoreId("productStoreId"),
        remainingSubTotal("remainingSubTotal"),
        salesChannelEnumId("salesChannelEnumId"),
        statusId("statusId"),
        syncStatusId("syncStatusId"),
        terminalId("terminalId"),
        timeZone("timeZone"),
        transactionId("transactionId"),
        userLogin("userLogin"),
        visitId("visitId"),
        webSiteId("webSiteId");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
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
     * Creates a new <code>UpdateOrderHeaderService</code> instance.
     */
    public UpdateOrderHeaderService() {
        super();
    }

    /**
     * Creates a new <code>UpdateOrderHeaderService</code> instance.
     * @param user an <code>User</code> value
     */
    public UpdateOrderHeaderService(User user) {
        super(user);
    }

    private String inAutoOrderShoppingListId;
    private String inBillFromPartyId;
    private String inBillToPartyId;
    private String inBillingAccountId;
    private String inCreatedBy;
    private String inCurrencyUom;
    private Timestamp inEntryDate;
    private String inExternalId;
    private String inFirstAttemptOrderId;
    private BigDecimal inGrandTotal;
    private String inInternalCode;
    private String inIsRushOrder;
    private Locale inLocale;
    private String inNeedsInventoryIssuance;
    private Timestamp inOrderDate;
    private String inOrderId;
    private String inOrderName;
    private String inOrderTypeId;
    private String inOriginFacilityId;
    private String inPriority;
    private String inProductStoreId;
    private BigDecimal inRemainingSubTotal;
    private String inSalesChannelEnumId;
    private String inStatusId;
    private String inSyncStatusId;
    private String inTerminalId;
    private TimeZone inTimeZone;
    private String inTransactionId;
    private GenericValue inUserLogin;
    private String inVisitId;
    private String inWebSiteId;
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
    public String getInAutoOrderShoppingListId() {
        return this.inAutoOrderShoppingListId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInBillFromPartyId() {
        return this.inBillFromPartyId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInBillToPartyId() {
        return this.inBillToPartyId;
    }
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
    public String getInCreatedBy() {
        return this.inCreatedBy;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCurrencyUom() {
        return this.inCurrencyUom;
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
     * @return <code>String</code>
     */
    public String getInExternalId() {
        return this.inExternalId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInFirstAttemptOrderId() {
        return this.inFirstAttemptOrderId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInGrandTotal() {
        return this.inGrandTotal;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInInternalCode() {
        return this.inInternalCode;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInIsRushOrder() {
        return this.inIsRushOrder;
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
    public String getInNeedsInventoryIssuance() {
        return this.inNeedsInventoryIssuance;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInOrderDate() {
        return this.inOrderDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInOrderId() {
        return this.inOrderId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInOrderName() {
        return this.inOrderName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInOrderTypeId() {
        return this.inOrderTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInOriginFacilityId() {
        return this.inOriginFacilityId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPriority() {
        return this.inPriority;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInProductStoreId() {
        return this.inProductStoreId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInRemainingSubTotal() {
        return this.inRemainingSubTotal;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInSalesChannelEnumId() {
        return this.inSalesChannelEnumId;
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
     * @return <code>String</code>
     */
    public String getInSyncStatusId() {
        return this.inSyncStatusId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTerminalId() {
        return this.inTerminalId;
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
    public String getInTransactionId() {
        return this.inTransactionId;
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
     * @return <code>String</code>
     */
    public String getInVisitId() {
        return this.inVisitId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInWebSiteId() {
        return this.inWebSiteId;
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
     * @param inAutoOrderShoppingListId the inAutoOrderShoppingListId to set
    */
    public void setInAutoOrderShoppingListId(String inAutoOrderShoppingListId) {
        this.inParameters.add("autoOrderShoppingListId");
        this.inAutoOrderShoppingListId = inAutoOrderShoppingListId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inBillFromPartyId the inBillFromPartyId to set
    */
    public void setInBillFromPartyId(String inBillFromPartyId) {
        this.inParameters.add("billFromPartyId");
        this.inBillFromPartyId = inBillFromPartyId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inBillToPartyId the inBillToPartyId to set
    */
    public void setInBillToPartyId(String inBillToPartyId) {
        this.inParameters.add("billToPartyId");
        this.inBillToPartyId = inBillToPartyId;
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
     * @param inCreatedBy the inCreatedBy to set
    */
    public void setInCreatedBy(String inCreatedBy) {
        this.inParameters.add("createdBy");
        this.inCreatedBy = inCreatedBy;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCurrencyUom the inCurrencyUom to set
    */
    public void setInCurrencyUom(String inCurrencyUom) {
        this.inParameters.add("currencyUom");
        this.inCurrencyUom = inCurrencyUom;
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
     * @param inExternalId the inExternalId to set
    */
    public void setInExternalId(String inExternalId) {
        this.inParameters.add("externalId");
        this.inExternalId = inExternalId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFirstAttemptOrderId the inFirstAttemptOrderId to set
    */
    public void setInFirstAttemptOrderId(String inFirstAttemptOrderId) {
        this.inParameters.add("firstAttemptOrderId");
        this.inFirstAttemptOrderId = inFirstAttemptOrderId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGrandTotal the inGrandTotal to set
    */
    public void setInGrandTotal(BigDecimal inGrandTotal) {
        this.inParameters.add("grandTotal");
        this.inGrandTotal = inGrandTotal;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inInternalCode the inInternalCode to set
    */
    public void setInInternalCode(String inInternalCode) {
        this.inParameters.add("internalCode");
        this.inInternalCode = inInternalCode;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inIsRushOrder the inIsRushOrder to set
    */
    public void setInIsRushOrder(String inIsRushOrder) {
        this.inParameters.add("isRushOrder");
        this.inIsRushOrder = inIsRushOrder;
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
     * @param inNeedsInventoryIssuance the inNeedsInventoryIssuance to set
    */
    public void setInNeedsInventoryIssuance(String inNeedsInventoryIssuance) {
        this.inParameters.add("needsInventoryIssuance");
        this.inNeedsInventoryIssuance = inNeedsInventoryIssuance;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inOrderDate the inOrderDate to set
    */
    public void setInOrderDate(Timestamp inOrderDate) {
        this.inParameters.add("orderDate");
        this.inOrderDate = inOrderDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inOrderId the inOrderId to set
    */
    public void setInOrderId(String inOrderId) {
        this.inParameters.add("orderId");
        this.inOrderId = inOrderId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inOrderName the inOrderName to set
    */
    public void setInOrderName(String inOrderName) {
        this.inParameters.add("orderName");
        this.inOrderName = inOrderName;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inOrderTypeId the inOrderTypeId to set
    */
    public void setInOrderTypeId(String inOrderTypeId) {
        this.inParameters.add("orderTypeId");
        this.inOrderTypeId = inOrderTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inOriginFacilityId the inOriginFacilityId to set
    */
    public void setInOriginFacilityId(String inOriginFacilityId) {
        this.inParameters.add("originFacilityId");
        this.inOriginFacilityId = inOriginFacilityId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPriority the inPriority to set
    */
    public void setInPriority(String inPriority) {
        this.inParameters.add("priority");
        this.inPriority = inPriority;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inProductStoreId the inProductStoreId to set
    */
    public void setInProductStoreId(String inProductStoreId) {
        this.inParameters.add("productStoreId");
        this.inProductStoreId = inProductStoreId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRemainingSubTotal the inRemainingSubTotal to set
    */
    public void setInRemainingSubTotal(BigDecimal inRemainingSubTotal) {
        this.inParameters.add("remainingSubTotal");
        this.inRemainingSubTotal = inRemainingSubTotal;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSalesChannelEnumId the inSalesChannelEnumId to set
    */
    public void setInSalesChannelEnumId(String inSalesChannelEnumId) {
        this.inParameters.add("salesChannelEnumId");
        this.inSalesChannelEnumId = inSalesChannelEnumId;
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
     * @param inSyncStatusId the inSyncStatusId to set
    */
    public void setInSyncStatusId(String inSyncStatusId) {
        this.inParameters.add("syncStatusId");
        this.inSyncStatusId = inSyncStatusId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTerminalId the inTerminalId to set
    */
    public void setInTerminalId(String inTerminalId) {
        this.inParameters.add("terminalId");
        this.inTerminalId = inTerminalId;
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
     * @param inTransactionId the inTransactionId to set
    */
    public void setInTransactionId(String inTransactionId) {
        this.inParameters.add("transactionId");
        this.inTransactionId = inTransactionId;
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
     * @param inVisitId the inVisitId to set
    */
    public void setInVisitId(String inVisitId) {
        this.inParameters.add("visitId");
        this.inVisitId = inVisitId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inWebSiteId the inWebSiteId to set
    */
    public void setInWebSiteId(String inWebSiteId) {
        this.inParameters.add("webSiteId");
        this.inWebSiteId = inWebSiteId;
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
        if (inParameters.contains("autoOrderShoppingListId")) mapValue.put("autoOrderShoppingListId", getInAutoOrderShoppingListId());
        if (inParameters.contains("billFromPartyId")) mapValue.put("billFromPartyId", getInBillFromPartyId());
        if (inParameters.contains("billToPartyId")) mapValue.put("billToPartyId", getInBillToPartyId());
        if (inParameters.contains("billingAccountId")) mapValue.put("billingAccountId", getInBillingAccountId());
        if (inParameters.contains("createdBy")) mapValue.put("createdBy", getInCreatedBy());
        if (inParameters.contains("currencyUom")) mapValue.put("currencyUom", getInCurrencyUom());
        if (inParameters.contains("entryDate")) mapValue.put("entryDate", getInEntryDate());
        if (inParameters.contains("externalId")) mapValue.put("externalId", getInExternalId());
        if (inParameters.contains("firstAttemptOrderId")) mapValue.put("firstAttemptOrderId", getInFirstAttemptOrderId());
        if (inParameters.contains("grandTotal")) mapValue.put("grandTotal", getInGrandTotal());
        if (inParameters.contains("internalCode")) mapValue.put("internalCode", getInInternalCode());
        if (inParameters.contains("isRushOrder")) mapValue.put("isRushOrder", getInIsRushOrder());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("needsInventoryIssuance")) mapValue.put("needsInventoryIssuance", getInNeedsInventoryIssuance());
        if (inParameters.contains("orderDate")) mapValue.put("orderDate", getInOrderDate());
        if (inParameters.contains("orderId")) mapValue.put("orderId", getInOrderId());
        if (inParameters.contains("orderName")) mapValue.put("orderName", getInOrderName());
        if (inParameters.contains("orderTypeId")) mapValue.put("orderTypeId", getInOrderTypeId());
        if (inParameters.contains("originFacilityId")) mapValue.put("originFacilityId", getInOriginFacilityId());
        if (inParameters.contains("priority")) mapValue.put("priority", getInPriority());
        if (inParameters.contains("productStoreId")) mapValue.put("productStoreId", getInProductStoreId());
        if (inParameters.contains("remainingSubTotal")) mapValue.put("remainingSubTotal", getInRemainingSubTotal());
        if (inParameters.contains("salesChannelEnumId")) mapValue.put("salesChannelEnumId", getInSalesChannelEnumId());
        if (inParameters.contains("statusId")) mapValue.put("statusId", getInStatusId());
        if (inParameters.contains("syncStatusId")) mapValue.put("syncStatusId", getInSyncStatusId());
        if (inParameters.contains("terminalId")) mapValue.put("terminalId", getInTerminalId());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("transactionId")) mapValue.put("transactionId", getInTransactionId());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        if (inParameters.contains("visitId")) mapValue.put("visitId", getInVisitId());
        if (inParameters.contains("webSiteId")) mapValue.put("webSiteId", getInWebSiteId());
          // allow the User set to override the userLogin
          if (getUser() != null) mapValue.put("userLogin", getUser().getOfbizUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
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
        if (mapValue.containsKey("autoOrderShoppingListId")) setInAutoOrderShoppingListId((String) mapValue.get("autoOrderShoppingListId"));
        if (mapValue.containsKey("billFromPartyId")) setInBillFromPartyId((String) mapValue.get("billFromPartyId"));
        if (mapValue.containsKey("billToPartyId")) setInBillToPartyId((String) mapValue.get("billToPartyId"));
        if (mapValue.containsKey("billingAccountId")) setInBillingAccountId((String) mapValue.get("billingAccountId"));
        if (mapValue.containsKey("createdBy")) setInCreatedBy((String) mapValue.get("createdBy"));
        if (mapValue.containsKey("currencyUom")) setInCurrencyUom((String) mapValue.get("currencyUom"));
        if (mapValue.containsKey("entryDate")) setInEntryDate((Timestamp) mapValue.get("entryDate"));
        if (mapValue.containsKey("externalId")) setInExternalId((String) mapValue.get("externalId"));
        if (mapValue.containsKey("firstAttemptOrderId")) setInFirstAttemptOrderId((String) mapValue.get("firstAttemptOrderId"));
        if (mapValue.containsKey("grandTotal")) setInGrandTotal((BigDecimal) mapValue.get("grandTotal"));
        if (mapValue.containsKey("internalCode")) setInInternalCode((String) mapValue.get("internalCode"));
        if (mapValue.containsKey("isRushOrder")) setInIsRushOrder((String) mapValue.get("isRushOrder"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("needsInventoryIssuance")) setInNeedsInventoryIssuance((String) mapValue.get("needsInventoryIssuance"));
        if (mapValue.containsKey("orderDate")) setInOrderDate((Timestamp) mapValue.get("orderDate"));
        if (mapValue.containsKey("orderId")) setInOrderId((String) mapValue.get("orderId"));
        if (mapValue.containsKey("orderName")) setInOrderName((String) mapValue.get("orderName"));
        if (mapValue.containsKey("orderTypeId")) setInOrderTypeId((String) mapValue.get("orderTypeId"));
        if (mapValue.containsKey("originFacilityId")) setInOriginFacilityId((String) mapValue.get("originFacilityId"));
        if (mapValue.containsKey("priority")) setInPriority((String) mapValue.get("priority"));
        if (mapValue.containsKey("productStoreId")) setInProductStoreId((String) mapValue.get("productStoreId"));
        if (mapValue.containsKey("remainingSubTotal")) setInRemainingSubTotal((BigDecimal) mapValue.get("remainingSubTotal"));
        if (mapValue.containsKey("salesChannelEnumId")) setInSalesChannelEnumId((String) mapValue.get("salesChannelEnumId"));
        if (mapValue.containsKey("statusId")) setInStatusId((String) mapValue.get("statusId"));
        if (mapValue.containsKey("syncStatusId")) setInSyncStatusId((String) mapValue.get("syncStatusId"));
        if (mapValue.containsKey("terminalId")) setInTerminalId((String) mapValue.get("terminalId"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("transactionId")) setInTransactionId((String) mapValue.get("transactionId"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
        if (mapValue.containsKey("visitId")) setInVisitId((String) mapValue.get("visitId"));
        if (mapValue.containsKey("webSiteId")) setInWebSiteId((String) mapValue.get("webSiteId"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
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
     * Construct a <code>UpdateOrderHeaderService</code> from the input values of the given <code>UpdateOrderHeaderService</code>.
     * @param input a <code>UpdateOrderHeaderService</code>
     */
    public static UpdateOrderHeaderService fromInput(UpdateOrderHeaderService input) {
        UpdateOrderHeaderService service = new UpdateOrderHeaderService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>UpdateOrderHeaderService</code> from the output values of the given <code>UpdateOrderHeaderService</code>.
     * @param output a <code>UpdateOrderHeaderService</code>
     */
    public static UpdateOrderHeaderService fromOutput(UpdateOrderHeaderService output) {
        UpdateOrderHeaderService service = new UpdateOrderHeaderService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>UpdateOrderHeaderService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static UpdateOrderHeaderService fromInput(Map<String, Object> mapValue) {
        UpdateOrderHeaderService service = new UpdateOrderHeaderService();
        service.putAllInput(mapValue);
        if (mapValue.containsKey("userLogin")) {
            GenericValue userGv = (GenericValue) mapValue.get("userLogin");
            try {
                service.setUser(new User(userGv, userGv.getDelegator()));
            } catch (InfrastructureException e) {
                // this may happen if the user login is null
            }
        }
        return service;
    }

    /**
     * Construct a <code>UpdateOrderHeaderService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static UpdateOrderHeaderService fromOutput(Map<String, Object> mapValue) {
        UpdateOrderHeaderService service = new UpdateOrderHeaderService();
        service.putAllOutput(mapValue);
        return service;
    }
}
