package ru.otus.projava.hw1.gradle;

import com.google.common.base.Splitter;
import java.util.ArrayList;
import java.util.List;

public class HelloOtus {
  public static void main(String[] args) {
    List<String> strings = new ArrayList<>();
    Splitter.on(',')
        .trimResults()
        .omitEmptyStrings()
        .split("Welcome , to, Paradise!")
         .forEach(strings::add);
    System.out.println(strings);
  }
}
