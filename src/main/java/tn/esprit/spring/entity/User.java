package tn.esprit.spring.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class User {

	@Column(name="Firstname")
	private String fistname;
	@Column(name="Lastname")
	private String lastname;
	
	
	@Enumerated(EnumType.STRING)
	private Role role;
	@Temporal(TemporalType.DATE)

	private Date date;
	
	
	
	public enum Role{ 
		CHEF_DEPARTEMENT, ADMINISTRATEUR, INGENIEUR, TECHNICIEN } 

}
