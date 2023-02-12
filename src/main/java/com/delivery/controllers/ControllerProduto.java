package com.delivery.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerProduto {
    @RequestMapping("/produto")
    public String form(){
        return "produto";
    }
}
