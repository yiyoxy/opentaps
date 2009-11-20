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
import java.sql.Time;
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
 * Create a Calendar Week.
 * Auto generated base service entity createCalendarWeek.
 *
 * Engine: simple
 * Location: component://manufacturing/script/org/ofbiz/manufacturing/techdata/RoutingSimpleServices.xml
 * Invoke: createCalendarWeek
 * Defined in: file:/home/jeremy/programmation/opentaps-git/applications/manufacturing/servicedef/services_calendar.xml
 */
public class CreateCalendarWeekService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "createCalendarWeek";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.FALSE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        calendarWeekId("calendarWeekId"),
        description("description"),
        fridayCapacity("fridayCapacity"),
        fridayStartTime("fridayStartTime"),
        locale("locale"),
        mondayCapacity("mondayCapacity"),
        mondayStartTime("mondayStartTime"),
        saturdayCapacity("saturdayCapacity"),
        saturdayStartTime("saturdayStartTime"),
        sundayCapacity("sundayCapacity"),
        sundayStartTime("sundayStartTime"),
        thursdayCapacity("thursdayCapacity"),
        thursdayStartTime("thursdayStartTime"),
        timeZone("timeZone"),
        tuesdayCapacity("tuesdayCapacity"),
        tuesdayStartTime("tuesdayStartTime"),
        userLogin("userLogin"),
        wednesdayCapacity("wednesdayCapacity"),
        wednesdayStartTime("wednesdayStartTime");
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
     * Creates a new <code>CreateCalendarWeekService</code> instance.
     */
    public CreateCalendarWeekService() {
        super();
    }


    private String inCalendarWeekId;
    private String inDescription;
    private BigDecimal inFridayCapacity;
    private Time inFridayStartTime;
    private Locale inLocale;
    private BigDecimal inMondayCapacity;
    private Time inMondayStartTime;
    private BigDecimal inSaturdayCapacity;
    private Time inSaturdayStartTime;
    private BigDecimal inSundayCapacity;
    private Time inSundayStartTime;
    private BigDecimal inThursdayCapacity;
    private Time inThursdayStartTime;
    private TimeZone inTimeZone;
    private BigDecimal inTuesdayCapacity;
    private Time inTuesdayStartTime;
    private GenericValue inUserLogin;
    private BigDecimal inWednesdayCapacity;
    private Time inWednesdayStartTime;
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
    public String getInCalendarWeekId() {
        return this.inCalendarWeekId;
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
    public BigDecimal getInFridayCapacity() {
        return this.inFridayCapacity;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Time</code>
     */
    public Time getInFridayStartTime() {
        return this.inFridayStartTime;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInMondayCapacity() {
        return this.inMondayCapacity;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Time</code>
     */
    public Time getInMondayStartTime() {
        return this.inMondayStartTime;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInSaturdayCapacity() {
        return this.inSaturdayCapacity;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Time</code>
     */
    public Time getInSaturdayStartTime() {
        return this.inSaturdayStartTime;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInSundayCapacity() {
        return this.inSundayCapacity;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Time</code>
     */
    public Time getInSundayStartTime() {
        return this.inSundayStartTime;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInThursdayCapacity() {
        return this.inThursdayCapacity;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Time</code>
     */
    public Time getInThursdayStartTime() {
        return this.inThursdayStartTime;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInTuesdayCapacity() {
        return this.inTuesdayCapacity;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Time</code>
     */
    public Time getInTuesdayStartTime() {
        return this.inTuesdayStartTime;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInWednesdayCapacity() {
        return this.inWednesdayCapacity;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Time</code>
     */
    public Time getInWednesdayStartTime() {
        return this.inWednesdayStartTime;
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
     * @param inCalendarWeekId the inCalendarWeekId to set
    */
    public void setInCalendarWeekId(String inCalendarWeekId) {
        this.inParameters.add("calendarWeekId");
        this.inCalendarWeekId = inCalendarWeekId;
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
     * @param inFridayCapacity the inFridayCapacity to set
    */
    public void setInFridayCapacity(BigDecimal inFridayCapacity) {
        this.inParameters.add("fridayCapacity");
        this.inFridayCapacity = inFridayCapacity;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFridayStartTime the inFridayStartTime to set
    */
    public void setInFridayStartTime(Time inFridayStartTime) {
        this.inParameters.add("fridayStartTime");
        this.inFridayStartTime = inFridayStartTime;
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
     * @param inMondayCapacity the inMondayCapacity to set
    */
    public void setInMondayCapacity(BigDecimal inMondayCapacity) {
        this.inParameters.add("mondayCapacity");
        this.inMondayCapacity = inMondayCapacity;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inMondayStartTime the inMondayStartTime to set
    */
    public void setInMondayStartTime(Time inMondayStartTime) {
        this.inParameters.add("mondayStartTime");
        this.inMondayStartTime = inMondayStartTime;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSaturdayCapacity the inSaturdayCapacity to set
    */
    public void setInSaturdayCapacity(BigDecimal inSaturdayCapacity) {
        this.inParameters.add("saturdayCapacity");
        this.inSaturdayCapacity = inSaturdayCapacity;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSaturdayStartTime the inSaturdayStartTime to set
    */
    public void setInSaturdayStartTime(Time inSaturdayStartTime) {
        this.inParameters.add("saturdayStartTime");
        this.inSaturdayStartTime = inSaturdayStartTime;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSundayCapacity the inSundayCapacity to set
    */
    public void setInSundayCapacity(BigDecimal inSundayCapacity) {
        this.inParameters.add("sundayCapacity");
        this.inSundayCapacity = inSundayCapacity;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSundayStartTime the inSundayStartTime to set
    */
    public void setInSundayStartTime(Time inSundayStartTime) {
        this.inParameters.add("sundayStartTime");
        this.inSundayStartTime = inSundayStartTime;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inThursdayCapacity the inThursdayCapacity to set
    */
    public void setInThursdayCapacity(BigDecimal inThursdayCapacity) {
        this.inParameters.add("thursdayCapacity");
        this.inThursdayCapacity = inThursdayCapacity;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inThursdayStartTime the inThursdayStartTime to set
    */
    public void setInThursdayStartTime(Time inThursdayStartTime) {
        this.inParameters.add("thursdayStartTime");
        this.inThursdayStartTime = inThursdayStartTime;
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
     * @param inTuesdayCapacity the inTuesdayCapacity to set
    */
    public void setInTuesdayCapacity(BigDecimal inTuesdayCapacity) {
        this.inParameters.add("tuesdayCapacity");
        this.inTuesdayCapacity = inTuesdayCapacity;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTuesdayStartTime the inTuesdayStartTime to set
    */
    public void setInTuesdayStartTime(Time inTuesdayStartTime) {
        this.inParameters.add("tuesdayStartTime");
        this.inTuesdayStartTime = inTuesdayStartTime;
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
     * @param inWednesdayCapacity the inWednesdayCapacity to set
    */
    public void setInWednesdayCapacity(BigDecimal inWednesdayCapacity) {
        this.inParameters.add("wednesdayCapacity");
        this.inWednesdayCapacity = inWednesdayCapacity;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inWednesdayStartTime the inWednesdayStartTime to set
    */
    public void setInWednesdayStartTime(Time inWednesdayStartTime) {
        this.inParameters.add("wednesdayStartTime");
        this.inWednesdayStartTime = inWednesdayStartTime;
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
        if (inParameters.contains("calendarWeekId")) mapValue.put("calendarWeekId", getInCalendarWeekId());
        if (inParameters.contains("description")) mapValue.put("description", getInDescription());
        if (inParameters.contains("fridayCapacity")) mapValue.put("fridayCapacity", getInFridayCapacity());
        if (inParameters.contains("fridayStartTime")) mapValue.put("fridayStartTime", getInFridayStartTime());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("mondayCapacity")) mapValue.put("mondayCapacity", getInMondayCapacity());
        if (inParameters.contains("mondayStartTime")) mapValue.put("mondayStartTime", getInMondayStartTime());
        if (inParameters.contains("saturdayCapacity")) mapValue.put("saturdayCapacity", getInSaturdayCapacity());
        if (inParameters.contains("saturdayStartTime")) mapValue.put("saturdayStartTime", getInSaturdayStartTime());
        if (inParameters.contains("sundayCapacity")) mapValue.put("sundayCapacity", getInSundayCapacity());
        if (inParameters.contains("sundayStartTime")) mapValue.put("sundayStartTime", getInSundayStartTime());
        if (inParameters.contains("thursdayCapacity")) mapValue.put("thursdayCapacity", getInThursdayCapacity());
        if (inParameters.contains("thursdayStartTime")) mapValue.put("thursdayStartTime", getInThursdayStartTime());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("tuesdayCapacity")) mapValue.put("tuesdayCapacity", getInTuesdayCapacity());
        if (inParameters.contains("tuesdayStartTime")) mapValue.put("tuesdayStartTime", getInTuesdayStartTime());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        if (inParameters.contains("wednesdayCapacity")) mapValue.put("wednesdayCapacity", getInWednesdayCapacity());
        if (inParameters.contains("wednesdayStartTime")) mapValue.put("wednesdayStartTime", getInWednesdayStartTime());
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
        if (mapValue.containsKey("calendarWeekId")) setInCalendarWeekId((String) mapValue.get("calendarWeekId"));
        if (mapValue.containsKey("description")) setInDescription((String) mapValue.get("description"));
        if (mapValue.containsKey("fridayCapacity")) setInFridayCapacity((BigDecimal) mapValue.get("fridayCapacity"));
        if (mapValue.containsKey("fridayStartTime")) setInFridayStartTime((Time) mapValue.get("fridayStartTime"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("mondayCapacity")) setInMondayCapacity((BigDecimal) mapValue.get("mondayCapacity"));
        if (mapValue.containsKey("mondayStartTime")) setInMondayStartTime((Time) mapValue.get("mondayStartTime"));
        if (mapValue.containsKey("saturdayCapacity")) setInSaturdayCapacity((BigDecimal) mapValue.get("saturdayCapacity"));
        if (mapValue.containsKey("saturdayStartTime")) setInSaturdayStartTime((Time) mapValue.get("saturdayStartTime"));
        if (mapValue.containsKey("sundayCapacity")) setInSundayCapacity((BigDecimal) mapValue.get("sundayCapacity"));
        if (mapValue.containsKey("sundayStartTime")) setInSundayStartTime((Time) mapValue.get("sundayStartTime"));
        if (mapValue.containsKey("thursdayCapacity")) setInThursdayCapacity((BigDecimal) mapValue.get("thursdayCapacity"));
        if (mapValue.containsKey("thursdayStartTime")) setInThursdayStartTime((Time) mapValue.get("thursdayStartTime"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("tuesdayCapacity")) setInTuesdayCapacity((BigDecimal) mapValue.get("tuesdayCapacity"));
        if (mapValue.containsKey("tuesdayStartTime")) setInTuesdayStartTime((Time) mapValue.get("tuesdayStartTime"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
        if (mapValue.containsKey("wednesdayCapacity")) setInWednesdayCapacity((BigDecimal) mapValue.get("wednesdayCapacity"));
        if (mapValue.containsKey("wednesdayStartTime")) setInWednesdayStartTime((Time) mapValue.get("wednesdayStartTime"));
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
     * Construct a <code>CreateCalendarWeekService</code> from the input values of the given <code>CreateCalendarWeekService</code>.
     * @param input a <code>CreateCalendarWeekService</code>
     */
    public static CreateCalendarWeekService fromInput(CreateCalendarWeekService input) {
        CreateCalendarWeekService service = new CreateCalendarWeekService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>CreateCalendarWeekService</code> from the output values of the given <code>CreateCalendarWeekService</code>.
     * @param output a <code>CreateCalendarWeekService</code>
     */
    public static CreateCalendarWeekService fromOutput(CreateCalendarWeekService output) {
        CreateCalendarWeekService service = new CreateCalendarWeekService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CreateCalendarWeekService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CreateCalendarWeekService fromInput(Map<String, Object> mapValue) {
        CreateCalendarWeekService service = new CreateCalendarWeekService();
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
     * Construct a <code>CreateCalendarWeekService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CreateCalendarWeekService fromOutput(Map<String, Object> mapValue) {
        CreateCalendarWeekService service = new CreateCalendarWeekService();
        service.putAllOutput(mapValue);
        return service;
    }
}
