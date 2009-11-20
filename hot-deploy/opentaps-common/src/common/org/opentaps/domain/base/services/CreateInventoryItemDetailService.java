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
import org.opentaps.foundation.infrastructure.User;

/**
 * Create an createInventoryItemDetail - note that the quantityOnHand and availableToPromise are relative (positive or negative) and will be added to the corresponding value on the given InventoryItem.
 * Auto generated base service entity createInventoryItemDetail.
 *
 * Engine: simple
 * Location: component://product/script/org/ofbiz/product/inventory/InventoryServices.xml
 * Invoke: createInventoryItemDetail
 * Defined in: file:/home/jeremy/programmation/opentaps-git/applications/product/servicedef/services_facility.xml
 */
public class CreateInventoryItemDetailService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "createInventoryItemDetail";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        availableToPromiseDiff("availableToPromiseDiff"),
        description("description"),
        fixedAssetId("fixedAssetId"),
        inventoryItemId("inventoryItemId"),
        itemIssuanceId("itemIssuanceId"),
        locale("locale"),
        maintHistSeqId("maintHistSeqId"),
        orderId("orderId"),
        orderItemSeqId("orderItemSeqId"),
        physicalInventoryId("physicalInventoryId"),
        quantityOnHandDiff("quantityOnHandDiff"),
        reasonEnumId("reasonEnumId"),
        receiptId("receiptId"),
        returnId("returnId"),
        returnItemSeqId("returnItemSeqId"),
        shipGroupSeqId("shipGroupSeqId"),
        shipmentId("shipmentId"),
        shipmentItemSeqId("shipmentItemSeqId"),
        timeZone("timeZone"),
        unitCost("unitCost"),
        userLogin("userLogin"),
        workEffortId("workEffortId");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        inventoryItemDetailSeqId("inventoryItemDetailSeqId"),
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
     * Creates a new <code>CreateInventoryItemDetailService</code> instance.
     */
    public CreateInventoryItemDetailService() {
        super();
    }

    /**
     * Creates a new <code>CreateInventoryItemDetailService</code> instance.
     * @param user an <code>User</code> value
     */
    public CreateInventoryItemDetailService(User user) {
        super(user);
    }

    private BigDecimal inAvailableToPromiseDiff;
    private String inDescription;
    private String inFixedAssetId;
    private String inInventoryItemId;
    private String inItemIssuanceId;
    private Locale inLocale;
    private String inMaintHistSeqId;
    private String inOrderId;
    private String inOrderItemSeqId;
    private String inPhysicalInventoryId;
    private BigDecimal inQuantityOnHandDiff;
    private String inReasonEnumId;
    private String inReceiptId;
    private String inReturnId;
    private String inReturnItemSeqId;
    private String inShipGroupSeqId;
    private String inShipmentId;
    private String inShipmentItemSeqId;
    private TimeZone inTimeZone;
    private BigDecimal inUnitCost;
    private GenericValue inUserLogin;
    private String inWorkEffortId;
    private String outErrorMessage;
    private List outErrorMessageList;
    private String outInventoryItemDetailSeqId;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInAvailableToPromiseDiff() {
        return this.inAvailableToPromiseDiff;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDescription() {
        return this.inDescription;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInFixedAssetId() {
        return this.inFixedAssetId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInInventoryItemId() {
        return this.inInventoryItemId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInItemIssuanceId() {
        return this.inItemIssuanceId;
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
    public String getInMaintHistSeqId() {
        return this.inMaintHistSeqId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
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
    public String getInOrderItemSeqId() {
        return this.inOrderItemSeqId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPhysicalInventoryId() {
        return this.inPhysicalInventoryId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInQuantityOnHandDiff() {
        return this.inQuantityOnHandDiff;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInReasonEnumId() {
        return this.inReasonEnumId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInReceiptId() {
        return this.inReceiptId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
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
    public String getInReturnItemSeqId() {
        return this.inReturnItemSeqId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInShipGroupSeqId() {
        return this.inShipGroupSeqId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInShipmentId() {
        return this.inShipmentId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInShipmentItemSeqId() {
        return this.inShipmentItemSeqId;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInUnitCost() {
        return this.inUnitCost;
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
    public String getInWorkEffortId() {
        return this.inWorkEffortId;
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
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getOutInventoryItemDetailSeqId() {
        return this.outInventoryItemDetailSeqId;
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
     * @param inAvailableToPromiseDiff the inAvailableToPromiseDiff to set
    */
    public void setInAvailableToPromiseDiff(BigDecimal inAvailableToPromiseDiff) {
        this.inParameters.add("availableToPromiseDiff");
        this.inAvailableToPromiseDiff = inAvailableToPromiseDiff;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDescription the inDescription to set
    */
    public void setInDescription(String inDescription) {
        this.inParameters.add("description");
        this.inDescription = inDescription;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFixedAssetId the inFixedAssetId to set
    */
    public void setInFixedAssetId(String inFixedAssetId) {
        this.inParameters.add("fixedAssetId");
        this.inFixedAssetId = inFixedAssetId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inInventoryItemId the inInventoryItemId to set
    */
    public void setInInventoryItemId(String inInventoryItemId) {
        this.inParameters.add("inventoryItemId");
        this.inInventoryItemId = inInventoryItemId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inItemIssuanceId the inItemIssuanceId to set
    */
    public void setInItemIssuanceId(String inItemIssuanceId) {
        this.inParameters.add("itemIssuanceId");
        this.inItemIssuanceId = inItemIssuanceId;
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
     * @param inMaintHistSeqId the inMaintHistSeqId to set
    */
    public void setInMaintHistSeqId(String inMaintHistSeqId) {
        this.inParameters.add("maintHistSeqId");
        this.inMaintHistSeqId = inMaintHistSeqId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inOrderId the inOrderId to set
    */
    public void setInOrderId(String inOrderId) {
        this.inParameters.add("orderId");
        this.inOrderId = inOrderId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inOrderItemSeqId the inOrderItemSeqId to set
    */
    public void setInOrderItemSeqId(String inOrderItemSeqId) {
        this.inParameters.add("orderItemSeqId");
        this.inOrderItemSeqId = inOrderItemSeqId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPhysicalInventoryId the inPhysicalInventoryId to set
    */
    public void setInPhysicalInventoryId(String inPhysicalInventoryId) {
        this.inParameters.add("physicalInventoryId");
        this.inPhysicalInventoryId = inPhysicalInventoryId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inQuantityOnHandDiff the inQuantityOnHandDiff to set
    */
    public void setInQuantityOnHandDiff(BigDecimal inQuantityOnHandDiff) {
        this.inParameters.add("quantityOnHandDiff");
        this.inQuantityOnHandDiff = inQuantityOnHandDiff;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inReasonEnumId the inReasonEnumId to set
    */
    public void setInReasonEnumId(String inReasonEnumId) {
        this.inParameters.add("reasonEnumId");
        this.inReasonEnumId = inReasonEnumId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inReceiptId the inReceiptId to set
    */
    public void setInReceiptId(String inReceiptId) {
        this.inParameters.add("receiptId");
        this.inReceiptId = inReceiptId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inReturnId the inReturnId to set
    */
    public void setInReturnId(String inReturnId) {
        this.inParameters.add("returnId");
        this.inReturnId = inReturnId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inReturnItemSeqId the inReturnItemSeqId to set
    */
    public void setInReturnItemSeqId(String inReturnItemSeqId) {
        this.inParameters.add("returnItemSeqId");
        this.inReturnItemSeqId = inReturnItemSeqId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inShipGroupSeqId the inShipGroupSeqId to set
    */
    public void setInShipGroupSeqId(String inShipGroupSeqId) {
        this.inParameters.add("shipGroupSeqId");
        this.inShipGroupSeqId = inShipGroupSeqId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inShipmentId the inShipmentId to set
    */
    public void setInShipmentId(String inShipmentId) {
        this.inParameters.add("shipmentId");
        this.inShipmentId = inShipmentId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inShipmentItemSeqId the inShipmentItemSeqId to set
    */
    public void setInShipmentItemSeqId(String inShipmentItemSeqId) {
        this.inParameters.add("shipmentItemSeqId");
        this.inShipmentItemSeqId = inShipmentItemSeqId;
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
     * @param inUnitCost the inUnitCost to set
    */
    public void setInUnitCost(BigDecimal inUnitCost) {
        this.inParameters.add("unitCost");
        this.inUnitCost = inUnitCost;
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
     * @param inWorkEffortId the inWorkEffortId to set
    */
    public void setInWorkEffortId(String inWorkEffortId) {
        this.inParameters.add("workEffortId");
        this.inWorkEffortId = inWorkEffortId;
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
     * This parameter is required.
     * @param outInventoryItemDetailSeqId the outInventoryItemDetailSeqId to set
    */
    public void setOutInventoryItemDetailSeqId(String outInventoryItemDetailSeqId) {
        this.outParameters.add("inventoryItemDetailSeqId");
        this.outInventoryItemDetailSeqId = outInventoryItemDetailSeqId;
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
        if (inParameters.contains("availableToPromiseDiff")) mapValue.put("availableToPromiseDiff", getInAvailableToPromiseDiff());
        if (inParameters.contains("description")) mapValue.put("description", getInDescription());
        if (inParameters.contains("fixedAssetId")) mapValue.put("fixedAssetId", getInFixedAssetId());
        if (inParameters.contains("inventoryItemId")) mapValue.put("inventoryItemId", getInInventoryItemId());
        if (inParameters.contains("itemIssuanceId")) mapValue.put("itemIssuanceId", getInItemIssuanceId());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("maintHistSeqId")) mapValue.put("maintHistSeqId", getInMaintHistSeqId());
        if (inParameters.contains("orderId")) mapValue.put("orderId", getInOrderId());
        if (inParameters.contains("orderItemSeqId")) mapValue.put("orderItemSeqId", getInOrderItemSeqId());
        if (inParameters.contains("physicalInventoryId")) mapValue.put("physicalInventoryId", getInPhysicalInventoryId());
        if (inParameters.contains("quantityOnHandDiff")) mapValue.put("quantityOnHandDiff", getInQuantityOnHandDiff());
        if (inParameters.contains("reasonEnumId")) mapValue.put("reasonEnumId", getInReasonEnumId());
        if (inParameters.contains("receiptId")) mapValue.put("receiptId", getInReceiptId());
        if (inParameters.contains("returnId")) mapValue.put("returnId", getInReturnId());
        if (inParameters.contains("returnItemSeqId")) mapValue.put("returnItemSeqId", getInReturnItemSeqId());
        if (inParameters.contains("shipGroupSeqId")) mapValue.put("shipGroupSeqId", getInShipGroupSeqId());
        if (inParameters.contains("shipmentId")) mapValue.put("shipmentId", getInShipmentId());
        if (inParameters.contains("shipmentItemSeqId")) mapValue.put("shipmentItemSeqId", getInShipmentItemSeqId());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("unitCost")) mapValue.put("unitCost", getInUnitCost());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        if (inParameters.contains("workEffortId")) mapValue.put("workEffortId", getInWorkEffortId());
        // allow the User set to override the userLogin
        if (getUser() != null) mapValue.put("userLogin", getUser().getOfbizUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("errorMessage")) mapValue.put("errorMessage", getOutErrorMessage());
        if (outParameters.contains("errorMessageList")) mapValue.put("errorMessageList", getOutErrorMessageList());
        if (outParameters.contains("inventoryItemDetailSeqId")) mapValue.put("inventoryItemDetailSeqId", getOutInventoryItemDetailSeqId());
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
        if (mapValue.containsKey("availableToPromiseDiff")) setInAvailableToPromiseDiff((BigDecimal) mapValue.get("availableToPromiseDiff"));
        if (mapValue.containsKey("description")) setInDescription((String) mapValue.get("description"));
        if (mapValue.containsKey("fixedAssetId")) setInFixedAssetId((String) mapValue.get("fixedAssetId"));
        if (mapValue.containsKey("inventoryItemId")) setInInventoryItemId((String) mapValue.get("inventoryItemId"));
        if (mapValue.containsKey("itemIssuanceId")) setInItemIssuanceId((String) mapValue.get("itemIssuanceId"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("maintHistSeqId")) setInMaintHistSeqId((String) mapValue.get("maintHistSeqId"));
        if (mapValue.containsKey("orderId")) setInOrderId((String) mapValue.get("orderId"));
        if (mapValue.containsKey("orderItemSeqId")) setInOrderItemSeqId((String) mapValue.get("orderItemSeqId"));
        if (mapValue.containsKey("physicalInventoryId")) setInPhysicalInventoryId((String) mapValue.get("physicalInventoryId"));
        if (mapValue.containsKey("quantityOnHandDiff")) setInQuantityOnHandDiff((BigDecimal) mapValue.get("quantityOnHandDiff"));
        if (mapValue.containsKey("reasonEnumId")) setInReasonEnumId((String) mapValue.get("reasonEnumId"));
        if (mapValue.containsKey("receiptId")) setInReceiptId((String) mapValue.get("receiptId"));
        if (mapValue.containsKey("returnId")) setInReturnId((String) mapValue.get("returnId"));
        if (mapValue.containsKey("returnItemSeqId")) setInReturnItemSeqId((String) mapValue.get("returnItemSeqId"));
        if (mapValue.containsKey("shipGroupSeqId")) setInShipGroupSeqId((String) mapValue.get("shipGroupSeqId"));
        if (mapValue.containsKey("shipmentId")) setInShipmentId((String) mapValue.get("shipmentId"));
        if (mapValue.containsKey("shipmentItemSeqId")) setInShipmentItemSeqId((String) mapValue.get("shipmentItemSeqId"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("unitCost")) setInUnitCost((BigDecimal) mapValue.get("unitCost"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
        if (mapValue.containsKey("workEffortId")) setInWorkEffortId((String) mapValue.get("workEffortId"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("inventoryItemDetailSeqId")) setOutInventoryItemDetailSeqId((String) mapValue.get("inventoryItemDetailSeqId"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>CreateInventoryItemDetailService</code> from the input values of the given <code>CreateInventoryItemDetailService</code>.
     * @param input a <code>CreateInventoryItemDetailService</code>
     */
    public static CreateInventoryItemDetailService fromInput(CreateInventoryItemDetailService input) {
        CreateInventoryItemDetailService service = new CreateInventoryItemDetailService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>CreateInventoryItemDetailService</code> from the output values of the given <code>CreateInventoryItemDetailService</code>.
     * @param output a <code>CreateInventoryItemDetailService</code>
     */
    public static CreateInventoryItemDetailService fromOutput(CreateInventoryItemDetailService output) {
        CreateInventoryItemDetailService service = new CreateInventoryItemDetailService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CreateInventoryItemDetailService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CreateInventoryItemDetailService fromInput(Map<String, Object> mapValue) {
        CreateInventoryItemDetailService service = new CreateInventoryItemDetailService();
        service.putAllInput(mapValue);
        if (mapValue.containsKey("userLogin")) {
            GenericValue userGv = (GenericValue) mapValue.get("userLogin");
            if (userGv != null) {
                try {
                    service.setUser(new User(userGv, userGv.getDelegator()));
                } catch (InfrastructureException e) { }
            }
        }
        return service;
    }

    /**
     * Construct a <code>CreateInventoryItemDetailService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CreateInventoryItemDetailService fromOutput(Map<String, Object> mapValue) {
        CreateInventoryItemDetailService service = new CreateInventoryItemDetailService();
        service.putAllOutput(mapValue);
        return service;
    }
}
