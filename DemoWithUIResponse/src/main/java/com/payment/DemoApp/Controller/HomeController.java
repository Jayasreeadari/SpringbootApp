package com.payment.DemoApp.Controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @RequestMapping("/responseEntityValue")
    public ResponseEntity<String> getDemoDataUsingResponseEntity(){
        HttpHeaders headers = new HttpHeaders();
        headers.add("type", "application/json");
        return new ResponseEntity<>("Success response",headers, HttpStatus.OK);
    }

    @RequestMapping("/responseString")
    public String getDemoDataUsingString(){

        return "Success";
    }

}
