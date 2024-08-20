/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erp.ui;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author wvgarcia
 */
@ManagedBean(name = "loginBean")
@SessionScoped
public class LoginBean {
    
    private static final Logger logger = LoggerFactory.getLogger(LoginBean.class);

    private String username;
    private String password;
    private boolean loggedIn;

    public String login() {

        if (username != null && username.equals("admin") && password != null && password.equals("admin")) {
            loggedIn = true;
            System.out.println("login exitoso.");
            logger.info("se ha iniciado sesion correctamente");
            return "dashboard?faces-redirect=true";
        } else {
            loggedIn = false;
            System.out.println("fallo en login.");
            logger.debug("Error en realizar inicio de session.");
            return "login?faces-redirect=true";
        }
    }

    public String logout() {
        username = null;
        password = null;
        loggedIn = false;
        return "login?faces-redirect=true";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }
}
