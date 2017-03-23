package com.pointwest.workforce.planner.domain;

import java.sql.Timestamp;
import java.util.List;

public class Opportunity {
	
	private int opportunityId;
	
	private String opportunityName;
	
	private MarketCircle marketCircle;
	
	private ServiceLine serviceLine;
	
	private String durationGranularity;
	
	private double durationInWeeks;
	
	private double durationInMonths;
	
	private Timestamp projectStartDate;
	
	private String projectStatus;
	
	private String documentStatus;
	
	private String clientName;
	
	private String projectSite;
	
	private String projectAlias;
	
	private List<Activity> activities;

	public int getOpportunityId() {
		return opportunityId;
	}

	public void setOpportunityId(int opportunityId) {
		this.opportunityId = opportunityId;
	}

	public String getOpportunityName() {
		return opportunityName;
	}

	public void setOpportunityName(String opportunityName) {
		this.opportunityName = opportunityName;
	}

	public MarketCircle getMarketCircle() {
		return marketCircle;
	}

	public void setMarketCircle(MarketCircle marketCircle) {
		this.marketCircle = marketCircle;
	}

	public ServiceLine getServiceLine() {
		return serviceLine;
	}

	public void setServiceLine(ServiceLine serviceLine) {
		this.serviceLine = serviceLine;
	}

	public String getDurationGranularity() {
		return durationGranularity;
	}

	public void setDurationGranularity(String durationGranularity) {
		this.durationGranularity = durationGranularity;
	}

	public double getDurationInWeeks() {
		return durationInWeeks;
	}

	public void setDurationInWeeks(double durationInWeeks) {
		this.durationInWeeks = durationInWeeks;
	}

	public double getDurationInMonths() {
		return durationInMonths;
	}

	public void setDurationInMonths(double durationInMonths) {
		this.durationInMonths = durationInMonths;
	}

	public Timestamp getProjectStartDate() {
		return projectStartDate;
	}

	public void setProjectStartDate(Timestamp projectStartDate) {
		this.projectStartDate = projectStartDate;
	}

	public String getProjectStatus() {
		return projectStatus;
	}

	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}

	public String getDocumentStatus() {
		return documentStatus;
	}

	public void setDocumentStatus(String documentStatus) {
		this.documentStatus = documentStatus;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getProjectSite() {
		return projectSite;
	}

	public void setProjectSite(String projectSite) {
		this.projectSite = projectSite;
	}

	public String getProjectAlias() {
		return projectAlias;
	}

	public void setProjectAlias(String projectAlias) {
		this.projectAlias = projectAlias;
	}

	public List<Activity> getActivities() {
		return activities;
	}

	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}


}
