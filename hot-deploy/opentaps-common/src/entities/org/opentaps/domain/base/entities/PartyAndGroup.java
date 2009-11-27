package org.opentaps.domain.base.entities;

/*
 * Copyright (c) 2008 - 2009 Open Source Strategies, Inc.
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

// DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY WHEN THE DATA MODEL CHANGES
// EXTEND THIS CLASS INSTEAD.

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javolution.util.FastMap;

import org.opentaps.foundation.entity.Entity;
import org.opentaps.foundation.entity.EntityFieldInterface;
import org.opentaps.foundation.repository.RepositoryException;
import org.opentaps.foundation.repository.RepositoryInterface;
import javax.persistence.*;
import org.hibernate.search.annotations.*;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Auto generated base entity PartyAndGroup.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectPartyAndGroups", query="SELECT PTY.PARTY_ID AS \"partyId\",PTY.PARTY_TYPE_ID AS \"partyTypeId\",PTY.EXTERNAL_ID AS \"externalId\",PTY.PREFERRED_CURRENCY_UOM_ID AS \"preferredCurrencyUomId\",PTY.DESCRIPTION AS \"description\",PTY.STATUS_ID AS \"statusId\",PTY.CREATED_DATE AS \"createdDate\",PTY.CREATED_BY_USER_LOGIN AS \"createdByUserLogin\",PTY.LAST_MODIFIED_DATE AS \"lastModifiedDate\",PTY.LAST_MODIFIED_BY_USER_LOGIN AS \"lastModifiedByUserLogin\",PTY.DATA_SOURCE_ID AS \"dataSourceId\",PTY.IS_UNREAD AS \"isUnread\",PGRP.GROUP_NAME AS \"groupName\",PGRP.GROUP_NAME_LOCAL AS \"groupNameLocal\",PGRP.OFFICE_SITE_NAME AS \"officeSiteName\",PGRP.ANNUAL_REVENUE AS \"annualRevenue\",PGRP.NUM_EMPLOYEES AS \"numEmployees\",PGRP.TICKER_SYMBOL AS \"tickerSymbol\",PGRP.COMMENTS AS \"comments\",PGRP.LOGO_IMAGE_URL AS \"logoImageUrl\",PGRP.IS_INCORPORATED AS \"isIncorporated\",PGRP.FEDERAL_TAX_ID AS \"federalTaxId\",PGRP.REQUIRES1099 AS \"requires1099\" FROM PARTY PTY INNER JOIN PARTY_GROUP PGRP ON PTY.PARTY_ID = PGRP.PARTY_ID", resultSetMapping="PartyAndGroupMapping")
@SqlResultSetMapping(name="PartyAndGroupMapping", entities={
@EntityResult(entityClass=PartyAndGroup.class, fields = {
@FieldResult(name="partyId", column="partyId")
,@FieldResult(name="partyTypeId", column="partyTypeId")
,@FieldResult(name="externalId", column="externalId")
,@FieldResult(name="preferredCurrencyUomId", column="preferredCurrencyUomId")
,@FieldResult(name="description", column="description")
,@FieldResult(name="statusId", column="statusId")
,@FieldResult(name="createdDate", column="createdDate")
,@FieldResult(name="createdByUserLogin", column="createdByUserLogin")
,@FieldResult(name="lastModifiedDate", column="lastModifiedDate")
,@FieldResult(name="lastModifiedByUserLogin", column="lastModifiedByUserLogin")
,@FieldResult(name="dataSourceId", column="dataSourceId")
,@FieldResult(name="isUnread", column="isUnread")
,@FieldResult(name="groupName", column="groupName")
,@FieldResult(name="groupNameLocal", column="groupNameLocal")
,@FieldResult(name="officeSiteName", column="officeSiteName")
,@FieldResult(name="annualRevenue", column="annualRevenue")
,@FieldResult(name="numEmployees", column="numEmployees")
,@FieldResult(name="tickerSymbol", column="tickerSymbol")
,@FieldResult(name="comments", column="comments")
,@FieldResult(name="logoImageUrl", column="logoImageUrl")
,@FieldResult(name="isIncorporated", column="isIncorporated")
,@FieldResult(name="federalTaxId", column="federalTaxId")
,@FieldResult(name="requires1099", column="requires1099")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class PartyAndGroup extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("partyId", "PTY.PARTY_ID");
        fields.put("partyTypeId", "PTY.PARTY_TYPE_ID");
        fields.put("externalId", "PTY.EXTERNAL_ID");
        fields.put("preferredCurrencyUomId", "PTY.PREFERRED_CURRENCY_UOM_ID");
        fields.put("description", "PTY.DESCRIPTION");
        fields.put("statusId", "PTY.STATUS_ID");
        fields.put("createdDate", "PTY.CREATED_DATE");
        fields.put("createdByUserLogin", "PTY.CREATED_BY_USER_LOGIN");
        fields.put("lastModifiedDate", "PTY.LAST_MODIFIED_DATE");
        fields.put("lastModifiedByUserLogin", "PTY.LAST_MODIFIED_BY_USER_LOGIN");
        fields.put("dataSourceId", "PTY.DATA_SOURCE_ID");
        fields.put("isUnread", "PTY.IS_UNREAD");
        fields.put("groupName", "PGRP.GROUP_NAME");
        fields.put("groupNameLocal", "PGRP.GROUP_NAME_LOCAL");
        fields.put("officeSiteName", "PGRP.OFFICE_SITE_NAME");
        fields.put("annualRevenue", "PGRP.ANNUAL_REVENUE");
        fields.put("numEmployees", "PGRP.NUM_EMPLOYEES");
        fields.put("tickerSymbol", "PGRP.TICKER_SYMBOL");
        fields.put("comments", "PGRP.COMMENTS");
        fields.put("logoImageUrl", "PGRP.LOGO_IMAGE_URL");
        fields.put("isIncorporated", "PGRP.IS_INCORPORATED");
        fields.put("federalTaxId", "PGRP.FEDERAL_TAX_ID");
        fields.put("requires1099", "PGRP.REQUIRES1099");
fieldMapColumns.put("PartyAndGroup", fields);
}
  public static enum Fields implements EntityFieldInterface<PartyAndGroup> {
    partyId("partyId"),
    partyTypeId("partyTypeId"),
    externalId("externalId"),
    preferredCurrencyUomId("preferredCurrencyUomId"),
    description("description"),
    statusId("statusId"),
    createdDate("createdDate"),
    createdByUserLogin("createdByUserLogin"),
    lastModifiedDate("lastModifiedDate"),
    lastModifiedByUserLogin("lastModifiedByUserLogin"),
    dataSourceId("dataSourceId"),
    isUnread("isUnread"),
    groupName("groupName"),
    groupNameLocal("groupNameLocal"),
    officeSiteName("officeSiteName"),
    annualRevenue("annualRevenue"),
    numEmployees("numEmployees"),
    tickerSymbol("tickerSymbol"),
    comments("comments"),
    logoImageUrl("logoImageUrl"),
    isIncorporated("isIncorporated"),
    federalTaxId("federalTaxId"),
    requires1099("requires1099");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    @Id
   private String partyId;
    
   private String partyTypeId;
    
   private String externalId;
    
   private String preferredCurrencyUomId;
    
   private String description;
    
   private String statusId;
    
   private Timestamp createdDate;
    
   private String createdByUserLogin;
    
   private Timestamp lastModifiedDate;
    
   private String lastModifiedByUserLogin;
    
   private String dataSourceId;
    
   private String isUnread;
    
   private String groupName;
    
   private String groupNameLocal;
    
   private String officeSiteName;
    
   private BigDecimal annualRevenue;
    
   private Long numEmployees;
    
   private String tickerSymbol;
    
   private String comments;
    
   private String logoImageUrl;
    
   private String isIncorporated;
    
   private String federalTaxId;
    
   private String requires1099;

  /**
   * Default constructor.
   */
  public PartyAndGroup() {
      super();
      this.baseEntityName = "PartyAndGroup";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("partyId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("partyId");this.allFieldsNames.add("partyTypeId");this.allFieldsNames.add("externalId");this.allFieldsNames.add("preferredCurrencyUomId");this.allFieldsNames.add("description");this.allFieldsNames.add("statusId");this.allFieldsNames.add("createdDate");this.allFieldsNames.add("createdByUserLogin");this.allFieldsNames.add("lastModifiedDate");this.allFieldsNames.add("lastModifiedByUserLogin");this.allFieldsNames.add("dataSourceId");this.allFieldsNames.add("isUnread");this.allFieldsNames.add("groupName");this.allFieldsNames.add("groupNameLocal");this.allFieldsNames.add("officeSiteName");this.allFieldsNames.add("annualRevenue");this.allFieldsNames.add("numEmployees");this.allFieldsNames.add("tickerSymbol");this.allFieldsNames.add("comments");this.allFieldsNames.add("logoImageUrl");this.allFieldsNames.add("isIncorporated");this.allFieldsNames.add("federalTaxId");this.allFieldsNames.add("requires1099");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PartyAndGroup(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param partyId the partyId to set
     */
    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
    /**
     * Auto generated value setter.
     * @param partyTypeId the partyTypeId to set
     */
    public void setPartyTypeId(String partyTypeId) {
        this.partyTypeId = partyTypeId;
    }
    /**
     * Auto generated value setter.
     * @param externalId the externalId to set
     */
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }
    /**
     * Auto generated value setter.
     * @param preferredCurrencyUomId the preferredCurrencyUomId to set
     */
    public void setPreferredCurrencyUomId(String preferredCurrencyUomId) {
        this.preferredCurrencyUomId = preferredCurrencyUomId;
    }
    /**
     * Auto generated value setter.
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * Auto generated value setter.
     * @param statusId the statusId to set
     */
    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
    /**
     * Auto generated value setter.
     * @param createdDate the createdDate to set
     */
    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }
    /**
     * Auto generated value setter.
     * @param createdByUserLogin the createdByUserLogin to set
     */
    public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }
    /**
     * Auto generated value setter.
     * @param lastModifiedDate the lastModifiedDate to set
     */
    public void setLastModifiedDate(Timestamp lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
    /**
     * Auto generated value setter.
     * @param lastModifiedByUserLogin the lastModifiedByUserLogin to set
     */
    public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }
    /**
     * Auto generated value setter.
     * @param dataSourceId the dataSourceId to set
     */
    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }
    /**
     * Auto generated value setter.
     * @param isUnread the isUnread to set
     */
    public void setIsUnread(String isUnread) {
        this.isUnread = isUnread;
    }
    /**
     * Auto generated value setter.
     * @param groupName the groupName to set
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    /**
     * Auto generated value setter.
     * @param groupNameLocal the groupNameLocal to set
     */
    public void setGroupNameLocal(String groupNameLocal) {
        this.groupNameLocal = groupNameLocal;
    }
    /**
     * Auto generated value setter.
     * @param officeSiteName the officeSiteName to set
     */
    public void setOfficeSiteName(String officeSiteName) {
        this.officeSiteName = officeSiteName;
    }
    /**
     * Auto generated value setter.
     * @param annualRevenue the annualRevenue to set
     */
    public void setAnnualRevenue(BigDecimal annualRevenue) {
        this.annualRevenue = annualRevenue;
    }
    /**
     * Auto generated value setter.
     * @param numEmployees the numEmployees to set
     */
    public void setNumEmployees(Long numEmployees) {
        this.numEmployees = numEmployees;
    }
    /**
     * Auto generated value setter.
     * @param tickerSymbol the tickerSymbol to set
     */
    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }
    /**
     * Auto generated value setter.
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
    /**
     * Auto generated value setter.
     * @param logoImageUrl the logoImageUrl to set
     */
    public void setLogoImageUrl(String logoImageUrl) {
        this.logoImageUrl = logoImageUrl;
    }
    /**
     * Auto generated value setter.
     * @param isIncorporated the isIncorporated to set
     */
    public void setIsIncorporated(String isIncorporated) {
        this.isIncorporated = isIncorporated;
    }
    /**
     * Auto generated value setter.
     * @param federalTaxId the federalTaxId to set
     */
    public void setFederalTaxId(String federalTaxId) {
        this.federalTaxId = federalTaxId;
    }
    /**
     * Auto generated value setter.
     * @param requires1099 the requires1099 to set
     */
    public void setRequires1099(String requires1099) {
        this.requires1099 = requires1099;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyId() {
        return this.partyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyTypeId() {
        return this.partyTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getExternalId() {
        return this.externalId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPreferredCurrencyUomId() {
        return this.preferredCurrencyUomId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getStatusId() {
        return this.statusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedDate() {
        return this.createdDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCreatedByUserLogin() {
        return this.createdByUserLogin;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastModifiedDate() {
        return this.lastModifiedDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLastModifiedByUserLogin() {
        return this.lastModifiedByUserLogin;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getIsUnread() {
        return this.isUnread;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGroupName() {
        return this.groupName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGroupNameLocal() {
        return this.groupNameLocal;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOfficeSiteName() {
        return this.officeSiteName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getAnnualRevenue() {
        return this.annualRevenue;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getNumEmployees() {
        return this.numEmployees;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTickerSymbol() {
        return this.tickerSymbol;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getComments() {
        return this.comments;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLogoImageUrl() {
        return this.logoImageUrl;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getIsIncorporated() {
        return this.isIncorporated;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFederalTaxId() {
        return this.federalTaxId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRequires1099() {
        return this.requires1099;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPartyId((String) mapValue.get("partyId"));
        setPartyTypeId((String) mapValue.get("partyTypeId"));
        setExternalId((String) mapValue.get("externalId"));
        setPreferredCurrencyUomId((String) mapValue.get("preferredCurrencyUomId"));
        setDescription((String) mapValue.get("description"));
        setStatusId((String) mapValue.get("statusId"));
        setCreatedDate((Timestamp) mapValue.get("createdDate"));
        setCreatedByUserLogin((String) mapValue.get("createdByUserLogin"));
        setLastModifiedDate((Timestamp) mapValue.get("lastModifiedDate"));
        setLastModifiedByUserLogin((String) mapValue.get("lastModifiedByUserLogin"));
        setDataSourceId((String) mapValue.get("dataSourceId"));
        setIsUnread((String) mapValue.get("isUnread"));
        setGroupName((String) mapValue.get("groupName"));
        setGroupNameLocal((String) mapValue.get("groupNameLocal"));
        setOfficeSiteName((String) mapValue.get("officeSiteName"));
        setAnnualRevenue(convertToBigDecimal(mapValue.get("annualRevenue")));
        setNumEmployees((Long) mapValue.get("numEmployees"));
        setTickerSymbol((String) mapValue.get("tickerSymbol"));
        setComments((String) mapValue.get("comments"));
        setLogoImageUrl((String) mapValue.get("logoImageUrl"));
        setIsIncorporated((String) mapValue.get("isIncorporated"));
        setFederalTaxId((String) mapValue.get("federalTaxId"));
        setRequires1099((String) mapValue.get("requires1099"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("partyId", getPartyId());
        mapValue.put("partyTypeId", getPartyTypeId());
        mapValue.put("externalId", getExternalId());
        mapValue.put("preferredCurrencyUomId", getPreferredCurrencyUomId());
        mapValue.put("description", getDescription());
        mapValue.put("statusId", getStatusId());
        mapValue.put("createdDate", getCreatedDate());
        mapValue.put("createdByUserLogin", getCreatedByUserLogin());
        mapValue.put("lastModifiedDate", getLastModifiedDate());
        mapValue.put("lastModifiedByUserLogin", getLastModifiedByUserLogin());
        mapValue.put("dataSourceId", getDataSourceId());
        mapValue.put("isUnread", getIsUnread());
        mapValue.put("groupName", getGroupName());
        mapValue.put("groupNameLocal", getGroupNameLocal());
        mapValue.put("officeSiteName", getOfficeSiteName());
        mapValue.put("annualRevenue", getAnnualRevenue());
        mapValue.put("numEmployees", getNumEmployees());
        mapValue.put("tickerSymbol", getTickerSymbol());
        mapValue.put("comments", getComments());
        mapValue.put("logoImageUrl", getLogoImageUrl());
        mapValue.put("isIncorporated", getIsIncorporated());
        mapValue.put("federalTaxId", getFederalTaxId());
        mapValue.put("requires1099", getRequires1099());
        return mapValue;
    }


}