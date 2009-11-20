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
 * .
 * Auto generated base service entity createSimpleTextContent.
 *
 * Engine: simple
 * Location: component://content/script/org/ofbiz/content/content/ContentServices.xml
 * Invoke: createSimpleTextContent
 * Defined in: file:/home/jeremy/programmation/opentaps-git/applications/content/servicedef/services.xml
 */
public class CreateSimpleTextContentService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "createSimpleTextContent";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.FALSE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        characterSetId("characterSetId"),
        childBranchCount("childBranchCount"),
        childLeafCount("childLeafCount"),
        classificationEnumId("classificationEnumId"),
        contentId("contentId"),
        contentName("contentName"),
        contentTypeId("contentTypeId"),
        createdByUserLogin("createdByUserLogin"),
        createdDate("createdDate"),
        dataResourceId("dataResourceId"),
        dataSourceId("dataSourceId"),
        decoratorContentId("decoratorContentId"),
        description("description"),
        instanceOfContentId("instanceOfContentId"),
        lastModifiedByUserLogin("lastModifiedByUserLogin"),
        lastModifiedDate("lastModifiedDate"),
        locale("locale"),
        localeString("localeString"),
        mimeTypeId("mimeTypeId"),
        ownerContentId("ownerContentId"),
        privilegeEnumId("privilegeEnumId"),
        serviceName("serviceName"),
        statusId("statusId"),
        templateDataResourceId("templateDataResourceId"),
        text("text"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        contentId("contentId"),
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
     * Creates a new <code>CreateSimpleTextContentService</code> instance.
     */
    public CreateSimpleTextContentService() {
        super();
    }


    private String inCharacterSetId;
    private Long inChildBranchCount;
    private Long inChildLeafCount;
    private String inClassificationEnumId;
    private String inContentId;
    private String inContentName;
    private String inContentTypeId;
    private String inCreatedByUserLogin;
    private Timestamp inCreatedDate;
    private String inDataResourceId;
    private String inDataSourceId;
    private String inDecoratorContentId;
    private String inDescription;
    private String inInstanceOfContentId;
    private String inLastModifiedByUserLogin;
    private Timestamp inLastModifiedDate;
    private Locale inLocale;
    private String inLocaleString;
    private String inMimeTypeId;
    private String inOwnerContentId;
    private String inPrivilegeEnumId;
    private String inServiceName;
    private String inStatusId;
    private String inTemplateDataResourceId;
    private String inText;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String outContentId;
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
    public String getInCharacterSetId() {
        return this.inCharacterSetId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInChildBranchCount() {
        return this.inChildBranchCount;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInChildLeafCount() {
        return this.inChildLeafCount;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInClassificationEnumId() {
        return this.inClassificationEnumId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
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
    public String getInContentName() {
        return this.inContentName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInContentTypeId() {
        return this.inContentTypeId;
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
    public String getInDataResourceId() {
        return this.inDataResourceId;
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
    public String getInDecoratorContentId() {
        return this.inDecoratorContentId;
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
     * @return <code>String</code>
     */
    public String getInInstanceOfContentId() {
        return this.inInstanceOfContentId;
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
    public String getInLocaleString() {
        return this.inLocaleString;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInMimeTypeId() {
        return this.inMimeTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInOwnerContentId() {
        return this.inOwnerContentId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPrivilegeEnumId() {
        return this.inPrivilegeEnumId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInServiceName() {
        return this.inServiceName;
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
    public String getInTemplateDataResourceId() {
        return this.inTemplateDataResourceId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInText() {
        return this.inText;
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
    public String getOutContentId() {
        return this.outContentId;
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
     * @param inCharacterSetId the inCharacterSetId to set
    */
    public void setInCharacterSetId(String inCharacterSetId) {
        this.inParameters.add("characterSetId");
        this.inCharacterSetId = inCharacterSetId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inChildBranchCount the inChildBranchCount to set
    */
    public void setInChildBranchCount(Long inChildBranchCount) {
        this.inParameters.add("childBranchCount");
        this.inChildBranchCount = inChildBranchCount;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inChildLeafCount the inChildLeafCount to set
    */
    public void setInChildLeafCount(Long inChildLeafCount) {
        this.inParameters.add("childLeafCount");
        this.inChildLeafCount = inChildLeafCount;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inClassificationEnumId the inClassificationEnumId to set
    */
    public void setInClassificationEnumId(String inClassificationEnumId) {
        this.inParameters.add("classificationEnumId");
        this.inClassificationEnumId = inClassificationEnumId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inContentId the inContentId to set
    */
    public void setInContentId(String inContentId) {
        this.inParameters.add("contentId");
        this.inContentId = inContentId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inContentName the inContentName to set
    */
    public void setInContentName(String inContentName) {
        this.inParameters.add("contentName");
        this.inContentName = inContentName;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inContentTypeId the inContentTypeId to set
    */
    public void setInContentTypeId(String inContentTypeId) {
        this.inParameters.add("contentTypeId");
        this.inContentTypeId = inContentTypeId;
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
     * @param inDataResourceId the inDataResourceId to set
    */
    public void setInDataResourceId(String inDataResourceId) {
        this.inParameters.add("dataResourceId");
        this.inDataResourceId = inDataResourceId;
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
     * @param inDecoratorContentId the inDecoratorContentId to set
    */
    public void setInDecoratorContentId(String inDecoratorContentId) {
        this.inParameters.add("decoratorContentId");
        this.inDecoratorContentId = inDecoratorContentId;
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
     * @param inInstanceOfContentId the inInstanceOfContentId to set
    */
    public void setInInstanceOfContentId(String inInstanceOfContentId) {
        this.inParameters.add("instanceOfContentId");
        this.inInstanceOfContentId = inInstanceOfContentId;
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
     * @param inLocale the inLocale to set
    */
    public void setInLocale(Locale inLocale) {
        this.inParameters.add("locale");
        this.inLocale = inLocale;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLocaleString the inLocaleString to set
    */
    public void setInLocaleString(String inLocaleString) {
        this.inParameters.add("localeString");
        this.inLocaleString = inLocaleString;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inMimeTypeId the inMimeTypeId to set
    */
    public void setInMimeTypeId(String inMimeTypeId) {
        this.inParameters.add("mimeTypeId");
        this.inMimeTypeId = inMimeTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inOwnerContentId the inOwnerContentId to set
    */
    public void setInOwnerContentId(String inOwnerContentId) {
        this.inParameters.add("ownerContentId");
        this.inOwnerContentId = inOwnerContentId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPrivilegeEnumId the inPrivilegeEnumId to set
    */
    public void setInPrivilegeEnumId(String inPrivilegeEnumId) {
        this.inParameters.add("privilegeEnumId");
        this.inPrivilegeEnumId = inPrivilegeEnumId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inServiceName the inServiceName to set
    */
    public void setInServiceName(String inServiceName) {
        this.inParameters.add("serviceName");
        this.inServiceName = inServiceName;
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
     * @param inTemplateDataResourceId the inTemplateDataResourceId to set
    */
    public void setInTemplateDataResourceId(String inTemplateDataResourceId) {
        this.inParameters.add("templateDataResourceId");
        this.inTemplateDataResourceId = inTemplateDataResourceId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inText the inText to set
    */
    public void setInText(String inText) {
        this.inParameters.add("text");
        this.inText = inText;
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
     * @param outContentId the outContentId to set
    */
    public void setOutContentId(String outContentId) {
        this.outParameters.add("contentId");
        this.outContentId = outContentId;
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
        if (inParameters.contains("characterSetId")) mapValue.put("characterSetId", getInCharacterSetId());
        if (inParameters.contains("childBranchCount")) mapValue.put("childBranchCount", getInChildBranchCount());
        if (inParameters.contains("childLeafCount")) mapValue.put("childLeafCount", getInChildLeafCount());
        if (inParameters.contains("classificationEnumId")) mapValue.put("classificationEnumId", getInClassificationEnumId());
        if (inParameters.contains("contentId")) mapValue.put("contentId", getInContentId());
        if (inParameters.contains("contentName")) mapValue.put("contentName", getInContentName());
        if (inParameters.contains("contentTypeId")) mapValue.put("contentTypeId", getInContentTypeId());
        if (inParameters.contains("createdByUserLogin")) mapValue.put("createdByUserLogin", getInCreatedByUserLogin());
        if (inParameters.contains("createdDate")) mapValue.put("createdDate", getInCreatedDate());
        if (inParameters.contains("dataResourceId")) mapValue.put("dataResourceId", getInDataResourceId());
        if (inParameters.contains("dataSourceId")) mapValue.put("dataSourceId", getInDataSourceId());
        if (inParameters.contains("decoratorContentId")) mapValue.put("decoratorContentId", getInDecoratorContentId());
        if (inParameters.contains("description")) mapValue.put("description", getInDescription());
        if (inParameters.contains("instanceOfContentId")) mapValue.put("instanceOfContentId", getInInstanceOfContentId());
        if (inParameters.contains("lastModifiedByUserLogin")) mapValue.put("lastModifiedByUserLogin", getInLastModifiedByUserLogin());
        if (inParameters.contains("lastModifiedDate")) mapValue.put("lastModifiedDate", getInLastModifiedDate());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("localeString")) mapValue.put("localeString", getInLocaleString());
        if (inParameters.contains("mimeTypeId")) mapValue.put("mimeTypeId", getInMimeTypeId());
        if (inParameters.contains("ownerContentId")) mapValue.put("ownerContentId", getInOwnerContentId());
        if (inParameters.contains("privilegeEnumId")) mapValue.put("privilegeEnumId", getInPrivilegeEnumId());
        if (inParameters.contains("serviceName")) mapValue.put("serviceName", getInServiceName());
        if (inParameters.contains("statusId")) mapValue.put("statusId", getInStatusId());
        if (inParameters.contains("templateDataResourceId")) mapValue.put("templateDataResourceId", getInTemplateDataResourceId());
        if (inParameters.contains("text")) mapValue.put("text", getInText());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        // allow the User set to override the userLogin
        if (getUser() != null) mapValue.put("userLogin", getUser().getOfbizUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("contentId")) mapValue.put("contentId", getOutContentId());
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
        if (mapValue.containsKey("characterSetId")) setInCharacterSetId((String) mapValue.get("characterSetId"));
        if (mapValue.containsKey("childBranchCount")) setInChildBranchCount((Long) mapValue.get("childBranchCount"));
        if (mapValue.containsKey("childLeafCount")) setInChildLeafCount((Long) mapValue.get("childLeafCount"));
        if (mapValue.containsKey("classificationEnumId")) setInClassificationEnumId((String) mapValue.get("classificationEnumId"));
        if (mapValue.containsKey("contentId")) setInContentId((String) mapValue.get("contentId"));
        if (mapValue.containsKey("contentName")) setInContentName((String) mapValue.get("contentName"));
        if (mapValue.containsKey("contentTypeId")) setInContentTypeId((String) mapValue.get("contentTypeId"));
        if (mapValue.containsKey("createdByUserLogin")) setInCreatedByUserLogin((String) mapValue.get("createdByUserLogin"));
        if (mapValue.containsKey("createdDate")) setInCreatedDate((Timestamp) mapValue.get("createdDate"));
        if (mapValue.containsKey("dataResourceId")) setInDataResourceId((String) mapValue.get("dataResourceId"));
        if (mapValue.containsKey("dataSourceId")) setInDataSourceId((String) mapValue.get("dataSourceId"));
        if (mapValue.containsKey("decoratorContentId")) setInDecoratorContentId((String) mapValue.get("decoratorContentId"));
        if (mapValue.containsKey("description")) setInDescription((String) mapValue.get("description"));
        if (mapValue.containsKey("instanceOfContentId")) setInInstanceOfContentId((String) mapValue.get("instanceOfContentId"));
        if (mapValue.containsKey("lastModifiedByUserLogin")) setInLastModifiedByUserLogin((String) mapValue.get("lastModifiedByUserLogin"));
        if (mapValue.containsKey("lastModifiedDate")) setInLastModifiedDate((Timestamp) mapValue.get("lastModifiedDate"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("localeString")) setInLocaleString((String) mapValue.get("localeString"));
        if (mapValue.containsKey("mimeTypeId")) setInMimeTypeId((String) mapValue.get("mimeTypeId"));
        if (mapValue.containsKey("ownerContentId")) setInOwnerContentId((String) mapValue.get("ownerContentId"));
        if (mapValue.containsKey("privilegeEnumId")) setInPrivilegeEnumId((String) mapValue.get("privilegeEnumId"));
        if (mapValue.containsKey("serviceName")) setInServiceName((String) mapValue.get("serviceName"));
        if (mapValue.containsKey("statusId")) setInStatusId((String) mapValue.get("statusId"));
        if (mapValue.containsKey("templateDataResourceId")) setInTemplateDataResourceId((String) mapValue.get("templateDataResourceId"));
        if (mapValue.containsKey("text")) setInText((String) mapValue.get("text"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("contentId")) setOutContentId((String) mapValue.get("contentId"));
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
     * Construct a <code>CreateSimpleTextContentService</code> from the input values of the given <code>CreateSimpleTextContentService</code>.
     * @param input a <code>CreateSimpleTextContentService</code>
     */
    public static CreateSimpleTextContentService fromInput(CreateSimpleTextContentService input) {
        CreateSimpleTextContentService service = new CreateSimpleTextContentService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>CreateSimpleTextContentService</code> from the output values of the given <code>CreateSimpleTextContentService</code>.
     * @param output a <code>CreateSimpleTextContentService</code>
     */
    public static CreateSimpleTextContentService fromOutput(CreateSimpleTextContentService output) {
        CreateSimpleTextContentService service = new CreateSimpleTextContentService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CreateSimpleTextContentService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CreateSimpleTextContentService fromInput(Map<String, Object> mapValue) {
        CreateSimpleTextContentService service = new CreateSimpleTextContentService();
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
     * Construct a <code>CreateSimpleTextContentService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CreateSimpleTextContentService fromOutput(Map<String, Object> mapValue) {
        CreateSimpleTextContentService service = new CreateSimpleTextContentService();
        service.putAllOutput(mapValue);
        return service;
    }
}
