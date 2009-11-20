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
 * Get Content and resource information.
 * Auto generated base service entity getSubContentWithPermCheck.
 *
 * Engine: simple
 * Location: component://content/script/org/ofbiz/content/content/ContentServices.xml
 * Invoke: getSubContentWithPermCheck
 * Defined in: file:/home/jeremy/programmation/opentaps-git/applications/content/servicedef/services.xml
 */
public class GetSubContentWithPermCheckService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "getSubContentWithPermCheck";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        contentAssocTypeId("contentAssocTypeId"),
        contentId("contentId"),
        contentOperationId("contentOperationId"),
        filterByDate("filterByDate"),
        locale("locale"),
        mainAction("mainAction"),
        mapKey("mapKey"),
        timeZone("timeZone"),
        useCache("useCache"),
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
        subContentList("subContentList"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    /**
     * Creates a new <code>GetSubContentWithPermCheckService</code> instance.
     */
    public GetSubContentWithPermCheckService() {
        super();
    }

    /**
     * Creates a new <code>GetSubContentWithPermCheckService</code> instance.
     * @param user an <code>User</code> value
     */
    public GetSubContentWithPermCheckService(User user) {
        super(user);
    }

    private String inContentAssocTypeId;
    private String inContentId;
    private String inContentOperationId;
    private Boolean inFilterByDate;
    private Locale inLocale;
    private String inMainAction;
    private String inMapKey;
    private TimeZone inTimeZone;
    private Boolean inUseCache;
    private GenericValue inUserLogin;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private String outResponseMessage;
    private List outSubContentList;
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
    public String getInContentOperationId() {
        return this.inContentOperationId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Boolean</code>
     */
    public Boolean getInFilterByDate() {
        return this.inFilterByDate;
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
    public String getInMainAction() {
        return this.inMainAction;
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
     * @return <code>TimeZone</code>
     */
    public TimeZone getInTimeZone() {
        return this.inTimeZone;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Boolean</code>
     */
    public Boolean getInUseCache() {
        return this.inUseCache;
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
     * @return <code>List</code>
     */
    public List getOutSubContentList() {
        return this.outSubContentList;
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
     * @param inContentOperationId the inContentOperationId to set
    */
    public void setInContentOperationId(String inContentOperationId) {
        this.inParameters.add("contentOperationId");
        this.inContentOperationId = inContentOperationId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFilterByDate the inFilterByDate to set
    */
    public void setInFilterByDate(Boolean inFilterByDate) {
        this.inParameters.add("filterByDate");
        this.inFilterByDate = inFilterByDate;
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
     * @param inMainAction the inMainAction to set
    */
    public void setInMainAction(String inMainAction) {
        this.inParameters.add("mainAction");
        this.inMainAction = inMainAction;
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
     * @param inTimeZone the inTimeZone to set
    */
    public void setInTimeZone(TimeZone inTimeZone) {
        this.inParameters.add("timeZone");
        this.inTimeZone = inTimeZone;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inUseCache the inUseCache to set
    */
    public void setInUseCache(Boolean inUseCache) {
        this.inParameters.add("useCache");
        this.inUseCache = inUseCache;
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
     * @param outSubContentList the outSubContentList to set
    */
    public void setOutSubContentList(List outSubContentList) {
        this.outParameters.add("subContentList");
        this.outSubContentList = outSubContentList;
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
        if (inParameters.contains("contentAssocTypeId")) mapValue.put("contentAssocTypeId", getInContentAssocTypeId());
        if (inParameters.contains("contentId")) mapValue.put("contentId", getInContentId());
        if (inParameters.contains("contentOperationId")) mapValue.put("contentOperationId", getInContentOperationId());
        if (inParameters.contains("filterByDate")) mapValue.put("filterByDate", getInFilterByDate());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("mainAction")) mapValue.put("mainAction", getInMainAction());
        if (inParameters.contains("mapKey")) mapValue.put("mapKey", getInMapKey());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("useCache")) mapValue.put("useCache", getInUseCache());
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
        if (outParameters.contains("subContentList")) mapValue.put("subContentList", getOutSubContentList());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("contentAssocTypeId")) setInContentAssocTypeId((String) mapValue.get("contentAssocTypeId"));
        if (mapValue.containsKey("contentId")) setInContentId((String) mapValue.get("contentId"));
        if (mapValue.containsKey("contentOperationId")) setInContentOperationId((String) mapValue.get("contentOperationId"));
        if (mapValue.containsKey("filterByDate")) setInFilterByDate((Boolean) mapValue.get("filterByDate"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("mainAction")) setInMainAction((String) mapValue.get("mainAction"));
        if (mapValue.containsKey("mapKey")) setInMapKey((String) mapValue.get("mapKey"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("useCache")) setInUseCache((Boolean) mapValue.get("useCache"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("subContentList")) setOutSubContentList((List) mapValue.get("subContentList"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>GetSubContentWithPermCheckService</code> from the input values of the given <code>GetSubContentWithPermCheckService</code>.
     * @param input a <code>GetSubContentWithPermCheckService</code>
     */
    public static GetSubContentWithPermCheckService fromInput(GetSubContentWithPermCheckService input) {
        GetSubContentWithPermCheckService service = new GetSubContentWithPermCheckService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>GetSubContentWithPermCheckService</code> from the output values of the given <code>GetSubContentWithPermCheckService</code>.
     * @param output a <code>GetSubContentWithPermCheckService</code>
     */
    public static GetSubContentWithPermCheckService fromOutput(GetSubContentWithPermCheckService output) {
        GetSubContentWithPermCheckService service = new GetSubContentWithPermCheckService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>GetSubContentWithPermCheckService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static GetSubContentWithPermCheckService fromInput(Map<String, Object> mapValue) {
        GetSubContentWithPermCheckService service = new GetSubContentWithPermCheckService();
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
     * Construct a <code>GetSubContentWithPermCheckService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static GetSubContentWithPermCheckService fromOutput(Map<String, Object> mapValue) {
        GetSubContentWithPermCheckService service = new GetSubContentWithPermCheckService();
        service.putAllOutput(mapValue);
        return service;
    }
}
