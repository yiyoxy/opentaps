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
 * Create an Account Group.
 * Auto generated base service entity createAccount.
 *
 * Engine: simple
 * Location: component://marketing/script/org/ofbiz/sfa/account/AccountServices.xml
 * Invoke: createAccount
 * Defined in: file:/home/jeremy/programmation/opentaps-git/applications/marketing/servicedef/services.xml
 */
public class CreateAccountService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "createAccount";
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
        annualRevenue("annualRevenue"),
        areaCode("areaCode"),
        askForName("askForName"),
        attnName("attnName"),
        city("city"),
        comments("comments"),
        contactNumber("contactNumber"),
        countryCode("countryCode"),
        countryGeoId("countryGeoId"),
        countyGeoId("countyGeoId"),
        directions("directions"),
        emailAddress("emailAddress"),
        extension("extension"),
        federalTaxId("federalTaxId"),
        geoPointId("geoPointId"),
        groupName("groupName"),
        groupNameLocal("groupNameLocal"),
        isIncorporated("isIncorporated"),
        locale("locale"),
        logoImageUrl("logoImageUrl"),
        numEmployees("numEmployees"),
        officeSiteName("officeSiteName"),
        postalCode("postalCode"),
        postalCodeExt("postalCodeExt"),
        postalCodeGeoId("postalCodeGeoId"),
        requires1099("requires1099"),
        stateProvinceGeoId("stateProvinceGeoId"),
        tickerSymbol("tickerSymbol"),
        timeZone("timeZone"),
        toName("toName"),
        userLogin("userLogin");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        locale("locale"),
        partyId("partyId"),
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
     * Creates a new <code>CreateAccountService</code> instance.
     */
    public CreateAccountService() {
        super();
    }


    private String inAddress1;
    private String inAddress2;
    private BigDecimal inAnnualRevenue;
    private String inAreaCode;
    private String inAskForName;
    private String inAttnName;
    private String inCity;
    private String inComments;
    private String inContactNumber;
    private String inCountryCode;
    private String inCountryGeoId;
    private String inCountyGeoId;
    private String inDirections;
    private String inEmailAddress;
    private String inExtension;
    private String inFederalTaxId;
    private String inGeoPointId;
    private String inGroupName;
    private String inGroupNameLocal;
    private String inIsIncorporated;
    private Locale inLocale;
    private String inLogoImageUrl;
    private Long inNumEmployees;
    private String inOfficeSiteName;
    private String inPostalCode;
    private String inPostalCodeExt;
    private String inPostalCodeGeoId;
    private String inRequires1099;
    private String inStateProvinceGeoId;
    private String inTickerSymbol;
    private TimeZone inTimeZone;
    private String inToName;
    private GenericValue inUserLogin;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private String outPartyId;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInAnnualRevenue() {
        return this.inAnnualRevenue;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAreaCode() {
        return this.inAreaCode;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAskForName() {
        return this.inAskForName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAttnName() {
        return this.inAttnName;
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
    public String getInComments() {
        return this.inComments;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInContactNumber() {
        return this.inContactNumber;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCountryCode() {
        return this.inCountryCode;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCountryGeoId() {
        return this.inCountryGeoId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCountyGeoId() {
        return this.inCountyGeoId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDirections() {
        return this.inDirections;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInEmailAddress() {
        return this.inEmailAddress;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInExtension() {
        return this.inExtension;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInFederalTaxId() {
        return this.inFederalTaxId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGeoPointId() {
        return this.inGeoPointId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGroupName() {
        return this.inGroupName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGroupNameLocal() {
        return this.inGroupNameLocal;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInIsIncorporated() {
        return this.inIsIncorporated;
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
    public String getInLogoImageUrl() {
        return this.inLogoImageUrl;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInNumEmployees() {
        return this.inNumEmployees;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInOfficeSiteName() {
        return this.inOfficeSiteName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPostalCode() {
        return this.inPostalCode;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPostalCodeExt() {
        return this.inPostalCodeExt;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPostalCodeGeoId() {
        return this.inPostalCodeGeoId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRequires1099() {
        return this.inRequires1099;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInStateProvinceGeoId() {
        return this.inStateProvinceGeoId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTickerSymbol() {
        return this.inTickerSymbol;
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
    public String getInToName() {
        return this.inToName;
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
    public String getOutPartyId() {
        return this.outPartyId;
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
     * @param inAnnualRevenue the inAnnualRevenue to set
    */
    public void setInAnnualRevenue(BigDecimal inAnnualRevenue) {
        this.inParameters.add("annualRevenue");
        this.inAnnualRevenue = inAnnualRevenue;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAreaCode the inAreaCode to set
    */
    public void setInAreaCode(String inAreaCode) {
        this.inParameters.add("areaCode");
        this.inAreaCode = inAreaCode;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAskForName the inAskForName to set
    */
    public void setInAskForName(String inAskForName) {
        this.inParameters.add("askForName");
        this.inAskForName = inAskForName;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAttnName the inAttnName to set
    */
    public void setInAttnName(String inAttnName) {
        this.inParameters.add("attnName");
        this.inAttnName = inAttnName;
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
     * @param inComments the inComments to set
    */
    public void setInComments(String inComments) {
        this.inParameters.add("comments");
        this.inComments = inComments;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inContactNumber the inContactNumber to set
    */
    public void setInContactNumber(String inContactNumber) {
        this.inParameters.add("contactNumber");
        this.inContactNumber = inContactNumber;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCountryCode the inCountryCode to set
    */
    public void setInCountryCode(String inCountryCode) {
        this.inParameters.add("countryCode");
        this.inCountryCode = inCountryCode;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCountryGeoId the inCountryGeoId to set
    */
    public void setInCountryGeoId(String inCountryGeoId) {
        this.inParameters.add("countryGeoId");
        this.inCountryGeoId = inCountryGeoId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCountyGeoId the inCountyGeoId to set
    */
    public void setInCountyGeoId(String inCountyGeoId) {
        this.inParameters.add("countyGeoId");
        this.inCountyGeoId = inCountyGeoId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDirections the inDirections to set
    */
    public void setInDirections(String inDirections) {
        this.inParameters.add("directions");
        this.inDirections = inDirections;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inEmailAddress the inEmailAddress to set
    */
    public void setInEmailAddress(String inEmailAddress) {
        this.inParameters.add("emailAddress");
        this.inEmailAddress = inEmailAddress;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inExtension the inExtension to set
    */
    public void setInExtension(String inExtension) {
        this.inParameters.add("extension");
        this.inExtension = inExtension;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFederalTaxId the inFederalTaxId to set
    */
    public void setInFederalTaxId(String inFederalTaxId) {
        this.inParameters.add("federalTaxId");
        this.inFederalTaxId = inFederalTaxId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGeoPointId the inGeoPointId to set
    */
    public void setInGeoPointId(String inGeoPointId) {
        this.inParameters.add("geoPointId");
        this.inGeoPointId = inGeoPointId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGroupName the inGroupName to set
    */
    public void setInGroupName(String inGroupName) {
        this.inParameters.add("groupName");
        this.inGroupName = inGroupName;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGroupNameLocal the inGroupNameLocal to set
    */
    public void setInGroupNameLocal(String inGroupNameLocal) {
        this.inParameters.add("groupNameLocal");
        this.inGroupNameLocal = inGroupNameLocal;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inIsIncorporated the inIsIncorporated to set
    */
    public void setInIsIncorporated(String inIsIncorporated) {
        this.inParameters.add("isIncorporated");
        this.inIsIncorporated = inIsIncorporated;
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
     * @param inLogoImageUrl the inLogoImageUrl to set
    */
    public void setInLogoImageUrl(String inLogoImageUrl) {
        this.inParameters.add("logoImageUrl");
        this.inLogoImageUrl = inLogoImageUrl;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inNumEmployees the inNumEmployees to set
    */
    public void setInNumEmployees(Long inNumEmployees) {
        this.inParameters.add("numEmployees");
        this.inNumEmployees = inNumEmployees;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inOfficeSiteName the inOfficeSiteName to set
    */
    public void setInOfficeSiteName(String inOfficeSiteName) {
        this.inParameters.add("officeSiteName");
        this.inOfficeSiteName = inOfficeSiteName;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPostalCode the inPostalCode to set
    */
    public void setInPostalCode(String inPostalCode) {
        this.inParameters.add("postalCode");
        this.inPostalCode = inPostalCode;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPostalCodeExt the inPostalCodeExt to set
    */
    public void setInPostalCodeExt(String inPostalCodeExt) {
        this.inParameters.add("postalCodeExt");
        this.inPostalCodeExt = inPostalCodeExt;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPostalCodeGeoId the inPostalCodeGeoId to set
    */
    public void setInPostalCodeGeoId(String inPostalCodeGeoId) {
        this.inParameters.add("postalCodeGeoId");
        this.inPostalCodeGeoId = inPostalCodeGeoId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRequires1099 the inRequires1099 to set
    */
    public void setInRequires1099(String inRequires1099) {
        this.inParameters.add("requires1099");
        this.inRequires1099 = inRequires1099;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inStateProvinceGeoId the inStateProvinceGeoId to set
    */
    public void setInStateProvinceGeoId(String inStateProvinceGeoId) {
        this.inParameters.add("stateProvinceGeoId");
        this.inStateProvinceGeoId = inStateProvinceGeoId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTickerSymbol the inTickerSymbol to set
    */
    public void setInTickerSymbol(String inTickerSymbol) {
        this.inParameters.add("tickerSymbol");
        this.inTickerSymbol = inTickerSymbol;
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
     * @param inToName the inToName to set
    */
    public void setInToName(String inToName) {
        this.inParameters.add("toName");
        this.inToName = inToName;
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
     * @param outPartyId the outPartyId to set
    */
    public void setOutPartyId(String outPartyId) {
        this.outParameters.add("partyId");
        this.outPartyId = outPartyId;
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
        if (inParameters.contains("address1")) mapValue.put("address1", getInAddress1());
        if (inParameters.contains("address2")) mapValue.put("address2", getInAddress2());
        if (inParameters.contains("annualRevenue")) mapValue.put("annualRevenue", getInAnnualRevenue());
        if (inParameters.contains("areaCode")) mapValue.put("areaCode", getInAreaCode());
        if (inParameters.contains("askForName")) mapValue.put("askForName", getInAskForName());
        if (inParameters.contains("attnName")) mapValue.put("attnName", getInAttnName());
        if (inParameters.contains("city")) mapValue.put("city", getInCity());
        if (inParameters.contains("comments")) mapValue.put("comments", getInComments());
        if (inParameters.contains("contactNumber")) mapValue.put("contactNumber", getInContactNumber());
        if (inParameters.contains("countryCode")) mapValue.put("countryCode", getInCountryCode());
        if (inParameters.contains("countryGeoId")) mapValue.put("countryGeoId", getInCountryGeoId());
        if (inParameters.contains("countyGeoId")) mapValue.put("countyGeoId", getInCountyGeoId());
        if (inParameters.contains("directions")) mapValue.put("directions", getInDirections());
        if (inParameters.contains("emailAddress")) mapValue.put("emailAddress", getInEmailAddress());
        if (inParameters.contains("extension")) mapValue.put("extension", getInExtension());
        if (inParameters.contains("federalTaxId")) mapValue.put("federalTaxId", getInFederalTaxId());
        if (inParameters.contains("geoPointId")) mapValue.put("geoPointId", getInGeoPointId());
        if (inParameters.contains("groupName")) mapValue.put("groupName", getInGroupName());
        if (inParameters.contains("groupNameLocal")) mapValue.put("groupNameLocal", getInGroupNameLocal());
        if (inParameters.contains("isIncorporated")) mapValue.put("isIncorporated", getInIsIncorporated());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("logoImageUrl")) mapValue.put("logoImageUrl", getInLogoImageUrl());
        if (inParameters.contains("numEmployees")) mapValue.put("numEmployees", getInNumEmployees());
        if (inParameters.contains("officeSiteName")) mapValue.put("officeSiteName", getInOfficeSiteName());
        if (inParameters.contains("postalCode")) mapValue.put("postalCode", getInPostalCode());
        if (inParameters.contains("postalCodeExt")) mapValue.put("postalCodeExt", getInPostalCodeExt());
        if (inParameters.contains("postalCodeGeoId")) mapValue.put("postalCodeGeoId", getInPostalCodeGeoId());
        if (inParameters.contains("requires1099")) mapValue.put("requires1099", getInRequires1099());
        if (inParameters.contains("stateProvinceGeoId")) mapValue.put("stateProvinceGeoId", getInStateProvinceGeoId());
        if (inParameters.contains("tickerSymbol")) mapValue.put("tickerSymbol", getInTickerSymbol());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("toName")) mapValue.put("toName", getInToName());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("errorMessage")) mapValue.put("errorMessage", getOutErrorMessage());
        if (outParameters.contains("errorMessageList")) mapValue.put("errorMessageList", getOutErrorMessageList());
        if (outParameters.contains("locale")) mapValue.put("locale", getOutLocale());
        if (outParameters.contains("partyId")) mapValue.put("partyId", getOutPartyId());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("address1")) setInAddress1((String) mapValue.get("address1"));
        if (mapValue.containsKey("address2")) setInAddress2((String) mapValue.get("address2"));
        if (mapValue.containsKey("annualRevenue")) setInAnnualRevenue((BigDecimal) mapValue.get("annualRevenue"));
        if (mapValue.containsKey("areaCode")) setInAreaCode((String) mapValue.get("areaCode"));
        if (mapValue.containsKey("askForName")) setInAskForName((String) mapValue.get("askForName"));
        if (mapValue.containsKey("attnName")) setInAttnName((String) mapValue.get("attnName"));
        if (mapValue.containsKey("city")) setInCity((String) mapValue.get("city"));
        if (mapValue.containsKey("comments")) setInComments((String) mapValue.get("comments"));
        if (mapValue.containsKey("contactNumber")) setInContactNumber((String) mapValue.get("contactNumber"));
        if (mapValue.containsKey("countryCode")) setInCountryCode((String) mapValue.get("countryCode"));
        if (mapValue.containsKey("countryGeoId")) setInCountryGeoId((String) mapValue.get("countryGeoId"));
        if (mapValue.containsKey("countyGeoId")) setInCountyGeoId((String) mapValue.get("countyGeoId"));
        if (mapValue.containsKey("directions")) setInDirections((String) mapValue.get("directions"));
        if (mapValue.containsKey("emailAddress")) setInEmailAddress((String) mapValue.get("emailAddress"));
        if (mapValue.containsKey("extension")) setInExtension((String) mapValue.get("extension"));
        if (mapValue.containsKey("federalTaxId")) setInFederalTaxId((String) mapValue.get("federalTaxId"));
        if (mapValue.containsKey("geoPointId")) setInGeoPointId((String) mapValue.get("geoPointId"));
        if (mapValue.containsKey("groupName")) setInGroupName((String) mapValue.get("groupName"));
        if (mapValue.containsKey("groupNameLocal")) setInGroupNameLocal((String) mapValue.get("groupNameLocal"));
        if (mapValue.containsKey("isIncorporated")) setInIsIncorporated((String) mapValue.get("isIncorporated"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("logoImageUrl")) setInLogoImageUrl((String) mapValue.get("logoImageUrl"));
        if (mapValue.containsKey("numEmployees")) setInNumEmployees((Long) mapValue.get("numEmployees"));
        if (mapValue.containsKey("officeSiteName")) setInOfficeSiteName((String) mapValue.get("officeSiteName"));
        if (mapValue.containsKey("postalCode")) setInPostalCode((String) mapValue.get("postalCode"));
        if (mapValue.containsKey("postalCodeExt")) setInPostalCodeExt((String) mapValue.get("postalCodeExt"));
        if (mapValue.containsKey("postalCodeGeoId")) setInPostalCodeGeoId((String) mapValue.get("postalCodeGeoId"));
        if (mapValue.containsKey("requires1099")) setInRequires1099((String) mapValue.get("requires1099"));
        if (mapValue.containsKey("stateProvinceGeoId")) setInStateProvinceGeoId((String) mapValue.get("stateProvinceGeoId"));
        if (mapValue.containsKey("tickerSymbol")) setInTickerSymbol((String) mapValue.get("tickerSymbol"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("toName")) setInToName((String) mapValue.get("toName"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("partyId")) setOutPartyId((String) mapValue.get("partyId"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>CreateAccountService</code> from the input values of the given <code>CreateAccountService</code>.
     * @param input a <code>CreateAccountService</code>
     */
    public static CreateAccountService fromInput(CreateAccountService input) {
        CreateAccountService service = new CreateAccountService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>CreateAccountService</code> from the output values of the given <code>CreateAccountService</code>.
     * @param output a <code>CreateAccountService</code>
     */
    public static CreateAccountService fromOutput(CreateAccountService output) {
        CreateAccountService service = new CreateAccountService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CreateAccountService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CreateAccountService fromInput(Map<String, Object> mapValue) {
        CreateAccountService service = new CreateAccountService();
        service.putAllInput(mapValue);
        return service;
    }

    /**
     * Construct a <code>CreateAccountService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CreateAccountService fromOutput(Map<String, Object> mapValue) {
        CreateAccountService service = new CreateAccountService();
        service.putAllOutput(mapValue);
        return service;
    }
}
