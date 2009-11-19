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

/**
 * Tax Calc Service Interface.
 * Auto generated base service entity calcTaxInterface.
 *
 * Engine: interface
 * Location: 
 * Invoke: 
 * Defined in: file:/home/jeremy/programmation/opentaps-git/applications/accounting/servicedef/services_tax.xml
 */
public class CalcTaxInterfaceService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "calcTaxInterface";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.FALSE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        billToPartyId("billToPartyId"),
        itemAmountList("itemAmountList"),
        itemPriceList("itemPriceList"),
        itemProductList("itemProductList"),
        itemShippingList("itemShippingList"),
        locale("locale"),
        orderPromotionsAmount("orderPromotionsAmount"),
        orderShippingAmount("orderShippingAmount"),
        payToPartyId("payToPartyId"),
        productStoreId("productStoreId"),
        shippingAddress("shippingAddress"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        itemAdjustments("itemAdjustments"),
        locale("locale"),
        orderAdjustments("orderAdjustments"),
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
     * Creates a new <code>CalcTaxInterfaceService</code> instance.
     */
    public CalcTaxInterfaceService() {
        super();
    }


    private String inBillToPartyId;
    private List inItemAmountList;
    private List inItemPriceList;
    private List inItemProductList;
    private List inItemShippingList;
    private Locale inLocale;
    private BigDecimal inOrderPromotionsAmount;
    private BigDecimal inOrderShippingAmount;
    private String inPayToPartyId;
    private String inProductStoreId;
    private GenericValue inShippingAddress;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String outErrorMessage;
    private List outErrorMessageList;
    private List outItemAdjustments;
    private Locale outLocale;
    private List outOrderAdjustments;
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
    public String getInBillToPartyId() {
        return this.inBillToPartyId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>List</code>
     */
    public List getInItemAmountList() {
        return this.inItemAmountList;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>List</code>
     */
    public List getInItemPriceList() {
        return this.inItemPriceList;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>List</code>
     */
    public List getInItemProductList() {
        return this.inItemProductList;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getInItemShippingList() {
        return this.inItemShippingList;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInOrderPromotionsAmount() {
        return this.inOrderPromotionsAmount;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInOrderShippingAmount() {
        return this.inOrderShippingAmount;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPayToPartyId() {
        return this.inPayToPartyId;
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
     * @return <code>GenericValue</code>
     */
    public GenericValue getInShippingAddress() {
        return this.inShippingAddress;
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
     * This parameter is required.
     * @return <code>List</code>
     */
    public List getOutItemAdjustments() {
        return this.outItemAdjustments;
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
     * @return <code>List</code>
     */
    public List getOutOrderAdjustments() {
        return this.outOrderAdjustments;
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
     * @param inBillToPartyId the inBillToPartyId to set
    */
    public void setInBillToPartyId(String inBillToPartyId) {
        this.inParameters.add("billToPartyId");
        this.inBillToPartyId = inBillToPartyId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inItemAmountList the inItemAmountList to set
    */
    public void setInItemAmountList(List inItemAmountList) {
        this.inParameters.add("itemAmountList");
        this.inItemAmountList = inItemAmountList;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inItemPriceList the inItemPriceList to set
    */
    public void setInItemPriceList(List inItemPriceList) {
        this.inParameters.add("itemPriceList");
        this.inItemPriceList = inItemPriceList;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inItemProductList the inItemProductList to set
    */
    public void setInItemProductList(List inItemProductList) {
        this.inParameters.add("itemProductList");
        this.inItemProductList = inItemProductList;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inItemShippingList the inItemShippingList to set
    */
    public void setInItemShippingList(List inItemShippingList) {
        this.inParameters.add("itemShippingList");
        this.inItemShippingList = inItemShippingList;
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
     * @param inOrderPromotionsAmount the inOrderPromotionsAmount to set
    */
    public void setInOrderPromotionsAmount(BigDecimal inOrderPromotionsAmount) {
        this.inParameters.add("orderPromotionsAmount");
        this.inOrderPromotionsAmount = inOrderPromotionsAmount;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inOrderShippingAmount the inOrderShippingAmount to set
    */
    public void setInOrderShippingAmount(BigDecimal inOrderShippingAmount) {
        this.inParameters.add("orderShippingAmount");
        this.inOrderShippingAmount = inOrderShippingAmount;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPayToPartyId the inPayToPartyId to set
    */
    public void setInPayToPartyId(String inPayToPartyId) {
        this.inParameters.add("payToPartyId");
        this.inPayToPartyId = inPayToPartyId;
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
     * @param inShippingAddress the inShippingAddress to set
    */
    public void setInShippingAddress(GenericValue inShippingAddress) {
        this.inParameters.add("shippingAddress");
        this.inShippingAddress = inShippingAddress;
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
     * This parameter is required.
     * @param outItemAdjustments the outItemAdjustments to set
    */
    public void setOutItemAdjustments(List outItemAdjustments) {
        this.outParameters.add("itemAdjustments");
        this.outItemAdjustments = outItemAdjustments;
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
     * @param outOrderAdjustments the outOrderAdjustments to set
    */
    public void setOutOrderAdjustments(List outOrderAdjustments) {
        this.outParameters.add("orderAdjustments");
        this.outOrderAdjustments = outOrderAdjustments;
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
        if (inParameters.contains("billToPartyId")) mapValue.put("billToPartyId", getInBillToPartyId());
        if (inParameters.contains("itemAmountList")) mapValue.put("itemAmountList", getInItemAmountList());
        if (inParameters.contains("itemPriceList")) mapValue.put("itemPriceList", getInItemPriceList());
        if (inParameters.contains("itemProductList")) mapValue.put("itemProductList", getInItemProductList());
        if (inParameters.contains("itemShippingList")) mapValue.put("itemShippingList", getInItemShippingList());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("orderPromotionsAmount")) mapValue.put("orderPromotionsAmount", getInOrderPromotionsAmount());
        if (inParameters.contains("orderShippingAmount")) mapValue.put("orderShippingAmount", getInOrderShippingAmount());
        if (inParameters.contains("payToPartyId")) mapValue.put("payToPartyId", getInPayToPartyId());
        if (inParameters.contains("productStoreId")) mapValue.put("productStoreId", getInProductStoreId());
        if (inParameters.contains("shippingAddress")) mapValue.put("shippingAddress", getInShippingAddress());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("errorMessage")) mapValue.put("errorMessage", getOutErrorMessage());
        if (outParameters.contains("errorMessageList")) mapValue.put("errorMessageList", getOutErrorMessageList());
        if (outParameters.contains("itemAdjustments")) mapValue.put("itemAdjustments", getOutItemAdjustments());
        if (outParameters.contains("locale")) mapValue.put("locale", getOutLocale());
        if (outParameters.contains("orderAdjustments")) mapValue.put("orderAdjustments", getOutOrderAdjustments());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("billToPartyId")) setInBillToPartyId((String) mapValue.get("billToPartyId"));
        if (mapValue.containsKey("itemAmountList")) setInItemAmountList((List) mapValue.get("itemAmountList"));
        if (mapValue.containsKey("itemPriceList")) setInItemPriceList((List) mapValue.get("itemPriceList"));
        if (mapValue.containsKey("itemProductList")) setInItemProductList((List) mapValue.get("itemProductList"));
        if (mapValue.containsKey("itemShippingList")) setInItemShippingList((List) mapValue.get("itemShippingList"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("orderPromotionsAmount")) setInOrderPromotionsAmount((BigDecimal) mapValue.get("orderPromotionsAmount"));
        if (mapValue.containsKey("orderShippingAmount")) setInOrderShippingAmount((BigDecimal) mapValue.get("orderShippingAmount"));
        if (mapValue.containsKey("payToPartyId")) setInPayToPartyId((String) mapValue.get("payToPartyId"));
        if (mapValue.containsKey("productStoreId")) setInProductStoreId((String) mapValue.get("productStoreId"));
        if (mapValue.containsKey("shippingAddress")) setInShippingAddress((GenericValue) mapValue.get("shippingAddress"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("itemAdjustments")) setOutItemAdjustments((List) mapValue.get("itemAdjustments"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("orderAdjustments")) setOutOrderAdjustments((List) mapValue.get("orderAdjustments"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>CalcTaxInterfaceService</code> from the input values of the given <code>CalcTaxInterfaceService</code>.
     * @param input a <code>CalcTaxInterfaceService</code>
     */
    public static CalcTaxInterfaceService fromInput(CalcTaxInterfaceService input) {
        CalcTaxInterfaceService service = new CalcTaxInterfaceService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>CalcTaxInterfaceService</code> from the output values of the given <code>CalcTaxInterfaceService</code>.
     * @param output a <code>CalcTaxInterfaceService</code>
     */
    public static CalcTaxInterfaceService fromOutput(CalcTaxInterfaceService output) {
        CalcTaxInterfaceService service = new CalcTaxInterfaceService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CalcTaxInterfaceService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CalcTaxInterfaceService fromInput(Map<String, Object> mapValue) {
        CalcTaxInterfaceService service = new CalcTaxInterfaceService();
        service.putAllInput(mapValue);
        return service;
    }

    /**
     * Construct a <code>CalcTaxInterfaceService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CalcTaxInterfaceService fromOutput(Map<String, Object> mapValue) {
        CalcTaxInterfaceService service = new CalcTaxInterfaceService();
        service.putAllOutput(mapValue);
        return service;
    }
}
