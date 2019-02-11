/**
 * 
 */
package com.hk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Elephant
 *
 */

@RestController
@EnableAutoConfiguration
public class App {
    
    @RequestMapping("/")
    String home (){
        return "hello World,I'm Elephant";
    }
    
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
