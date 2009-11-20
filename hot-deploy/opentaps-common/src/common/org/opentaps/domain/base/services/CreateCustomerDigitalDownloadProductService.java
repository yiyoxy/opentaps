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
 * .
 * Auto generated base service entity createCustomerDigitalDownloadProduct.
 *
 * Engine: simple
 * Location: component://product/script/org/ofbiz/product/product/CustomerDigitalDownloadServices.xml
 * Invoke: createCustomerDigitalDownloadProduct
 * Defined in: file:/home/jeremy/programmation/opentaps-git/applications/product/servicedef/services.xml
 */
public class CreateCustomerDigitalDownloadProductService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "createCustomerDigitalDownloadProduct";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        currencyUomId("currencyUomId"),
        description("description"),
        locale("locale"),
        price("price"),
        productName("productName"),
        productStoreId("productStoreId"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        availableFromDate("availableFromDate"),
        currencyUomId("currencyUomId"),
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        locale("locale"),
        minimumOrderQuantity("minimumOrderQuantity"),
        productId("productId"),
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
     * Creates a new <code>CreateCustomerDigitalDownloadProductService</code> instance.
     */
    public CreateCustomerDigitalDownloadProductService() {
        super();
    }

    /**
     * Creates a new <code>CreateCustomerDigitalDownloadProductService</code> instance.
     * @param user an <code>User</code> value
     */
    public CreateCustomerDigitalDownloadProductService(User user) {
        super(user);
    }

    private String inCurrencyUomId;
    private String inDescription;
    private Locale inLocale;
    private BigDecimal inPrice;
    private String inProductName;
    private String inProductStoreId;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private Timestamp outAvailableFromDate;
    private String outCurrencyUomId;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private BigDecimal outMinimumOrderQuantity;
    private String outProductId;
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
     * @return <code>String</code>
     */
    public String getInDescription() {
        return this.inDescription;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInPrice() {
        return this.inPrice;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInProductName() {
        return this.inProductName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInProductStoreId() {
        return this.inProductStoreId;
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
     * This parameter is required.
     * @return <code>Timestamp</code>
     */
    public Timestamp getOutAvailableFromDate() {
        return this.outAvailableFromDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getOutCurrencyUomId() {
        return this.outCurrencyUomId;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getOutMinimumOrderQuantity() {
        return this.outMinimumOrderQuantity;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getOutProductId() {
        return this.outProductId;
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
     * @param inDescription the inDescription to set
    */
    public void setInDescription(String inDescription) {
        this.inParameters.add("description");
        this.inDescription = inDescription;
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
     * @param inPrice the inPrice to set
    */
    public void setInPrice(BigDecimal inPrice) {
        this.inParameters.add("price");
        this.inPrice = inPrice;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inProductName the inProductName to set
    */
    public void setInProductName(String inProductName) {
        this.inParameters.add("productName");
        this.inProductName = inProductName;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inProductStoreId the inProductStoreId to set
    */
    public void setInProductStoreId(String inProductStoreId) {
        this.inParameters.add("productStoreId");
        this.inProductStoreId = inProductStoreId;
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
     * This parameter is required.
     * @param outAvailableFromDate the outAvailableFromDate to set
    */
    public void setOutAvailableFromDate(Timestamp outAvailableFromDate) {
        this.outParameters.add("availableFromDate");
        this.outAvailableFromDate = outAvailableFromDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param outCurrencyUomId the outCurrencyUomId to set
    */
    public void setOutCurrencyUomId(String outCurrencyUomId) {
        this.outParameters.add("currencyUomId");
        this.outCurrencyUomId = outCurrencyUomId;
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
     * @param outMinimumOrderQuantity the outMinimumOrderQuantity to set
    */
    public void setOutMinimumOrderQuantity(BigDecimal outMinimumOrderQuantity) {
        this.outParameters.add("minimumOrderQuantity");
        this.outMinimumOrderQuantity = outMinimumOrderQuantity;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param outProductId the outProductId to set
    */
    public void setOutProductId(String outProductId) {
        this.outParameters.add("productId");
        this.outProductId = outProductId;
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
        if (inParameters.contains("description")) mapValue.put("description", getInDescription());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("price")) mapValue.put("price", getInPrice());
        if (inParameters.contains("productName")) mapValue.put("productName", getInProductName());
        if (inParameters.contains("productStoreId")) mapValue.put("productStoreId", getInProductStoreId());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        // allow the User set to override the userLogin
        if (getUser() != null) mapValue.put("userLogin", getUser().getOfbizUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("availableFromDate")) mapValue.put("availableFromDate", getOutAvailableFromDate());
        if (outParameters.contains("currencyUomId")) mapValue.put("currencyUomId", getOutCurrencyUomId());
        if (outParameters.contains("errorMessage")) mapValue.put("errorMessage", getOutErrorMessage());
        if (outParameters.contains("errorMessageList")) mapValue.put("errorMessageList", getOutErrorMessageList());
        if (outParameters.contains("locale")) mapValue.put("locale", getOutLocale());
        if (outParameters.contains("minimumOrderQuantity")) mapValue.put("minimumOrderQuantity", getOutMinimumOrderQuantity());
        if (outParameters.contains("productId")) mapValue.put("productId", getOutProductId());
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
        if (mapValue.containsKey("description")) setInDescription((String) mapValue.get("description"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("price")) setInPrice((BigDecimal) mapValue.get("price"));
        if (mapValue.containsKey("productName")) setInProductName((String) mapValue.get("productName"));
        if (mapValue.containsKey("productStoreId")) setInProductStoreId((String) mapValue.get("productStoreId"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("availableFromDate")) setOutAvailableFromDate((Timestamp) mapValue.get("availableFromDate"));
        if (mapValue.containsKey("currencyUomId")) setOutCurrencyUomId((String) mapValue.get("currencyUomId"));
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("minimumOrderQuantity")) setOutMinimumOrderQuantity((BigDecimal) mapValue.get("minimumOrderQuantity"));
        if (mapValue.containsKey("productId")) setOutProductId((String) mapValue.get("productId"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>CreateCustomerDigitalDownloadProductService</code> from the input values of the given <code>CreateCustomerDigitalDownloadProductService</code>.
     * @param input a <code>CreateCustomerDigitalDownloadProductService</code>
     */
    public static CreateCustomerDigitalDownloadProductService fromInput(CreateCustomerDigitalDownloadProductService input) {
        CreateCustomerDigitalDownloadProductService service = new CreateCustomerDigitalDownloadProductService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>CreateCustomerDigitalDownloadProductService</code> from the output values of the given <code>CreateCustomerDigitalDownloadProductService</code>.
     * @param output a <code>CreateCustomerDigitalDownloadProductService</code>
     */
    public static CreateCustomerDigitalDownloadProductService fromOutput(CreateCustomerDigitalDownloadProductService output) {
        CreateCustomerDigitalDownloadProductService service = new CreateCustomerDigitalDownloadProductService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CreateCustomerDigitalDownloadProductService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CreateCustomerDigitalDownloadProductService fromInput(Map<String, Object> mapValue) {
        CreateCustomerDigitalDownloadProductService service = new CreateCustomerDigitalDownloadProductService();
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
     * Construct a <code>CreateCustomerDigitalDownloadProductService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CreateCustomerDigitalDownloadProductService fromOutput(Map<String, Object> mapValue) {
        CreateCustomerDigitalDownloadProductService service = new CreateCustomerDigitalDownloadProductService();
        service.putAllOutput(mapValue);
        return service;
    }
}
