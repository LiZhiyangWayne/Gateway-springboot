package com.ylk.gateway.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *  @author: Wayne
 * Create Date: 2018/4/10
 * Description: 基本信息对应的model
 * 修改记录:
 * 修改后版本			修改人		修改日期			修改内容
 * 2018/4/10.1		Wayne		 2018/4/10		 create
 */
@Entity
@Table(name = "BASE_INFO")
public class BaseInfo {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "ORG_CODE")
    private String orgCode;
    @Column(name = "PATIENT_ID")
    private String patientId;
    @Column(name = "LAST_UPDATE_DTIME")
    private Date lastUpdateDtime;
    @Column(name = "CARD_NO")
    private String cardNo;
    @Column(name = "CARD_TYPE_CODE")
    private String cardTypeCode;
    @Column(name = "HEALTH_RECORD_NO")
    private String healthRecordNo;
    @Column(name = "NAME")
    private String name;
    @Column(name = "SEX_CODE")
    private String sexCode;
    @Column(name = "BIRTH_DATE")
    private Date birthDate;
    @Column(name = "ID_TYPE_CODE")
    private String idTypeCode;
    @Column(name = "ID_NO")
    private String idNo;
    @Column(name = "EMPLOYER_NAME")
    private String employerName;
    @Column(name = "TEL_NO")
    private String telNo;
    @Column(name = "CONTACT_NAME")
    private String contactName;
    @Column(name = "CONTACT_TEL_NO")
    private String contactTelNo;
    @Column(name = "NATIONALITY_CODE")
    private String nationalityCode;
    @Column(name = "ABO_CODE")
    private String aboCode;
    @Column(name = "RH_CODE")
    private String rhCode;
    @Column(name = "EDUCATION_CODE")
    private String educationCode;
    @Column(name = "OCCUPATION_CODE")
    private String occupationCode;
    @Column(name = "MARRIAGE_CODE")
    private String marriageCode;
    @Column(name = "DRUG_ALLERGY_MARK")
    private String drugAllergyMark;
    @Column(name = "OP_HISTORY_MARK")
    private String opHistoryMark;
    @Column(name = "TRAUMA_HISTORY_MARK")
    private String traumaHistoryMark;
    @Column(name = "BLOOD_TRANSF_MARK")
    private String bloodTransfMark;
    @Column(name = "DISABILITY_MARK")
    private String disabilityMark;
    @Column(name = "GENETIC_DISEASE_HISTORY")
    private String geneticDiseaseHistory;
    @Column(name = "OPERATION_HISTORY")
    private String operationHistory;

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public Date getLastUpdateDtime() {
        return lastUpdateDtime;
    }

    public void setLastUpdateDtime(Date lastUpdateDtime) {
        this.lastUpdateDtime = lastUpdateDtime;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardTypeCode() {
        return cardTypeCode;
    }

    public void setCardTypeCode(String cardTypeCode) {
        this.cardTypeCode = cardTypeCode;
    }

    public String getHealthRecordNo() {
        return healthRecordNo;
    }

    public void setHealthRecordNo(String healthRecordNo) {
        this.healthRecordNo = healthRecordNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getIdTypeCode() {
        return idTypeCode;
    }

    public void setIdTypeCode(String idTypeCode) {
        this.idTypeCode = idTypeCode;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactTelNo() {
        return contactTelNo;
    }

    public void setContactTelNo(String contactTelNo) {
        this.contactTelNo = contactTelNo;
    }

    public String getNationalityCode() {
        return nationalityCode;
    }

    public void setNationalityCode(String nationalityCode) {
        this.nationalityCode = nationalityCode;
    }

    public String getAboCode() {
        return aboCode;
    }

    public void setAboCode(String aboCode) {
        this.aboCode = aboCode;
    }

    public String getRhCode() {
        return rhCode;
    }

    public void setRhCode(String rhCode) {
        this.rhCode = rhCode;
    }

    public String getEducationCode() {
        return educationCode;
    }

    public void setEducationCode(String educationCode) {
        this.educationCode = educationCode;
    }

    public String getOccupationCode() {
        return occupationCode;
    }

    public void setOccupationCode(String occupationCode) {
        this.occupationCode = occupationCode;
    }

    public String getMarriageCode() {
        return marriageCode;
    }

    public void setMarriageCode(String marriageCode) {
        this.marriageCode = marriageCode;
    }

    public String getDrugAllergyMark() {
        return drugAllergyMark;
    }

    public void setDrugAllergyMark(String drugAllergyMark) {
        this.drugAllergyMark = drugAllergyMark;
    }

    public String getOpHistoryMark() {
        return opHistoryMark;
    }

    public void setOpHistoryMark(String opHistoryMark) {
        this.opHistoryMark = opHistoryMark;
    }

    public String getTraumaHistoryMark() {
        return traumaHistoryMark;
    }

    public void setTraumaHistoryMark(String traumaHistoryMark) {
        this.traumaHistoryMark = traumaHistoryMark;
    }

    public String getBloodTransfMark() {
        return bloodTransfMark;
    }

    public void setBloodTransfMark(String bloodTransfMark) {
        this.bloodTransfMark = bloodTransfMark;
    }

    public String getDisabilityMark() {
        return disabilityMark;
    }

    public void setDisabilityMark(String disabilityMark) {
        this.disabilityMark = disabilityMark;
    }

    public String getGeneticDiseaseHistory() {
        return geneticDiseaseHistory;
    }

    public void setGeneticDiseaseHistory(String geneticDiseaseHistory) {
        this.geneticDiseaseHistory = geneticDiseaseHistory;
    }

    public String getOperationHistory() {
        return operationHistory;
    }

    public void setOperationHistory(String operationHistory) {
        this.operationHistory = operationHistory;
    }
}
