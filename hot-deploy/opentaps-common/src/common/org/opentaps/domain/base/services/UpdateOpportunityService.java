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

/**
 * Update an opportnity.
 * Auto generated base service entity updateOpportunity.
 *
 * Engine: simple
 * Location: component://marketing/script/org/ofbiz/sfa/opportunity/OpportunityServices.xml
 * Invoke: updateOpportunity
 * Defined in: file:/home/jeremy/programmation/opentaps-git/applications/marketing/servicedef/services.xml
 */
public class UpdateOpportunityService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "updateOpportunity";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.FALSE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        createdByUserLogin("createdByUserLogin"),
        currencyUomId("currencyUomId"),
        dataSourceId("dataSourceId"),
        description("description"),
        estimatedAmount("estimatedAmount"),
        estimatedCloseDate("estimatedCloseDate"),
        estimatedProbability("estimatedProbability"),
        locale("locale"),
        marketingCampaignId("marketingCampaignId"),
        nextStep("nextStep"),
        opportunityName("opportunityName"),
        opportunityStageId("opportunityStageId"),
        salesOpportunityId("salesOpportunityId"),
        timeZone("timeZone"),
        typeEnumId("typeEnumId"),
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
     * Creates a new <code>UpdateOpportunityService</code> instance.
     */
    public UpdateOpportunityService() {
        super();
    }


    private String inCreatedByUserLogin;
    private String inCurrencyUomId;
    private String inDataSourceId;
    private String inDescription;
    private BigDecimal inEstimatedAmount;
    private Timestamp inEstimatedCloseDate;
    private BigDecimal inEstimatedProbability;
    private Locale inLocale;
    private String inMarketingCampaignId;
    private String inNextStep;
    private String inOpportunityName;
    private String inOpportunityStageId;
    private String inSalesOpportunityId;
    private TimeZone inTimeZone;
    private String inTypeEnumId;
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
    public String getInCreatedByUserLogin() {
        return this.inCreatedByUserLogin;
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
     * @return <code>String</code>
     */
    public String getInDataSourceId() {
        return this.inDataSourceId;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInEstimatedAmount() {
        return this.inEstimatedAmount;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInEstimatedCloseDate() {
        return this.inEstimatedCloseDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInEstimatedProbability() {
        return this.inEstimatedProbability;
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
    public String getInMarketingCampaignId() {
        return this.inMarketingCampaignId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInNextStep() {
        return this.inNextStep;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInOpportunityName() {
        return this.inOpportunityName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInOpportunityStageId() {
        return this.inOpportunityStageId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInSalesOpportunityId() {
        return this.inSalesOpportunityId;
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
    public String getInTypeEnumId() {
        return this.inTypeEnumId;
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
     * @param inCreatedByUserLogin the inCreatedByUserLogin to set
    */
    public void setInCreatedByUserLogin(String inCreatedByUserLogin) {
        this.inParameters.add("createdByUserLogin");
        this.inCreatedByUserLogin = inCreatedByUserLogin;
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
     * @param inDataSourceId the inDataSourceId to set
    */
    public void setInDataSourceId(String inDataSourceId) {
        this.inParameters.add("dataSourceId");
        this.inDataSourceId = inDataSourceId;
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
     * @param inEstimatedAmount the inEstimatedAmount to set
    */
    public void setInEstimatedAmount(BigDecimal inEstimatedAmount) {
        this.inParameters.add("estimatedAmount");
        this.inEstimatedAmount = inEstimatedAmount;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inEstimatedCloseDate the inEstimatedCloseDate to set
    */
    public void setInEstimatedCloseDate(Timestamp inEstimatedCloseDate) {
        this.inParameters.add("estimatedCloseDate");
        this.inEstimatedCloseDate = inEstimatedCloseDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inEstimatedProbability the inEstimatedProbability to set
    */
    public void setInEstimatedProbability(BigDecimal inEstimatedProbability) {
        this.inParameters.add("estimatedProbability");
        this.inEstimatedProbability = inEstimatedProbability;
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
     * @param inMarketingCampaignId the inMarketingCampaignId to set
    */
    public void setInMarketingCampaignId(String inMarketingCampaignId) {
        this.inParameters.add("marketingCampaignId");
        this.inMarketingCampaignId = inMarketingCampaignId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inNextStep the inNextStep to set
    */
    public void setInNextStep(String inNextStep) {
        this.inParameters.add("nextStep");
        this.inNextStep = inNextStep;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inOpportunityName the inOpportunityName to set
    */
    public void setInOpportunityName(String inOpportunityName) {
        this.inParameters.add("opportunityName");
        this.inOpportunityName = inOpportunityName;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inOpportunityStageId the inOpportunityStageId to set
    */
    public void setInOpportunityStageId(String inOpportunityStageId) {
        this.inParameters.add("opportunityStageId");
        this.inOpportunityStageId = inOpportunityStageId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inSalesOpportunityId the inSalesOpportunityId to set
    */
    public void setInSalesOpportunityId(String inSalesOpportunityId) {
        this.inParameters.add("salesOpportunityId");
        this.inSalesOpportunityId = inSalesOpportunityId;
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
     * @param inTypeEnumId the inTypeEnumId to set
    */
    public void setInTypeEnumId(String inTypeEnumId) {
        this.inParameters.add("typeEnumId");
        this.inTypeEnumId = inTypeEnumId;
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
        if (inParameters.contains("createdByUserLogin")) mapValue.put("createdByUserLogin", getInCreatedByUserLogin());
        if (inParameters.contains("currencyUomId")) mapValue.put("currencyUomId", getInCurrencyUomId());
        if (inParameters.contains("dataSourceId")) mapValue.put("dataSourceId", getInDataSourceId());
        if (inParameters.contains("description")) mapValue.put("description", getInDescription());
        if (inParameters.contains("estimatedAmount")) mapValue.put("estimatedAmount", getInEstimatedAmount());
        if (inParameters.contains("estimatedCloseDate")) mapValue.put("estimatedCloseDate", getInEstimatedCloseDate());
        if (inParameters.contains("estimatedProbability")) mapValue.put("estimatedProbability", getInEstimatedProbability());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("marketingCampaignId")) mapValue.put("marketingCampaignId", getInMarketingCampaignId());
        if (inParameters.contains("nextStep")) mapValue.put("nextStep", getInNextStep());
        if (inParameters.contains("opportunityName")) mapValue.put("opportunityName", getInOpportunityName());
        if (inParameters.contains("opportunityStageId")) mapValue.put("opportunityStageId", getInOpportunityStageId());
        if (inParameters.contains("salesOpportunityId")) mapValue.put("salesOpportunityId", getInSalesOpportunityId());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("typeEnumId")) mapValue.put("typeEnumId", getInTypeEnumId());
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
        if (mapValue.containsKey("createdByUserLogin")) setInCreatedByUserLogin((String) mapValue.get("createdByUserLogin"));
        if (mapValue.containsKey("currencyUomId")) setInCurrencyUomId((String) mapValue.get("currencyUomId"));
        if (mapValue.containsKey("dataSourceId")) setInDataSourceId((String) mapValue.get("dataSourceId"));
        if (mapValue.containsKey("description")) setInDescription((String) mapValue.get("description"));
        if (mapValue.containsKey("estimatedAmount")) setInEstimatedAmount((BigDecimal) mapValue.get("estimatedAmount"));
        if (mapValue.containsKey("estimatedCloseDate")) setInEstimatedCloseDate((Timestamp) mapValue.get("estimatedCloseDate"));
        if (mapValue.containsKey("estimatedProbability")) setInEstimatedProbability((BigDecimal) mapValue.get("estimatedProbability"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("marketingCampaignId")) setInMarketingCampaignId((String) mapValue.get("marketingCampaignId"));
        if (mapValue.containsKey("nextStep")) setInNextStep((String) mapValue.get("nextStep"));
        if (mapValue.containsKey("opportunityName")) setInOpportunityName((String) mapValue.get("opportunityName"));
        if (mapValue.containsKey("opportunityStageId")) setInOpportunityStageId((String) mapValue.get("opportunityStageId"));
        if (mapValue.containsKey("salesOpportunityId")) setInSalesOpportunityId((String) mapValue.get("salesOpportunityId"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("typeEnumId")) setInTypeEnumId((String) mapValue.get("typeEnumId"));
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
     * Construct a <code>UpdateOpportunityService</code> from the input values of the given <code>UpdateOpportunityService</code>.
     * @param input a <code>UpdateOpportunityService</code>
     */
    public static UpdateOpportunityService fromInput(UpdateOpportunityService input) {
        UpdateOpportunityService service = new UpdateOpportunityService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>UpdateOpportunityService</code> from the output values of the given <code>UpdateOpportunityService</code>.
     * @param output a <code>UpdateOpportunityService</code>
     */
    public static UpdateOpportunityService fromOutput(UpdateOpportunityService output) {
        UpdateOpportunityService service = new UpdateOpportunityService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>UpdateOpportunityService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static UpdateOpportunityService fromInput(Map<String, Object> mapValue) {
        UpdateOpportunityService service = new UpdateOpportunityService();
        service.putAllInput(mapValue);
        return service;
    }

    /**
     * Construct a <code>UpdateOpportunityService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static UpdateOpportunityService fromOutput(Map<String, Object> mapValue) {
        UpdateOpportunityService service = new UpdateOpportunityService();
        service.putAllOutput(mapValue);
        return service;
    }
}
