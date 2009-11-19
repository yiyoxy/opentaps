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
 * Update a Temporal Expression.
 * Auto generated base service entity updateTemporalExpression.
 *
 * Engine: entity-auto
 * Location: 
 * Invoke: update
 * Defined in: file:/home/jeremy/programmation/opentaps-git/framework/common/servicedef/services.xml
 */
public class UpdateTemporalExpressionService extends ServiceWrapperWithAuth {

    /** The service name as used by the service engine. */
    public static final String NAME = "updateTemporalExpression";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        date1("date1"),
        date2("date2"),
        integer1("integer1"),
        integer2("integer2"),
        locale("locale"),
        string1("string1"),
        string2("string2"),
        tempExprId("tempExprId"),
        tempExprTypeId("tempExprTypeId"),
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
     * Creates a new <code>UpdateTemporalExpressionService</code> instance.
     */
    public UpdateTemporalExpressionService() {
        super();
    }

    /**
     * Creates a new <code>UpdateTemporalExpressionService</code> instance.
     * @param user an <code>User</code> value
     */
    public UpdateTemporalExpressionService(User user) {
        super(user);
    }

    private Timestamp inDate1;
    private Timestamp inDate2;
    private Long inInteger1;
    private Long inInteger2;
    private Locale inLocale;
    private String inString1;
    private String inString2;
    private String inTempExprId;
    private String inTempExprTypeId;
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
    public Timestamp getInDate1() {
        return this.inDate1;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInDate2() {
        return this.inDate2;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInInteger1() {
        return this.inInteger1;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInInteger2() {
        return this.inInteger2;
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
    public String getInString1() {
        return this.inString1;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInString2() {
        return this.inString2;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInTempExprId() {
        return this.inTempExprId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTempExprTypeId() {
        return this.inTempExprTypeId;
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
     * @param inDate1 the inDate1 to set
    */
    public void setInDate1(Timestamp inDate1) {
        this.inParameters.add("date1");
        this.inDate1 = inDate1;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDate2 the inDate2 to set
    */
    public void setInDate2(Timestamp inDate2) {
        this.inParameters.add("date2");
        this.inDate2 = inDate2;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inInteger1 the inInteger1 to set
    */
    public void setInInteger1(Long inInteger1) {
        this.inParameters.add("integer1");
        this.inInteger1 = inInteger1;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inInteger2 the inInteger2 to set
    */
    public void setInInteger2(Long inInteger2) {
        this.inParameters.add("integer2");
        this.inInteger2 = inInteger2;
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
     * @param inString1 the inString1 to set
    */
    public void setInString1(String inString1) {
        this.inParameters.add("string1");
        this.inString1 = inString1;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inString2 the inString2 to set
    */
    public void setInString2(String inString2) {
        this.inParameters.add("string2");
        this.inString2 = inString2;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inTempExprId the inTempExprId to set
    */
    public void setInTempExprId(String inTempExprId) {
        this.inParameters.add("tempExprId");
        this.inTempExprId = inTempExprId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTempExprTypeId the inTempExprTypeId to set
    */
    public void setInTempExprTypeId(String inTempExprTypeId) {
        this.inParameters.add("tempExprTypeId");
        this.inTempExprTypeId = inTempExprTypeId;
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
        if (inParameters.contains("date1")) mapValue.put("date1", getInDate1());
        if (inParameters.contains("date2")) mapValue.put("date2", getInDate2());
        if (inParameters.contains("integer1")) mapValue.put("integer1", getInInteger1());
        if (inParameters.contains("integer2")) mapValue.put("integer2", getInInteger2());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("string1")) mapValue.put("string1", getInString1());
        if (inParameters.contains("string2")) mapValue.put("string2", getInString2());
        if (inParameters.contains("tempExprId")) mapValue.put("tempExprId", getInTempExprId());
        if (inParameters.contains("tempExprTypeId")) mapValue.put("tempExprTypeId", getInTempExprTypeId());
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
        if (mapValue.containsKey("date1")) setInDate1((Timestamp) mapValue.get("date1"));
        if (mapValue.containsKey("date2")) setInDate2((Timestamp) mapValue.get("date2"));
        if (mapValue.containsKey("integer1")) setInInteger1((Long) mapValue.get("integer1"));
        if (mapValue.containsKey("integer2")) setInInteger2((Long) mapValue.get("integer2"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("string1")) setInString1((String) mapValue.get("string1"));
        if (mapValue.containsKey("string2")) setInString2((String) mapValue.get("string2"));
        if (mapValue.containsKey("tempExprId")) setInTempExprId((String) mapValue.get("tempExprId"));
        if (mapValue.containsKey("tempExprTypeId")) setInTempExprTypeId((String) mapValue.get("tempExprTypeId"));
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
     * Construct a <code>UpdateTemporalExpressionService</code> from the input values of the given <code>UpdateTemporalExpressionService</code>.
     * @param input a <code>UpdateTemporalExpressionService</code>
     */
    public static UpdateTemporalExpressionService fromInput(UpdateTemporalExpressionService input) {
        UpdateTemporalExpressionService service = new UpdateTemporalExpressionService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>UpdateTemporalExpressionService</code> from the output values of the given <code>UpdateTemporalExpressionService</code>.
     * @param output a <code>UpdateTemporalExpressionService</code>
     */
    public static UpdateTemporalExpressionService fromOutput(UpdateTemporalExpressionService output) {
        UpdateTemporalExpressionService service = new UpdateTemporalExpressionService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>UpdateTemporalExpressionService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static UpdateTemporalExpressionService fromInput(Map<String, Object> mapValue) {
        UpdateTemporalExpressionService service = new UpdateTemporalExpressionService();
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
     * Construct a <code>UpdateTemporalExpressionService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static UpdateTemporalExpressionService fromOutput(Map<String, Object> mapValue) {
        UpdateTemporalExpressionService service = new UpdateTemporalExpressionService();
        service.putAllOutput(mapValue);
        return service;
    }
}
