package com.emi.wms.bean;

import java.math.BigDecimal;
import java.util.Date;

import com.emi.sys.core.annotation.EmiColumn;
import com.emi.sys.core.annotation.EmiTable;
@EmiTable(name="AA_Org")
public class AaOrg {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.AA_Org.pk
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="pk" ,increment=true)
    private Integer pk;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.AA_Org.gid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name = "gid", ID = true)
    private String gid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.AA_Org.notes
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="notes" )
    private String notes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.AA_Org.orgCode
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="orgCode" )
    private String orgcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.AA_Org.orgName
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="orgName" )
    private String orgname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.AA_Org.orgAdder
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="orgAdder" )
    private String orgadder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.AA_Org.orgTel
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="orgTel" )
    private String orgtel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.AA_Org.orgFax
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="orgFax" )
    private String orgfax;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.AA_Org.orgMoboile
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="orgMoboile" )
    private String orgmoboile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.AA_Org.legal
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="legal" )
    private String legal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.AA_Org.orgLongitude
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="orgLongitude" )
    private BigDecimal orglongitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.AA_Org.orgLatitude
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="orgLatitude" )
    private BigDecimal orglatitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.AA_Org.orgPostCode
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="orgPostCode" )
    private String orgpostcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.AA_Org.orgUrls
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="orgUrls" )
    private String orgurls;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.AA_Org.orgUrl
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="orgUrl" )
    private String orgurl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.AA_Org.beginTimes
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="beginTimes" )
    private Date begintimes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.AA_Org.endTimes
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="endTimes" )
    private Date endtimes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.AA_Org.sobId
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="parentid" )
    private String parentid;

	@EmiColumn(name="isDel" )
    private String isDel;
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.AA_Org.pk
     *
     * @return the value of dbo.AA_Org.pk
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public Integer getPk() {
        return pk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.AA_Org.pk
     *
     * @param pk the value for dbo.AA_Org.pk
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.AA_Org.gid
     *
     * @return the value of dbo.AA_Org.gid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getGid() {
        return gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.AA_Org.gid
     *
     * @param gid the value for dbo.AA_Org.gid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setGid(String gid) {
        this.gid = gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.AA_Org.notes
     *
     * @return the value of dbo.AA_Org.notes
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getNotes() {
        return notes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.AA_Org.notes
     *
     * @param notes the value for dbo.AA_Org.notes
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.AA_Org.orgCode
     *
     * @return the value of dbo.AA_Org.orgCode
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getOrgcode() {
        return orgcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.AA_Org.orgCode
     *
     * @param orgcode the value for dbo.AA_Org.orgCode
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.AA_Org.orgName
     *
     * @return the value of dbo.AA_Org.orgName
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getOrgname() {
        return orgname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.AA_Org.orgName
     *
     * @param orgname the value for dbo.AA_Org.orgName
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setOrgname(String orgname) {
        this.orgname = orgname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.AA_Org.orgAdder
     *
     * @return the value of dbo.AA_Org.orgAdder
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getOrgadder() {
        return orgadder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.AA_Org.orgAdder
     *
     * @param orgadder the value for dbo.AA_Org.orgAdder
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setOrgadder(String orgadder) {
        this.orgadder = orgadder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.AA_Org.orgTel
     *
     * @return the value of dbo.AA_Org.orgTel
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getOrgtel() {
        return orgtel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.AA_Org.orgTel
     *
     * @param orgtel the value for dbo.AA_Org.orgTel
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setOrgtel(String orgtel) {
        this.orgtel = orgtel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.AA_Org.orgFax
     *
     * @return the value of dbo.AA_Org.orgFax
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getOrgfax() {
        return orgfax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.AA_Org.orgFax
     *
     * @param orgfax the value for dbo.AA_Org.orgFax
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setOrgfax(String orgfax) {
        this.orgfax = orgfax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.AA_Org.orgMoboile
     *
     * @return the value of dbo.AA_Org.orgMoboile
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getOrgmoboile() {
        return orgmoboile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.AA_Org.orgMoboile
     *
     * @param orgmoboile the value for dbo.AA_Org.orgMoboile
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setOrgmoboile(String orgmoboile) {
        this.orgmoboile = orgmoboile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.AA_Org.legal
     *
     * @return the value of dbo.AA_Org.legal
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getLegal() {
        return legal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.AA_Org.legal
     *
     * @param legal the value for dbo.AA_Org.legal
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setLegal(String legal) {
        this.legal = legal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.AA_Org.orgLongitude
     *
     * @return the value of dbo.AA_Org.orgLongitude
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public BigDecimal getOrglongitude() {
        return orglongitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.AA_Org.orgLongitude
     *
     * @param orglongitude the value for dbo.AA_Org.orgLongitude
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setOrglongitude(BigDecimal orglongitude) {
        this.orglongitude = orglongitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.AA_Org.orgLatitude
     *
     * @return the value of dbo.AA_Org.orgLatitude
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public BigDecimal getOrglatitude() {
        return orglatitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.AA_Org.orgLatitude
     *
     * @param orglatitude the value for dbo.AA_Org.orgLatitude
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setOrglatitude(BigDecimal orglatitude) {
        this.orglatitude = orglatitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.AA_Org.orgPostCode
     *
     * @return the value of dbo.AA_Org.orgPostCode
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getOrgpostcode() {
        return orgpostcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.AA_Org.orgPostCode
     *
     * @param orgpostcode the value for dbo.AA_Org.orgPostCode
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setOrgpostcode(String orgpostcode) {
        this.orgpostcode = orgpostcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.AA_Org.orgUrls
     *
     * @return the value of dbo.AA_Org.orgUrls
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getOrgurls() {
        return orgurls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.AA_Org.orgUrls
     *
     * @param orgurls the value for dbo.AA_Org.orgUrls
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setOrgurls(String orgurls) {
        this.orgurls = orgurls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.AA_Org.orgUrl
     *
     * @return the value of dbo.AA_Org.orgUrl
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getOrgurl() {
        return orgurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.AA_Org.orgUrl
     *
     * @param orgurl the value for dbo.AA_Org.orgUrl
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setOrgurl(String orgurl) {
        this.orgurl = orgurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.AA_Org.beginTimes
     *
     * @return the value of dbo.AA_Org.beginTimes
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public Date getBegintimes() {
        return begintimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.AA_Org.beginTimes
     *
     * @param begintimes the value for dbo.AA_Org.beginTimes
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setBegintimes(Date begintimes) {
        this.begintimes = begintimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.AA_Org.endTimes
     *
     * @return the value of dbo.AA_Org.endTimes
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public Date getEndtimes() {
        return endtimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.AA_Org.endTimes
     *
     * @param endtimes the value for dbo.AA_Org.endTimes
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setEndtimes(Date endtimes) {
        this.endtimes = endtimes;
    }

	public String getParentid() {
		return parentid;
	}

	public void setParentid(String parentid) {
		this.parentid = parentid;
	}

	public String getIsDel() {
		return isDel;
	}

	public void setIsDel(String isDel) {
		this.isDel = isDel;
	}

}