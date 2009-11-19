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

/**
 * Send Print From Screen Widget Service.
 * Auto generated base service entity sendPrintFromScreen.
 *
 * Engine: java
 * Location: org.ofbiz.content.output.OutputServices
 * Invoke: sendPrintFromScreen
 * Defined in: file:/home/jeremy/programmation/opentaps-git/applications/content/servicedef/services_output.xml
 */
public class SendPrintFromScreenService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "sendPrintFromScreen";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.FALSE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        contentType("contentType"),
        docAttributes("docAttributes"),
        locale("locale"),
        printRequestAttributes("printRequestAttributes"),
        printerContentType("printerContentType"),
        printerName("printerName"),
        screenContext("screenContext"),
        screenLocation("screenLocation"),
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
     * Creates a new <code>SendPrintFromScreenService</code> instance.
     */
    public SendPrintFromScreenService() {
        super();
    }


    private String inContentType;
    private List inDocAttributes;
    private Locale inLocale;
    private List inPrintRequestAttributes;
    private String inPrinterContentType;
    private String inPrinterName;
    private Map inScreenContext;
    private String inScreenLocation;
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
     * @return <code>String</code>
     */
    public String getInContentType() {
        return this.inContentType;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getInDocAttributes() {
        return this.inDocAttributes;
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
     * @return <code>List</code>
     */
    public List getInPrintRequestAttributes() {
        return this.inPrintRequestAttributes;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPrinterContentType() {
        return this.inPrinterContentType;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPrinterName() {
        return this.inPrinterName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Map</code>
     */
    public Map getInScreenContext() {
        return this.inScreenContext;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInScreenLocation() {
        return this.inScreenLocation;
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
     * @param inContentType the inContentType to set
    */
    public void setInContentType(String inContentType) {
        this.inParameters.add("contentType");
        this.inContentType = inContentType;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDocAttributes the inDocAttributes to set
    */
    public void setInDocAttributes(List inDocAttributes) {
        this.inParameters.add("docAttributes");
        this.inDocAttributes = inDocAttributes;
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
     * @param inPrintRequestAttributes the inPrintRequestAttributes to set
    */
    public void setInPrintRequestAttributes(List inPrintRequestAttributes) {
        this.inParameters.add("printRequestAttributes");
        this.inPrintRequestAttributes = inPrintRequestAttributes;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPrinterContentType the inPrinterContentType to set
    */
    public void setInPrinterContentType(String inPrinterContentType) {
        this.inParameters.add("printerContentType");
        this.inPrinterContentType = inPrinterContentType;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPrinterName the inPrinterName to set
    */
    public void setInPrinterName(String inPrinterName) {
        this.inParameters.add("printerName");
        this.inPrinterName = inPrinterName;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inScreenContext the inScreenContext to set
    */
    public void setInScreenContext(Map inScreenContext) {
        this.inParameters.add("screenContext");
        this.inScreenContext = inScreenContext;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inScreenLocation the inScreenLocation to set
    */
    public void setInScreenLocation(String inScreenLocation) {
        this.inParameters.add("screenLocation");
        this.inScreenLocation = inScreenLocation;
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
        if (inParameters.contains("contentType")) mapValue.put("contentType", getInContentType());
        if (inParameters.contains("docAttributes")) mapValue.put("docAttributes", getInDocAttributes());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("printRequestAttributes")) mapValue.put("printRequestAttributes", getInPrintRequestAttributes());
        if (inParameters.contains("printerContentType")) mapValue.put("printerContentType", getInPrinterContentType());
        if (inParameters.contains("printerName")) mapValue.put("printerName", getInPrinterName());
        if (inParameters.contains("screenContext")) mapValue.put("screenContext", getInScreenContext());
        if (inParameters.contains("screenLocation")) mapValue.put("screenLocation", getInScreenLocation());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
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
        if (mapValue.containsKey("contentType")) setInContentType((String) mapValue.get("contentType"));
        if (mapValue.containsKey("docAttributes")) setInDocAttributes((List) mapValue.get("docAttributes"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("printRequestAttributes")) setInPrintRequestAttributes((List) mapValue.get("printRequestAttributes"));
        if (mapValue.containsKey("printerContentType")) setInPrinterContentType((String) mapValue.get("printerContentType"));
        if (mapValue.containsKey("printerName")) setInPrinterName((String) mapValue.get("printerName"));
        if (mapValue.containsKey("screenContext")) setInScreenContext((Map) mapValue.get("screenContext"));
        if (mapValue.containsKey("screenLocation")) setInScreenLocation((String) mapValue.get("screenLocation"));
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
     * Construct a <code>SendPrintFromScreenService</code> from the input values of the given <code>SendPrintFromScreenService</code>.
     * @param input a <code>SendPrintFromScreenService</code>
     */
    public static SendPrintFromScreenService fromInput(SendPrintFromScreenService input) {
        SendPrintFromScreenService service = new SendPrintFromScreenService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>SendPrintFromScreenService</code> from the output values of the given <code>SendPrintFromScreenService</code>.
     * @param output a <code>SendPrintFromScreenService</code>
     */
    public static SendPrintFromScreenService fromOutput(SendPrintFromScreenService output) {
        SendPrintFromScreenService service = new SendPrintFromScreenService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>SendPrintFromScreenService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static SendPrintFromScreenService fromInput(Map<String, Object> mapValue) {
        SendPrintFromScreenService service = new SendPrintFromScreenService();
        service.putAllInput(mapValue);
        return service;
    }

    /**
     * Construct a <code>SendPrintFromScreenService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static SendPrintFromScreenService fromOutput(Map<String, Object> mapValue) {
        SendPrintFromScreenService service = new SendPrintFromScreenService();
        service.putAllOutput(mapValue);
        return service;
    }
}
