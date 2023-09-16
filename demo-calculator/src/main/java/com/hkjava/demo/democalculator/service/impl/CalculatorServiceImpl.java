package com.hkjava.demo.democalculator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.hkjava.demo.democalculator.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {

  @Autowired
  @Qualifier(value = "arraylist")
  private List<String> strings;

  @Override
  public List<String> getStrings() {
    return this.strings;
  }

  @Override
  public int add(int x, int y) {
    return x + y;
  }

  @Override
  public int substract(int x, int y) {
    return x - y;
  }
}
