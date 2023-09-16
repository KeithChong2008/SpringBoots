package com.hkjava.demo.democalculator.service;

import java.util.List;

public interface CalculatorService {

  List<String> getStrings();
  
  /**
   * 
   * @param x
   * @param y
   * @return
   */
  int add(int x, int y);

  /**
   * A method to substract x by y.
   * 
   * @param x - A int value
   * @param y - A int value
   * @return x - y
   */
  int substract(int x, int y);
}
