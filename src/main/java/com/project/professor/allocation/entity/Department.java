package com.project.professor.allocation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
public class Department {

	@JsonProperty(access = Access.READ_ONLY)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name", nullable = false, unique = true)
	private String name;

	@Column(name = "areaDepartment", nullable = false, unique = true)
	private String areaDepartment;

	public String getAreaDepartment() {
		return areaDepartment;
	}

	public void setAreaDepartment(String areaDepartment) {
		this.areaDepartment = areaDepartment;
	}

	public String getSiglaDepartment() {
		return siglaDepartment;
	}

	public void setSiglaDepartment(String siglaDepartment) {
		this.siglaDepartment = siglaDepartment;
	}

	@Column(name = "siglaDepartment", nullable = false, unique = true)
	private String siglaDepartment;

	public Department() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
}
