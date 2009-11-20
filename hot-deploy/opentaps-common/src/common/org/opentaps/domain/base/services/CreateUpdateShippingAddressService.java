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
import org.opentaps.foundation.infrastructure.User;

/**
 * Creates new shipping address and update existing address.
 * Auto generated base service entity createUpdateShippingAddress.
 *
 * Engine: simple
 * Location: component://order/script/org/ofbiz/order/order/OrderServices.xml
 * Invoke: createUpdateShippingAddress
 * Defined in: file:/home/jeremy/programmation/opentaps-git/applications/order/servicedef/services.xml
 */
public class CreateUpdateShippingAddressService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "createUpdateShippingAddress";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        billToContactMechId("billToContactMechId"),
        keepAddressBook("keepAddressBook"),
        locale("locale"),
        partyId("partyId"),
        productStoreId("productStoreId"),
        setDefaultShipping("setDefaultShipping"),
        shipToAddress1("shipToAddress1"),
        shipToAddress2("shipToAddress2"),
        shipToAttnName("shipToAttnName"),
        shipToCity("shipToCity"),
        shipToContactMechId("shipToContactMechId"),
        shipToCountryGeoId("shipToCountryGeoId"),
        shipToName("shipToName"),
        shipToPostalCode("shipToPostalCode"),
        shipToStateProvinceGeoId("shipToStateProvinceGeoId"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        contactMechId("contactMechId"),
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
     * Creates a new <code>CreateUpdateShippingAddressService</code> instance.
     */
    public CreateUpdateShippingAddressService() {
        super();
    }

    /**
     * Creates a new <code>CreateUpdateShippingAddressService</code> instance.
     * @param user an <code>User</code> value
     */
    public CreateUpdateShippingAddressService(User user) {
        super(user);
    }

    private String inBillToContactMechId;
    private String inKeepAddressBook;
    private Locale inLocale;
    private String inPartyId;
    private String inProductStoreId;
    private String inSetDefaultShipping;
    private String inShipToAddress1;
    private String inShipToAddress2;
    private String inShipToAttnName;
    private String inShipToCity;
    private String inShipToContactMechId;
    private String inShipToCountryGeoId;
    private String inShipToName;
    private String inShipToPostalCode;
    private String inShipToStateProvinceGeoId;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String outContactMechId;
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
    public String getInBillToContactMechId() {
        return this.inBillToContactMechId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInKeepAddressBook() {
        return this.inKeepAddressBook;
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
     * @return <code>String</code>
     */
    public String getInProductStoreId() {
        return this.inProductStoreId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInSetDefaultShipping() {
        return this.inSetDefaultShipping;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInShipToAddress1() {
        return this.inShipToAddress1;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInShipToAddress2() {
        return this.inShipToAddress2;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInShipToAttnName() {
        return this.inShipToAttnName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInShipToCity() {
        return this.inShipToCity;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInShipToContactMechId() {
        return this.inShipToContactMechId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInShipToCountryGeoId() {
        return this.inShipToCountryGeoId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInShipToName() {
        return this.inShipToName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInShipToPostalCode() {
        return this.inShipToPostalCode;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInShipToStateProvinceGeoId() {
        return this.inShipToStateProvinceGeoId;
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
     * @return <code>String</code>
     */
    public String getOutContactMechId() {
        return this.outContactMechId;
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
     * @param inBillToContactMechId the inBillToContactMechId to set
    */
    public void setInBillToContactMechId(String inBillToContactMechId) {
        this.inParameters.add("billToContactMechId");
        this.inBillToContactMechId = inBillToContactMechId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inKeepAddressBook the inKeepAddressBook to set
    */
    public void setInKeepAddressBook(String inKeepAddressBook) {
        this.inParameters.add("keepAddressBook");
        this.inKeepAddressBook = inKeepAddressBook;
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
     * @param inProductStoreId the inProductStoreId to set
    */
    public void setInProductStoreId(String inProductStoreId) {
        this.inParameters.add("productStoreId");
        this.inProductStoreId = inProductStoreId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSetDefaultShipping the inSetDefaultShipping to set
    */
    public void setInSetDefaultShipping(String inSetDefaultShipping) {
        this.inParameters.add("setDefaultShipping");
        this.inSetDefaultShipping = inSetDefaultShipping;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inShipToAddress1 the inShipToAddress1 to set
    */
    public void setInShipToAddress1(String inShipToAddress1) {
        this.inParameters.add("shipToAddress1");
        this.inShipToAddress1 = inShipToAddress1;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inShipToAddress2 the inShipToAddress2 to set
    */
    public void setInShipToAddress2(String inShipToAddress2) {
        this.inParameters.add("shipToAddress2");
        this.inShipToAddress2 = inShipToAddress2;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inShipToAttnName the inShipToAttnName to set
    */
    public void setInShipToAttnName(String inShipToAttnName) {
        this.inParameters.add("shipToAttnName");
        this.inShipToAttnName = inShipToAttnName;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inShipToCity the inShipToCity to set
    */
    public void setInShipToCity(String inShipToCity) {
        this.inParameters.add("shipToCity");
        this.inShipToCity = inShipToCity;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inShipToContactMechId the inShipToContactMechId to set
    */
    public void setInShipToContactMechId(String inShipToContactMechId) {
        this.inParameters.add("shipToContactMechId");
        this.inShipToContactMechId = inShipToContactMechId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inShipToCountryGeoId the inShipToCountryGeoId to set
    */
    public void setInShipToCountryGeoId(String inShipToCountryGeoId) {
        this.inParameters.add("shipToCountryGeoId");
        this.inShipToCountryGeoId = inShipToCountryGeoId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inShipToName the inShipToName to set
    */
    public void setInShipToName(String inShipToName) {
        this.inParameters.add("shipToName");
        this.inShipToName = inShipToName;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inShipToPostalCode the inShipToPostalCode to set
    */
    public void setInShipToPostalCode(String inShipToPostalCode) {
        this.inParameters.add("shipToPostalCode");
        this.inShipToPostalCode = inShipToPostalCode;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inShipToStateProvinceGeoId the inShipToStateProvinceGeoId to set
    */
    public void setInShipToStateProvinceGeoId(String inShipToStateProvinceGeoId) {
        this.inParameters.add("shipToStateProvinceGeoId");
        this.inShipToStateProvinceGeoId = inShipToStateProvinceGeoId;
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
     * @param outContactMechId the outContactMechId to set
    */
    public void setOutContactMechId(String outContactMechId) {
        this.outParameters.add("contactMechId");
        this.outContactMechId = outContactMechId;
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
        if (inParameters.contains("billToContactMechId")) mapValue.put("billToContactMechId", getInBillToContactMechId());
        if (inParameters.contains("keepAddressBook")) mapValue.put("keepAddressBook", getInKeepAddressBook());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("partyId")) mapValue.put("partyId", getInPartyId());
        if (inParameters.contains("productStoreId")) mapValue.put("productStoreId", getInProductStoreId());
        if (inParameters.contains("setDefaultShipping")) mapValue.put("setDefaultShipping", getInSetDefaultShipping());
        if (inParameters.contains("shipToAddress1")) mapValue.put("shipToAddress1", getInShipToAddress1());
        if (inParameters.contains("shipToAddress2")) mapValue.put("shipToAddress2", getInShipToAddress2());
        if (inParameters.contains("shipToAttnName")) mapValue.put("shipToAttnName", getInShipToAttnName());
        if (inParameters.contains("shipToCity")) mapValue.put("shipToCity", getInShipToCity());
        if (inParameters.contains("shipToContactMechId")) mapValue.put("shipToContactMechId", getInShipToContactMechId());
        if (inParameters.contains("shipToCountryGeoId")) mapValue.put("shipToCountryGeoId", getInShipToCountryGeoId());
        if (inParameters.contains("shipToName")) mapValue.put("shipToName", getInShipToName());
        if (inParameters.contains("shipToPostalCode")) mapValue.put("shipToPostalCode", getInShipToPostalCode());
        if (inParameters.contains("shipToStateProvinceGeoId")) mapValue.put("shipToStateProvinceGeoId", getInShipToStateProvinceGeoId());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        // allow the User set to override the userLogin
        if (getUser() != null) mapValue.put("userLogin", getUser().getOfbizUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("contactMechId")) mapValue.put("contactMechId", getOutContactMechId());
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
        if (mapValue.containsKey("billToContactMechId")) setInBillToContactMechId((String) mapValue.get("billToContactMechId"));
        if (mapValue.containsKey("keepAddressBook")) setInKeepAddressBook((String) mapValue.get("keepAddressBook"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("partyId")) setInPartyId((String) mapValue.get("partyId"));
        if (mapValue.containsKey("productStoreId")) setInProductStoreId((String) mapValue.get("productStoreId"));
        if (mapValue.containsKey("setDefaultShipping")) setInSetDefaultShipping((String) mapValue.get("setDefaultShipping"));
        if (mapValue.containsKey("shipToAddress1")) setInShipToAddress1((String) mapValue.get("shipToAddress1"));
        if (mapValue.containsKey("shipToAddress2")) setInShipToAddress2((String) mapValue.get("shipToAddress2"));
        if (mapValue.containsKey("shipToAttnName")) setInShipToAttnName((String) mapValue.get("shipToAttnName"));
        if (mapValue.containsKey("shipToCity")) setInShipToCity((String) mapValue.get("shipToCity"));
        if (mapValue.containsKey("shipToContactMechId")) setInShipToContactMechId((String) mapValue.get("shipToContactMechId"));
        if (mapValue.containsKey("shipToCountryGeoId")) setInShipToCountryGeoId((String) mapValue.get("shipToCountryGeoId"));
        if (mapValue.containsKey("shipToName")) setInShipToName((String) mapValue.get("shipToName"));
        if (mapValue.containsKey("shipToPostalCode")) setInShipToPostalCode((String) mapValue.get("shipToPostalCode"));
        if (mapValue.containsKey("shipToStateProvinceGeoId")) setInShipToStateProvinceGeoId((String) mapValue.get("shipToStateProvinceGeoId"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("contactMechId")) setOutContactMechId((String) mapValue.get("contactMechId"));
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
     * Construct a <code>CreateUpdateShippingAddressService</code> from the input values of the given <code>CreateUpdateShippingAddressService</code>.
     * @param input a <code>CreateUpdateShippingAddressService</code>
     */
    public static CreateUpdateShippingAddressService fromInput(CreateUpdateShippingAddressService input) {
        CreateUpdateShippingAddressService service = new CreateUpdateShippingAddressService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>CreateUpdateShippingAddressService</code> from the output values of the given <code>CreateUpdateShippingAddressService</code>.
     * @param output a <code>CreateUpdateShippingAddressService</code>
     */
    public static CreateUpdateShippingAddressService fromOutput(CreateUpdateShippingAddressService output) {
        CreateUpdateShippingAddressService service = new CreateUpdateShippingAddressService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CreateUpdateShippingAddressService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CreateUpdateShippingAddressService fromInput(Map<String, Object> mapValue) {
        CreateUpdateShippingAddressService service = new CreateUpdateShippingAddressService();
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
     * Construct a <code>CreateUpdateShippingAddressService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CreateUpdateShippingAddressService fromOutput(Map<String, Object> mapValue) {
        CreateUpdateShippingAddressService service = new CreateUpdateShippingAddressService();
        service.putAllOutput(mapValue);
        return service;
    }
}
