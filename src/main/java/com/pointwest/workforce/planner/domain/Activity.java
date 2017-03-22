package com.pointwest.workforce.planner.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Activity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="activity_id")
	private int activityId;
	
	@Column(name="activity_name")
	private String activityName;
	
	@Column(name="is_custom")
	private boolean isCustom;
	
	
}
