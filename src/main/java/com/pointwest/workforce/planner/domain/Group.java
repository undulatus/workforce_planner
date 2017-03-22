package com.pointwest.workforce.planner.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Group {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="group_id")
	private int groupId;
	
	@Column(name="group_name")
	private String groupName;
	
}
