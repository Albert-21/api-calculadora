/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.calculadora.model;

/**
 *
 * @author alberto
 */
public class Numeros {
    private long num1;
    private long num2;
    private long result;

    public Numeros(long num1, long num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public long getNum1() {
        return num1;
    }

    public void setNum1(long num1) {
        this.num1 = num1;
    }

    public long getNum2() {
        return num2;
    }

    public void setNum2(long num2) {
        this.num2 = num2;
    }
    
     public long getResult() {
        return result = this.num1 + this.num2;
    }
    
    
}
