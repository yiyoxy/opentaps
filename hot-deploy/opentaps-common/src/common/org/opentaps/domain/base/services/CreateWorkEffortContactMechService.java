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
 * Create WorkEffortContactMech; if contactMechId is not provided, a new contact mech is created (if partyId is set then the new contact mech is also associated to the party).
 * Auto generated base service entity createWorkEffortContactMech.
 *
 * Engine: simple
 * Location: component://workeffort/script/org/ofbiz/workeffort/workeffort/WorkEffortSimpleServices.xml
 * Invoke: createWorkEffortContactMech
 * Defined in: file:/home/jeremy/programmation/opentaps-git/applications/workeffort/servicedef/services.xml
 */
public class CreateWorkEffortContactMechService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "createWorkEffortContactMech";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        allowSolicitation("allowSolicitation"),
        comments("comments"),
        contactMechId("contactMechId"),
        contactMechPurposeTypeId("contactMechPurposeTypeId"),
        contactMechTypeId("contactMechTypeId"),
        extension("extension"),
        fromDate("fromDate"),
        infoString("infoString"),
        locale("locale"),
        monthsWithContactMech("monthsWithContactMech"),
        partyId("partyId"),
        roleTypeId("roleTypeId"),
        thruDate("thruDate"),
        timeZone("timeZone"),
        userLogin("userLogin"),
        verified("verified"),
        workEffortId("workEffortId"),
        yearsWithContactMech("yearsWithContactMech");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        contactMechId("contactMechId"),
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
     * Creates a new <code>CreateWorkEffortContactMechService</code> instance.
     */
    public CreateWorkEffortContactMechService() {
        super();
    }

    /**
     * Creates a new <code>CreateWorkEffortContactMechService</code> instance.
     * @param user an <code>User</code> value
     */
    public CreateWorkEffortContactMechService(User user) {
        super(user);
    }

    private String inAllowSolicitation;
    private String inComments;
    private String inContactMechId;
    private String inContactMechPurposeTypeId;
    private String inContactMechTypeId;
    private String inExtension;
    private Timestamp inFromDate;
    private String inInfoString;
    private Locale inLocale;
    private Long inMonthsWithContactMech;
    private String inPartyId;
    private String inRoleTypeId;
    private Timestamp inThruDate;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String inVerified;
    private String inWorkEffortId;
    private Long inYearsWithContactMech;
    private String outContactMechId;
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
    public String getInAllowSolicitation() {
        return this.inAllowSolicitation;
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
    public String getInContactMechId() {
        return this.inContactMechId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInContactMechPurposeTypeId() {
        return this.inContactMechPurposeTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInContactMechTypeId() {
        return this.inContactMechTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInExtension() {
        return this.inExtension;
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
     * @return <code>String</code>
     */
    public String getInInfoString() {
        return this.inInfoString;
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
    public Long getInMonthsWithContactMech() {
        return this.inMonthsWithContactMech;
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
    public String getInRoleTypeId() {
        return this.inRoleTypeId;
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
    public String getInVerified() {
        return this.inVerified;
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
     * @return <code>Long</code>
     */
    public Long getInYearsWithContactMech() {
        return this.inYearsWithContactMech;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutContactMechId() {
        return this.outContactMechId;
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
     * @param inAllowSolicitation the inAllowSolicitation to set
    */
    public void setInAllowSolicitation(String inAllowSolicitation) {
        this.inParameters.add("allowSolicitation");
        this.inAllowSolicitation = inAllowSolicitation;
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
     * @param inContactMechId the inContactMechId to set
    */
    public void setInContactMechId(String inContactMechId) {
        this.inParameters.add("contactMechId");
        this.inContactMechId = inContactMechId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inContactMechPurposeTypeId the inContactMechPurposeTypeId to set
    */
    public void setInContactMechPurposeTypeId(String inContactMechPurposeTypeId) {
        this.inParameters.add("contactMechPurposeTypeId");
        this.inContactMechPurposeTypeId = inContactMechPurposeTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inContactMechTypeId the inContactMechTypeId to set
    */
    public void setInContactMechTypeId(String inContactMechTypeId) {
        this.inParameters.add("contactMechTypeId");
        this.inContactMechTypeId = inContactMechTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inExtension the inExtension to set
    */
    public void setInExtension(String inExtension) {
        this.inParameters.add("extension");
        this.inExtension = inExtension;
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
     * @param inInfoString the inInfoString to set
    */
    public void setInInfoString(String inInfoString) {
        this.inParameters.add("infoString");
        this.inInfoString = inInfoString;
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
     * @param inMonthsWithContactMech the inMonthsWithContactMech to set
    */
    public void setInMonthsWithContactMech(Long inMonthsWithContactMech) {
        this.inParameters.add("monthsWithContactMech");
        this.inMonthsWithContactMech = inMonthsWithContactMech;
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
     * @param inRoleTypeId the inRoleTypeId to set
    */
    public void setInRoleTypeId(String inRoleTypeId) {
        this.inParameters.add("roleTypeId");
        this.inRoleTypeId = inRoleTypeId;
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
     * @param inVerified the inVerified to set
    */
    public void setInVerified(String inVerified) {
        this.inParameters.add("verified");
        this.inVerified = inVerified;
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
     * @param inYearsWithContactMech the inYearsWithContactMech to set
    */
    public void setInYearsWithContactMech(Long inYearsWithContactMech) {
        this.inParameters.add("yearsWithContactMech");
        this.inYearsWithContactMech = inYearsWithContactMech;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outContactMechId the outContactMechId to set
    */
    public void setOutContactMechId(String outContactMechId) {
        this.outParameters.add("contactMechId");
        this.outContactMechId = outContactMechId;
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
        if (inParameters.contains("allowSolicitation")) mapValue.put("allowSolicitation", getInAllowSolicitation());
        if (inParameters.contains("comments")) mapValue.put("comments", getInComments());
        if (inParameters.contains("contactMechId")) mapValue.put("contactMechId", getInContactMechId());
        if (inParameters.contains("contactMechPurposeTypeId")) mapValue.put("contactMechPurposeTypeId", getInContactMechPurposeTypeId());
        if (inParameters.contains("contactMechTypeId")) mapValue.put("contactMechTypeId", getInContactMechTypeId());
        if (inParameters.contains("extension")) mapValue.put("extension", getInExtension());
        if (inParameters.contains("fromDate")) mapValue.put("fromDate", getInFromDate());
        if (inParameters.contains("infoString")) mapValue.put("infoString", getInInfoString());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("monthsWithContactMech")) mapValue.put("monthsWithContactMech", getInMonthsWithContactMech());
        if (inParameters.contains("partyId")) mapValue.put("partyId", getInPartyId());
        if (inParameters.contains("roleTypeId")) mapValue.put("roleTypeId", getInRoleTypeId());
        if (inParameters.contains("thruDate")) mapValue.put("thruDate", getInThruDate());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        if (inParameters.contains("verified")) mapValue.put("verified", getInVerified());
        if (inParameters.contains("workEffortId")) mapValue.put("workEffortId", getInWorkEffortId());
        if (inParameters.contains("yearsWithContactMech")) mapValue.put("yearsWithContactMech", getInYearsWithContactMech());
        // allow the User set to override the userLogin
        if (getUser() != null) mapValue.put("userLogin", getUser().getOfbizUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("contactMechId")) mapValue.put("contactMechId", getOutContactMechId());
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
        if (mapValue.containsKey("allowSolicitation")) setInAllowSolicitation((String) mapValue.get("allowSolicitation"));
        if (mapValue.containsKey("comments")) setInComments((String) mapValue.get("comments"));
        if (mapValue.containsKey("contactMechId")) setInContactMechId((String) mapValue.get("contactMechId"));
        if (mapValue.containsKey("contactMechPurposeTypeId")) setInContactMechPurposeTypeId((String) mapValue.get("contactMechPurposeTypeId"));
        if (mapValue.containsKey("contactMechTypeId")) setInContactMechTypeId((String) mapValue.get("contactMechTypeId"));
        if (mapValue.containsKey("extension")) setInExtension((String) mapValue.get("extension"));
        if (mapValue.containsKey("fromDate")) setInFromDate((Timestamp) mapValue.get("fromDate"));
        if (mapValue.containsKey("infoString")) setInInfoString((String) mapValue.get("infoString"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("monthsWithContactMech")) setInMonthsWithContactMech((Long) mapValue.get("monthsWithContactMech"));
        if (mapValue.containsKey("partyId")) setInPartyId((String) mapValue.get("partyId"));
        if (mapValue.containsKey("roleTypeId")) setInRoleTypeId((String) mapValue.get("roleTypeId"));
        if (mapValue.containsKey("thruDate")) setInThruDate((Timestamp) mapValue.get("thruDate"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
        if (mapValue.containsKey("verified")) setInVerified((String) mapValue.get("verified"));
        if (mapValue.containsKey("workEffortId")) setInWorkEffortId((String) mapValue.get("workEffortId"));
        if (mapValue.containsKey("yearsWithContactMech")) setInYearsWithContactMech((Long) mapValue.get("yearsWithContactMech"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("contactMechId")) setOutContactMechId((String) mapValue.get("contactMechId"));
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
     * Construct a <code>CreateWorkEffortContactMechService</code> from the input values of the given <code>CreateWorkEffortContactMechService</code>.
     * @param input a <code>CreateWorkEffortContactMechService</code>
     */
    public static CreateWorkEffortContactMechService fromInput(CreateWorkEffortContactMechService input) {
        CreateWorkEffortContactMechService service = new CreateWorkEffortContactMechService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>CreateWorkEffortContactMechService</code> from the output values of the given <code>CreateWorkEffortContactMechService</code>.
     * @param output a <code>CreateWorkEffortContactMechService</code>
     */
    public static CreateWorkEffortContactMechService fromOutput(CreateWorkEffortContactMechService output) {
        CreateWorkEffortContactMechService service = new CreateWorkEffortContactMechService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CreateWorkEffortContactMechService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CreateWorkEffortContactMechService fromInput(Map<String, Object> mapValue) {
        CreateWorkEffortContactMechService service = new CreateWorkEffortContactMechService();
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
     * Construct a <code>CreateWorkEffortContactMechService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CreateWorkEffortContactMechService fromOutput(Map<String, Object> mapValue) {
        CreateWorkEffortContactMechService service = new CreateWorkEffortContactMechService();
        service.putAllOutput(mapValue);
        return service;
    }
}
