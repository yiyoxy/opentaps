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
 * Update EntitySync.
 * Auto generated base service entity updateEntitySync.
 *
 * Engine: simple
 * Location: component://entityext/script/org/ofbiz/entityext/synchronization/EntitySyncServices.xml
 * Invoke: updateEntitySync
 * Defined in: file:/home/jeremy/programmation/opentaps-git/framework/entityext/servicedef/services.xml
 */
public class UpdateEntitySyncService extends ServiceWrapperWithAuth {

    /** The service name as used by the service engine. */
    public static final String NAME = "updateEntitySync";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        entitySyncId("entitySyncId"),
        forPullOnly("forPullOnly"),
        forPushOnly("forPushOnly"),
        keepRemoveInfoHours("keepRemoveInfoHours"),
        lastHistoryStartDate("lastHistoryStartDate"),
        lastSuccessfulSynchTime("lastSuccessfulSynchTime"),
        locale("locale"),
        maxRunningNoUpdateMillis("maxRunningNoUpdateMillis"),
        offlineSyncSplitMillis("offlineSyncSplitMillis"),
        preOfflineSynchTime("preOfflineSynchTime"),
        runStatusId("runStatusId"),
        syncEndBufferMillis("syncEndBufferMillis"),
        syncSplitMillis("syncSplitMillis"),
        targetDelegatorName("targetDelegatorName"),
        targetServiceName("targetServiceName"),
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
     * Creates a new <code>UpdateEntitySyncService</code> instance.
     */
    public UpdateEntitySyncService() {
        super();
    }

    /**
     * Creates a new <code>UpdateEntitySyncService</code> instance.
     * @param user an <code>User</code> value
     */
    public UpdateEntitySyncService(User user) {
        super(user);
    }

    private String inEntitySyncId;
    private String inForPullOnly;
    private String inForPushOnly;
    private Double inKeepRemoveInfoHours;
    private Timestamp inLastHistoryStartDate;
    private Timestamp inLastSuccessfulSynchTime;
    private Locale inLocale;
    private Long inMaxRunningNoUpdateMillis;
    private Long inOfflineSyncSplitMillis;
    private Timestamp inPreOfflineSynchTime;
    private String inRunStatusId;
    private Long inSyncEndBufferMillis;
    private Long inSyncSplitMillis;
    private String inTargetDelegatorName;
    private String inTargetServiceName;
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
    public String getInEntitySyncId() {
        return this.inEntitySyncId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInForPullOnly() {
        return this.inForPullOnly;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInForPushOnly() {
        return this.inForPushOnly;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Double</code>
     */
    public Double getInKeepRemoveInfoHours() {
        return this.inKeepRemoveInfoHours;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInLastHistoryStartDate() {
        return this.inLastHistoryStartDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInLastSuccessfulSynchTime() {
        return this.inLastSuccessfulSynchTime;
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
     * @return <code>Long</code>
     */
    public Long getInMaxRunningNoUpdateMillis() {
        return this.inMaxRunningNoUpdateMillis;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInOfflineSyncSplitMillis() {
        return this.inOfflineSyncSplitMillis;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInPreOfflineSynchTime() {
        return this.inPreOfflineSynchTime;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRunStatusId() {
        return this.inRunStatusId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInSyncEndBufferMillis() {
        return this.inSyncEndBufferMillis;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInSyncSplitMillis() {
        return this.inSyncSplitMillis;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTargetDelegatorName() {
        return this.inTargetDelegatorName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTargetServiceName() {
        return this.inTargetServiceName;
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
     * @param inEntitySyncId the inEntitySyncId to set
    */
    public void setInEntitySyncId(String inEntitySyncId) {
        this.inParameters.add("entitySyncId");
        this.inEntitySyncId = inEntitySyncId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inForPullOnly the inForPullOnly to set
    */
    public void setInForPullOnly(String inForPullOnly) {
        this.inParameters.add("forPullOnly");
        this.inForPullOnly = inForPullOnly;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inForPushOnly the inForPushOnly to set
    */
    public void setInForPushOnly(String inForPushOnly) {
        this.inParameters.add("forPushOnly");
        this.inForPushOnly = inForPushOnly;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inKeepRemoveInfoHours the inKeepRemoveInfoHours to set
    */
    public void setInKeepRemoveInfoHours(Double inKeepRemoveInfoHours) {
        this.inParameters.add("keepRemoveInfoHours");
        this.inKeepRemoveInfoHours = inKeepRemoveInfoHours;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLastHistoryStartDate the inLastHistoryStartDate to set
    */
    public void setInLastHistoryStartDate(Timestamp inLastHistoryStartDate) {
        this.inParameters.add("lastHistoryStartDate");
        this.inLastHistoryStartDate = inLastHistoryStartDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLastSuccessfulSynchTime the inLastSuccessfulSynchTime to set
    */
    public void setInLastSuccessfulSynchTime(Timestamp inLastSuccessfulSynchTime) {
        this.inParameters.add("lastSuccessfulSynchTime");
        this.inLastSuccessfulSynchTime = inLastSuccessfulSynchTime;
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
     * @param inMaxRunningNoUpdateMillis the inMaxRunningNoUpdateMillis to set
    */
    public void setInMaxRunningNoUpdateMillis(Long inMaxRunningNoUpdateMillis) {
        this.inParameters.add("maxRunningNoUpdateMillis");
        this.inMaxRunningNoUpdateMillis = inMaxRunningNoUpdateMillis;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inOfflineSyncSplitMillis the inOfflineSyncSplitMillis to set
    */
    public void setInOfflineSyncSplitMillis(Long inOfflineSyncSplitMillis) {
        this.inParameters.add("offlineSyncSplitMillis");
        this.inOfflineSyncSplitMillis = inOfflineSyncSplitMillis;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPreOfflineSynchTime the inPreOfflineSynchTime to set
    */
    public void setInPreOfflineSynchTime(Timestamp inPreOfflineSynchTime) {
        this.inParameters.add("preOfflineSynchTime");
        this.inPreOfflineSynchTime = inPreOfflineSynchTime;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRunStatusId the inRunStatusId to set
    */
    public void setInRunStatusId(String inRunStatusId) {
        this.inParameters.add("runStatusId");
        this.inRunStatusId = inRunStatusId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSyncEndBufferMillis the inSyncEndBufferMillis to set
    */
    public void setInSyncEndBufferMillis(Long inSyncEndBufferMillis) {
        this.inParameters.add("syncEndBufferMillis");
        this.inSyncEndBufferMillis = inSyncEndBufferMillis;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSyncSplitMillis the inSyncSplitMillis to set
    */
    public void setInSyncSplitMillis(Long inSyncSplitMillis) {
        this.inParameters.add("syncSplitMillis");
        this.inSyncSplitMillis = inSyncSplitMillis;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTargetDelegatorName the inTargetDelegatorName to set
    */
    public void setInTargetDelegatorName(String inTargetDelegatorName) {
        this.inParameters.add("targetDelegatorName");
        this.inTargetDelegatorName = inTargetDelegatorName;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTargetServiceName the inTargetServiceName to set
    */
    public void setInTargetServiceName(String inTargetServiceName) {
        this.inParameters.add("targetServiceName");
        this.inTargetServiceName = inTargetServiceName;
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
        if (inParameters.contains("entitySyncId")) mapValue.put("entitySyncId", getInEntitySyncId());
        if (inParameters.contains("forPullOnly")) mapValue.put("forPullOnly", getInForPullOnly());
        if (inParameters.contains("forPushOnly")) mapValue.put("forPushOnly", getInForPushOnly());
        if (inParameters.contains("keepRemoveInfoHours")) mapValue.put("keepRemoveInfoHours", getInKeepRemoveInfoHours());
        if (inParameters.contains("lastHistoryStartDate")) mapValue.put("lastHistoryStartDate", getInLastHistoryStartDate());
        if (inParameters.contains("lastSuccessfulSynchTime")) mapValue.put("lastSuccessfulSynchTime", getInLastSuccessfulSynchTime());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("maxRunningNoUpdateMillis")) mapValue.put("maxRunningNoUpdateMillis", getInMaxRunningNoUpdateMillis());
        if (inParameters.contains("offlineSyncSplitMillis")) mapValue.put("offlineSyncSplitMillis", getInOfflineSyncSplitMillis());
        if (inParameters.contains("preOfflineSynchTime")) mapValue.put("preOfflineSynchTime", getInPreOfflineSynchTime());
        if (inParameters.contains("runStatusId")) mapValue.put("runStatusId", getInRunStatusId());
        if (inParameters.contains("syncEndBufferMillis")) mapValue.put("syncEndBufferMillis", getInSyncEndBufferMillis());
        if (inParameters.contains("syncSplitMillis")) mapValue.put("syncSplitMillis", getInSyncSplitMillis());
        if (inParameters.contains("targetDelegatorName")) mapValue.put("targetDelegatorName", getInTargetDelegatorName());
        if (inParameters.contains("targetServiceName")) mapValue.put("targetServiceName", getInTargetServiceName());
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
        if (mapValue.containsKey("entitySyncId")) setInEntitySyncId((String) mapValue.get("entitySyncId"));
        if (mapValue.containsKey("forPullOnly")) setInForPullOnly((String) mapValue.get("forPullOnly"));
        if (mapValue.containsKey("forPushOnly")) setInForPushOnly((String) mapValue.get("forPushOnly"));
        if (mapValue.containsKey("keepRemoveInfoHours")) setInKeepRemoveInfoHours((Double) mapValue.get("keepRemoveInfoHours"));
        if (mapValue.containsKey("lastHistoryStartDate")) setInLastHistoryStartDate((Timestamp) mapValue.get("lastHistoryStartDate"));
        if (mapValue.containsKey("lastSuccessfulSynchTime")) setInLastSuccessfulSynchTime((Timestamp) mapValue.get("lastSuccessfulSynchTime"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("maxRunningNoUpdateMillis")) setInMaxRunningNoUpdateMillis((Long) mapValue.get("maxRunningNoUpdateMillis"));
        if (mapValue.containsKey("offlineSyncSplitMillis")) setInOfflineSyncSplitMillis((Long) mapValue.get("offlineSyncSplitMillis"));
        if (mapValue.containsKey("preOfflineSynchTime")) setInPreOfflineSynchTime((Timestamp) mapValue.get("preOfflineSynchTime"));
        if (mapValue.containsKey("runStatusId")) setInRunStatusId((String) mapValue.get("runStatusId"));
        if (mapValue.containsKey("syncEndBufferMillis")) setInSyncEndBufferMillis((Long) mapValue.get("syncEndBufferMillis"));
        if (mapValue.containsKey("syncSplitMillis")) setInSyncSplitMillis((Long) mapValue.get("syncSplitMillis"));
        if (mapValue.containsKey("targetDelegatorName")) setInTargetDelegatorName((String) mapValue.get("targetDelegatorName"));
        if (mapValue.containsKey("targetServiceName")) setInTargetServiceName((String) mapValue.get("targetServiceName"));
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
     * Construct a <code>UpdateEntitySyncService</code> from the input values of the given <code>UpdateEntitySyncService</code>.
     * @param input a <code>UpdateEntitySyncService</code>
     */
    public static UpdateEntitySyncService fromInput(UpdateEntitySyncService input) {
        UpdateEntitySyncService service = new UpdateEntitySyncService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>UpdateEntitySyncService</code> from the output values of the given <code>UpdateEntitySyncService</code>.
     * @param output a <code>UpdateEntitySyncService</code>
     */
    public static UpdateEntitySyncService fromOutput(UpdateEntitySyncService output) {
        UpdateEntitySyncService service = new UpdateEntitySyncService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>UpdateEntitySyncService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static UpdateEntitySyncService fromInput(Map<String, Object> mapValue) {
        UpdateEntitySyncService service = new UpdateEntitySyncService();
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
     * Construct a <code>UpdateEntitySyncService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static UpdateEntitySyncService fromOutput(Map<String, Object> mapValue) {
        UpdateEntitySyncService service = new UpdateEntitySyncService();
        service.putAllOutput(mapValue);
        return service;
    }
}
