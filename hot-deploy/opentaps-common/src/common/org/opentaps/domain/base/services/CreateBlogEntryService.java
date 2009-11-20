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

import java.nio.ByteBuffer;
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
 * Creates content records for a blog entry.
 * Auto generated base service entity createBlogEntry.
 *
 * Engine: simple
 * Location: component://content/script/org/ofbiz/content/blog/BlogServices.xml
 * Invoke: createBlogEntry
 * Defined in: file:/home/jeremy/programmation/opentaps-git/applications/content/servicedef/services.xml
 */
public class CreateBlogEntryService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "createBlogEntry";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        uploadedFileContentType("_uploadedFile_contentType"),
        uploadedFileFileName("_uploadedFile_fileName"),
        articleData("articleData"),
        blogContentId("blogContentId"),
        contentName("contentName"),
        description("description"),
        locale("locale"),
        statusId("statusId"),
        summaryData("summaryData"),
        templateDataResourceId("templateDataResourceId"),
        timeZone("timeZone"),
        uploadedFile("uploadedFile"),
        userLogin("userLogin");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        blogContentId("blogContentId"),
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
     * Creates a new <code>CreateBlogEntryService</code> instance.
     */
    public CreateBlogEntryService() {
        super();
    }

    /**
     * Creates a new <code>CreateBlogEntryService</code> instance.
     * @param user an <code>User</code> value
     */
    public CreateBlogEntryService(User user) {
        super(user);
    }

    private String inUploadedFileContentType;
    private String inUploadedFileFileName;
    private String inArticleData;
    private String inBlogContentId;
    private String inContentName;
    private String inDescription;
    private Locale inLocale;
    private String inStatusId;
    private String inSummaryData;
    private String inTemplateDataResourceId;
    private TimeZone inTimeZone;
    private ByteBuffer inUploadedFile;
    private GenericValue inUserLogin;
    private String outBlogContentId;
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
    public String getInUploadedFileContentType() {
        return this.inUploadedFileContentType;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInUploadedFileFileName() {
        return this.inUploadedFileFileName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInArticleData() {
        return this.inArticleData;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInBlogContentId() {
        return this.inBlogContentId;
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
    public String getInDescription() {
        return this.inDescription;
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
    public String getInStatusId() {
        return this.inStatusId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInSummaryData() {
        return this.inSummaryData;
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
     * This parameter is optional.
     * @return <code>TimeZone</code>
     */
    public TimeZone getInTimeZone() {
        return this.inTimeZone;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>ByteBuffer</code>
     */
    public ByteBuffer getInUploadedFile() {
        return this.inUploadedFile;
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
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getOutBlogContentId() {
        return this.outBlogContentId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
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
     * @param inUploadedFileContentType the inUploadedFileContentType to set
    */
    public void setInUploadedFileContentType(String inUploadedFileContentType) {
        this.inParameters.add("_uploadedFile_contentType");
        this.inUploadedFileContentType = inUploadedFileContentType;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inUploadedFileFileName the inUploadedFileFileName to set
    */
    public void setInUploadedFileFileName(String inUploadedFileFileName) {
        this.inParameters.add("_uploadedFile_fileName");
        this.inUploadedFileFileName = inUploadedFileFileName;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inArticleData the inArticleData to set
    */
    public void setInArticleData(String inArticleData) {
        this.inParameters.add("articleData");
        this.inArticleData = inArticleData;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inBlogContentId the inBlogContentId to set
    */
    public void setInBlogContentId(String inBlogContentId) {
        this.inParameters.add("blogContentId");
        this.inBlogContentId = inBlogContentId;
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
     * @param inDescription the inDescription to set
    */
    public void setInDescription(String inDescription) {
        this.inParameters.add("description");
        this.inDescription = inDescription;
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
     * @param inStatusId the inStatusId to set
    */
    public void setInStatusId(String inStatusId) {
        this.inParameters.add("statusId");
        this.inStatusId = inStatusId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSummaryData the inSummaryData to set
    */
    public void setInSummaryData(String inSummaryData) {
        this.inParameters.add("summaryData");
        this.inSummaryData = inSummaryData;
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
     * @param inUploadedFile the inUploadedFile to set
    */
    public void setInUploadedFile(ByteBuffer inUploadedFile) {
        this.inParameters.add("uploadedFile");
        this.inUploadedFile = inUploadedFile;
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
     * This parameter is required.
     * @param outBlogContentId the outBlogContentId to set
    */
    public void setOutBlogContentId(String outBlogContentId) {
        this.outParameters.add("blogContentId");
        this.outBlogContentId = outBlogContentId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
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
        if (inParameters.contains("_uploadedFile_contentType")) mapValue.put("_uploadedFile_contentType", getInUploadedFileContentType());
        if (inParameters.contains("_uploadedFile_fileName")) mapValue.put("_uploadedFile_fileName", getInUploadedFileFileName());
        if (inParameters.contains("articleData")) mapValue.put("articleData", getInArticleData());
        if (inParameters.contains("blogContentId")) mapValue.put("blogContentId", getInBlogContentId());
        if (inParameters.contains("contentName")) mapValue.put("contentName", getInContentName());
        if (inParameters.contains("description")) mapValue.put("description", getInDescription());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("statusId")) mapValue.put("statusId", getInStatusId());
        if (inParameters.contains("summaryData")) mapValue.put("summaryData", getInSummaryData());
        if (inParameters.contains("templateDataResourceId")) mapValue.put("templateDataResourceId", getInTemplateDataResourceId());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("uploadedFile")) mapValue.put("uploadedFile", getInUploadedFile());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        // allow the User set to override the userLogin
        if (getUser() != null) mapValue.put("userLogin", getUser().getOfbizUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("blogContentId")) mapValue.put("blogContentId", getOutBlogContentId());
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
        if (mapValue.containsKey("_uploadedFile_contentType")) setInUploadedFileContentType((String) mapValue.get("_uploadedFile_contentType"));
        if (mapValue.containsKey("_uploadedFile_fileName")) setInUploadedFileFileName((String) mapValue.get("_uploadedFile_fileName"));
        if (mapValue.containsKey("articleData")) setInArticleData((String) mapValue.get("articleData"));
        if (mapValue.containsKey("blogContentId")) setInBlogContentId((String) mapValue.get("blogContentId"));
        if (mapValue.containsKey("contentName")) setInContentName((String) mapValue.get("contentName"));
        if (mapValue.containsKey("description")) setInDescription((String) mapValue.get("description"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("statusId")) setInStatusId((String) mapValue.get("statusId"));
        if (mapValue.containsKey("summaryData")) setInSummaryData((String) mapValue.get("summaryData"));
        if (mapValue.containsKey("templateDataResourceId")) setInTemplateDataResourceId((String) mapValue.get("templateDataResourceId"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("uploadedFile")) setInUploadedFile((ByteBuffer) mapValue.get("uploadedFile"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("blogContentId")) setOutBlogContentId((String) mapValue.get("blogContentId"));
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
     * Construct a <code>CreateBlogEntryService</code> from the input values of the given <code>CreateBlogEntryService</code>.
     * @param input a <code>CreateBlogEntryService</code>
     */
    public static CreateBlogEntryService fromInput(CreateBlogEntryService input) {
        CreateBlogEntryService service = new CreateBlogEntryService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>CreateBlogEntryService</code> from the output values of the given <code>CreateBlogEntryService</code>.
     * @param output a <code>CreateBlogEntryService</code>
     */
    public static CreateBlogEntryService fromOutput(CreateBlogEntryService output) {
        CreateBlogEntryService service = new CreateBlogEntryService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CreateBlogEntryService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CreateBlogEntryService fromInput(Map<String, Object> mapValue) {
        CreateBlogEntryService service = new CreateBlogEntryService();
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
     * Construct a <code>CreateBlogEntryService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CreateBlogEntryService fromOutput(Map<String, Object> mapValue) {
        CreateBlogEntryService service = new CreateBlogEntryService();
        service.putAllOutput(mapValue);
        return service;
    }
}
