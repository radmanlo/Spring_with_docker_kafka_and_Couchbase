package com.example.demo.model;

import java.time.LocalDate;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@ToString
public class User {

	private int id;
	@JsonProperty
	private String name;
	@JsonProperty
	private LocalDate birthDate;
	private boolean vip;
	
}
