package com.southwind.controller;


import com.southwind.entity.Student;
import com.southwind.feign.FeignPeoviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/feign")
public class FeignHandler {

    @Autowired
    private FeignPeoviderClient feignPeoviderClient;

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return feignPeoviderClient.findAll();
    }

    @GetMapping("/index")
    public String index() {
        return feignPeoviderClient.index();
    }

}
