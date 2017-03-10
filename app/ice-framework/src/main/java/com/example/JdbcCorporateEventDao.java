package com.example;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import lombok.Data;
@Data
public class JdbcCorporateEventDao {
	private DataSource  dataSource;
    private JdbcTemplate jdbcTemplate;
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    public int getRowCount(String sql){
    	return this.jdbcTemplate.queryForObject(sql, Integer.class);
    }
    
    public List<Map<String,Object>> queryForList(String sql,Object... args){
    	return this.jdbcTemplate.queryForList(sql,args);
    }
    
}
