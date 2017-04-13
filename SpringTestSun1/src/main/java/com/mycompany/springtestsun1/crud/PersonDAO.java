/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springtestsun1.crud;

import com.mycompany.springtestsun1.entity.Person;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.stereotype.Component;

/**
 *
 * @author shibo
 */
@Component("test")
public class PersonDAO {

    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    @Autowired
    public void setTemplate(DataSource template) {
        this.template = new JdbcTemplate(template);
    }

    public List<Person> getPerson() {

        return template.query("select * from Person  ", new RowMapper<Person>() {

            @Override
            public Person mapRow(ResultSet rs, int i) throws SQLException {
                Person p = new Person();
                p.setId(rs.getInt("id"));
                p.setEmail(rs.getString("email"));
                p.setPassword(rs.getString("password"));
                p.setUsername(rs.getString("username"));
                return p;
            }
        });

    }

    public boolean delete(int id) {

        return template.update("delete from Person where id = '" + id + "'  ") == 1;

    }

    public boolean add(Person p) {
        System.out.println(""+p);
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(p);
        return template.update("insert into Person (id,email,username,password) values (9,'fhfhf','jhjh','htyt')") == 1;

    }
}
