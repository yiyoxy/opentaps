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
import org.opentaps.foundation.infrastructure.User;

/**
 * Receives a payment from a party to a product store's pay to party.
 * Auto generated base service entity receiveBillingAccountPayment.
 *
 * Engine: java
 * Location: com.opensourcestrategies.financials.accounts.BillingAccountServices
 * Invoke: receiveBillingAccountPayment
 * Defined in: file:/home/jeremy/programmation/opentaps-git/hot-deploy/financials/servicedef/services_billingaccount.xml
 */
public class ReceiveBillingAccountPaymentService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "receiveBillingAccountPayment";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        amount("amount"),
        billingAccountId("billingAccountId"),
        currencyUomId("currencyUomId"),
        effectiveDate("effectiveDate"),
        locale("locale"),
        partyIdFrom("partyIdFrom"),
        partyIdTo("partyIdTo"),
        paymentMethodTypeId("paymentMethodTypeId"),
        paymentRefNum("paymentRefNum"),
        paymentTypeId("paymentTypeId"),
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
        paymentId("paymentId"),
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
     * Creates a new <code>ReceiveBillingAccountPaymentService</code> instance.
     */
    public ReceiveBillingAccountPaymentService() {
        super();
    }

    /**
     * Creates a new <code>ReceiveBillingAccountPaymentService</code> instance.
     * @param user an <code>User</code> value
     */
    public ReceiveBillingAccountPaymentService(User user) {
        super(user);
    }

    private Double inAmount;
    private String inBillingAccountId;
    private String inCurrencyUomId;
    private Timestamp inEffectiveDate;
    private Locale inLocale;
    private String inPartyIdFrom;
    private String inPartyIdTo;
    private String inPaymentMethodTypeId;
    private String inPaymentRefNum;
    private String inPaymentTypeId;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private String outPaymentId;
    private String outResponseMessage;
    private String outSuccessMessage;
    private List outSuccessMessageList;
    private TimeZone outTimeZone;
    private GenericValue outUserLogin;

    private Set<String> inParameters = FastSet.newInstance();
    private Set<String> outParameters = FastSet.newInstance();

    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Double</code>
     */
    public Double getInAmount() {
        return this.inAmount;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInBillingAccountId() {
        return this.inBillingAccountId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInCurrencyUomId() {
        return this.inCurrencyUomId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInEffectiveDate() {
        return this.inEffectiveDate;
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
    public String getInPartyIdFrom() {
        return this.inPartyIdFrom;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInPartyIdTo() {
        return this.inPartyIdTo;
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
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPaymentRefNum() {
        return this.inPaymentRefNum;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInPaymentTypeId() {
        return this.inPaymentTypeId;
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
    public String getOutPaymentId() {
        return this.outPaymentId;
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
     * This parameter is required.
     * @param inAmount the inAmount to set
    */
    public void setInAmount(Double inAmount) {
        this.inParameters.add("amount");
        this.inAmount = inAmount;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inBillingAccountId the inBillingAccountId to set
    */
    public void setInBillingAccountId(String inBillingAccountId) {
        this.inParameters.add("billingAccountId");
        this.inBillingAccountId = inBillingAccountId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inCurrencyUomId the inCurrencyUomId to set
    */
    public void setInCurrencyUomId(String inCurrencyUomId) {
        this.inParameters.add("currencyUomId");
        this.inCurrencyUomId = inCurrencyUomId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inEffectiveDate the inEffectiveDate to set
    */
    public void setInEffectiveDate(Timestamp inEffectiveDate) {
        this.inParameters.add("effectiveDate");
        this.inEffectiveDate = inEffectiveDate;
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
     * @param inPartyIdFrom the inPartyIdFrom to set
    */
    public void setInPartyIdFrom(String inPartyIdFrom) {
        this.inParameters.add("partyIdFrom");
        this.inPartyIdFrom = inPartyIdFrom;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inPartyIdTo the inPartyIdTo to set
    */
    public void setInPartyIdTo(String inPartyIdTo) {
        this.inParameters.add("partyIdTo");
        this.inPartyIdTo = inPartyIdTo;
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
     * This parameter is optional.
     * @param inPaymentRefNum the inPaymentRefNum to set
    */
    public void setInPaymentRefNum(String inPaymentRefNum) {
        this.inParameters.add("paymentRefNum");
        this.inPaymentRefNum = inPaymentRefNum;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inPaymentTypeId the inPaymentTypeId to set
    */
    public void setInPaymentTypeId(String inPaymentTypeId) {
        this.inParameters.add("paymentTypeId");
        this.inPaymentTypeId = inPaymentTypeId;
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
     * @param outPaymentId the outPaymentId to set
    */
    public void setOutPaymentId(String outPaymentId) {
        this.outParameters.add("paymentId");
        this.outPaymentId = outPaymentId;
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
        if (inParameters.contains("amount")) mapValue.put("amount", getInAmount());
        if (inParameters.contains("billingAccountId")) mapValue.put("billingAccountId", getInBillingAccountId());
        if (inParameters.contains("currencyUomId")) mapValue.put("currencyUomId", getInCurrencyUomId());
        if (inParameters.contains("effectiveDate")) mapValue.put("effectiveDate", getInEffectiveDate());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("partyIdFrom")) mapValue.put("partyIdFrom", getInPartyIdFrom());
        if (inParameters.contains("partyIdTo")) mapValue.put("partyIdTo", getInPartyIdTo());
        if (inParameters.contains("paymentMethodTypeId")) mapValue.put("paymentMethodTypeId", getInPaymentMethodTypeId());
        if (inParameters.contains("paymentRefNum")) mapValue.put("paymentRefNum", getInPaymentRefNum());
        if (inParameters.contains("paymentTypeId")) mapValue.put("paymentTypeId", getInPaymentTypeId());
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
        if (outParameters.contains("paymentId")) mapValue.put("paymentId", getOutPaymentId());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("amount")) setInAmount((Double) mapValue.get("amount"));
        if (mapValue.containsKey("billingAccountId")) setInBillingAccountId((String) mapValue.get("billingAccountId"));
        if (mapValue.containsKey("currencyUomId")) setInCurrencyUomId((String) mapValue.get("currencyUomId"));
        if (mapValue.containsKey("effectiveDate")) setInEffectiveDate((Timestamp) mapValue.get("effectiveDate"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("partyIdFrom")) setInPartyIdFrom((String) mapValue.get("partyIdFrom"));
        if (mapValue.containsKey("partyIdTo")) setInPartyIdTo((String) mapValue.get("partyIdTo"));
        if (mapValue.containsKey("paymentMethodTypeId")) setInPaymentMethodTypeId((String) mapValue.get("paymentMethodTypeId"));
        if (mapValue.containsKey("paymentRefNum")) setInPaymentRefNum((String) mapValue.get("paymentRefNum"));
        if (mapValue.containsKey("paymentTypeId")) setInPaymentTypeId((String) mapValue.get("paymentTypeId"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("paymentId")) setOutPaymentId((String) mapValue.get("paymentId"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>ReceiveBillingAccountPaymentService</code> from the input values of the given <code>ReceiveBillingAccountPaymentService</code>.
     * @param input a <code>ReceiveBillingAccountPaymentService</code>
     */
    public static ReceiveBillingAccountPaymentService fromInput(ReceiveBillingAccountPaymentService input) {
        ReceiveBillingAccountPaymentService service = new ReceiveBillingAccountPaymentService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>ReceiveBillingAccountPaymentService</code> from the output values of the given <code>ReceiveBillingAccountPaymentService</code>.
     * @param output a <code>ReceiveBillingAccountPaymentService</code>
     */
    public static ReceiveBillingAccountPaymentService fromOutput(ReceiveBillingAccountPaymentService output) {
        ReceiveBillingAccountPaymentService service = new ReceiveBillingAccountPaymentService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>ReceiveBillingAccountPaymentService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static ReceiveBillingAccountPaymentService fromInput(Map<String, Object> mapValue) {
        ReceiveBillingAccountPaymentService service = new ReceiveBillingAccountPaymentService();
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
     * Construct a <code>ReceiveBillingAccountPaymentService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static ReceiveBillingAccountPaymentService fromOutput(Map<String, Object> mapValue) {
        ReceiveBillingAccountPaymentService service = new ReceiveBillingAccountPaymentService();
        service.putAllOutput(mapValue);
        return service;
    }
}
