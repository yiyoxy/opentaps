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

import java.math.BigDecimal;
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
 * Update an InvoiceTerm. Will return failure if a term of the new type exists, or if the new term type
            is a payment term (governed by InvoiceHelper.invoiceDueDateAgreementTermTypeIds) and a term of that sort exists..
 * Auto generated base service entity updateInvoiceTerm.
 *
 * Engine: java
 * Location: com.opensourcestrategies.financials.invoice.InvoiceServices
 * Invoke: updateInvoiceTerm
 * Defined in: file:/home/jeremy/programmation/opentaps-git/hot-deploy/financials/servicedef/services_invoice.xml
 */
public class UpdateInvoiceTermService extends ServiceWrapperWithAuth {

    /** The service name as used by the service engine. */
    public static final String NAME = "updateInvoiceTerm";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        description("description"),
        invoiceId("invoiceId"),
        invoiceItemSeqId("invoiceItemSeqId"),
        invoiceTermId("invoiceTermId"),
        locale("locale"),
        maxQuantity("maxQuantity"),
        minQuantity("minQuantity"),
        termDays("termDays"),
        termTypeId("termTypeId"),
        termValue("termValue"),
        textValue("textValue"),
        timeZone("timeZone"),
        uomId("uomId"),
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
     * Creates a new <code>UpdateInvoiceTermService</code> instance.
     */
    public UpdateInvoiceTermService() {
        super();
    }

    /**
     * Creates a new <code>UpdateInvoiceTermService</code> instance.
     * @param user an <code>User</code> value
     */
    public UpdateInvoiceTermService(User user) {
        super(user);
    }

    private String inDescription;
    private String inInvoiceId;
    private String inInvoiceItemSeqId;
    private String inInvoiceTermId;
    private Locale inLocale;
    private Double inMaxQuantity;
    private Double inMinQuantity;
    private Long inTermDays;
    private String inTermTypeId;
    private BigDecimal inTermValue;
    private String inTextValue;
    private TimeZone inTimeZone;
    private String inUomId;
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
    public String getInDescription() {
        return this.inDescription;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInInvoiceId() {
        return this.inInvoiceId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInInvoiceItemSeqId() {
        return this.inInvoiceItemSeqId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInInvoiceTermId() {
        return this.inInvoiceTermId;
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
     * @return <code>Double</code>
     */
    public Double getInMaxQuantity() {
        return this.inMaxQuantity;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Double</code>
     */
    public Double getInMinQuantity() {
        return this.inMinQuantity;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInTermDays() {
        return this.inTermDays;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTermTypeId() {
        return this.inTermTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInTermValue() {
        return this.inTermValue;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTextValue() {
        return this.inTextValue;
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
    public String getInUomId() {
        return this.inUomId;
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
     * @param inDescription the inDescription to set
    */
    public void setInDescription(String inDescription) {
        this.inParameters.add("description");
        this.inDescription = inDescription;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inInvoiceId the inInvoiceId to set
    */
    public void setInInvoiceId(String inInvoiceId) {
        this.inParameters.add("invoiceId");
        this.inInvoiceId = inInvoiceId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inInvoiceItemSeqId the inInvoiceItemSeqId to set
    */
    public void setInInvoiceItemSeqId(String inInvoiceItemSeqId) {
        this.inParameters.add("invoiceItemSeqId");
        this.inInvoiceItemSeqId = inInvoiceItemSeqId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inInvoiceTermId the inInvoiceTermId to set
    */
    public void setInInvoiceTermId(String inInvoiceTermId) {
        this.inParameters.add("invoiceTermId");
        this.inInvoiceTermId = inInvoiceTermId;
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
     * @param inMaxQuantity the inMaxQuantity to set
    */
    public void setInMaxQuantity(Double inMaxQuantity) {
        this.inParameters.add("maxQuantity");
        this.inMaxQuantity = inMaxQuantity;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inMinQuantity the inMinQuantity to set
    */
    public void setInMinQuantity(Double inMinQuantity) {
        this.inParameters.add("minQuantity");
        this.inMinQuantity = inMinQuantity;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTermDays the inTermDays to set
    */
    public void setInTermDays(Long inTermDays) {
        this.inParameters.add("termDays");
        this.inTermDays = inTermDays;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTermTypeId the inTermTypeId to set
    */
    public void setInTermTypeId(String inTermTypeId) {
        this.inParameters.add("termTypeId");
        this.inTermTypeId = inTermTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTermValue the inTermValue to set
    */
    public void setInTermValue(BigDecimal inTermValue) {
        this.inParameters.add("termValue");
        this.inTermValue = inTermValue;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTextValue the inTextValue to set
    */
    public void setInTextValue(String inTextValue) {
        this.inParameters.add("textValue");
        this.inTextValue = inTextValue;
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
     * @param inUomId the inUomId to set
    */
    public void setInUomId(String inUomId) {
        this.inParameters.add("uomId");
        this.inUomId = inUomId;
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
        if (inParameters.contains("description")) mapValue.put("description", getInDescription());
        if (inParameters.contains("invoiceId")) mapValue.put("invoiceId", getInInvoiceId());
        if (inParameters.contains("invoiceItemSeqId")) mapValue.put("invoiceItemSeqId", getInInvoiceItemSeqId());
        if (inParameters.contains("invoiceTermId")) mapValue.put("invoiceTermId", getInInvoiceTermId());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("maxQuantity")) mapValue.put("maxQuantity", getInMaxQuantity());
        if (inParameters.contains("minQuantity")) mapValue.put("minQuantity", getInMinQuantity());
        if (inParameters.contains("termDays")) mapValue.put("termDays", getInTermDays());
        if (inParameters.contains("termTypeId")) mapValue.put("termTypeId", getInTermTypeId());
        if (inParameters.contains("termValue")) mapValue.put("termValue", getInTermValue());
        if (inParameters.contains("textValue")) mapValue.put("textValue", getInTextValue());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("uomId")) mapValue.put("uomId", getInUomId());
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
        if (mapValue.containsKey("description")) setInDescription((String) mapValue.get("description"));
        if (mapValue.containsKey("invoiceId")) setInInvoiceId((String) mapValue.get("invoiceId"));
        if (mapValue.containsKey("invoiceItemSeqId")) setInInvoiceItemSeqId((String) mapValue.get("invoiceItemSeqId"));
        if (mapValue.containsKey("invoiceTermId")) setInInvoiceTermId((String) mapValue.get("invoiceTermId"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("maxQuantity")) setInMaxQuantity((Double) mapValue.get("maxQuantity"));
        if (mapValue.containsKey("minQuantity")) setInMinQuantity((Double) mapValue.get("minQuantity"));
        if (mapValue.containsKey("termDays")) setInTermDays((Long) mapValue.get("termDays"));
        if (mapValue.containsKey("termTypeId")) setInTermTypeId((String) mapValue.get("termTypeId"));
        if (mapValue.containsKey("termValue")) setInTermValue((BigDecimal) mapValue.get("termValue"));
        if (mapValue.containsKey("textValue")) setInTextValue((String) mapValue.get("textValue"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("uomId")) setInUomId((String) mapValue.get("uomId"));
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
     * Construct a <code>UpdateInvoiceTermService</code> from the input values of the given <code>UpdateInvoiceTermService</code>.
     * @param input a <code>UpdateInvoiceTermService</code>
     */
    public static UpdateInvoiceTermService fromInput(UpdateInvoiceTermService input) {
        UpdateInvoiceTermService service = new UpdateInvoiceTermService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>UpdateInvoiceTermService</code> from the output values of the given <code>UpdateInvoiceTermService</code>.
     * @param output a <code>UpdateInvoiceTermService</code>
     */
    public static UpdateInvoiceTermService fromOutput(UpdateInvoiceTermService output) {
        UpdateInvoiceTermService service = new UpdateInvoiceTermService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>UpdateInvoiceTermService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static UpdateInvoiceTermService fromInput(Map<String, Object> mapValue) {
        UpdateInvoiceTermService service = new UpdateInvoiceTermService();
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
     * Construct a <code>UpdateInvoiceTermService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static UpdateInvoiceTermService fromOutput(Map<String, Object> mapValue) {
        UpdateInvoiceTermService service = new UpdateInvoiceTermService();
        service.putAllOutput(mapValue);
        return service;
    }
}
