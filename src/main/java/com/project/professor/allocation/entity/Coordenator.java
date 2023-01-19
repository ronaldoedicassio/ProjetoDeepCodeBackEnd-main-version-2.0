package com.project.professor.allocation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Coordenator extends Professor {
	
	@Id
	private long id;
	
	@Column(name = "name", nullable = false, unique=true)
	private String name;

}
