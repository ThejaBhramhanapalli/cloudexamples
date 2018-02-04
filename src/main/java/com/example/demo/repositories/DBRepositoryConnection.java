package com.example.demo.repositories;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DBRepositoryConnection {
	
	private final JdbcTemplate jdbcTemplate;
	
	public DBRepositoryConnection(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate =jdbcTemplate;
	}
}
