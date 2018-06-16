package com.gmr.vote.contorller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class test {
    @RequestMapping(value = "/test")
    public String asd() {
        return "sfdghr";
    }
}
