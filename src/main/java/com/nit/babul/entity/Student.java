package com.nit.babul.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="student")
public class Student {
	
	@Id
	@Column(name="id")
	 private int id;
	@Column(name="name")
	 private String name;
	@Column(name="subject")
	 private String sub;
	@Column(name="father_name")
	 private String father;
	

}
