"use strict";

mergeSort([10,3,7,16,2,15]);


function mergeSort(arrayToSort) {
  const helperArray = arrayToSort.length();
  mergeSortHelper(array, helper, 0, helperArray.length-1);
}

function mergeSortHelper(array, helper, low, high) {
  if (low < high) {
    const middle = low + high / 2;
    mergeSortHelper(array, helper, low, middle);
    mergeSortHelper(array, helper, middle+1, high);
    merge(array, helper, low, middl, high);
  }
}

function merge(array, helper, low, middle, high) {
  for (let i = low; i <= high; i++) {
    helper[i] = array[i];
  }

  let helperLeft = low;
  let helperRight = middle + 1;
  let current = low;

  while (helperLeft <= middle && helperRight <= high) {
    if (helper[helperLeft] <= helper[helperRight]) {
      array[current] = helper[helperLeft];
      helperLeft++;
    } else {
      array[current] = helper[helperRight];
      helperRight++;
    }
    current++;
  }

  let remaining = middle - helperLeft;
  for (let i = 0; i <= remaining; i++) {
    array[current + 1] = helper[helperLeft + 1];
  }
}