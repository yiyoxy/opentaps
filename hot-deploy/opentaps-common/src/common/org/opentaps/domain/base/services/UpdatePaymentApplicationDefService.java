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
 * 
            Apply a payment to a Invoice or other payment or Billing account or Taxauthority,
            If no ammountApplied is supplied the system will calculate and use the maximum possible value.
        .
 * Auto generated base service entity updatePaymentApplicationDef.
 *
 * Engine: java
 * Location: com.opensourcestrategies.financials.payment.PaymentServices
 * Invoke: updatePaymentApplicationDef
 * Defined in: file:/home/jeremy/programmation/opentaps-git/hot-deploy/financials/servicedef/services_payment.xml
 */
public class UpdatePaymentApplicationDefService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "updatePaymentApplicationDef";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.FALSE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        acctgTagEnumId1("acctgTagEnumId1"),
        acctgTagEnumId10("acctgTagEnumId10"),
        acctgTagEnumId2("acctgTagEnumId2"),
        acctgTagEnumId3("acctgTagEnumId3"),
        acctgTagEnumId4("acctgTagEnumId4"),
        acctgTagEnumId5("acctgTagEnumId5"),
        acctgTagEnumId6("acctgTagEnumId6"),
        acctgTagEnumId7("acctgTagEnumId7"),
        acctgTagEnumId8("acctgTagEnumId8"),
        acctgTagEnumId9("acctgTagEnumId9"),
        amountApplied("amountApplied"),
        billingAccountId("billingAccountId"),
        invoiceId("invoiceId"),
        invoiceItemSeqId("invoiceItemSeqId"),
        invoiceProcessing("invoiceProcessing"),
        locale("locale"),
        overrideGlAccountId("overrideGlAccountId"),
        paymentApplicationId("paymentApplicationId"),
        paymentId("paymentId"),
        taxAuthGeoId("taxAuthGeoId"),
        timeZone("timeZone"),
        toPaymentId("toPaymentId"),
        userLogin("userLogin");
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
     * Creates a new <code>UpdatePaymentApplicationDefService</code> instance.
     */
    public UpdatePaymentApplicationDefService() {
        super();
    }


    private String inAcctgTagEnumId1;
    private String inAcctgTagEnumId10;
    private String inAcctgTagEnumId2;
    private String inAcctgTagEnumId3;
    private String inAcctgTagEnumId4;
    private String inAcctgTagEnumId5;
    private String inAcctgTagEnumId6;
    private String inAcctgTagEnumId7;
    private String inAcctgTagEnumId8;
    private String inAcctgTagEnumId9;
    private BigDecimal inAmountApplied;
    private String inBillingAccountId;
    private String inInvoiceId;
    private String inInvoiceItemSeqId;
    private String inInvoiceProcessing;
    private Locale inLocale;
    private String inOverrideGlAccountId;
    private String inPaymentApplicationId;
    private String inPaymentId;
    private String inTaxAuthGeoId;
    private TimeZone inTimeZone;
    private String inToPaymentId;
    private GenericValue inUserLogin;
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
    public String getInAcctgTagEnumId1() {
        return this.inAcctgTagEnumId1;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAcctgTagEnumId10() {
        return this.inAcctgTagEnumId10;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAcctgTagEnumId2() {
        return this.inAcctgTagEnumId2;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAcctgTagEnumId3() {
        return this.inAcctgTagEnumId3;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAcctgTagEnumId4() {
        return this.inAcctgTagEnumId4;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAcctgTagEnumId5() {
        return this.inAcctgTagEnumId5;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAcctgTagEnumId6() {
        return this.inAcctgTagEnumId6;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAcctgTagEnumId7() {
        return this.inAcctgTagEnumId7;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAcctgTagEnumId8() {
        return this.inAcctgTagEnumId8;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAcctgTagEnumId9() {
        return this.inAcctgTagEnumId9;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInAmountApplied() {
        return this.inAmountApplied;
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
    public String getInInvoiceId() {
        return this.inInvoiceId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInInvoiceItemSeqId() {
        return this.inInvoiceItemSeqId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInInvoiceProcessing() {
        return this.inInvoiceProcessing;
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
    public String getInOverrideGlAccountId() {
        return this.inOverrideGlAccountId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPaymentApplicationId() {
        return this.inPaymentApplicationId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInPaymentId() {
        return this.inPaymentId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTaxAuthGeoId() {
        return this.inTaxAuthGeoId;
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
    public String getInToPaymentId() {
        return this.inToPaymentId;
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
     * @param inAcctgTagEnumId1 the inAcctgTagEnumId1 to set
    */
    public void setInAcctgTagEnumId1(String inAcctgTagEnumId1) {
        this.inParameters.add("acctgTagEnumId1");
        this.inAcctgTagEnumId1 = inAcctgTagEnumId1;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAcctgTagEnumId10 the inAcctgTagEnumId10 to set
    */
    public void setInAcctgTagEnumId10(String inAcctgTagEnumId10) {
        this.inParameters.add("acctgTagEnumId10");
        this.inAcctgTagEnumId10 = inAcctgTagEnumId10;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAcctgTagEnumId2 the inAcctgTagEnumId2 to set
    */
    public void setInAcctgTagEnumId2(String inAcctgTagEnumId2) {
        this.inParameters.add("acctgTagEnumId2");
        this.inAcctgTagEnumId2 = inAcctgTagEnumId2;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAcctgTagEnumId3 the inAcctgTagEnumId3 to set
    */
    public void setInAcctgTagEnumId3(String inAcctgTagEnumId3) {
        this.inParameters.add("acctgTagEnumId3");
        this.inAcctgTagEnumId3 = inAcctgTagEnumId3;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAcctgTagEnumId4 the inAcctgTagEnumId4 to set
    */
    public void setInAcctgTagEnumId4(String inAcctgTagEnumId4) {
        this.inParameters.add("acctgTagEnumId4");
        this.inAcctgTagEnumId4 = inAcctgTagEnumId4;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAcctgTagEnumId5 the inAcctgTagEnumId5 to set
    */
    public void setInAcctgTagEnumId5(String inAcctgTagEnumId5) {
        this.inParameters.add("acctgTagEnumId5");
        this.inAcctgTagEnumId5 = inAcctgTagEnumId5;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAcctgTagEnumId6 the inAcctgTagEnumId6 to set
    */
    public void setInAcctgTagEnumId6(String inAcctgTagEnumId6) {
        this.inParameters.add("acctgTagEnumId6");
        this.inAcctgTagEnumId6 = inAcctgTagEnumId6;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAcctgTagEnumId7 the inAcctgTagEnumId7 to set
    */
    public void setInAcctgTagEnumId7(String inAcctgTagEnumId7) {
        this.inParameters.add("acctgTagEnumId7");
        this.inAcctgTagEnumId7 = inAcctgTagEnumId7;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAcctgTagEnumId8 the inAcctgTagEnumId8 to set
    */
    public void setInAcctgTagEnumId8(String inAcctgTagEnumId8) {
        this.inParameters.add("acctgTagEnumId8");
        this.inAcctgTagEnumId8 = inAcctgTagEnumId8;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAcctgTagEnumId9 the inAcctgTagEnumId9 to set
    */
    public void setInAcctgTagEnumId9(String inAcctgTagEnumId9) {
        this.inParameters.add("acctgTagEnumId9");
        this.inAcctgTagEnumId9 = inAcctgTagEnumId9;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAmountApplied the inAmountApplied to set
    */
    public void setInAmountApplied(BigDecimal inAmountApplied) {
        this.inParameters.add("amountApplied");
        this.inAmountApplied = inAmountApplied;
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
     * @param inInvoiceId the inInvoiceId to set
    */
    public void setInInvoiceId(String inInvoiceId) {
        this.inParameters.add("invoiceId");
        this.inInvoiceId = inInvoiceId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inInvoiceItemSeqId the inInvoiceItemSeqId to set
    */
    public void setInInvoiceItemSeqId(String inInvoiceItemSeqId) {
        this.inParameters.add("invoiceItemSeqId");
        this.inInvoiceItemSeqId = inInvoiceItemSeqId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inInvoiceProcessing the inInvoiceProcessing to set
    */
    public void setInInvoiceProcessing(String inInvoiceProcessing) {
        this.inParameters.add("invoiceProcessing");
        this.inInvoiceProcessing = inInvoiceProcessing;
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
     * @param inOverrideGlAccountId the inOverrideGlAccountId to set
    */
    public void setInOverrideGlAccountId(String inOverrideGlAccountId) {
        this.inParameters.add("overrideGlAccountId");
        this.inOverrideGlAccountId = inOverrideGlAccountId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPaymentApplicationId the inPaymentApplicationId to set
    */
    public void setInPaymentApplicationId(String inPaymentApplicationId) {
        this.inParameters.add("paymentApplicationId");
        this.inPaymentApplicationId = inPaymentApplicationId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inPaymentId the inPaymentId to set
    */
    public void setInPaymentId(String inPaymentId) {
        this.inParameters.add("paymentId");
        this.inPaymentId = inPaymentId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTaxAuthGeoId the inTaxAuthGeoId to set
    */
    public void setInTaxAuthGeoId(String inTaxAuthGeoId) {
        this.inParameters.add("taxAuthGeoId");
        this.inTaxAuthGeoId = inTaxAuthGeoId;
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
     * @param inToPaymentId the inToPaymentId to set
    */
    public void setInToPaymentId(String inToPaymentId) {
        this.inParameters.add("toPaymentId");
        this.inToPaymentId = inToPaymentId;
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
        if (inParameters.contains("acctgTagEnumId1")) mapValue.put("acctgTagEnumId1", getInAcctgTagEnumId1());
        if (inParameters.contains("acctgTagEnumId10")) mapValue.put("acctgTagEnumId10", getInAcctgTagEnumId10());
        if (inParameters.contains("acctgTagEnumId2")) mapValue.put("acctgTagEnumId2", getInAcctgTagEnumId2());
        if (inParameters.contains("acctgTagEnumId3")) mapValue.put("acctgTagEnumId3", getInAcctgTagEnumId3());
        if (inParameters.contains("acctgTagEnumId4")) mapValue.put("acctgTagEnumId4", getInAcctgTagEnumId4());
        if (inParameters.contains("acctgTagEnumId5")) mapValue.put("acctgTagEnumId5", getInAcctgTagEnumId5());
        if (inParameters.contains("acctgTagEnumId6")) mapValue.put("acctgTagEnumId6", getInAcctgTagEnumId6());
        if (inParameters.contains("acctgTagEnumId7")) mapValue.put("acctgTagEnumId7", getInAcctgTagEnumId7());
        if (inParameters.contains("acctgTagEnumId8")) mapValue.put("acctgTagEnumId8", getInAcctgTagEnumId8());
        if (inParameters.contains("acctgTagEnumId9")) mapValue.put("acctgTagEnumId9", getInAcctgTagEnumId9());
        if (inParameters.contains("amountApplied")) mapValue.put("amountApplied", getInAmountApplied());
        if (inParameters.contains("billingAccountId")) mapValue.put("billingAccountId", getInBillingAccountId());
        if (inParameters.contains("invoiceId")) mapValue.put("invoiceId", getInInvoiceId());
        if (inParameters.contains("invoiceItemSeqId")) mapValue.put("invoiceItemSeqId", getInInvoiceItemSeqId());
        if (inParameters.contains("invoiceProcessing")) mapValue.put("invoiceProcessing", getInInvoiceProcessing());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("overrideGlAccountId")) mapValue.put("overrideGlAccountId", getInOverrideGlAccountId());
        if (inParameters.contains("paymentApplicationId")) mapValue.put("paymentApplicationId", getInPaymentApplicationId());
        if (inParameters.contains("paymentId")) mapValue.put("paymentId", getInPaymentId());
        if (inParameters.contains("taxAuthGeoId")) mapValue.put("taxAuthGeoId", getInTaxAuthGeoId());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("toPaymentId")) mapValue.put("toPaymentId", getInToPaymentId());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
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
        if (mapValue.containsKey("acctgTagEnumId1")) setInAcctgTagEnumId1((String) mapValue.get("acctgTagEnumId1"));
        if (mapValue.containsKey("acctgTagEnumId10")) setInAcctgTagEnumId10((String) mapValue.get("acctgTagEnumId10"));
        if (mapValue.containsKey("acctgTagEnumId2")) setInAcctgTagEnumId2((String) mapValue.get("acctgTagEnumId2"));
        if (mapValue.containsKey("acctgTagEnumId3")) setInAcctgTagEnumId3((String) mapValue.get("acctgTagEnumId3"));
        if (mapValue.containsKey("acctgTagEnumId4")) setInAcctgTagEnumId4((String) mapValue.get("acctgTagEnumId4"));
        if (mapValue.containsKey("acctgTagEnumId5")) setInAcctgTagEnumId5((String) mapValue.get("acctgTagEnumId5"));
        if (mapValue.containsKey("acctgTagEnumId6")) setInAcctgTagEnumId6((String) mapValue.get("acctgTagEnumId6"));
        if (mapValue.containsKey("acctgTagEnumId7")) setInAcctgTagEnumId7((String) mapValue.get("acctgTagEnumId7"));
        if (mapValue.containsKey("acctgTagEnumId8")) setInAcctgTagEnumId8((String) mapValue.get("acctgTagEnumId8"));
        if (mapValue.containsKey("acctgTagEnumId9")) setInAcctgTagEnumId9((String) mapValue.get("acctgTagEnumId9"));
        if (mapValue.containsKey("amountApplied")) setInAmountApplied((BigDecimal) mapValue.get("amountApplied"));
        if (mapValue.containsKey("billingAccountId")) setInBillingAccountId((String) mapValue.get("billingAccountId"));
        if (mapValue.containsKey("invoiceId")) setInInvoiceId((String) mapValue.get("invoiceId"));
        if (mapValue.containsKey("invoiceItemSeqId")) setInInvoiceItemSeqId((String) mapValue.get("invoiceItemSeqId"));
        if (mapValue.containsKey("invoiceProcessing")) setInInvoiceProcessing((String) mapValue.get("invoiceProcessing"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("overrideGlAccountId")) setInOverrideGlAccountId((String) mapValue.get("overrideGlAccountId"));
        if (mapValue.containsKey("paymentApplicationId")) setInPaymentApplicationId((String) mapValue.get("paymentApplicationId"));
        if (mapValue.containsKey("paymentId")) setInPaymentId((String) mapValue.get("paymentId"));
        if (mapValue.containsKey("taxAuthGeoId")) setInTaxAuthGeoId((String) mapValue.get("taxAuthGeoId"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("toPaymentId")) setInToPaymentId((String) mapValue.get("toPaymentId"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
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
     * Construct a <code>UpdatePaymentApplicationDefService</code> from the input values of the given <code>UpdatePaymentApplicationDefService</code>.
     * @param input a <code>UpdatePaymentApplicationDefService</code>
     */
    public static UpdatePaymentApplicationDefService fromInput(UpdatePaymentApplicationDefService input) {
        UpdatePaymentApplicationDefService service = new UpdatePaymentApplicationDefService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>UpdatePaymentApplicationDefService</code> from the output values of the given <code>UpdatePaymentApplicationDefService</code>.
     * @param output a <code>UpdatePaymentApplicationDefService</code>
     */
    public static UpdatePaymentApplicationDefService fromOutput(UpdatePaymentApplicationDefService output) {
        UpdatePaymentApplicationDefService service = new UpdatePaymentApplicationDefService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>UpdatePaymentApplicationDefService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static UpdatePaymentApplicationDefService fromInput(Map<String, Object> mapValue) {
        UpdatePaymentApplicationDefService service = new UpdatePaymentApplicationDefService();
        service.putAllInput(mapValue);
        return service;
    }

    /**
     * Construct a <code>UpdatePaymentApplicationDefService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static UpdatePaymentApplicationDefService fromOutput(Map<String, Object> mapValue) {
        UpdatePaymentApplicationDefService service = new UpdatePaymentApplicationDefService();
        service.putAllOutput(mapValue);
        return service;
    }
}
