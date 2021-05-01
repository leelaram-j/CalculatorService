package com.practise.SpringBootDemo.controller;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    private long requestId;
    private Object op1;
    private Object op2;
    private String result;

    public long getRequestId() {
        return requestId;
    }

    public void setRequestId(long requestId) {
        this.requestId = requestId;
    }

    public Object getOp1() {
        return op1;
    }

    public void setOp1(Object op1) {
        this.op1 = op1;
    }

    public Object getOp2() {
        return op2;
    }

    public void setOp2(Object op2) {
        this.op2 = op2;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
