

package com.erp.srv.impl;

import com.erp.srv.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UsuarioServiceImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<String> selectAll() {
        String sql = "SELECT login FROM usuarios_sistemas";
        System.out.println("ingresa a realizar la query del sistema.");
        return jdbcTemplate.query(sql, (rs, rowNum) -> rs.getString("login"));
    }
}