package com.sameh.app.java.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private int id;
	@Column(name = "first_Name")
	private String firstName;
	@Column(name = "last_Name")
	private String lastName;
	@Column(name = "personal_Email")
	private String personalEmail;
	@Column(name = "work_Email")
	private String workEmail;
	@Column(name = "phone_Number")
	private String phoneNumber;
	@Column(name = "hire_Date")
	private Date hireDate;
	@Column(name = "salary")
	private float salary;
	@Column(name = "commission")
	private float commission;
	
	
	public Employee(int id, String firstName, String lastName, String personalEmail, String workEmail,
			String phoneNumber, Date hireDate, float salary, float commission) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.personalEmail = personalEmail;
		this.workEmail = workEmail;
		this.phoneNumber = phoneNumber;
		this.hireDate = hireDate;
		this.salary = salary;
		this.commission = commission;
	}
	public Employee() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public String getPersonalEmail() {
		return personalEmail;
	}
	public void setPersonalEmail(String personalEmail) {
		this.personalEmail = personalEmail;
	}
	public String getWorkEmail() {
		return workEmail;
	}
	public void setWorkEmail(String workEmail) {
		this.workEmail = workEmail;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float getCommission() {
		return commission;
	}
	public void setCommission(float commission) {
		this.commission = commission;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", personalEmail="
				+ personalEmail + ", workEmail=" + workEmail + ", phoneNumber=" + phoneNumber + ", hireDate=" + hireDate
				+ ", salary=" + salary + ", commission=" + commission + "]";
	}
	
	
	
}
