package com.sameh.app.java.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usersTest")
public class UserTest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "Name")
	private String name;
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "address_id", referencedColumnName = "id")
	private AddressTest address;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AddressTest getAddress() {
		return address;
	}
	public void setAddress(AddressTest address) {
		this.address = address;
	}

	
	@Override
	public String toString() {
		return "UserTest [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}
