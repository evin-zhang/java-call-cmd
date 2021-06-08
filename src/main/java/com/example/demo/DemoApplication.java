package com.example.demo;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Level;
import java.util.logging.Logger;

//@SpringBootApplication
public class DemoApplication {
    public static Logger log = Logger.getLogger(DemoApplication.class.toString());
    public static void main(String[] args) {

        try {
            for(int i=0;i<10;i++){
               Process pr =  Runtime.getRuntime().exec("cmd /C start C:\\sandbox\\pyTest\\build.bat");
               Thread.sleep(3000);

            }
        }catch(Exception e){
            log.log(Level.SEVERE,e.getMessage());
        }
    }

}
