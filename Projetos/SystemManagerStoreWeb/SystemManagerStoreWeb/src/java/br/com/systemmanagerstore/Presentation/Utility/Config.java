/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.systemmanagerstore.Presentation.Utility;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author ARLEY
 */
@Named(value = "config")
@SessionScoped
public class Config implements Serializable {

    /**
     * Creates a new instance of Config
     */
    
    public static String urlBase = "http://localhost:8080/SystemManagerStoreWeb/";
    
    public Config() {
    }
    
    public String urlBase(){
       return Config.urlBase;
    }
}
