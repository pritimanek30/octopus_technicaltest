package com.octopusgroup.loadproperty;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperty {

    //This will set the project path from user directory
    String projectPath = System.getProperty("user.dir");

    //Creating objects
    static Properties prop;
    static FileInputStream input;

    ////Assign value of key from .config file to parameter "String key"
    public String getProperty(String key) {

        //Initialize the object
        prop = new Properties();

        //Catch any exception thrown
        try {
            input = new FileInputStream(projectPath + "\\src\\test\\java\\com\\octopusgroup\\resources\\properties\\config.properties");
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}
