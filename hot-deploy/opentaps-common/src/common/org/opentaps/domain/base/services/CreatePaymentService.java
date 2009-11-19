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
import org.opentaps.foundation.service.ServiceWrapperWithAuth;

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
 * Create a Payment.  If a paymentMethodId is supplied, paymentMethodTypeId is gotten from paymentMethod.  Otherwise, it must be supplied.  If no
        paymentMethodTypeId and no paymentMethodId is supplied, then an error will be returned. .
 * Auto generated base service entity createPayment.
 *
 * Engine: simple
 * Location: component://accounting/script/org/ofbiz/accounting/payment/PaymentServices.xml
 * Invoke: createPayment
 * Defined in: file:/home/jeremy/programmation/opentaps-git/applications/accounting/servicedef/services_payment.xml
 */
public class CreatePaymentService extends ServiceWrapperWithAuth {

    /** The service name as used by the service engine. */
    public static final String NAME = "createPayment";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
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
        actualCurrencyAmount("actualCurrencyAmount"),
        actualCurrencyUomId("actualCurrencyUomId"),
        amount("amount"),
        comments("comments"),
        currencyUomId("currencyUomId"),
        effectiveDate("effectiveDate"),
        finAccountTransId("finAccountTransId"),
        locale("locale"),
        overrideGlAccountId("overrideGlAccountId"),
        partyIdFrom("partyIdFrom"),
        partyIdTo("partyIdTo"),
        paymentGatewayResponseId("paymentGatewayResponseId"),
        paymentId("paymentId"),
        paymentMethodId("paymentMethodId"),
        paymentMethodTypeId("paymentMethodTypeId"),
        paymentPreferenceId("paymentPreferenceId"),
        paymentRefNum("paymentRefNum"),
        paymentTypeId("paymentTypeId"),
        roleTypeIdTo("roleTypeIdTo"),
        statusId("statusId"),
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
     * Creates a new <code>CreatePaymentService</code> instance.
     */
    public CreatePaymentService() {
        super();
    }

    /**
     * Creates a new <code>CreatePaymentService</code> instance.
     * @param user an <code>User</code> value
     */
    public CreatePaymentService(User user) {
        super(user);
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
    private BigDecimal inActualCurrencyAmount;
    private String inActualCurrencyUomId;
    private BigDecimal inAmount;
    private String inComments;
    private String inCurrencyUomId;
    private Timestamp inEffectiveDate;
    private String inFinAccountTransId;
    private Locale inLocale;
    private String inOverrideGlAccountId;
    private String inPartyIdFrom;
    private String inPartyIdTo;
    private String inPaymentGatewayResponseId;
    private String inPaymentId;
    private String inPaymentMethodId;
    private String inPaymentMethodTypeId;
    private String inPaymentPreferenceId;
    private String inPaymentRefNum;
    private String inPaymentTypeId;
    private String inRoleTypeIdTo;
    private String inStatusId;
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
    public BigDecimal getInActualCurrencyAmount() {
        return this.inActualCurrencyAmount;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInActualCurrencyUomId() {
        return this.inActualCurrencyUomId;
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
     * @return <code>String</code>
     */
    public String getInFinAccountTransId() {
        return this.inFinAccountTransId;
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
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPaymentGatewayResponseId() {
        return this.inPaymentGatewayResponseId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
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
    public String getInPaymentMethodId() {
        return this.inPaymentMethodId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
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
    public String getInPaymentPreferenceId() {
        return this.inPaymentPreferenceId;
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
     * @return <code>String</code>
     */
    public String getInRoleTypeIdTo() {
        return this.inRoleTypeIdTo;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInStatusId() {
        return this.inStatusId;
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
     * This parameter is optional.
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
     * @param inActualCurrencyAmount the inActualCurrencyAmount to set
    */
    public void setInActualCurrencyAmount(BigDecimal inActualCurrencyAmount) {
        this.inParameters.add("actualCurrencyAmount");
        this.inActualCurrencyAmount = inActualCurrencyAmount;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inActualCurrencyUomId the inActualCurrencyUomId to set
    */
    public void setInActualCurrencyUomId(String inActualCurrencyUomId) {
        this.inParameters.add("actualCurrencyUomId");
        this.inActualCurrencyUomId = inActualCurrencyUomId;
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
     * @param inFinAccountTransId the inFinAccountTransId to set
    */
    public void setInFinAccountTransId(String inFinAccountTransId) {
        this.inParameters.add("finAccountTransId");
        this.inFinAccountTransId = inFinAccountTransId;
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
     * This parameter is optional.
     * @param inPaymentGatewayResponseId the inPaymentGatewayResponseId to set
    */
    public void setInPaymentGatewayResponseId(String inPaymentGatewayResponseId) {
        this.inParameters.add("paymentGatewayResponseId");
        this.inPaymentGatewayResponseId = inPaymentGatewayResponseId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPaymentId the inPaymentId to set
    */
    public void setInPaymentId(String inPaymentId) {
        this.inParameters.add("paymentId");
        this.inPaymentId = inPaymentId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPaymentMethodId the inPaymentMethodId to set
    */
    public void setInPaymentMethodId(String inPaymentMethodId) {
        this.inParameters.add("paymentMethodId");
        this.inPaymentMethodId = inPaymentMethodId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPaymentMethodTypeId the inPaymentMethodTypeId to set
    */
    public void setInPaymentMethodTypeId(String inPaymentMethodTypeId) {
        this.inParameters.add("paymentMethodTypeId");
        this.inPaymentMethodTypeId = inPaymentMethodTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPaymentPreferenceId the inPaymentPreferenceId to set
    */
    public void setInPaymentPreferenceId(String inPaymentPreferenceId) {
        this.inParameters.add("paymentPreferenceId");
        this.inPaymentPreferenceId = inPaymentPreferenceId;
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
     * @param inRoleTypeIdTo the inRoleTypeIdTo to set
    */
    public void setInRoleTypeIdTo(String inRoleTypeIdTo) {
        this.inParameters.add("roleTypeIdTo");
        this.inRoleTypeIdTo = inRoleTypeIdTo;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inStatusId the inStatusId to set
    */
    public void setInStatusId(String inStatusId) {
        this.inParameters.add("statusId");
        this.inStatusId = inStatusId;
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
     * This parameter is optional.
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
        if (inParameters.contains("actualCurrencyAmount")) mapValue.put("actualCurrencyAmount", getInActualCurrencyAmount());
        if (inParameters.contains("actualCurrencyUomId")) mapValue.put("actualCurrencyUomId", getInActualCurrencyUomId());
        if (inParameters.contains("amount")) mapValue.put("amount", getInAmount());
        if (inParameters.contains("comments")) mapValue.put("comments", getInComments());
        if (inParameters.contains("currencyUomId")) mapValue.put("currencyUomId", getInCurrencyUomId());
        if (inParameters.contains("effectiveDate")) mapValue.put("effectiveDate", getInEffectiveDate());
        if (inParameters.contains("finAccountTransId")) mapValue.put("finAccountTransId", getInFinAccountTransId());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("overrideGlAccountId")) mapValue.put("overrideGlAccountId", getInOverrideGlAccountId());
        if (inParameters.contains("partyIdFrom")) mapValue.put("partyIdFrom", getInPartyIdFrom());
        if (inParameters.contains("partyIdTo")) mapValue.put("partyIdTo", getInPartyIdTo());
        if (inParameters.contains("paymentGatewayResponseId")) mapValue.put("paymentGatewayResponseId", getInPaymentGatewayResponseId());
        if (inParameters.contains("paymentId")) mapValue.put("paymentId", getInPaymentId());
        if (inParameters.contains("paymentMethodId")) mapValue.put("paymentMethodId", getInPaymentMethodId());
        if (inParameters.contains("paymentMethodTypeId")) mapValue.put("paymentMethodTypeId", getInPaymentMethodTypeId());
        if (inParameters.contains("paymentPreferenceId")) mapValue.put("paymentPreferenceId", getInPaymentPreferenceId());
        if (inParameters.contains("paymentRefNum")) mapValue.put("paymentRefNum", getInPaymentRefNum());
        if (inParameters.contains("paymentTypeId")) mapValue.put("paymentTypeId", getInPaymentTypeId());
        if (inParameters.contains("roleTypeIdTo")) mapValue.put("roleTypeIdTo", getInRoleTypeIdTo());
        if (inParameters.contains("statusId")) mapValue.put("statusId", getInStatusId());
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
        if (mapValue.containsKey("actualCurrencyAmount")) setInActualCurrencyAmount((BigDecimal) mapValue.get("actualCurrencyAmount"));
        if (mapValue.containsKey("actualCurrencyUomId")) setInActualCurrencyUomId((String) mapValue.get("actualCurrencyUomId"));
        if (mapValue.containsKey("amount")) setInAmount((BigDecimal) mapValue.get("amount"));
        if (mapValue.containsKey("comments")) setInComments((String) mapValue.get("comments"));
        if (mapValue.containsKey("currencyUomId")) setInCurrencyUomId((String) mapValue.get("currencyUomId"));
        if (mapValue.containsKey("effectiveDate")) setInEffectiveDate((Timestamp) mapValue.get("effectiveDate"));
        if (mapValue.containsKey("finAccountTransId")) setInFinAccountTransId((String) mapValue.get("finAccountTransId"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("overrideGlAccountId")) setInOverrideGlAccountId((String) mapValue.get("overrideGlAccountId"));
        if (mapValue.containsKey("partyIdFrom")) setInPartyIdFrom((String) mapValue.get("partyIdFrom"));
        if (mapValue.containsKey("partyIdTo")) setInPartyIdTo((String) mapValue.get("partyIdTo"));
        if (mapValue.containsKey("paymentGatewayResponseId")) setInPaymentGatewayResponseId((String) mapValue.get("paymentGatewayResponseId"));
        if (mapValue.containsKey("paymentId")) setInPaymentId((String) mapValue.get("paymentId"));
        if (mapValue.containsKey("paymentMethodId")) setInPaymentMethodId((String) mapValue.get("paymentMethodId"));
        if (mapValue.containsKey("paymentMethodTypeId")) setInPaymentMethodTypeId((String) mapValue.get("paymentMethodTypeId"));
        if (mapValue.containsKey("paymentPreferenceId")) setInPaymentPreferenceId((String) mapValue.get("paymentPreferenceId"));
        if (mapValue.containsKey("paymentRefNum")) setInPaymentRefNum((String) mapValue.get("paymentRefNum"));
        if (mapValue.containsKey("paymentTypeId")) setInPaymentTypeId((String) mapValue.get("paymentTypeId"));
        if (mapValue.containsKey("roleTypeIdTo")) setInRoleTypeIdTo((String) mapValue.get("roleTypeIdTo"));
        if (mapValue.containsKey("statusId")) setInStatusId((String) mapValue.get("statusId"));
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
     * Construct a <code>CreatePaymentService</code> from the input values of the given <code>CreatePaymentService</code>.
     * @param input a <code>CreatePaymentService</code>
     */
    public static CreatePaymentService fromInput(CreatePaymentService input) {
        CreatePaymentService service = new CreatePaymentService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>CreatePaymentService</code> from the output values of the given <code>CreatePaymentService</code>.
     * @param output a <code>CreatePaymentService</code>
     */
    public static CreatePaymentService fromOutput(CreatePaymentService output) {
        CreatePaymentService service = new CreatePaymentService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CreatePaymentService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CreatePaymentService fromInput(Map<String, Object> mapValue) {
        CreatePaymentService service = new CreatePaymentService();
        service.putAllInput(mapValue);
        if (mapValue.containsKey("userLogin")) {
            GenericValue userGv = (GenericValue) mapValue.get("userLogin");
            try {
                service.setUser(new User(userGv, userGv.getDelegator()));
            } catch (InfrastructureException e) {
                // this may happen if the user login is null
            }
        }
        return service;
    }

    /**
     * Construct a <code>CreatePaymentService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CreatePaymentService fromOutput(Map<String, Object> mapValue) {
        CreatePaymentService service = new CreatePaymentService();
        service.putAllOutput(mapValue);
        return service;
    }
}
