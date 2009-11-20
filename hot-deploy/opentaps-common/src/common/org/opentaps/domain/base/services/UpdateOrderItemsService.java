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

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import javolution.util.FastMap;
import javolution.util.FastSet;
import org.ofbiz.entity.GenericValue;
import org.ofbiz.order.shoppingcart.ShoppingCart;
import org.opentaps.foundation.infrastructure.User;

/**
 * Update the quantities/prices for an existing order, copied from ofbiz to customize how cancel quantities are handled..
 * Auto generated base service entity updateOrderItems.
 *
 * Engine: java
 * Location: org.opentaps.common.order.OrderServices
 * Invoke: updateApprovedOrderItemsLegacy
 * Defined in: file:/home/jeremy/programmation/opentaps-git/hot-deploy/opentaps-common/servicedef/services_orders.xml
 */
public class UpdateOrderItemsService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "updateOrderItems";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        forceComplete("forceComplete"),
        itemAttributesMap("itemAttributesMap"),
        itemCommentMap("itemCommentMap"),
        itemDeliveryDateMap("itemDeliveryDateMap"),
        itemDescriptionMap("itemDescriptionMap"),
        itemPriceMap("itemPriceMap"),
        itemQtyMap("itemQtyMap"),
        itemReasonMap("itemReasonMap"),
        itemShipDateMap("itemShipDateMap"),
        locale("locale"),
        orderId("orderId"),
        orderTypeId("orderTypeId"),
        overridePriceMap("overridePriceMap"),
        recalcAdjustments("recalcAdjustments"),
        supplierPartyId("supplierPartyId"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        locale("locale"),
        orderId("orderId"),
        responseMessage("responseMessage"),
        shoppingCart("shoppingCart"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    /**
     * Creates a new <code>UpdateOrderItemsService</code> instance.
     */
    public UpdateOrderItemsService() {
        super();
    }

    /**
     * Creates a new <code>UpdateOrderItemsService</code> instance.
     * @param user an <code>User</code> value
     */
    public UpdateOrderItemsService(User user) {
        super(user);
    }

    private String inForceComplete;
    private Map inItemAttributesMap;
    private Map inItemCommentMap;
    private Map inItemDeliveryDateMap;
    private Map inItemDescriptionMap;
    private Map inItemPriceMap;
    private Map inItemQtyMap;
    private Map inItemReasonMap;
    private Map inItemShipDateMap;
    private Locale inLocale;
    private String inOrderId;
    private String inOrderTypeId;
    private Map inOverridePriceMap;
    private String inRecalcAdjustments;
    private String inSupplierPartyId;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private String outOrderId;
    private String outResponseMessage;
    private ShoppingCart outShoppingCart;
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
    public String getInForceComplete() {
        return this.inForceComplete;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Map</code>
     */
    public Map getInItemAttributesMap() {
        return this.inItemAttributesMap;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Map</code>
     */
    public Map getInItemCommentMap() {
        return this.inItemCommentMap;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Map</code>
     */
    public Map getInItemDeliveryDateMap() {
        return this.inItemDeliveryDateMap;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Map</code>
     */
    public Map getInItemDescriptionMap() {
        return this.inItemDescriptionMap;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Map</code>
     */
    public Map getInItemPriceMap() {
        return this.inItemPriceMap;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Map</code>
     */
    public Map getInItemQtyMap() {
        return this.inItemQtyMap;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Map</code>
     */
    public Map getInItemReasonMap() {
        return this.inItemReasonMap;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Map</code>
     */
    public Map getInItemShipDateMap() {
        return this.inItemShipDateMap;
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
    public String getInOrderTypeId() {
        return this.inOrderTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Map</code>
     */
    public Map getInOverridePriceMap() {
        return this.inOverridePriceMap;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRecalcAdjustments() {
        return this.inRecalcAdjustments;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInSupplierPartyId() {
        return this.inSupplierPartyId;
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
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getOutOrderId() {
        return this.outOrderId;
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
     * This parameter is required.
     * @return <code>ShoppingCart</code>
     */
    public ShoppingCart getOutShoppingCart() {
        return this.outShoppingCart;
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
     * @param inForceComplete the inForceComplete to set
    */
    public void setInForceComplete(String inForceComplete) {
        this.inParameters.add("forceComplete");
        this.inForceComplete = inForceComplete;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inItemAttributesMap the inItemAttributesMap to set
    */
    public void setInItemAttributesMap(Map inItemAttributesMap) {
        this.inParameters.add("itemAttributesMap");
        this.inItemAttributesMap = inItemAttributesMap;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inItemCommentMap the inItemCommentMap to set
    */
    public void setInItemCommentMap(Map inItemCommentMap) {
        this.inParameters.add("itemCommentMap");
        this.inItemCommentMap = inItemCommentMap;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inItemDeliveryDateMap the inItemDeliveryDateMap to set
    */
    public void setInItemDeliveryDateMap(Map inItemDeliveryDateMap) {
        this.inParameters.add("itemDeliveryDateMap");
        this.inItemDeliveryDateMap = inItemDeliveryDateMap;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inItemDescriptionMap the inItemDescriptionMap to set
    */
    public void setInItemDescriptionMap(Map inItemDescriptionMap) {
        this.inParameters.add("itemDescriptionMap");
        this.inItemDescriptionMap = inItemDescriptionMap;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inItemPriceMap the inItemPriceMap to set
    */
    public void setInItemPriceMap(Map inItemPriceMap) {
        this.inParameters.add("itemPriceMap");
        this.inItemPriceMap = inItemPriceMap;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inItemQtyMap the inItemQtyMap to set
    */
    public void setInItemQtyMap(Map inItemQtyMap) {
        this.inParameters.add("itemQtyMap");
        this.inItemQtyMap = inItemQtyMap;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inItemReasonMap the inItemReasonMap to set
    */
    public void setInItemReasonMap(Map inItemReasonMap) {
        this.inParameters.add("itemReasonMap");
        this.inItemReasonMap = inItemReasonMap;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inItemShipDateMap the inItemShipDateMap to set
    */
    public void setInItemShipDateMap(Map inItemShipDateMap) {
        this.inParameters.add("itemShipDateMap");
        this.inItemShipDateMap = inItemShipDateMap;
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
     * @param inOrderTypeId the inOrderTypeId to set
    */
    public void setInOrderTypeId(String inOrderTypeId) {
        this.inParameters.add("orderTypeId");
        this.inOrderTypeId = inOrderTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inOverridePriceMap the inOverridePriceMap to set
    */
    public void setInOverridePriceMap(Map inOverridePriceMap) {
        this.inParameters.add("overridePriceMap");
        this.inOverridePriceMap = inOverridePriceMap;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRecalcAdjustments the inRecalcAdjustments to set
    */
    public void setInRecalcAdjustments(String inRecalcAdjustments) {
        this.inParameters.add("recalcAdjustments");
        this.inRecalcAdjustments = inRecalcAdjustments;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSupplierPartyId the inSupplierPartyId to set
    */
    public void setInSupplierPartyId(String inSupplierPartyId) {
        this.inParameters.add("supplierPartyId");
        this.inSupplierPartyId = inSupplierPartyId;
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
     * @param inUserLogin the inUserLogin to set
    */
    public void setInUserLogin(GenericValue inUserLogin) {
        this.inParameters.add("userLogin");
        this.inUserLogin = inUserLogin;
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
     * This parameter is required.
     * @param outOrderId the outOrderId to set
    */
    public void setOutOrderId(String outOrderId) {
        this.outParameters.add("orderId");
        this.outOrderId = outOrderId;
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
     * This parameter is required.
     * @param outShoppingCart the outShoppingCart to set
    */
    public void setOutShoppingCart(ShoppingCart outShoppingCart) {
        this.outParameters.add("shoppingCart");
        this.outShoppingCart = outShoppingCart;
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
        if (inParameters.contains("forceComplete")) mapValue.put("forceComplete", getInForceComplete());
        if (inParameters.contains("itemAttributesMap")) mapValue.put("itemAttributesMap", getInItemAttributesMap());
        if (inParameters.contains("itemCommentMap")) mapValue.put("itemCommentMap", getInItemCommentMap());
        if (inParameters.contains("itemDeliveryDateMap")) mapValue.put("itemDeliveryDateMap", getInItemDeliveryDateMap());
        if (inParameters.contains("itemDescriptionMap")) mapValue.put("itemDescriptionMap", getInItemDescriptionMap());
        if (inParameters.contains("itemPriceMap")) mapValue.put("itemPriceMap", getInItemPriceMap());
        if (inParameters.contains("itemQtyMap")) mapValue.put("itemQtyMap", getInItemQtyMap());
        if (inParameters.contains("itemReasonMap")) mapValue.put("itemReasonMap", getInItemReasonMap());
        if (inParameters.contains("itemShipDateMap")) mapValue.put("itemShipDateMap", getInItemShipDateMap());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("orderId")) mapValue.put("orderId", getInOrderId());
        if (inParameters.contains("orderTypeId")) mapValue.put("orderTypeId", getInOrderTypeId());
        if (inParameters.contains("overridePriceMap")) mapValue.put("overridePriceMap", getInOverridePriceMap());
        if (inParameters.contains("recalcAdjustments")) mapValue.put("recalcAdjustments", getInRecalcAdjustments());
        if (inParameters.contains("supplierPartyId")) mapValue.put("supplierPartyId", getInSupplierPartyId());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
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
        if (outParameters.contains("orderId")) mapValue.put("orderId", getOutOrderId());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("shoppingCart")) mapValue.put("shoppingCart", getOutShoppingCart());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("forceComplete")) setInForceComplete((String) mapValue.get("forceComplete"));
        if (mapValue.containsKey("itemAttributesMap")) setInItemAttributesMap((Map) mapValue.get("itemAttributesMap"));
        if (mapValue.containsKey("itemCommentMap")) setInItemCommentMap((Map) mapValue.get("itemCommentMap"));
        if (mapValue.containsKey("itemDeliveryDateMap")) setInItemDeliveryDateMap((Map) mapValue.get("itemDeliveryDateMap"));
        if (mapValue.containsKey("itemDescriptionMap")) setInItemDescriptionMap((Map) mapValue.get("itemDescriptionMap"));
        if (mapValue.containsKey("itemPriceMap")) setInItemPriceMap((Map) mapValue.get("itemPriceMap"));
        if (mapValue.containsKey("itemQtyMap")) setInItemQtyMap((Map) mapValue.get("itemQtyMap"));
        if (mapValue.containsKey("itemReasonMap")) setInItemReasonMap((Map) mapValue.get("itemReasonMap"));
        if (mapValue.containsKey("itemShipDateMap")) setInItemShipDateMap((Map) mapValue.get("itemShipDateMap"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("orderId")) setInOrderId((String) mapValue.get("orderId"));
        if (mapValue.containsKey("orderTypeId")) setInOrderTypeId((String) mapValue.get("orderTypeId"));
        if (mapValue.containsKey("overridePriceMap")) setInOverridePriceMap((Map) mapValue.get("overridePriceMap"));
        if (mapValue.containsKey("recalcAdjustments")) setInRecalcAdjustments((String) mapValue.get("recalcAdjustments"));
        if (mapValue.containsKey("supplierPartyId")) setInSupplierPartyId((String) mapValue.get("supplierPartyId"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("orderId")) setOutOrderId((String) mapValue.get("orderId"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("shoppingCart")) setOutShoppingCart((ShoppingCart) mapValue.get("shoppingCart"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>UpdateOrderItemsService</code> from the input values of the given <code>UpdateOrderItemsService</code>.
     * @param input a <code>UpdateOrderItemsService</code>
     */
    public static UpdateOrderItemsService fromInput(UpdateOrderItemsService input) {
        UpdateOrderItemsService service = new UpdateOrderItemsService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>UpdateOrderItemsService</code> from the output values of the given <code>UpdateOrderItemsService</code>.
     * @param output a <code>UpdateOrderItemsService</code>
     */
    public static UpdateOrderItemsService fromOutput(UpdateOrderItemsService output) {
        UpdateOrderItemsService service = new UpdateOrderItemsService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>UpdateOrderItemsService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static UpdateOrderItemsService fromInput(Map<String, Object> mapValue) {
        UpdateOrderItemsService service = new UpdateOrderItemsService();
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
     * Construct a <code>UpdateOrderItemsService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static UpdateOrderItemsService fromOutput(Map<String, Object> mapValue) {
        UpdateOrderItemsService service = new UpdateOrderItemsService();
        service.putAllOutput(mapValue);
        return service;
    }
}
