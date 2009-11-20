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
 * Create a ProductPromo.
 * Auto generated base service entity createProductPromo.
 *
 * Engine: simple
 * Location: component://product/script/org/ofbiz/product/promo/PromoServices.xml
 * Invoke: createProductPromo
 * Defined in: file:/home/jeremy/programmation/opentaps-git/applications/product/servicedef/services_pricepromo.xml
 */
public class CreateProductPromoService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "createProductPromo";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        billbackFactor("billbackFactor"),
        locale("locale"),
        overrideOrgPartyId("overrideOrgPartyId"),
        promoName("promoName"),
        promoText("promoText"),
        requireCode("requireCode"),
        showToCustomer("showToCustomer"),
        timeZone("timeZone"),
        useLimitPerCustomer("useLimitPerCustomer"),
        useLimitPerOrder("useLimitPerOrder"),
        useLimitPerPromotion("useLimitPerPromotion"),
        userEntered("userEntered"),
        userLogin("userLogin");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        locale("locale"),
        productPromoId("productPromoId"),
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
     * Creates a new <code>CreateProductPromoService</code> instance.
     */
    public CreateProductPromoService() {
        super();
    }

    /**
     * Creates a new <code>CreateProductPromoService</code> instance.
     * @param user an <code>User</code> value
     */
    public CreateProductPromoService(User user) {
        super(user);
    }

    private BigDecimal inBillbackFactor;
    private Locale inLocale;
    private String inOverrideOrgPartyId;
    private String inPromoName;
    private String inPromoText;
    private String inRequireCode;
    private String inShowToCustomer;
    private TimeZone inTimeZone;
    private Long inUseLimitPerCustomer;
    private Long inUseLimitPerOrder;
    private Long inUseLimitPerPromotion;
    private String inUserEntered;
    private GenericValue inUserLogin;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private String outProductPromoId;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInBillbackFactor() {
        return this.inBillbackFactor;
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
    public String getInOverrideOrgPartyId() {
        return this.inOverrideOrgPartyId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInPromoName() {
        return this.inPromoName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPromoText() {
        return this.inPromoText;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRequireCode() {
        return this.inRequireCode;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInShowToCustomer() {
        return this.inShowToCustomer;
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
     * @return <code>Long</code>
     */
    public Long getInUseLimitPerCustomer() {
        return this.inUseLimitPerCustomer;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInUseLimitPerOrder() {
        return this.inUseLimitPerOrder;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInUseLimitPerPromotion() {
        return this.inUseLimitPerPromotion;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInUserEntered() {
        return this.inUserEntered;
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
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getOutProductPromoId() {
        return this.outProductPromoId;
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
     * @param inBillbackFactor the inBillbackFactor to set
    */
    public void setInBillbackFactor(BigDecimal inBillbackFactor) {
        this.inParameters.add("billbackFactor");
        this.inBillbackFactor = inBillbackFactor;
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
     * @param inOverrideOrgPartyId the inOverrideOrgPartyId to set
    */
    public void setInOverrideOrgPartyId(String inOverrideOrgPartyId) {
        this.inParameters.add("overrideOrgPartyId");
        this.inOverrideOrgPartyId = inOverrideOrgPartyId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inPromoName the inPromoName to set
    */
    public void setInPromoName(String inPromoName) {
        this.inParameters.add("promoName");
        this.inPromoName = inPromoName;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPromoText the inPromoText to set
    */
    public void setInPromoText(String inPromoText) {
        this.inParameters.add("promoText");
        this.inPromoText = inPromoText;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRequireCode the inRequireCode to set
    */
    public void setInRequireCode(String inRequireCode) {
        this.inParameters.add("requireCode");
        this.inRequireCode = inRequireCode;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inShowToCustomer the inShowToCustomer to set
    */
    public void setInShowToCustomer(String inShowToCustomer) {
        this.inParameters.add("showToCustomer");
        this.inShowToCustomer = inShowToCustomer;
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
     * @param inUseLimitPerCustomer the inUseLimitPerCustomer to set
    */
    public void setInUseLimitPerCustomer(Long inUseLimitPerCustomer) {
        this.inParameters.add("useLimitPerCustomer");
        this.inUseLimitPerCustomer = inUseLimitPerCustomer;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inUseLimitPerOrder the inUseLimitPerOrder to set
    */
    public void setInUseLimitPerOrder(Long inUseLimitPerOrder) {
        this.inParameters.add("useLimitPerOrder");
        this.inUseLimitPerOrder = inUseLimitPerOrder;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inUseLimitPerPromotion the inUseLimitPerPromotion to set
    */
    public void setInUseLimitPerPromotion(Long inUseLimitPerPromotion) {
        this.inParameters.add("useLimitPerPromotion");
        this.inUseLimitPerPromotion = inUseLimitPerPromotion;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inUserEntered the inUserEntered to set
    */
    public void setInUserEntered(String inUserEntered) {
        this.inParameters.add("userEntered");
        this.inUserEntered = inUserEntered;
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
     * This parameter is required.
     * @param outProductPromoId the outProductPromoId to set
    */
    public void setOutProductPromoId(String outProductPromoId) {
        this.outParameters.add("productPromoId");
        this.outProductPromoId = outProductPromoId;
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
        if (inParameters.contains("billbackFactor")) mapValue.put("billbackFactor", getInBillbackFactor());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("overrideOrgPartyId")) mapValue.put("overrideOrgPartyId", getInOverrideOrgPartyId());
        if (inParameters.contains("promoName")) mapValue.put("promoName", getInPromoName());
        if (inParameters.contains("promoText")) mapValue.put("promoText", getInPromoText());
        if (inParameters.contains("requireCode")) mapValue.put("requireCode", getInRequireCode());
        if (inParameters.contains("showToCustomer")) mapValue.put("showToCustomer", getInShowToCustomer());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("useLimitPerCustomer")) mapValue.put("useLimitPerCustomer", getInUseLimitPerCustomer());
        if (inParameters.contains("useLimitPerOrder")) mapValue.put("useLimitPerOrder", getInUseLimitPerOrder());
        if (inParameters.contains("useLimitPerPromotion")) mapValue.put("useLimitPerPromotion", getInUseLimitPerPromotion());
        if (inParameters.contains("userEntered")) mapValue.put("userEntered", getInUserEntered());
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
        if (outParameters.contains("productPromoId")) mapValue.put("productPromoId", getOutProductPromoId());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("billbackFactor")) setInBillbackFactor((BigDecimal) mapValue.get("billbackFactor"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("overrideOrgPartyId")) setInOverrideOrgPartyId((String) mapValue.get("overrideOrgPartyId"));
        if (mapValue.containsKey("promoName")) setInPromoName((String) mapValue.get("promoName"));
        if (mapValue.containsKey("promoText")) setInPromoText((String) mapValue.get("promoText"));
        if (mapValue.containsKey("requireCode")) setInRequireCode((String) mapValue.get("requireCode"));
        if (mapValue.containsKey("showToCustomer")) setInShowToCustomer((String) mapValue.get("showToCustomer"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("useLimitPerCustomer")) setInUseLimitPerCustomer((Long) mapValue.get("useLimitPerCustomer"));
        if (mapValue.containsKey("useLimitPerOrder")) setInUseLimitPerOrder((Long) mapValue.get("useLimitPerOrder"));
        if (mapValue.containsKey("useLimitPerPromotion")) setInUseLimitPerPromotion((Long) mapValue.get("useLimitPerPromotion"));
        if (mapValue.containsKey("userEntered")) setInUserEntered((String) mapValue.get("userEntered"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("productPromoId")) setOutProductPromoId((String) mapValue.get("productPromoId"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>CreateProductPromoService</code> from the input values of the given <code>CreateProductPromoService</code>.
     * @param input a <code>CreateProductPromoService</code>
     */
    public static CreateProductPromoService fromInput(CreateProductPromoService input) {
        CreateProductPromoService service = new CreateProductPromoService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>CreateProductPromoService</code> from the output values of the given <code>CreateProductPromoService</code>.
     * @param output a <code>CreateProductPromoService</code>
     */
    public static CreateProductPromoService fromOutput(CreateProductPromoService output) {
        CreateProductPromoService service = new CreateProductPromoService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CreateProductPromoService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CreateProductPromoService fromInput(Map<String, Object> mapValue) {
        CreateProductPromoService service = new CreateProductPromoService();
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
     * Construct a <code>CreateProductPromoService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CreateProductPromoService fromOutput(Map<String, Object> mapValue) {
        CreateProductPromoService service = new CreateProductPromoService();
        service.putAllOutput(mapValue);
        return service;
    }
}
