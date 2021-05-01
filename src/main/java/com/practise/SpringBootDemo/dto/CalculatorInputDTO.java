package com.practise.SpringBootDemo.dto;

import org.springframework.stereotype.Component;

@Component
public class CalculatorInputDTO {
    String op1;
    String op2;

    public String getOp1() {
        return op1;
    }

    public void setOp1(String op1) {
        this.op1 = op1;
    }

    public String getOp2() {
        return op2;
    }

    public void setOp2(String op2) {
        this.op2 = op2;
    }
}
