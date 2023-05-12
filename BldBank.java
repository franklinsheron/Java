package com.example.model;
import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "bloodbank")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString



public class BldBank 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "blood_group")
	private String bloodgroup;
	
	

}
