package com.peterszarvas94.spring.basics.springin10steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

  private SorthAlgorithm sortAlgorithm;

  @Autowired
  public BinarySearchImpl(SorthAlgorithm sortAlgorithm) {
    super();
    this.sortAlgorithm = sortAlgorithm;
  }

  public int binarySearch(int[] numbers, int numberToSearchFor) {

    System.out.println(sortAlgorithm);

    return 3;
  }
}
