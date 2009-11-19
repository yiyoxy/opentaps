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
 * Update a ContentAssoc.
 * Auto generated base service entity updateContentAssoc.
 *
 * Engine: simple
 * Location: component://content/script/org/ofbiz/content/content/ContentServices.xml
 * Invoke: updateContentAssoc
 * Defined in: file:/home/jeremy/programmation/opentaps-git/applications/content/servicedef/services_content.xml
 */
public class UpdateContentAssocService extends ServiceWrapperWithAuth {

    /** The service name as used by the service engine. */
    public static final String NAME = "updateContentAssoc";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        contentAssocPredicateId("contentAssocPredicateId"),
        contentAssocTypeId("contentAssocTypeId"),
        contentId("contentId"),
        contentIdFrom("contentIdFrom"),
        contentIdTo("contentIdTo"),
        contentPurposeList("contentPurposeList"),
        createdByUserLogin("createdByUserLogin"),
        createdDate("createdDate"),
        dataSourceId("dataSourceId"),
        deactivateExisting("deactivateExisting"),
        displayFailCond("displayFailCond"),
        fromDate("fromDate"),
        lastModifiedByUserLogin("lastModifiedByUserLogin"),
        lastModifiedDate("lastModifiedDate"),
        leftCoordinate("leftCoordinate"),
        locale("locale"),
        mapKey("mapKey"),
        roleTypeList("roleTypeList"),
        sequenceNum("sequenceNum"),
        skipPermissionCheck("skipPermissionCheck"),
        targetOperationList("targetOperationList"),
        thruDate("thruDate"),
        timeZone("timeZone"),
        upperCoordinate("upperCoordinate"),
        userLogin("userLogin");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        contentIdFrom("contentIdFrom"),
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        locale("locale"),
        responseMessage("responseMessage"),
        roleTypeList("roleTypeList"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    /**
     * Creates a new <code>UpdateContentAssocService</code> instance.
     */
    public UpdateContentAssocService() {
        super();
    }

    /**
     * Creates a new <code>UpdateContentAssocService</code> instance.
     * @param user an <code>User</code> value
     */
    public UpdateContentAssocService(User user) {
        super(user);
    }

    private String inContentAssocPredicateId;
    private String inContentAssocTypeId;
    private String inContentId;
    private String inContentIdFrom;
    private String inContentIdTo;
    private List inContentPurposeList;
    private String inCreatedByUserLogin;
    private Timestamp inCreatedDate;
    private String inDataSourceId;
    private String inDeactivateExisting;
    private Boolean inDisplayFailCond;
    private Timestamp inFromDate;
    private String inLastModifiedByUserLogin;
    private Timestamp inLastModifiedDate;
    private Long inLeftCoordinate;
    private Locale inLocale;
    private String inMapKey;
    private List inRoleTypeList;
    private Long inSequenceNum;
    private String inSkipPermissionCheck;
    private List inTargetOperationList;
    private Timestamp inThruDate;
    private TimeZone inTimeZone;
    private Long inUpperCoordinate;
    private GenericValue inUserLogin;
    private String outContentIdFrom;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private String outResponseMessage;
    private List outRoleTypeList;
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
    public String getInContentAssocPredicateId() {
        return this.inContentAssocPredicateId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInContentAssocTypeId() {
        return this.inContentAssocTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInContentId() {
        return this.inContentId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInContentIdFrom() {
        return this.inContentIdFrom;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInContentIdTo() {
        return this.inContentIdTo;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getInContentPurposeList() {
        return this.inContentPurposeList;
    }
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
     * @return <code>Timestamp</code>
     */
    public Timestamp getInCreatedDate() {
        return this.inCreatedDate;
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
    public String getInDeactivateExisting() {
        return this.inDeactivateExisting;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Boolean</code>
     */
    public Boolean getInDisplayFailCond() {
        return this.inDisplayFailCond;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInFromDate() {
        return this.inFromDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInLastModifiedByUserLogin() {
        return this.inLastModifiedByUserLogin;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInLastModifiedDate() {
        return this.inLastModifiedDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInLeftCoordinate() {
        return this.inLeftCoordinate;
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
    public String getInMapKey() {
        return this.inMapKey;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getInRoleTypeList() {
        return this.inRoleTypeList;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInSequenceNum() {
        return this.inSequenceNum;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInSkipPermissionCheck() {
        return this.inSkipPermissionCheck;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getInTargetOperationList() {
        return this.inTargetOperationList;
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
     * @return <code>Long</code>
     */
    public Long getInUpperCoordinate() {
        return this.inUpperCoordinate;
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
    public String getOutContentIdFrom() {
        return this.outContentIdFrom;
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
     * @return <code>List</code>
     */
    public List getOutRoleTypeList() {
        return this.outRoleTypeList;
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
     * @param inContentAssocPredicateId the inContentAssocPredicateId to set
    */
    public void setInContentAssocPredicateId(String inContentAssocPredicateId) {
        this.inParameters.add("contentAssocPredicateId");
        this.inContentAssocPredicateId = inContentAssocPredicateId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inContentAssocTypeId the inContentAssocTypeId to set
    */
    public void setInContentAssocTypeId(String inContentAssocTypeId) {
        this.inParameters.add("contentAssocTypeId");
        this.inContentAssocTypeId = inContentAssocTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inContentId the inContentId to set
    */
    public void setInContentId(String inContentId) {
        this.inParameters.add("contentId");
        this.inContentId = inContentId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inContentIdFrom the inContentIdFrom to set
    */
    public void setInContentIdFrom(String inContentIdFrom) {
        this.inParameters.add("contentIdFrom");
        this.inContentIdFrom = inContentIdFrom;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inContentIdTo the inContentIdTo to set
    */
    public void setInContentIdTo(String inContentIdTo) {
        this.inParameters.add("contentIdTo");
        this.inContentIdTo = inContentIdTo;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inContentPurposeList the inContentPurposeList to set
    */
    public void setInContentPurposeList(List inContentPurposeList) {
        this.inParameters.add("contentPurposeList");
        this.inContentPurposeList = inContentPurposeList;
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
     * @param inCreatedDate the inCreatedDate to set
    */
    public void setInCreatedDate(Timestamp inCreatedDate) {
        this.inParameters.add("createdDate");
        this.inCreatedDate = inCreatedDate;
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
     * @param inDeactivateExisting the inDeactivateExisting to set
    */
    public void setInDeactivateExisting(String inDeactivateExisting) {
        this.inParameters.add("deactivateExisting");
        this.inDeactivateExisting = inDeactivateExisting;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDisplayFailCond the inDisplayFailCond to set
    */
    public void setInDisplayFailCond(Boolean inDisplayFailCond) {
        this.inParameters.add("displayFailCond");
        this.inDisplayFailCond = inDisplayFailCond;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inFromDate the inFromDate to set
    */
    public void setInFromDate(Timestamp inFromDate) {
        this.inParameters.add("fromDate");
        this.inFromDate = inFromDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLastModifiedByUserLogin the inLastModifiedByUserLogin to set
    */
    public void setInLastModifiedByUserLogin(String inLastModifiedByUserLogin) {
        this.inParameters.add("lastModifiedByUserLogin");
        this.inLastModifiedByUserLogin = inLastModifiedByUserLogin;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLastModifiedDate the inLastModifiedDate to set
    */
    public void setInLastModifiedDate(Timestamp inLastModifiedDate) {
        this.inParameters.add("lastModifiedDate");
        this.inLastModifiedDate = inLastModifiedDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLeftCoordinate the inLeftCoordinate to set
    */
    public void setInLeftCoordinate(Long inLeftCoordinate) {
        this.inParameters.add("leftCoordinate");
        this.inLeftCoordinate = inLeftCoordinate;
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
     * @param inMapKey the inMapKey to set
    */
    public void setInMapKey(String inMapKey) {
        this.inParameters.add("mapKey");
        this.inMapKey = inMapKey;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRoleTypeList the inRoleTypeList to set
    */
    public void setInRoleTypeList(List inRoleTypeList) {
        this.inParameters.add("roleTypeList");
        this.inRoleTypeList = inRoleTypeList;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSequenceNum the inSequenceNum to set
    */
    public void setInSequenceNum(Long inSequenceNum) {
        this.inParameters.add("sequenceNum");
        this.inSequenceNum = inSequenceNum;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSkipPermissionCheck the inSkipPermissionCheck to set
    */
    public void setInSkipPermissionCheck(String inSkipPermissionCheck) {
        this.inParameters.add("skipPermissionCheck");
        this.inSkipPermissionCheck = inSkipPermissionCheck;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTargetOperationList the inTargetOperationList to set
    */
    public void setInTargetOperationList(List inTargetOperationList) {
        this.inParameters.add("targetOperationList");
        this.inTargetOperationList = inTargetOperationList;
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
     * @param inUpperCoordinate the inUpperCoordinate to set
    */
    public void setInUpperCoordinate(Long inUpperCoordinate) {
        this.inParameters.add("upperCoordinate");
        this.inUpperCoordinate = inUpperCoordinate;
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
     * @param outContentIdFrom the outContentIdFrom to set
    */
    public void setOutContentIdFrom(String outContentIdFrom) {
        this.outParameters.add("contentIdFrom");
        this.outContentIdFrom = outContentIdFrom;
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
     * @param outRoleTypeList the outRoleTypeList to set
    */
    public void setOutRoleTypeList(List outRoleTypeList) {
        this.outParameters.add("roleTypeList");
        this.outRoleTypeList = outRoleTypeList;
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
        if (inParameters.contains("contentAssocPredicateId")) mapValue.put("contentAssocPredicateId", getInContentAssocPredicateId());
        if (inParameters.contains("contentAssocTypeId")) mapValue.put("contentAssocTypeId", getInContentAssocTypeId());
        if (inParameters.contains("contentId")) mapValue.put("contentId", getInContentId());
        if (inParameters.contains("contentIdFrom")) mapValue.put("contentIdFrom", getInContentIdFrom());
        if (inParameters.contains("contentIdTo")) mapValue.put("contentIdTo", getInContentIdTo());
        if (inParameters.contains("contentPurposeList")) mapValue.put("contentPurposeList", getInContentPurposeList());
        if (inParameters.contains("createdByUserLogin")) mapValue.put("createdByUserLogin", getInCreatedByUserLogin());
        if (inParameters.contains("createdDate")) mapValue.put("createdDate", getInCreatedDate());
        if (inParameters.contains("dataSourceId")) mapValue.put("dataSourceId", getInDataSourceId());
        if (inParameters.contains("deactivateExisting")) mapValue.put("deactivateExisting", getInDeactivateExisting());
        if (inParameters.contains("displayFailCond")) mapValue.put("displayFailCond", getInDisplayFailCond());
        if (inParameters.contains("fromDate")) mapValue.put("fromDate", getInFromDate());
        if (inParameters.contains("lastModifiedByUserLogin")) mapValue.put("lastModifiedByUserLogin", getInLastModifiedByUserLogin());
        if (inParameters.contains("lastModifiedDate")) mapValue.put("lastModifiedDate", getInLastModifiedDate());
        if (inParameters.contains("leftCoordinate")) mapValue.put("leftCoordinate", getInLeftCoordinate());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("mapKey")) mapValue.put("mapKey", getInMapKey());
        if (inParameters.contains("roleTypeList")) mapValue.put("roleTypeList", getInRoleTypeList());
        if (inParameters.contains("sequenceNum")) mapValue.put("sequenceNum", getInSequenceNum());
        if (inParameters.contains("skipPermissionCheck")) mapValue.put("skipPermissionCheck", getInSkipPermissionCheck());
        if (inParameters.contains("targetOperationList")) mapValue.put("targetOperationList", getInTargetOperationList());
        if (inParameters.contains("thruDate")) mapValue.put("thruDate", getInThruDate());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("upperCoordinate")) mapValue.put("upperCoordinate", getInUpperCoordinate());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
          // allow the User set to override the userLogin
          if (getUser() != null) mapValue.put("userLogin", getUser().getOfbizUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("contentIdFrom")) mapValue.put("contentIdFrom", getOutContentIdFrom());
        if (outParameters.contains("errorMessage")) mapValue.put("errorMessage", getOutErrorMessage());
        if (outParameters.contains("errorMessageList")) mapValue.put("errorMessageList", getOutErrorMessageList());
        if (outParameters.contains("locale")) mapValue.put("locale", getOutLocale());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("roleTypeList")) mapValue.put("roleTypeList", getOutRoleTypeList());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("contentAssocPredicateId")) setInContentAssocPredicateId((String) mapValue.get("contentAssocPredicateId"));
        if (mapValue.containsKey("contentAssocTypeId")) setInContentAssocTypeId((String) mapValue.get("contentAssocTypeId"));
        if (mapValue.containsKey("contentId")) setInContentId((String) mapValue.get("contentId"));
        if (mapValue.containsKey("contentIdFrom")) setInContentIdFrom((String) mapValue.get("contentIdFrom"));
        if (mapValue.containsKey("contentIdTo")) setInContentIdTo((String) mapValue.get("contentIdTo"));
        if (mapValue.containsKey("contentPurposeList")) setInContentPurposeList((List) mapValue.get("contentPurposeList"));
        if (mapValue.containsKey("createdByUserLogin")) setInCreatedByUserLogin((String) mapValue.get("createdByUserLogin"));
        if (mapValue.containsKey("createdDate")) setInCreatedDate((Timestamp) mapValue.get("createdDate"));
        if (mapValue.containsKey("dataSourceId")) setInDataSourceId((String) mapValue.get("dataSourceId"));
        if (mapValue.containsKey("deactivateExisting")) setInDeactivateExisting((String) mapValue.get("deactivateExisting"));
        if (mapValue.containsKey("displayFailCond")) setInDisplayFailCond((Boolean) mapValue.get("displayFailCond"));
        if (mapValue.containsKey("fromDate")) setInFromDate((Timestamp) mapValue.get("fromDate"));
        if (mapValue.containsKey("lastModifiedByUserLogin")) setInLastModifiedByUserLogin((String) mapValue.get("lastModifiedByUserLogin"));
        if (mapValue.containsKey("lastModifiedDate")) setInLastModifiedDate((Timestamp) mapValue.get("lastModifiedDate"));
        if (mapValue.containsKey("leftCoordinate")) setInLeftCoordinate((Long) mapValue.get("leftCoordinate"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("mapKey")) setInMapKey((String) mapValue.get("mapKey"));
        if (mapValue.containsKey("roleTypeList")) setInRoleTypeList((List) mapValue.get("roleTypeList"));
        if (mapValue.containsKey("sequenceNum")) setInSequenceNum((Long) mapValue.get("sequenceNum"));
        if (mapValue.containsKey("skipPermissionCheck")) setInSkipPermissionCheck((String) mapValue.get("skipPermissionCheck"));
        if (mapValue.containsKey("targetOperationList")) setInTargetOperationList((List) mapValue.get("targetOperationList"));
        if (mapValue.containsKey("thruDate")) setInThruDate((Timestamp) mapValue.get("thruDate"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("upperCoordinate")) setInUpperCoordinate((Long) mapValue.get("upperCoordinate"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("contentIdFrom")) setOutContentIdFrom((String) mapValue.get("contentIdFrom"));
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("roleTypeList")) setOutRoleTypeList((List) mapValue.get("roleTypeList"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>UpdateContentAssocService</code> from the input values of the given <code>UpdateContentAssocService</code>.
     * @param input a <code>UpdateContentAssocService</code>
     */
    public static UpdateContentAssocService fromInput(UpdateContentAssocService input) {
        UpdateContentAssocService service = new UpdateContentAssocService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>UpdateContentAssocService</code> from the output values of the given <code>UpdateContentAssocService</code>.
     * @param output a <code>UpdateContentAssocService</code>
     */
    public static UpdateContentAssocService fromOutput(UpdateContentAssocService output) {
        UpdateContentAssocService service = new UpdateContentAssocService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>UpdateContentAssocService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static UpdateContentAssocService fromInput(Map<String, Object> mapValue) {
        UpdateContentAssocService service = new UpdateContentAssocService();
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
     * Construct a <code>UpdateContentAssocService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static UpdateContentAssocService fromOutput(Map<String, Object> mapValue) {
        UpdateContentAssocService service = new UpdateContentAssocService();
        service.putAllOutput(mapValue);
        return service;
    }
}
