package com.peterszarvas94.spring.basics.springin10steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SorthAlgorithm {
  public int[] sort(int[] numbers) {
    // Logic for Quick Sort
    return numbers;
  }
}
