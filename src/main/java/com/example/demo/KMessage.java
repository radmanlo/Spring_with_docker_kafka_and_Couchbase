package com.example.demo;

import java.time.LocalDate;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(of = {"id", "message", "message"})
public class KMessage {
	
	private String message;
	private String id = UUID.randomUUID().toString();
	private LocalDate messageDate = LocalDate.now();
	
}
