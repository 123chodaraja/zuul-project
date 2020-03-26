package com.wipro.doctorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DoctorServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DoctorServiceApplication.class, args);
    }

    @GetMapping("/doctor/{doctorName}")
    public String callDoctor(@PathVariable String doctorName) {
        return "welcome doctor " + doctorName;
    }

    @GetMapping("/doctor/bye/{doctorName}")
    public String goodbye(@PathVariable String doctorName) {
        return "have a good day " + doctorName;
    }

}
