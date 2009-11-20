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
 * Direct link to payment processors to force manual transactions; not logged in system.
 * Auto generated base service entity manualForcedCcTransaction.
 *
 * Engine: java
 * Location: org.ofbiz.accounting.payment.PaymentGatewayServices
 * Invoke: processManualCcTx
 * Defined in: file:/home/jeremy/programmation/opentaps-git/applications/accounting/servicedef/services_paymentmethod.xml
 */
public class ManualForcedCcTransactionService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "manualForcedCcTransaction";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        address1("address1"),
        address2("address2"),
        amount("amount"),
        cardNumber("cardNumber"),
        cardSecurityCode("cardSecurityCode"),
        cardType("cardType"),
        city("city"),
        companyNameOnCard("companyNameOnCard"),
        countryGeoId("countryGeoId"),
        expMonth("expMonth"),
        expYear("expYear"),
        firstNameOnCard("firstNameOnCard"),
        infoString("infoString"),
        lastNameOnCard("lastNameOnCard"),
        locale("locale"),
        middleNameOnCard("middleNameOnCard"),
        paymentMethodTypeId("paymentMethodTypeId"),
        postalCode("postalCode"),
        productStoreId("productStoreId"),
        referenceCode("referenceCode"),
        stateProvinceGeoId("stateProvinceGeoId"),
        suffixOnCard("suffixOnCard"),
        timeZone("timeZone"),
        titleOnCard("titleOnCard"),
        transactionType("transactionType"),
        userLogin("userLogin");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        locale("locale"),
        referenceNum("referenceNum"),
        responseMessage("responseMessage"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        tranRespMsgs("tranRespMsgs"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    /**
     * Creates a new <code>ManualForcedCcTransactionService</code> instance.
     */
    public ManualForcedCcTransactionService() {
        super();
    }

    /**
     * Creates a new <code>ManualForcedCcTransactionService</code> instance.
     * @param user an <code>User</code> value
     */
    public ManualForcedCcTransactionService(User user) {
        super(user);
    }

    private String inAddress1;
    private String inAddress2;
    private BigDecimal inAmount;
    private String inCardNumber;
    private String inCardSecurityCode;
    private String inCardType;
    private String inCity;
    private String inCompanyNameOnCard;
    private String inCountryGeoId;
    private String inExpMonth;
    private String inExpYear;
    private String inFirstNameOnCard;
    private String inInfoString;
    private String inLastNameOnCard;
    private Locale inLocale;
    private String inMiddleNameOnCard;
    private String inPaymentMethodTypeId;
    private String inPostalCode;
    private String inProductStoreId;
    private String inReferenceCode;
    private String inStateProvinceGeoId;
    private String inSuffixOnCard;
    private TimeZone inTimeZone;
    private String inTitleOnCard;
    private String inTransactionType;
    private GenericValue inUserLogin;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private String outReferenceNum;
    private String outResponseMessage;
    private String outSuccessMessage;
    private List outSuccessMessageList;
    private TimeZone outTimeZone;
    private List outTranRespMsgs;
    private GenericValue outUserLogin;

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
     * This parameter is required.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInAmount() {
        return this.inAmount;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInCardNumber() {
        return this.inCardNumber;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCardSecurityCode() {
        return this.inCardSecurityCode;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInCardType() {
        return this.inCardType;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
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
    public String getInCompanyNameOnCard() {
        return this.inCompanyNameOnCard;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInCountryGeoId() {
        return this.inCountryGeoId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInExpMonth() {
        return this.inExpMonth;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInExpYear() {
        return this.inExpYear;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInFirstNameOnCard() {
        return this.inFirstNameOnCard;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInInfoString() {
        return this.inInfoString;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInLastNameOnCard() {
        return this.inLastNameOnCard;
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
    public String getInMiddleNameOnCard() {
        return this.inMiddleNameOnCard;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInPaymentMethodTypeId() {
        return this.inPaymentMethodTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInPostalCode() {
        return this.inPostalCode;
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
     * @return <code>String</code>
     */
    public String getInReferenceCode() {
        return this.inReferenceCode;
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
    public String getInSuffixOnCard() {
        return this.inSuffixOnCard;
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
    public String getInTitleOnCard() {
        return this.inTitleOnCard;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInTransactionType() {
        return this.inTransactionType;
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
    public String getOutReferenceNum() {
        return this.outReferenceNum;
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
     * @return <code>List</code>
     */
    public List getOutTranRespMsgs() {
        return this.outTranRespMsgs;
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
     * This parameter is required.
     * @param inAmount the inAmount to set
    */
    public void setInAmount(BigDecimal inAmount) {
        this.inParameters.add("amount");
        this.inAmount = inAmount;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inCardNumber the inCardNumber to set
    */
    public void setInCardNumber(String inCardNumber) {
        this.inParameters.add("cardNumber");
        this.inCardNumber = inCardNumber;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCardSecurityCode the inCardSecurityCode to set
    */
    public void setInCardSecurityCode(String inCardSecurityCode) {
        this.inParameters.add("cardSecurityCode");
        this.inCardSecurityCode = inCardSecurityCode;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inCardType the inCardType to set
    */
    public void setInCardType(String inCardType) {
        this.inParameters.add("cardType");
        this.inCardType = inCardType;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inCity the inCity to set
    */
    public void setInCity(String inCity) {
        this.inParameters.add("city");
        this.inCity = inCity;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCompanyNameOnCard the inCompanyNameOnCard to set
    */
    public void setInCompanyNameOnCard(String inCompanyNameOnCard) {
        this.inParameters.add("companyNameOnCard");
        this.inCompanyNameOnCard = inCompanyNameOnCard;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inCountryGeoId the inCountryGeoId to set
    */
    public void setInCountryGeoId(String inCountryGeoId) {
        this.inParameters.add("countryGeoId");
        this.inCountryGeoId = inCountryGeoId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inExpMonth the inExpMonth to set
    */
    public void setInExpMonth(String inExpMonth) {
        this.inParameters.add("expMonth");
        this.inExpMonth = inExpMonth;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inExpYear the inExpYear to set
    */
    public void setInExpYear(String inExpYear) {
        this.inParameters.add("expYear");
        this.inExpYear = inExpYear;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inFirstNameOnCard the inFirstNameOnCard to set
    */
    public void setInFirstNameOnCard(String inFirstNameOnCard) {
        this.inParameters.add("firstNameOnCard");
        this.inFirstNameOnCard = inFirstNameOnCard;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inInfoString the inInfoString to set
    */
    public void setInInfoString(String inInfoString) {
        this.inParameters.add("infoString");
        this.inInfoString = inInfoString;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inLastNameOnCard the inLastNameOnCard to set
    */
    public void setInLastNameOnCard(String inLastNameOnCard) {
        this.inParameters.add("lastNameOnCard");
        this.inLastNameOnCard = inLastNameOnCard;
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
     * @param inMiddleNameOnCard the inMiddleNameOnCard to set
    */
    public void setInMiddleNameOnCard(String inMiddleNameOnCard) {
        this.inParameters.add("middleNameOnCard");
        this.inMiddleNameOnCard = inMiddleNameOnCard;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inPaymentMethodTypeId the inPaymentMethodTypeId to set
    */
    public void setInPaymentMethodTypeId(String inPaymentMethodTypeId) {
        this.inParameters.add("paymentMethodTypeId");
        this.inPaymentMethodTypeId = inPaymentMethodTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inPostalCode the inPostalCode to set
    */
    public void setInPostalCode(String inPostalCode) {
        this.inParameters.add("postalCode");
        this.inPostalCode = inPostalCode;
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
     * @param inReferenceCode the inReferenceCode to set
    */
    public void setInReferenceCode(String inReferenceCode) {
        this.inParameters.add("referenceCode");
        this.inReferenceCode = inReferenceCode;
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
     * @param inSuffixOnCard the inSuffixOnCard to set
    */
    public void setInSuffixOnCard(String inSuffixOnCard) {
        this.inParameters.add("suffixOnCard");
        this.inSuffixOnCard = inSuffixOnCard;
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
     * @param inTitleOnCard the inTitleOnCard to set
    */
    public void setInTitleOnCard(String inTitleOnCard) {
        this.inParameters.add("titleOnCard");
        this.inTitleOnCard = inTitleOnCard;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inTransactionType the inTransactionType to set
    */
    public void setInTransactionType(String inTransactionType) {
        this.inParameters.add("transactionType");
        this.inTransactionType = inTransactionType;
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
     * @param outReferenceNum the outReferenceNum to set
    */
    public void setOutReferenceNum(String outReferenceNum) {
        this.outParameters.add("referenceNum");
        this.outReferenceNum = outReferenceNum;
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
     * @param outTranRespMsgs the outTranRespMsgs to set
    */
    public void setOutTranRespMsgs(List outTranRespMsgs) {
        this.outParameters.add("tranRespMsgs");
        this.outTranRespMsgs = outTranRespMsgs;
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
        if (inParameters.contains("amount")) mapValue.put("amount", getInAmount());
        if (inParameters.contains("cardNumber")) mapValue.put("cardNumber", getInCardNumber());
        if (inParameters.contains("cardSecurityCode")) mapValue.put("cardSecurityCode", getInCardSecurityCode());
        if (inParameters.contains("cardType")) mapValue.put("cardType", getInCardType());
        if (inParameters.contains("city")) mapValue.put("city", getInCity());
        if (inParameters.contains("companyNameOnCard")) mapValue.put("companyNameOnCard", getInCompanyNameOnCard());
        if (inParameters.contains("countryGeoId")) mapValue.put("countryGeoId", getInCountryGeoId());
        if (inParameters.contains("expMonth")) mapValue.put("expMonth", getInExpMonth());
        if (inParameters.contains("expYear")) mapValue.put("expYear", getInExpYear());
        if (inParameters.contains("firstNameOnCard")) mapValue.put("firstNameOnCard", getInFirstNameOnCard());
        if (inParameters.contains("infoString")) mapValue.put("infoString", getInInfoString());
        if (inParameters.contains("lastNameOnCard")) mapValue.put("lastNameOnCard", getInLastNameOnCard());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("middleNameOnCard")) mapValue.put("middleNameOnCard", getInMiddleNameOnCard());
        if (inParameters.contains("paymentMethodTypeId")) mapValue.put("paymentMethodTypeId", getInPaymentMethodTypeId());
        if (inParameters.contains("postalCode")) mapValue.put("postalCode", getInPostalCode());
        if (inParameters.contains("productStoreId")) mapValue.put("productStoreId", getInProductStoreId());
        if (inParameters.contains("referenceCode")) mapValue.put("referenceCode", getInReferenceCode());
        if (inParameters.contains("stateProvinceGeoId")) mapValue.put("stateProvinceGeoId", getInStateProvinceGeoId());
        if (inParameters.contains("suffixOnCard")) mapValue.put("suffixOnCard", getInSuffixOnCard());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("titleOnCard")) mapValue.put("titleOnCard", getInTitleOnCard());
        if (inParameters.contains("transactionType")) mapValue.put("transactionType", getInTransactionType());
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
        if (outParameters.contains("referenceNum")) mapValue.put("referenceNum", getOutReferenceNum());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("tranRespMsgs")) mapValue.put("tranRespMsgs", getOutTranRespMsgs());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("address1")) setInAddress1((String) mapValue.get("address1"));
        if (mapValue.containsKey("address2")) setInAddress2((String) mapValue.get("address2"));
        if (mapValue.containsKey("amount")) setInAmount((BigDecimal) mapValue.get("amount"));
        if (mapValue.containsKey("cardNumber")) setInCardNumber((String) mapValue.get("cardNumber"));
        if (mapValue.containsKey("cardSecurityCode")) setInCardSecurityCode((String) mapValue.get("cardSecurityCode"));
        if (mapValue.containsKey("cardType")) setInCardType((String) mapValue.get("cardType"));
        if (mapValue.containsKey("city")) setInCity((String) mapValue.get("city"));
        if (mapValue.containsKey("companyNameOnCard")) setInCompanyNameOnCard((String) mapValue.get("companyNameOnCard"));
        if (mapValue.containsKey("countryGeoId")) setInCountryGeoId((String) mapValue.get("countryGeoId"));
        if (mapValue.containsKey("expMonth")) setInExpMonth((String) mapValue.get("expMonth"));
        if (mapValue.containsKey("expYear")) setInExpYear((String) mapValue.get("expYear"));
        if (mapValue.containsKey("firstNameOnCard")) setInFirstNameOnCard((String) mapValue.get("firstNameOnCard"));
        if (mapValue.containsKey("infoString")) setInInfoString((String) mapValue.get("infoString"));
        if (mapValue.containsKey("lastNameOnCard")) setInLastNameOnCard((String) mapValue.get("lastNameOnCard"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("middleNameOnCard")) setInMiddleNameOnCard((String) mapValue.get("middleNameOnCard"));
        if (mapValue.containsKey("paymentMethodTypeId")) setInPaymentMethodTypeId((String) mapValue.get("paymentMethodTypeId"));
        if (mapValue.containsKey("postalCode")) setInPostalCode((String) mapValue.get("postalCode"));
        if (mapValue.containsKey("productStoreId")) setInProductStoreId((String) mapValue.get("productStoreId"));
        if (mapValue.containsKey("referenceCode")) setInReferenceCode((String) mapValue.get("referenceCode"));
        if (mapValue.containsKey("stateProvinceGeoId")) setInStateProvinceGeoId((String) mapValue.get("stateProvinceGeoId"));
        if (mapValue.containsKey("suffixOnCard")) setInSuffixOnCard((String) mapValue.get("suffixOnCard"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("titleOnCard")) setInTitleOnCard((String) mapValue.get("titleOnCard"));
        if (mapValue.containsKey("transactionType")) setInTransactionType((String) mapValue.get("transactionType"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("referenceNum")) setOutReferenceNum((String) mapValue.get("referenceNum"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("tranRespMsgs")) setOutTranRespMsgs((List) mapValue.get("tranRespMsgs"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>ManualForcedCcTransactionService</code> from the input values of the given <code>ManualForcedCcTransactionService</code>.
     * @param input a <code>ManualForcedCcTransactionService</code>
     */
    public static ManualForcedCcTransactionService fromInput(ManualForcedCcTransactionService input) {
        ManualForcedCcTransactionService service = new ManualForcedCcTransactionService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>ManualForcedCcTransactionService</code> from the output values of the given <code>ManualForcedCcTransactionService</code>.
     * @param output a <code>ManualForcedCcTransactionService</code>
     */
    public static ManualForcedCcTransactionService fromOutput(ManualForcedCcTransactionService output) {
        ManualForcedCcTransactionService service = new ManualForcedCcTransactionService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>ManualForcedCcTransactionService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static ManualForcedCcTransactionService fromInput(Map<String, Object> mapValue) {
        ManualForcedCcTransactionService service = new ManualForcedCcTransactionService();
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
     * Construct a <code>ManualForcedCcTransactionService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static ManualForcedCcTransactionService fromOutput(Map<String, Object> mapValue) {
        ManualForcedCcTransactionService service = new ManualForcedCcTransactionService();
        service.putAllOutput(mapValue);
        return service;
    }
}
