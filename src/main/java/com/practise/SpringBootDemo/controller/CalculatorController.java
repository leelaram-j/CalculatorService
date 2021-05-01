package com.practise.SpringBootDemo.controller;

import com.practise.SpringBootDemo.dto.CalculatorInputDTO;
import com.practise.SpringBootDemo.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class CalculatorController {
    @Autowired
    Calculator calculator;

    AtomicLong al = new AtomicLong();

    @GetMapping("/add")
    public Calculator add(@RequestParam(value = "op1") Object op1, @RequestParam(value = "op2") Object op2) {
        calculator.setRequestId(al.incrementAndGet());
        calculator.setOp1(op1);
        calculator.setOp2(op2);
        if (CommonUtils.isString(op1) || CommonUtils.isString(op2)) {
            calculator.setResult("Please enter correct data type for operands");
        } else {
            String temp = String.valueOf(op1);
            String temp1 = String.valueOf(op2);
            if (temp.contains(".") || temp1.contains(".")) {
                float result = Float.valueOf(temp) + Float.valueOf(temp1);
                calculator.setResult(String.valueOf(result));
            } else {
                int result = Integer.valueOf(temp) + Integer.valueOf(temp1);
                calculator.setResult(String.valueOf(result));
            }
        }
        return calculator;
    }

    /*
    For path param we use it this way
    @GetMapping("/add/{value}")
    public Calculator(@PathVariable String value) {
    }
     */

    @PostMapping("/add")
    public Calculator add(@RequestBody CalculatorInputDTO calculatorInputDTO) {
        calculator.setRequestId(al.incrementAndGet());
        calculator.setOp1(calculatorInputDTO.getOp1());
        calculator.setOp2(calculatorInputDTO.getOp2());
        if (CommonUtils.isString(calculatorInputDTO.getOp1()) || CommonUtils.isString(calculatorInputDTO.getOp2())) {
            calculator.setResult("Please enter correct data type for operands");
        } else {
            String temp = String.valueOf(calculatorInputDTO.getOp1());
            String temp1 = String.valueOf(calculatorInputDTO.getOp2());
            if (temp.contains(".") || temp1.contains(".")) {
                float result = Float.valueOf(temp) + Float.valueOf(temp1);
                calculator.setResult(String.valueOf(result));
            } else {
                int result = Integer.valueOf(temp) + Integer.valueOf(temp1);
                calculator.setResult(String.valueOf(result));
            }
        }
        return calculator;
    }

    @PostMapping("/subtract")
    public Calculator subtract(@RequestBody CalculatorInputDTO calculatorInputDTO) {
        calculator.setRequestId(al.incrementAndGet());
        calculator.setOp1(calculatorInputDTO.getOp1());
        calculator.setOp2(calculatorInputDTO.getOp2());
        if (CommonUtils.isString(calculatorInputDTO.getOp1()) || CommonUtils.isString(calculatorInputDTO.getOp2())) {
            calculator.setResult("Please enter correct data type for operands");
        } else {
            String temp = String.valueOf(calculatorInputDTO.getOp1());
            String temp1 = String.valueOf(calculatorInputDTO.getOp2());
            if (temp.contains(".") || temp1.contains(".")) {
                float result = Float.valueOf(temp) - Float.valueOf(temp1);
                calculator.setResult(String.valueOf(result));
            } else {
                int result = Integer.valueOf(temp) - Integer.valueOf(temp1);
                calculator.setResult(String.valueOf(result));
            }
        }
        return calculator;
    }

    @PostMapping("/multiply")
    public Calculator multiply(@RequestBody CalculatorInputDTO calculatorInputDTO) {
        calculator.setRequestId(al.incrementAndGet());
        calculator.setOp1(calculatorInputDTO.getOp1());
        calculator.setOp2(calculatorInputDTO.getOp2());
        if (CommonUtils.isString(calculatorInputDTO.getOp1()) || CommonUtils.isString(calculatorInputDTO.getOp2())) {
            calculator.setResult("Please enter correct data type for operands");
        } else {
            String temp = String.valueOf(calculatorInputDTO.getOp1());
            String temp1 = String.valueOf(calculatorInputDTO.getOp2());
            if (temp.contains(".") || temp1.contains(".")) {
                float result = Float.valueOf(temp) * Float.valueOf(temp1);
                calculator.setResult(String.valueOf(result));
            } else {
                int result = Integer.valueOf(temp) * Integer.valueOf(temp1);
                calculator.setResult(String.valueOf(result));
            }
        }
        return calculator;
    }

    @PostMapping("/divide")
    public Calculator divide(@RequestBody CalculatorInputDTO calculatorInputDTO) {
        calculator.setRequestId(al.incrementAndGet());
        calculator.setOp1(calculatorInputDTO.getOp1());
        calculator.setOp2(calculatorInputDTO.getOp2());
        if (CommonUtils.isString(calculatorInputDTO.getOp1()) || CommonUtils.isString(calculatorInputDTO.getOp2())) {
            calculator.setResult("Please enter correct data type for operands");
        } else {
            String temp = String.valueOf(calculatorInputDTO.getOp1());
            String temp1 = String.valueOf(calculatorInputDTO.getOp2());
            if (temp.contains(".") || temp1.contains(".")) {
                float result = Float.valueOf(temp) / Float.valueOf(temp1);
                calculator.setResult(String.valueOf(result));
            } else {
                int result = Integer.valueOf(temp) / Integer.valueOf(temp1);
                calculator.setResult(String.valueOf(result));
            }
        }
        return calculator;
    }
}
