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
 * Create a Customer request from a commEvent(email).
 * Auto generated base service entity createCustRequestFromCommEvent.
 *
 * Engine: simple
 * Location: component://order/script/org/ofbiz/order/request/CustRequestServices.xml
 * Invoke: createCustRequestFromCommEvent
 * Defined in: file:/home/jeremy/programmation/opentaps-git/applications/order/servicedef/services_request.xml
 */
public class CreateCustRequestFromCommEventService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "createCustRequestFromCommEvent";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        bccString("bccString"),
        ccString("ccString"),
        communicationEventId("communicationEventId"),
        communicationEventTypeId("communicationEventTypeId"),
        contactListId("contactListId"),
        contactMechIdFrom("contactMechIdFrom"),
        contactMechIdTo("contactMechIdTo"),
        contactMechTypeId("contactMechTypeId"),
        content("content"),
        contentMimeTypeId("contentMimeTypeId"),
        custRequestName("custRequestName"),
        custRequestTypeId("custRequestTypeId"),
        datetimeEnded("datetimeEnded"),
        datetimeStarted("datetimeStarted"),
        entryDate("entryDate"),
        fromString("fromString"),
        headerString("headerString"),
        locale("locale"),
        messageId("messageId"),
        note("note"),
        origCommEventId("origCommEventId"),
        parentCommEventId("parentCommEventId"),
        partyIdFrom("partyIdFrom"),
        partyIdTo("partyIdTo"),
        reasonEnumId("reasonEnumId"),
        roleTypeIdFrom("roleTypeIdFrom"),
        roleTypeIdTo("roleTypeIdTo"),
        statusId("statusId"),
        subject("subject"),
        timeZone("timeZone"),
        toString("toString"),
        userLogin("userLogin");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        custRequestId("custRequestId"),
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
     * Creates a new <code>CreateCustRequestFromCommEventService</code> instance.
     */
    public CreateCustRequestFromCommEventService() {
        super();
    }

    /**
     * Creates a new <code>CreateCustRequestFromCommEventService</code> instance.
     * @param user an <code>User</code> value
     */
    public CreateCustRequestFromCommEventService(User user) {
        super(user);
    }

    private String inBccString;
    private String inCcString;
    private String inCommunicationEventId;
    private String inCommunicationEventTypeId;
    private String inContactListId;
    private String inContactMechIdFrom;
    private String inContactMechIdTo;
    private String inContactMechTypeId;
    private String inContent;
    private String inContentMimeTypeId;
    private String inCustRequestName;
    private String inCustRequestTypeId;
    private Timestamp inDatetimeEnded;
    private Timestamp inDatetimeStarted;
    private Timestamp inEntryDate;
    private String inFromString;
    private String inHeaderString;
    private Locale inLocale;
    private String inMessageId;
    private String inNote;
    private String inOrigCommEventId;
    private String inParentCommEventId;
    private String inPartyIdFrom;
    private String inPartyIdTo;
    private String inReasonEnumId;
    private String inRoleTypeIdFrom;
    private String inRoleTypeIdTo;
    private String inStatusId;
    private String inSubject;
    private TimeZone inTimeZone;
    private String inToString;
    private GenericValue inUserLogin;
    private String outCustRequestId;
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
    public String getInBccString() {
        return this.inBccString;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCcString() {
        return this.inCcString;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInCommunicationEventId() {
        return this.inCommunicationEventId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCommunicationEventTypeId() {
        return this.inCommunicationEventTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInContactListId() {
        return this.inContactListId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInContactMechIdFrom() {
        return this.inContactMechIdFrom;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInContactMechIdTo() {
        return this.inContactMechIdTo;
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
    public String getInContent() {
        return this.inContent;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInContentMimeTypeId() {
        return this.inContentMimeTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCustRequestName() {
        return this.inCustRequestName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCustRequestTypeId() {
        return this.inCustRequestTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInDatetimeEnded() {
        return this.inDatetimeEnded;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInDatetimeStarted() {
        return this.inDatetimeStarted;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInEntryDate() {
        return this.inEntryDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInFromString() {
        return this.inFromString;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInHeaderString() {
        return this.inHeaderString;
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
    public String getInMessageId() {
        return this.inMessageId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInNote() {
        return this.inNote;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInOrigCommEventId() {
        return this.inOrigCommEventId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInParentCommEventId() {
        return this.inParentCommEventId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPartyIdFrom() {
        return this.inPartyIdFrom;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPartyIdTo() {
        return this.inPartyIdTo;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInReasonEnumId() {
        return this.inReasonEnumId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRoleTypeIdFrom() {
        return this.inRoleTypeIdFrom;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRoleTypeIdTo() {
        return this.inRoleTypeIdTo;
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
    public String getInSubject() {
        return this.inSubject;
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
    public String getInToString() {
        return this.inToString;
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
    public String getOutCustRequestId() {
        return this.outCustRequestId;
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
     * @param inBccString the inBccString to set
    */
    public void setInBccString(String inBccString) {
        this.inParameters.add("bccString");
        this.inBccString = inBccString;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCcString the inCcString to set
    */
    public void setInCcString(String inCcString) {
        this.inParameters.add("ccString");
        this.inCcString = inCcString;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inCommunicationEventId the inCommunicationEventId to set
    */
    public void setInCommunicationEventId(String inCommunicationEventId) {
        this.inParameters.add("communicationEventId");
        this.inCommunicationEventId = inCommunicationEventId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCommunicationEventTypeId the inCommunicationEventTypeId to set
    */
    public void setInCommunicationEventTypeId(String inCommunicationEventTypeId) {
        this.inParameters.add("communicationEventTypeId");
        this.inCommunicationEventTypeId = inCommunicationEventTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inContactListId the inContactListId to set
    */
    public void setInContactListId(String inContactListId) {
        this.inParameters.add("contactListId");
        this.inContactListId = inContactListId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inContactMechIdFrom the inContactMechIdFrom to set
    */
    public void setInContactMechIdFrom(String inContactMechIdFrom) {
        this.inParameters.add("contactMechIdFrom");
        this.inContactMechIdFrom = inContactMechIdFrom;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inContactMechIdTo the inContactMechIdTo to set
    */
    public void setInContactMechIdTo(String inContactMechIdTo) {
        this.inParameters.add("contactMechIdTo");
        this.inContactMechIdTo = inContactMechIdTo;
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
     * @param inContent the inContent to set
    */
    public void setInContent(String inContent) {
        this.inParameters.add("content");
        this.inContent = inContent;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inContentMimeTypeId the inContentMimeTypeId to set
    */
    public void setInContentMimeTypeId(String inContentMimeTypeId) {
        this.inParameters.add("contentMimeTypeId");
        this.inContentMimeTypeId = inContentMimeTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCustRequestName the inCustRequestName to set
    */
    public void setInCustRequestName(String inCustRequestName) {
        this.inParameters.add("custRequestName");
        this.inCustRequestName = inCustRequestName;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCustRequestTypeId the inCustRequestTypeId to set
    */
    public void setInCustRequestTypeId(String inCustRequestTypeId) {
        this.inParameters.add("custRequestTypeId");
        this.inCustRequestTypeId = inCustRequestTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDatetimeEnded the inDatetimeEnded to set
    */
    public void setInDatetimeEnded(Timestamp inDatetimeEnded) {
        this.inParameters.add("datetimeEnded");
        this.inDatetimeEnded = inDatetimeEnded;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDatetimeStarted the inDatetimeStarted to set
    */
    public void setInDatetimeStarted(Timestamp inDatetimeStarted) {
        this.inParameters.add("datetimeStarted");
        this.inDatetimeStarted = inDatetimeStarted;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inEntryDate the inEntryDate to set
    */
    public void setInEntryDate(Timestamp inEntryDate) {
        this.inParameters.add("entryDate");
        this.inEntryDate = inEntryDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFromString the inFromString to set
    */
    public void setInFromString(String inFromString) {
        this.inParameters.add("fromString");
        this.inFromString = inFromString;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inHeaderString the inHeaderString to set
    */
    public void setInHeaderString(String inHeaderString) {
        this.inParameters.add("headerString");
        this.inHeaderString = inHeaderString;
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
     * @param inMessageId the inMessageId to set
    */
    public void setInMessageId(String inMessageId) {
        this.inParameters.add("messageId");
        this.inMessageId = inMessageId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inNote the inNote to set
    */
    public void setInNote(String inNote) {
        this.inParameters.add("note");
        this.inNote = inNote;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inOrigCommEventId the inOrigCommEventId to set
    */
    public void setInOrigCommEventId(String inOrigCommEventId) {
        this.inParameters.add("origCommEventId");
        this.inOrigCommEventId = inOrigCommEventId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inParentCommEventId the inParentCommEventId to set
    */
    public void setInParentCommEventId(String inParentCommEventId) {
        this.inParameters.add("parentCommEventId");
        this.inParentCommEventId = inParentCommEventId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPartyIdFrom the inPartyIdFrom to set
    */
    public void setInPartyIdFrom(String inPartyIdFrom) {
        this.inParameters.add("partyIdFrom");
        this.inPartyIdFrom = inPartyIdFrom;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPartyIdTo the inPartyIdTo to set
    */
    public void setInPartyIdTo(String inPartyIdTo) {
        this.inParameters.add("partyIdTo");
        this.inPartyIdTo = inPartyIdTo;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inReasonEnumId the inReasonEnumId to set
    */
    public void setInReasonEnumId(String inReasonEnumId) {
        this.inParameters.add("reasonEnumId");
        this.inReasonEnumId = inReasonEnumId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRoleTypeIdFrom the inRoleTypeIdFrom to set
    */
    public void setInRoleTypeIdFrom(String inRoleTypeIdFrom) {
        this.inParameters.add("roleTypeIdFrom");
        this.inRoleTypeIdFrom = inRoleTypeIdFrom;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRoleTypeIdTo the inRoleTypeIdTo to set
    */
    public void setInRoleTypeIdTo(String inRoleTypeIdTo) {
        this.inParameters.add("roleTypeIdTo");
        this.inRoleTypeIdTo = inRoleTypeIdTo;
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
     * @param inSubject the inSubject to set
    */
    public void setInSubject(String inSubject) {
        this.inParameters.add("subject");
        this.inSubject = inSubject;
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
     * @param inToString the inToString to set
    */
    public void setInToString(String inToString) {
        this.inParameters.add("toString");
        this.inToString = inToString;
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
     * @param outCustRequestId the outCustRequestId to set
    */
    public void setOutCustRequestId(String outCustRequestId) {
        this.outParameters.add("custRequestId");
        this.outCustRequestId = outCustRequestId;
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
        if (inParameters.contains("bccString")) mapValue.put("bccString", getInBccString());
        if (inParameters.contains("ccString")) mapValue.put("ccString", getInCcString());
        if (inParameters.contains("communicationEventId")) mapValue.put("communicationEventId", getInCommunicationEventId());
        if (inParameters.contains("communicationEventTypeId")) mapValue.put("communicationEventTypeId", getInCommunicationEventTypeId());
        if (inParameters.contains("contactListId")) mapValue.put("contactListId", getInContactListId());
        if (inParameters.contains("contactMechIdFrom")) mapValue.put("contactMechIdFrom", getInContactMechIdFrom());
        if (inParameters.contains("contactMechIdTo")) mapValue.put("contactMechIdTo", getInContactMechIdTo());
        if (inParameters.contains("contactMechTypeId")) mapValue.put("contactMechTypeId", getInContactMechTypeId());
        if (inParameters.contains("content")) mapValue.put("content", getInContent());
        if (inParameters.contains("contentMimeTypeId")) mapValue.put("contentMimeTypeId", getInContentMimeTypeId());
        if (inParameters.contains("custRequestName")) mapValue.put("custRequestName", getInCustRequestName());
        if (inParameters.contains("custRequestTypeId")) mapValue.put("custRequestTypeId", getInCustRequestTypeId());
        if (inParameters.contains("datetimeEnded")) mapValue.put("datetimeEnded", getInDatetimeEnded());
        if (inParameters.contains("datetimeStarted")) mapValue.put("datetimeStarted", getInDatetimeStarted());
        if (inParameters.contains("entryDate")) mapValue.put("entryDate", getInEntryDate());
        if (inParameters.contains("fromString")) mapValue.put("fromString", getInFromString());
        if (inParameters.contains("headerString")) mapValue.put("headerString", getInHeaderString());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("messageId")) mapValue.put("messageId", getInMessageId());
        if (inParameters.contains("note")) mapValue.put("note", getInNote());
        if (inParameters.contains("origCommEventId")) mapValue.put("origCommEventId", getInOrigCommEventId());
        if (inParameters.contains("parentCommEventId")) mapValue.put("parentCommEventId", getInParentCommEventId());
        if (inParameters.contains("partyIdFrom")) mapValue.put("partyIdFrom", getInPartyIdFrom());
        if (inParameters.contains("partyIdTo")) mapValue.put("partyIdTo", getInPartyIdTo());
        if (inParameters.contains("reasonEnumId")) mapValue.put("reasonEnumId", getInReasonEnumId());
        if (inParameters.contains("roleTypeIdFrom")) mapValue.put("roleTypeIdFrom", getInRoleTypeIdFrom());
        if (inParameters.contains("roleTypeIdTo")) mapValue.put("roleTypeIdTo", getInRoleTypeIdTo());
        if (inParameters.contains("statusId")) mapValue.put("statusId", getInStatusId());
        if (inParameters.contains("subject")) mapValue.put("subject", getInSubject());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("toString")) mapValue.put("toString", getInToString());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        // allow the User set to override the userLogin
        if (getUser() != null) mapValue.put("userLogin", getUser().getOfbizUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("custRequestId")) mapValue.put("custRequestId", getOutCustRequestId());
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
        if (mapValue.containsKey("bccString")) setInBccString((String) mapValue.get("bccString"));
        if (mapValue.containsKey("ccString")) setInCcString((String) mapValue.get("ccString"));
        if (mapValue.containsKey("communicationEventId")) setInCommunicationEventId((String) mapValue.get("communicationEventId"));
        if (mapValue.containsKey("communicationEventTypeId")) setInCommunicationEventTypeId((String) mapValue.get("communicationEventTypeId"));
        if (mapValue.containsKey("contactListId")) setInContactListId((String) mapValue.get("contactListId"));
        if (mapValue.containsKey("contactMechIdFrom")) setInContactMechIdFrom((String) mapValue.get("contactMechIdFrom"));
        if (mapValue.containsKey("contactMechIdTo")) setInContactMechIdTo((String) mapValue.get("contactMechIdTo"));
        if (mapValue.containsKey("contactMechTypeId")) setInContactMechTypeId((String) mapValue.get("contactMechTypeId"));
        if (mapValue.containsKey("content")) setInContent((String) mapValue.get("content"));
        if (mapValue.containsKey("contentMimeTypeId")) setInContentMimeTypeId((String) mapValue.get("contentMimeTypeId"));
        if (mapValue.containsKey("custRequestName")) setInCustRequestName((String) mapValue.get("custRequestName"));
        if (mapValue.containsKey("custRequestTypeId")) setInCustRequestTypeId((String) mapValue.get("custRequestTypeId"));
        if (mapValue.containsKey("datetimeEnded")) setInDatetimeEnded((Timestamp) mapValue.get("datetimeEnded"));
        if (mapValue.containsKey("datetimeStarted")) setInDatetimeStarted((Timestamp) mapValue.get("datetimeStarted"));
        if (mapValue.containsKey("entryDate")) setInEntryDate((Timestamp) mapValue.get("entryDate"));
        if (mapValue.containsKey("fromString")) setInFromString((String) mapValue.get("fromString"));
        if (mapValue.containsKey("headerString")) setInHeaderString((String) mapValue.get("headerString"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("messageId")) setInMessageId((String) mapValue.get("messageId"));
        if (mapValue.containsKey("note")) setInNote((String) mapValue.get("note"));
        if (mapValue.containsKey("origCommEventId")) setInOrigCommEventId((String) mapValue.get("origCommEventId"));
        if (mapValue.containsKey("parentCommEventId")) setInParentCommEventId((String) mapValue.get("parentCommEventId"));
        if (mapValue.containsKey("partyIdFrom")) setInPartyIdFrom((String) mapValue.get("partyIdFrom"));
        if (mapValue.containsKey("partyIdTo")) setInPartyIdTo((String) mapValue.get("partyIdTo"));
        if (mapValue.containsKey("reasonEnumId")) setInReasonEnumId((String) mapValue.get("reasonEnumId"));
        if (mapValue.containsKey("roleTypeIdFrom")) setInRoleTypeIdFrom((String) mapValue.get("roleTypeIdFrom"));
        if (mapValue.containsKey("roleTypeIdTo")) setInRoleTypeIdTo((String) mapValue.get("roleTypeIdTo"));
        if (mapValue.containsKey("statusId")) setInStatusId((String) mapValue.get("statusId"));
        if (mapValue.containsKey("subject")) setInSubject((String) mapValue.get("subject"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("toString")) setInToString((String) mapValue.get("toString"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("custRequestId")) setOutCustRequestId((String) mapValue.get("custRequestId"));
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
     * Construct a <code>CreateCustRequestFromCommEventService</code> from the input values of the given <code>CreateCustRequestFromCommEventService</code>.
     * @param input a <code>CreateCustRequestFromCommEventService</code>
     */
    public static CreateCustRequestFromCommEventService fromInput(CreateCustRequestFromCommEventService input) {
        CreateCustRequestFromCommEventService service = new CreateCustRequestFromCommEventService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>CreateCustRequestFromCommEventService</code> from the output values of the given <code>CreateCustRequestFromCommEventService</code>.
     * @param output a <code>CreateCustRequestFromCommEventService</code>
     */
    public static CreateCustRequestFromCommEventService fromOutput(CreateCustRequestFromCommEventService output) {
        CreateCustRequestFromCommEventService service = new CreateCustRequestFromCommEventService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CreateCustRequestFromCommEventService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CreateCustRequestFromCommEventService fromInput(Map<String, Object> mapValue) {
        CreateCustRequestFromCommEventService service = new CreateCustRequestFromCommEventService();
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
     * Construct a <code>CreateCustRequestFromCommEventService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CreateCustRequestFromCommEventService fromOutput(Map<String, Object> mapValue) {
        CreateCustRequestFromCommEventService service = new CreateCustRequestFromCommEventService();
        service.putAllOutput(mapValue);
        return service;
    }
}
