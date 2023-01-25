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
public class Coordenator extends Professor {

	@JsonProperty(access = Access.READ_ONLY)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@JsonProperty(access = Access.WRITE_ONLY)
	@Column(name = "coursedCoordenated_id", nullable = false)
	private Long coursedCoordenatedId;

	@JsonProperty(access = Access.READ_ONLY)
	@ManyToOne
	@JoinColumn(name = "coursedCoordenated_id", nullable = false, insertable = false, updatable = false)
	private Course coursedCoordenated;

	public Coordenator(String name, String cpf, Department department, Course course) {
		super(name, cpf, department);
		this.coursedCoordenated = course;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCoursedCoordenatedId() {
		return coursedCoordenatedId;
	}

	public void setCoursedCoordenatedId(Long coursedCoordenatedId) {
		this.coursedCoordenatedId = coursedCoordenatedId;
	}

	public Course getCoursedCoordenated() {
		return coursedCoordenated;
	}

	public void setCoursedCoordenated(Course coursedCoordenated) {
		this.coursedCoordenated = coursedCoordenated;
	}

	@Override
	public String toString() {
		return "Coordenator [id=" + id + ", coursedCoordenatedId=" + coursedCoordenatedId + ", coursedCoordenated="
				+ coursedCoordenated + ", getName()=" + getName() + "]";
	}

}
