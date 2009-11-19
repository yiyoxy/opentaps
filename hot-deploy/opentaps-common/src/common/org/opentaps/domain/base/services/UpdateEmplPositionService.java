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
 * Update an Employee Position.
 * Auto generated base service entity updateEmplPosition.
 *
 * Engine: simple
 * Location: component://humanres/script/org/ofbiz/humanres/HumanResServices.xml
 * Invoke: updateEmplPosition
 * Defined in: file:/home/jeremy/programmation/opentaps-git/applications/humanres/servicedef/services.xml
 */
public class UpdateEmplPositionService extends ServiceWrapperWithAuth {

    /** The service name as used by the service engine. */
    public static final String NAME = "updateEmplPosition";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        actualFromDate("actualFromDate"),
        actualThruDate("actualThruDate"),
        budgetId("budgetId"),
        budgetItemSeqId("budgetItemSeqId"),
        emplPositionId("emplPositionId"),
        emplPositionTypeId("emplPositionTypeId"),
        estimatedFromDate("estimatedFromDate"),
        estimatedThruDate("estimatedThruDate"),
        exemptFlag("exemptFlag"),
        fulltimeFlag("fulltimeFlag"),
        locale("locale"),
        partyId("partyId"),
        salaryFlag("salaryFlag"),
        statusId("statusId"),
        temporaryFlag("temporaryFlag"),
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
     * Creates a new <code>UpdateEmplPositionService</code> instance.
     */
    public UpdateEmplPositionService() {
        super();
    }

    /**
     * Creates a new <code>UpdateEmplPositionService</code> instance.
     * @param user an <code>User</code> value
     */
    public UpdateEmplPositionService(User user) {
        super(user);
    }

    private Timestamp inActualFromDate;
    private Timestamp inActualThruDate;
    private String inBudgetId;
    private String inBudgetItemSeqId;
    private String inEmplPositionId;
    private String inEmplPositionTypeId;
    private Timestamp inEstimatedFromDate;
    private Timestamp inEstimatedThruDate;
    private String inExemptFlag;
    private String inFulltimeFlag;
    private Locale inLocale;
    private String inPartyId;
    private String inSalaryFlag;
    private String inStatusId;
    private String inTemporaryFlag;
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
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInActualFromDate() {
        return this.inActualFromDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInActualThruDate() {
        return this.inActualThruDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInBudgetId() {
        return this.inBudgetId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInBudgetItemSeqId() {
        return this.inBudgetItemSeqId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInEmplPositionId() {
        return this.inEmplPositionId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
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
    public Timestamp getInEstimatedFromDate() {
        return this.inEstimatedFromDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInEstimatedThruDate() {
        return this.inEstimatedThruDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInExemptFlag() {
        return this.inExemptFlag;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInFulltimeFlag() {
        return this.inFulltimeFlag;
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
    public String getInSalaryFlag() {
        return this.inSalaryFlag;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInStatusId() {
        return this.inStatusId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTemporaryFlag() {
        return this.inTemporaryFlag;
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
     * This parameter is optional.
     * @param inActualFromDate the inActualFromDate to set
    */
    public void setInActualFromDate(Timestamp inActualFromDate) {
        this.inParameters.add("actualFromDate");
        this.inActualFromDate = inActualFromDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inActualThruDate the inActualThruDate to set
    */
    public void setInActualThruDate(Timestamp inActualThruDate) {
        this.inParameters.add("actualThruDate");
        this.inActualThruDate = inActualThruDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inBudgetId the inBudgetId to set
    */
    public void setInBudgetId(String inBudgetId) {
        this.inParameters.add("budgetId");
        this.inBudgetId = inBudgetId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inBudgetItemSeqId the inBudgetItemSeqId to set
    */
    public void setInBudgetItemSeqId(String inBudgetItemSeqId) {
        this.inParameters.add("budgetItemSeqId");
        this.inBudgetItemSeqId = inBudgetItemSeqId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inEmplPositionId the inEmplPositionId to set
    */
    public void setInEmplPositionId(String inEmplPositionId) {
        this.inParameters.add("emplPositionId");
        this.inEmplPositionId = inEmplPositionId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inEmplPositionTypeId the inEmplPositionTypeId to set
    */
    public void setInEmplPositionTypeId(String inEmplPositionTypeId) {
        this.inParameters.add("emplPositionTypeId");
        this.inEmplPositionTypeId = inEmplPositionTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inEstimatedFromDate the inEstimatedFromDate to set
    */
    public void setInEstimatedFromDate(Timestamp inEstimatedFromDate) {
        this.inParameters.add("estimatedFromDate");
        this.inEstimatedFromDate = inEstimatedFromDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inEstimatedThruDate the inEstimatedThruDate to set
    */
    public void setInEstimatedThruDate(Timestamp inEstimatedThruDate) {
        this.inParameters.add("estimatedThruDate");
        this.inEstimatedThruDate = inEstimatedThruDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inExemptFlag the inExemptFlag to set
    */
    public void setInExemptFlag(String inExemptFlag) {
        this.inParameters.add("exemptFlag");
        this.inExemptFlag = inExemptFlag;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFulltimeFlag the inFulltimeFlag to set
    */
    public void setInFulltimeFlag(String inFulltimeFlag) {
        this.inParameters.add("fulltimeFlag");
        this.inFulltimeFlag = inFulltimeFlag;
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
     * @param inSalaryFlag the inSalaryFlag to set
    */
    public void setInSalaryFlag(String inSalaryFlag) {
        this.inParameters.add("salaryFlag");
        this.inSalaryFlag = inSalaryFlag;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inStatusId the inStatusId to set
    */
    public void setInStatusId(String inStatusId) {
        this.inParameters.add("statusId");
        this.inStatusId = inStatusId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTemporaryFlag the inTemporaryFlag to set
    */
    public void setInTemporaryFlag(String inTemporaryFlag) {
        this.inParameters.add("temporaryFlag");
        this.inTemporaryFlag = inTemporaryFlag;
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
        if (inParameters.contains("actualFromDate")) mapValue.put("actualFromDate", getInActualFromDate());
        if (inParameters.contains("actualThruDate")) mapValue.put("actualThruDate", getInActualThruDate());
        if (inParameters.contains("budgetId")) mapValue.put("budgetId", getInBudgetId());
        if (inParameters.contains("budgetItemSeqId")) mapValue.put("budgetItemSeqId", getInBudgetItemSeqId());
        if (inParameters.contains("emplPositionId")) mapValue.put("emplPositionId", getInEmplPositionId());
        if (inParameters.contains("emplPositionTypeId")) mapValue.put("emplPositionTypeId", getInEmplPositionTypeId());
        if (inParameters.contains("estimatedFromDate")) mapValue.put("estimatedFromDate", getInEstimatedFromDate());
        if (inParameters.contains("estimatedThruDate")) mapValue.put("estimatedThruDate", getInEstimatedThruDate());
        if (inParameters.contains("exemptFlag")) mapValue.put("exemptFlag", getInExemptFlag());
        if (inParameters.contains("fulltimeFlag")) mapValue.put("fulltimeFlag", getInFulltimeFlag());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("partyId")) mapValue.put("partyId", getInPartyId());
        if (inParameters.contains("salaryFlag")) mapValue.put("salaryFlag", getInSalaryFlag());
        if (inParameters.contains("statusId")) mapValue.put("statusId", getInStatusId());
        if (inParameters.contains("temporaryFlag")) mapValue.put("temporaryFlag", getInTemporaryFlag());
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
        if (mapValue.containsKey("actualFromDate")) setInActualFromDate((Timestamp) mapValue.get("actualFromDate"));
        if (mapValue.containsKey("actualThruDate")) setInActualThruDate((Timestamp) mapValue.get("actualThruDate"));
        if (mapValue.containsKey("budgetId")) setInBudgetId((String) mapValue.get("budgetId"));
        if (mapValue.containsKey("budgetItemSeqId")) setInBudgetItemSeqId((String) mapValue.get("budgetItemSeqId"));
        if (mapValue.containsKey("emplPositionId")) setInEmplPositionId((String) mapValue.get("emplPositionId"));
        if (mapValue.containsKey("emplPositionTypeId")) setInEmplPositionTypeId((String) mapValue.get("emplPositionTypeId"));
        if (mapValue.containsKey("estimatedFromDate")) setInEstimatedFromDate((Timestamp) mapValue.get("estimatedFromDate"));
        if (mapValue.containsKey("estimatedThruDate")) setInEstimatedThruDate((Timestamp) mapValue.get("estimatedThruDate"));
        if (mapValue.containsKey("exemptFlag")) setInExemptFlag((String) mapValue.get("exemptFlag"));
        if (mapValue.containsKey("fulltimeFlag")) setInFulltimeFlag((String) mapValue.get("fulltimeFlag"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("partyId")) setInPartyId((String) mapValue.get("partyId"));
        if (mapValue.containsKey("salaryFlag")) setInSalaryFlag((String) mapValue.get("salaryFlag"));
        if (mapValue.containsKey("statusId")) setInStatusId((String) mapValue.get("statusId"));
        if (mapValue.containsKey("temporaryFlag")) setInTemporaryFlag((String) mapValue.get("temporaryFlag"));
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
     * Construct a <code>UpdateEmplPositionService</code> from the input values of the given <code>UpdateEmplPositionService</code>.
     * @param input a <code>UpdateEmplPositionService</code>
     */
    public static UpdateEmplPositionService fromInput(UpdateEmplPositionService input) {
        UpdateEmplPositionService service = new UpdateEmplPositionService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>UpdateEmplPositionService</code> from the output values of the given <code>UpdateEmplPositionService</code>.
     * @param output a <code>UpdateEmplPositionService</code>
     */
    public static UpdateEmplPositionService fromOutput(UpdateEmplPositionService output) {
        UpdateEmplPositionService service = new UpdateEmplPositionService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>UpdateEmplPositionService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static UpdateEmplPositionService fromInput(Map<String, Object> mapValue) {
        UpdateEmplPositionService service = new UpdateEmplPositionService();
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
     * Construct a <code>UpdateEmplPositionService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static UpdateEmplPositionService fromOutput(Map<String, Object> mapValue) {
        UpdateEmplPositionService service = new UpdateEmplPositionService();
        service.putAllOutput(mapValue);
        return service;
    }
}
