package com.hospital.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;



@Entity
@Table(name="doctors")
public class Doctor {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	
	@NotEmpty(message = "Enter name")
	@Column(name = "first_name", length = 50, nullable = false)
	private String firstName;
	
	@NotEmpty(message = "Enter lastname")
	@Column(name = "last_name", length = 50, nullable = false)
	private String lastName;
	
	@NotEmpty(message = "Enter dni")
	@Size(min = 8, max = 8)
	@Column(name = "dni", length = 8, nullable = false)
	private String dni;
	
	@ManyToOne
	@JoinColumn(name="specialty_id")
	private Specialty specialty;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Specialty getSpecialty() {
		return specialty;
	}

	public void setSpecialty(Specialty specialty) {
		this.specialty = specialty;
	}


}
