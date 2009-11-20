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
 * Update Valid EmplPositionTypeRate.
 * Auto generated base service entity updateEmplPositionTypeRate.
 *
 * Engine: simple
 * Location: component://humanres/script/org/ofbiz/humanres/HumanResServices.xml
 * Invoke: updateEmplPositionTypeRate
 * Defined in: file:/home/jeremy/programmation/opentaps-git/applications/humanres/servicedef/services.xml
 */
public class UpdateEmplPositionTypeRateService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "updateEmplPositionTypeRate";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        emplPositionTypeId("emplPositionTypeId"),
        fromDate("fromDate"),
        locale("locale"),
        payGradeId("payGradeId"),
        periodTypeId("periodTypeId"),
        rateAmount("rateAmount"),
        rateCurrencyUomId("rateCurrencyUomId"),
        rateTypeId("rateTypeId"),
        salaryStepSeqId("salaryStepSeqId"),
        thruDate("thruDate"),
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
     * Creates a new <code>UpdateEmplPositionTypeRateService</code> instance.
     */
    public UpdateEmplPositionTypeRateService() {
        super();
    }

    /**
     * Creates a new <code>UpdateEmplPositionTypeRateService</code> instance.
     * @param user an <code>User</code> value
     */
    public UpdateEmplPositionTypeRateService(User user) {
        super(user);
    }

    private String inEmplPositionTypeId;
    private Timestamp inFromDate;
    private Locale inLocale;
    private String inPayGradeId;
    private String inPeriodTypeId;
    private BigDecimal inRateAmount;
    private String inRateCurrencyUomId;
    private String inRateTypeId;
    private String inSalaryStepSeqId;
    private Timestamp inThruDate;
    private TimeZone inTimeZone;
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
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInEmplPositionTypeId() {
        return this.inEmplPositionTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInFromDate() {
        return this.inFromDate;
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
    public String getInPayGradeId() {
        return this.inPayGradeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInPeriodTypeId() {
        return this.inPeriodTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInRateAmount() {
        return this.inRateAmount;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRateCurrencyUomId() {
        return this.inRateCurrencyUomId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInRateTypeId() {
        return this.inRateTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInSalaryStepSeqId() {
        return this.inSalaryStepSeqId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInThruDate() {
        return this.inThruDate;
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
     * @param inEmplPositionTypeId the inEmplPositionTypeId to set
    */
    public void setInEmplPositionTypeId(String inEmplPositionTypeId) {
        this.inParameters.add("emplPositionTypeId");
        this.inEmplPositionTypeId = inEmplPositionTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFromDate the inFromDate to set
    */
    public void setInFromDate(Timestamp inFromDate) {
        this.inParameters.add("fromDate");
        this.inFromDate = inFromDate;
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
     * @param inPayGradeId the inPayGradeId to set
    */
    public void setInPayGradeId(String inPayGradeId) {
        this.inParameters.add("payGradeId");
        this.inPayGradeId = inPayGradeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inPeriodTypeId the inPeriodTypeId to set
    */
    public void setInPeriodTypeId(String inPeriodTypeId) {
        this.inParameters.add("periodTypeId");
        this.inPeriodTypeId = inPeriodTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRateAmount the inRateAmount to set
    */
    public void setInRateAmount(BigDecimal inRateAmount) {
        this.inParameters.add("rateAmount");
        this.inRateAmount = inRateAmount;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRateCurrencyUomId the inRateCurrencyUomId to set
    */
    public void setInRateCurrencyUomId(String inRateCurrencyUomId) {
        this.inParameters.add("rateCurrencyUomId");
        this.inRateCurrencyUomId = inRateCurrencyUomId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inRateTypeId the inRateTypeId to set
    */
    public void setInRateTypeId(String inRateTypeId) {
        this.inParameters.add("rateTypeId");
        this.inRateTypeId = inRateTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSalaryStepSeqId the inSalaryStepSeqId to set
    */
    public void setInSalaryStepSeqId(String inSalaryStepSeqId) {
        this.inParameters.add("salaryStepSeqId");
        this.inSalaryStepSeqId = inSalaryStepSeqId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inThruDate the inThruDate to set
    */
    public void setInThruDate(Timestamp inThruDate) {
        this.inParameters.add("thruDate");
        this.inThruDate = inThruDate;
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
        if (inParameters.contains("emplPositionTypeId")) mapValue.put("emplPositionTypeId", getInEmplPositionTypeId());
        if (inParameters.contains("fromDate")) mapValue.put("fromDate", getInFromDate());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("payGradeId")) mapValue.put("payGradeId", getInPayGradeId());
        if (inParameters.contains("periodTypeId")) mapValue.put("periodTypeId", getInPeriodTypeId());
        if (inParameters.contains("rateAmount")) mapValue.put("rateAmount", getInRateAmount());
        if (inParameters.contains("rateCurrencyUomId")) mapValue.put("rateCurrencyUomId", getInRateCurrencyUomId());
        if (inParameters.contains("rateTypeId")) mapValue.put("rateTypeId", getInRateTypeId());
        if (inParameters.contains("salaryStepSeqId")) mapValue.put("salaryStepSeqId", getInSalaryStepSeqId());
        if (inParameters.contains("thruDate")) mapValue.put("thruDate", getInThruDate());
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
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("emplPositionTypeId")) setInEmplPositionTypeId((String) mapValue.get("emplPositionTypeId"));
        if (mapValue.containsKey("fromDate")) setInFromDate((Timestamp) mapValue.get("fromDate"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("payGradeId")) setInPayGradeId((String) mapValue.get("payGradeId"));
        if (mapValue.containsKey("periodTypeId")) setInPeriodTypeId((String) mapValue.get("periodTypeId"));
        if (mapValue.containsKey("rateAmount")) setInRateAmount((BigDecimal) mapValue.get("rateAmount"));
        if (mapValue.containsKey("rateCurrencyUomId")) setInRateCurrencyUomId((String) mapValue.get("rateCurrencyUomId"));
        if (mapValue.containsKey("rateTypeId")) setInRateTypeId((String) mapValue.get("rateTypeId"));
        if (mapValue.containsKey("salaryStepSeqId")) setInSalaryStepSeqId((String) mapValue.get("salaryStepSeqId"));
        if (mapValue.containsKey("thruDate")) setInThruDate((Timestamp) mapValue.get("thruDate"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
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
     * Construct a <code>UpdateEmplPositionTypeRateService</code> from the input values of the given <code>UpdateEmplPositionTypeRateService</code>.
     * @param input a <code>UpdateEmplPositionTypeRateService</code>
     */
    public static UpdateEmplPositionTypeRateService fromInput(UpdateEmplPositionTypeRateService input) {
        UpdateEmplPositionTypeRateService service = new UpdateEmplPositionTypeRateService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>UpdateEmplPositionTypeRateService</code> from the output values of the given <code>UpdateEmplPositionTypeRateService</code>.
     * @param output a <code>UpdateEmplPositionTypeRateService</code>
     */
    public static UpdateEmplPositionTypeRateService fromOutput(UpdateEmplPositionTypeRateService output) {
        UpdateEmplPositionTypeRateService service = new UpdateEmplPositionTypeRateService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>UpdateEmplPositionTypeRateService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static UpdateEmplPositionTypeRateService fromInput(Map<String, Object> mapValue) {
        UpdateEmplPositionTypeRateService service = new UpdateEmplPositionTypeRateService();
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
     * Construct a <code>UpdateEmplPositionTypeRateService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static UpdateEmplPositionTypeRateService fromOutput(Map<String, Object> mapValue) {
        UpdateEmplPositionTypeRateService service = new UpdateEmplPositionTypeRateService();
        service.putAllOutput(mapValue);
        return service;
    }
}
