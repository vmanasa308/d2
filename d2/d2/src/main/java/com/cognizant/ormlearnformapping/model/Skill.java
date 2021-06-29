package com.cognizant.ormlearnformapping.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "skill")
@Table(name = "skill", schema = "ormlearn")
public class Skill {

	// day 2 handson 3 declaring the variables, annotions and creating repo's
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sk_id")
	private int id;

	@Column(name = "sk_name")
	private String name;

	// hand'son 6
	@ManyToMany(mappedBy = "skillList", fetch = FetchType.EAGER)
	private Set<Employee> employeeList;
}
