package com.molcon.securitydbexample.model;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="user")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private int id;
	@Column(name = "email")
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="name")
	private String name;
	@Column(name="last_name")
	private String lastName;
	@Column(name="active")
	private int active;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinTable(name	= "user_role", joinColumns = JoinColumn(name=))
	private Set<Role> roles;
	
}
