/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.calculadora.controller;

import com.api.calculadora.model.Numeros;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author alberto
 */
@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class SumaController {
    @PostMapping("/suma")
    public long Suma(@Validated @RequestBody Numeros numeros){
        return numeros.getNum1()+ numeros.getNum2();
    }
}
