package com.wasim.main.entity;

//import org.hibernate.validator.constraints.Length;

//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import jakarta.validation.constraints.NotBlank;
@Entity
@Table(name = "student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	//@Column(nullable = false)
	//@NotBlank(message = "Enter your name")
	private String name;
	
	//@Column(nullable = false)
	//@NotBlank(message = "Enter your email")
	private String email;
	
	//@Column(nullable = true)
	//@Length(min = 4, message = "Phone must be at least 4 characters")
	private String phone;
	
	//@Column(nullable = false)
	//@NotBlank(message = "Enter your User Name")
	//@Length(min = 4, message = "User Name must be at least 4 characters")
	private String userName;
	
	//@Column(nullable = false)
	//@NotBlank(message = "Enter your Password")
	//@Length(min = 4, message = "Password must be at least 4 characters")
	private String password;

	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(long id, String name, String email, String phone, String userName, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.userName = userName;
		this.password = password;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", userName="
				+ userName + ", password=" + password + "]";
	}

}
