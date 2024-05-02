package com.bcopstein.sistvendas.interfaceAdaptadora;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/Controller")
    public String tester(){
        String msg = "oioioioioioioioiooioi";
        return msg;
    }
}
