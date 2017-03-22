package com.pointwest.workforce.planner.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Practice {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="practice_id")
	private int practiceId;
	
	@Column(name="practice_name")
	private String practiceName;
	
}
