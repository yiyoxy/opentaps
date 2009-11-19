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
 * Duplicate a Work Effort using a new workEffortId.
 * Auto generated base service entity duplicateWorkEffort.
 *
 * Engine: simple
 * Location: component://workeffort/script/org/ofbiz/workeffort/workeffort/WorkEffortSimpleServices.xml
 * Invoke: duplicateWorkEffort
 * Defined in: file:/home/jeremy/programmation/opentaps-git/applications/workeffort/servicedef/services.xml
 */
public class DuplicateWorkEffortService extends ServiceWrapperWithAuth {

    /** The service name as used by the service engine. */
    public static final String NAME = "duplicateWorkEffort";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        duplicateWorkEffortAssignmentRates("duplicateWorkEffortAssignmentRates"),
        duplicateWorkEffortAssocs("duplicateWorkEffortAssocs"),
        duplicateWorkEffortContents("duplicateWorkEffortContents"),
        duplicateWorkEffortNotes("duplicateWorkEffortNotes"),
        locale("locale"),
        oldWorkEffortId("oldWorkEffortId"),
        removeWorkEffortAssignmentRates("removeWorkEffortAssignmentRates"),
        removeWorkEffortAssocs("removeWorkEffortAssocs"),
        removeWorkEffortContents("removeWorkEffortContents"),
        removeWorkEffortNotes("removeWorkEffortNotes"),
        timeZone("timeZone"),
        userLogin("userLogin"),
        workEffortId("workEffortId");
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
     * Creates a new <code>DuplicateWorkEffortService</code> instance.
     */
    public DuplicateWorkEffortService() {
        super();
    }

    /**
     * Creates a new <code>DuplicateWorkEffortService</code> instance.
     * @param user an <code>User</code> value
     */
    public DuplicateWorkEffortService(User user) {
        super(user);
    }

    private String inDuplicateWorkEffortAssignmentRates;
    private String inDuplicateWorkEffortAssocs;
    private String inDuplicateWorkEffortContents;
    private String inDuplicateWorkEffortNotes;
    private Locale inLocale;
    private String inOldWorkEffortId;
    private String inRemoveWorkEffortAssignmentRates;
    private String inRemoveWorkEffortAssocs;
    private String inRemoveWorkEffortContents;
    private String inRemoveWorkEffortNotes;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String inWorkEffortId;
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
    public String getInDuplicateWorkEffortAssignmentRates() {
        return this.inDuplicateWorkEffortAssignmentRates;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDuplicateWorkEffortAssocs() {
        return this.inDuplicateWorkEffortAssocs;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDuplicateWorkEffortContents() {
        return this.inDuplicateWorkEffortContents;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDuplicateWorkEffortNotes() {
        return this.inDuplicateWorkEffortNotes;
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
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInOldWorkEffortId() {
        return this.inOldWorkEffortId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRemoveWorkEffortAssignmentRates() {
        return this.inRemoveWorkEffortAssignmentRates;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRemoveWorkEffortAssocs() {
        return this.inRemoveWorkEffortAssocs;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRemoveWorkEffortContents() {
        return this.inRemoveWorkEffortContents;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRemoveWorkEffortNotes() {
        return this.inRemoveWorkEffortNotes;
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
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInWorkEffortId() {
        return this.inWorkEffortId;
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
     * @param inDuplicateWorkEffortAssignmentRates the inDuplicateWorkEffortAssignmentRates to set
    */
    public void setInDuplicateWorkEffortAssignmentRates(String inDuplicateWorkEffortAssignmentRates) {
        this.inParameters.add("duplicateWorkEffortAssignmentRates");
        this.inDuplicateWorkEffortAssignmentRates = inDuplicateWorkEffortAssignmentRates;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDuplicateWorkEffortAssocs the inDuplicateWorkEffortAssocs to set
    */
    public void setInDuplicateWorkEffortAssocs(String inDuplicateWorkEffortAssocs) {
        this.inParameters.add("duplicateWorkEffortAssocs");
        this.inDuplicateWorkEffortAssocs = inDuplicateWorkEffortAssocs;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDuplicateWorkEffortContents the inDuplicateWorkEffortContents to set
    */
    public void setInDuplicateWorkEffortContents(String inDuplicateWorkEffortContents) {
        this.inParameters.add("duplicateWorkEffortContents");
        this.inDuplicateWorkEffortContents = inDuplicateWorkEffortContents;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDuplicateWorkEffortNotes the inDuplicateWorkEffortNotes to set
    */
    public void setInDuplicateWorkEffortNotes(String inDuplicateWorkEffortNotes) {
        this.inParameters.add("duplicateWorkEffortNotes");
        this.inDuplicateWorkEffortNotes = inDuplicateWorkEffortNotes;
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
     * This parameter is required.
     * @param inOldWorkEffortId the inOldWorkEffortId to set
    */
    public void setInOldWorkEffortId(String inOldWorkEffortId) {
        this.inParameters.add("oldWorkEffortId");
        this.inOldWorkEffortId = inOldWorkEffortId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRemoveWorkEffortAssignmentRates the inRemoveWorkEffortAssignmentRates to set
    */
    public void setInRemoveWorkEffortAssignmentRates(String inRemoveWorkEffortAssignmentRates) {
        this.inParameters.add("removeWorkEffortAssignmentRates");
        this.inRemoveWorkEffortAssignmentRates = inRemoveWorkEffortAssignmentRates;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRemoveWorkEffortAssocs the inRemoveWorkEffortAssocs to set
    */
    public void setInRemoveWorkEffortAssocs(String inRemoveWorkEffortAssocs) {
        this.inParameters.add("removeWorkEffortAssocs");
        this.inRemoveWorkEffortAssocs = inRemoveWorkEffortAssocs;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRemoveWorkEffortContents the inRemoveWorkEffortContents to set
    */
    public void setInRemoveWorkEffortContents(String inRemoveWorkEffortContents) {
        this.inParameters.add("removeWorkEffortContents");
        this.inRemoveWorkEffortContents = inRemoveWorkEffortContents;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRemoveWorkEffortNotes the inRemoveWorkEffortNotes to set
    */
    public void setInRemoveWorkEffortNotes(String inRemoveWorkEffortNotes) {
        this.inParameters.add("removeWorkEffortNotes");
        this.inRemoveWorkEffortNotes = inRemoveWorkEffortNotes;
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
     * This parameter is required.
     * @param inWorkEffortId the inWorkEffortId to set
    */
    public void setInWorkEffortId(String inWorkEffortId) {
        this.inParameters.add("workEffortId");
        this.inWorkEffortId = inWorkEffortId;
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
        if (inParameters.contains("duplicateWorkEffortAssignmentRates")) mapValue.put("duplicateWorkEffortAssignmentRates", getInDuplicateWorkEffortAssignmentRates());
        if (inParameters.contains("duplicateWorkEffortAssocs")) mapValue.put("duplicateWorkEffortAssocs", getInDuplicateWorkEffortAssocs());
        if (inParameters.contains("duplicateWorkEffortContents")) mapValue.put("duplicateWorkEffortContents", getInDuplicateWorkEffortContents());
        if (inParameters.contains("duplicateWorkEffortNotes")) mapValue.put("duplicateWorkEffortNotes", getInDuplicateWorkEffortNotes());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("oldWorkEffortId")) mapValue.put("oldWorkEffortId", getInOldWorkEffortId());
        if (inParameters.contains("removeWorkEffortAssignmentRates")) mapValue.put("removeWorkEffortAssignmentRates", getInRemoveWorkEffortAssignmentRates());
        if (inParameters.contains("removeWorkEffortAssocs")) mapValue.put("removeWorkEffortAssocs", getInRemoveWorkEffortAssocs());
        if (inParameters.contains("removeWorkEffortContents")) mapValue.put("removeWorkEffortContents", getInRemoveWorkEffortContents());
        if (inParameters.contains("removeWorkEffortNotes")) mapValue.put("removeWorkEffortNotes", getInRemoveWorkEffortNotes());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        if (inParameters.contains("workEffortId")) mapValue.put("workEffortId", getInWorkEffortId());
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
        if (mapValue.containsKey("duplicateWorkEffortAssignmentRates")) setInDuplicateWorkEffortAssignmentRates((String) mapValue.get("duplicateWorkEffortAssignmentRates"));
        if (mapValue.containsKey("duplicateWorkEffortAssocs")) setInDuplicateWorkEffortAssocs((String) mapValue.get("duplicateWorkEffortAssocs"));
        if (mapValue.containsKey("duplicateWorkEffortContents")) setInDuplicateWorkEffortContents((String) mapValue.get("duplicateWorkEffortContents"));
        if (mapValue.containsKey("duplicateWorkEffortNotes")) setInDuplicateWorkEffortNotes((String) mapValue.get("duplicateWorkEffortNotes"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("oldWorkEffortId")) setInOldWorkEffortId((String) mapValue.get("oldWorkEffortId"));
        if (mapValue.containsKey("removeWorkEffortAssignmentRates")) setInRemoveWorkEffortAssignmentRates((String) mapValue.get("removeWorkEffortAssignmentRates"));
        if (mapValue.containsKey("removeWorkEffortAssocs")) setInRemoveWorkEffortAssocs((String) mapValue.get("removeWorkEffortAssocs"));
        if (mapValue.containsKey("removeWorkEffortContents")) setInRemoveWorkEffortContents((String) mapValue.get("removeWorkEffortContents"));
        if (mapValue.containsKey("removeWorkEffortNotes")) setInRemoveWorkEffortNotes((String) mapValue.get("removeWorkEffortNotes"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
        if (mapValue.containsKey("workEffortId")) setInWorkEffortId((String) mapValue.get("workEffortId"));
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
     * Construct a <code>DuplicateWorkEffortService</code> from the input values of the given <code>DuplicateWorkEffortService</code>.
     * @param input a <code>DuplicateWorkEffortService</code>
     */
    public static DuplicateWorkEffortService fromInput(DuplicateWorkEffortService input) {
        DuplicateWorkEffortService service = new DuplicateWorkEffortService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>DuplicateWorkEffortService</code> from the output values of the given <code>DuplicateWorkEffortService</code>.
     * @param output a <code>DuplicateWorkEffortService</code>
     */
    public static DuplicateWorkEffortService fromOutput(DuplicateWorkEffortService output) {
        DuplicateWorkEffortService service = new DuplicateWorkEffortService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>DuplicateWorkEffortService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static DuplicateWorkEffortService fromInput(Map<String, Object> mapValue) {
        DuplicateWorkEffortService service = new DuplicateWorkEffortService();
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
     * Construct a <code>DuplicateWorkEffortService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static DuplicateWorkEffortService fromOutput(Map<String, Object> mapValue) {
        DuplicateWorkEffortService service = new DuplicateWorkEffortService();
        service.putAllOutput(mapValue);
        return service;
    }
}
