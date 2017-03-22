package com.pointwest.workforce.planner.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PayLevel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="pay_level_id")
	private int payLevelId;
	
	@Column(name="pay_level_name")
	private String payLevelName;
	
}
