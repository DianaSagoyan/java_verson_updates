package com.cydeo.java10;

import java.util.Arrays;

public class LocalVariableTypeDemo {
    public static void main(String[] args) {
      var str = "Cydeo";

      byte x = 10;
      var y = 1; //integer

      var price = 12.50;

      var numbers = Arrays.asList(3, 4, 5, 6);

      var sum = 0;
      for(var each: numbers){
          sum += each;
      }
    }
}
