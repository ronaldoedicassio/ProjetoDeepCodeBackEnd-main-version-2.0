package com.project.professor.allocation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
public class Course {

	@JsonProperty(access = Access.READ_ONLY)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name", nullable = false, unique = true)
	private String name;

	@Column(name = "siglaCourse", nullable = false, unique = true)
	private String siglaCourse;

	@JsonProperty(access = Access.WRITE_ONLY)
	@Column(name = "department_id", nullable = false)
	private Long departmentId;

	@JsonProperty(access = Access.READ_ONLY)
	@ManyToOne
	@JoinColumn(name = "department_id", nullable = false, insertable = false, updatable = false)
	private Department department;

	public Course() {
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

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getSiglaCourse() {
		return siglaCourse;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public void setSiglaCourse(String siglaCourse) {
		this.siglaCourse = siglaCourse;
	}

}
