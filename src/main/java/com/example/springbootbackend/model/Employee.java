package com.example.springbootbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "firstName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "email")
	private String email;

	@Column(name = "jobTitle")
	private String jobTitle;

	@Column(name = "salary")
	private double salary;

	public Employee() {

	}

	public Employee(String firstName, String lastName, String email, String jobTitle, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(final String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(final double salary) {
		this.salary = salary;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) { return true; }
		if (o == null || getClass() != o.getClass()) { return false; }
		final Employee employee = (Employee) o;
		return id == employee.id &&
				Double.compare(employee.salary, salary) == 0 &&
				Objects.equals(firstName, employee.firstName) &&
				Objects.equals(lastName, employee.lastName) &&
				Objects.equals(email, employee.email) &&
				Objects.equals(jobTitle, employee.jobTitle);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, firstName, lastName, email, jobTitle, salary);
	}
}
