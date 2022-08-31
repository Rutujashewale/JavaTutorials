class ArrayCopyDriver{
  public static void main(String[] args) {
    ArrayOperation ao = new ArrayOperation();
    int[] arr1 = {10, 12, 15, 19, 25};

    // pass array to method
    int[] arr2 = ao.copyArray(arr1);

    //displaying first array elements
    System.out.println("First array elements:");
    // passing array to display method
    ao.displayArray(arr1);

    //displaying Second array elements
    System.out.println("\nSecond array elements:");
    // passing array to display method
    ao.displayArray(arr2);
  }
}