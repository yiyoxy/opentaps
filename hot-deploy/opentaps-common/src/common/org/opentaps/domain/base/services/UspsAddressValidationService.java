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
 * .
 * Auto generated base service entity uspsAddressValidation.
 *
 * Engine: java
 * Location: org.ofbiz.shipment.thirdparty.usps.UspsServices
 * Invoke: uspsAddressValidation
 * Defined in: file:/home/jeremy/programmation/opentaps-git/applications/product/servicedef/services_shipment_usps.xml
 */
public class UspsAddressValidationService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "uspsAddressValidation";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.FALSE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        address1("address1"),
        address2("address2"),
        city("city"),
        firmName("firmName"),
        locale("locale"),
        state("state"),
        timeZone("timeZone"),
        userLogin("userLogin"),
        zip4("zip4"),
        zip5("zip5");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        address1("address1"),
        address2("address2"),
        city("city"),
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        firmName("firmName"),
        locale("locale"),
        responseMessage("responseMessage"),
        returnText("returnText"),
        state("state"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        userLogin("userLogin"),
        zip4("zip4"),
        zip5("zip5");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    /**
     * Creates a new <code>UspsAddressValidationService</code> instance.
     */
    public UspsAddressValidationService() {
        super();
    }


    private String inAddress1;
    private String inAddress2;
    private String inCity;
    private String inFirmName;
    private Locale inLocale;
    private String inState;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String inZip4;
    private String inZip5;
    private String outAddress1;
    private String outAddress2;
    private String outCity;
    private String outErrorMessage;
    private List outErrorMessageList;
    private String outFirmName;
    private Locale outLocale;
    private String outResponseMessage;
    private String outReturnText;
    private String outState;
    private String outSuccessMessage;
    private List outSuccessMessageList;
    private TimeZone outTimeZone;
    private GenericValue outUserLogin;
    private String outZip4;
    private String outZip5;

    private Set<String> inParameters = FastSet.newInstance();
    private Set<String> outParameters = FastSet.newInstance();

    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInAddress1() {
        return this.inAddress1;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAddress2() {
        return this.inAddress2;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCity() {
        return this.inCity;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInFirmName() {
        return this.inFirmName;
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
    public String getInState() {
        return this.inState;
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
    public String getInZip4() {
        return this.inZip4;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInZip5() {
        return this.inZip5;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getOutAddress1() {
        return this.outAddress1;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutAddress2() {
        return this.outAddress2;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutCity() {
        return this.outCity;
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
     * @return <code>String</code>
     */
    public String getOutFirmName() {
        return this.outFirmName;
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
    public String getOutReturnText() {
        return this.outReturnText;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutState() {
        return this.outState;
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
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutZip4() {
        return this.outZip4;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutZip5() {
        return this.outZip5;
    }

    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inAddress1 the inAddress1 to set
    */
    public void setInAddress1(String inAddress1) {
        this.inParameters.add("address1");
        this.inAddress1 = inAddress1;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAddress2 the inAddress2 to set
    */
    public void setInAddress2(String inAddress2) {
        this.inParameters.add("address2");
        this.inAddress2 = inAddress2;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCity the inCity to set
    */
    public void setInCity(String inCity) {
        this.inParameters.add("city");
        this.inCity = inCity;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFirmName the inFirmName to set
    */
    public void setInFirmName(String inFirmName) {
        this.inParameters.add("firmName");
        this.inFirmName = inFirmName;
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
     * @param inState the inState to set
    */
    public void setInState(String inState) {
        this.inParameters.add("state");
        this.inState = inState;
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
     * @param inZip4 the inZip4 to set
    */
    public void setInZip4(String inZip4) {
        this.inParameters.add("zip4");
        this.inZip4 = inZip4;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inZip5 the inZip5 to set
    */
    public void setInZip5(String inZip5) {
        this.inParameters.add("zip5");
        this.inZip5 = inZip5;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param outAddress1 the outAddress1 to set
    */
    public void setOutAddress1(String outAddress1) {
        this.outParameters.add("address1");
        this.outAddress1 = outAddress1;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outAddress2 the outAddress2 to set
    */
    public void setOutAddress2(String outAddress2) {
        this.outParameters.add("address2");
        this.outAddress2 = outAddress2;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outCity the outCity to set
    */
    public void setOutCity(String outCity) {
        this.outParameters.add("city");
        this.outCity = outCity;
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
     * @param outFirmName the outFirmName to set
    */
    public void setOutFirmName(String outFirmName) {
        this.outParameters.add("firmName");
        this.outFirmName = outFirmName;
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
     * @param outReturnText the outReturnText to set
    */
    public void setOutReturnText(String outReturnText) {
        this.outParameters.add("returnText");
        this.outReturnText = outReturnText;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outState the outState to set
    */
    public void setOutState(String outState) {
        this.outParameters.add("state");
        this.outState = outState;
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
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outZip4 the outZip4 to set
    */
    public void setOutZip4(String outZip4) {
        this.outParameters.add("zip4");
        this.outZip4 = outZip4;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outZip5 the outZip5 to set
    */
    public void setOutZip5(String outZip5) {
        this.outParameters.add("zip5");
        this.outZip5 = outZip5;
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
        if (inParameters.contains("address1")) mapValue.put("address1", getInAddress1());
        if (inParameters.contains("address2")) mapValue.put("address2", getInAddress2());
        if (inParameters.contains("city")) mapValue.put("city", getInCity());
        if (inParameters.contains("firmName")) mapValue.put("firmName", getInFirmName());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("state")) mapValue.put("state", getInState());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        if (inParameters.contains("zip4")) mapValue.put("zip4", getInZip4());
        if (inParameters.contains("zip5")) mapValue.put("zip5", getInZip5());
        // allow the User set to override the userLogin
        if (getUser() != null) mapValue.put("userLogin", getUser().getOfbizUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("address1")) mapValue.put("address1", getOutAddress1());
        if (outParameters.contains("address2")) mapValue.put("address2", getOutAddress2());
        if (outParameters.contains("city")) mapValue.put("city", getOutCity());
        if (outParameters.contains("errorMessage")) mapValue.put("errorMessage", getOutErrorMessage());
        if (outParameters.contains("errorMessageList")) mapValue.put("errorMessageList", getOutErrorMessageList());
        if (outParameters.contains("firmName")) mapValue.put("firmName", getOutFirmName());
        if (outParameters.contains("locale")) mapValue.put("locale", getOutLocale());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("returnText")) mapValue.put("returnText", getOutReturnText());
        if (outParameters.contains("state")) mapValue.put("state", getOutState());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        if (outParameters.contains("zip4")) mapValue.put("zip4", getOutZip4());
        if (outParameters.contains("zip5")) mapValue.put("zip5", getOutZip5());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("address1")) setInAddress1((String) mapValue.get("address1"));
        if (mapValue.containsKey("address2")) setInAddress2((String) mapValue.get("address2"));
        if (mapValue.containsKey("city")) setInCity((String) mapValue.get("city"));
        if (mapValue.containsKey("firmName")) setInFirmName((String) mapValue.get("firmName"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("state")) setInState((String) mapValue.get("state"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
        if (mapValue.containsKey("zip4")) setInZip4((String) mapValue.get("zip4"));
        if (mapValue.containsKey("zip5")) setInZip5((String) mapValue.get("zip5"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("address1")) setOutAddress1((String) mapValue.get("address1"));
        if (mapValue.containsKey("address2")) setOutAddress2((String) mapValue.get("address2"));
        if (mapValue.containsKey("city")) setOutCity((String) mapValue.get("city"));
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("firmName")) setOutFirmName((String) mapValue.get("firmName"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("returnText")) setOutReturnText((String) mapValue.get("returnText"));
        if (mapValue.containsKey("state")) setOutState((String) mapValue.get("state"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
        if (mapValue.containsKey("zip4")) setOutZip4((String) mapValue.get("zip4"));
        if (mapValue.containsKey("zip5")) setOutZip5((String) mapValue.get("zip5"));
    }

    /**
     * Construct a <code>UspsAddressValidationService</code> from the input values of the given <code>UspsAddressValidationService</code>.
     * @param input a <code>UspsAddressValidationService</code>
     */
    public static UspsAddressValidationService fromInput(UspsAddressValidationService input) {
        UspsAddressValidationService service = new UspsAddressValidationService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>UspsAddressValidationService</code> from the output values of the given <code>UspsAddressValidationService</code>.
     * @param output a <code>UspsAddressValidationService</code>
     */
    public static UspsAddressValidationService fromOutput(UspsAddressValidationService output) {
        UspsAddressValidationService service = new UspsAddressValidationService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>UspsAddressValidationService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static UspsAddressValidationService fromInput(Map<String, Object> mapValue) {
        UspsAddressValidationService service = new UspsAddressValidationService();
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
     * Construct a <code>UspsAddressValidationService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static UspsAddressValidationService fromOutput(Map<String, Object> mapValue) {
        UspsAddressValidationService service = new UspsAddressValidationService();
        service.putAllOutput(mapValue);
        return service;
    }
}
