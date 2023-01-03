package com.peterszarvas94.spring.basics.springin10steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

  @Autowired
  private SorthAlgorithm sortAlgorithm;

  // * two ways to inject dependencies:

  // * constructor injection - old method for mandatory dependencies:
  // public BinarySearchImpl(SorthAlgorithm sortAlgorithm) {
  //   super();
  //   this.sortAlgorithm = sortAlgorithm;
  // }

  // * setter injection (default behaviour) - old method for optional dependencies:
  // public void setSortAlgorithm(SorthAlgorithm sortAlgorithm) {
  //   this.sortAlgorithm = sortAlgorithm;
  // }

  public int binarySearch(int[] numbers, int numberToSearchFor) {

    System.out.printf("[OUTPUT] sortAlgorithm: %s%n", sortAlgorithm);

    return 3;
  }
}
