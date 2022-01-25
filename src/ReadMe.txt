convert this code into the menu-driven program:

// Simple operations that we perform on array

// insert value into the array
// traverse/print the array
// accessing particular element from the array
// search for the element in given array
// delete a particular value from the array
// delete the entire array

// Integer.MIN_VALUE = -2147483648
// Integer.MAX_VALUE = 2147483647
//
public class Sdarray {
  int arr[];
  // Array initialization using the constructor
  public Sdarray(int size)
  {
    arr = new int[size];
    for (int i = 0; i <arr.length ; i++)
    {
      arr[i] = Integer.MIN_VALUE;
    }
  }
  public void traverse()
  {
    // you can use any looping structrue ( either for loop or forEach loop or any other)

    // here i traverse the array by using the for each loop
    for (int res:arr) {
      System.out.println(res);
    }
  }
  // method to insert value in the array
  public void insert(int location, int value )
  {
    try
    {
      if(arr[location]== Integer.MIN_VALUE)
      {
        arr[location]= value;
      }
      else
      {
        System.out.println("already filled");
      }
    }catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("invalid index");
    }
  }
  // method to delete a particular index value from the array
  public void delete(int index) {
    int i = 0;
    try {
      for (i = index; i < arr.length - 1; i++)

        arr[i] = arr[i + 1];

      arr[i] = 0;
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("invalid index");
    }
  }
  // method to access a particular element from the array
  public void accessingCell(int index)
  {
    try
    {
      System.out.println(arr[index]);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("Invalid index");
    }
  }
  // search for the element in the given array
  // in this method i will pass value and find that value inside the array
  public void searchInAnArray(int searchvalue)
  {
    for (int i = 0; i <arr.length; i++) {
      if(arr[i] == searchvalue)
      {
        System.out.println("value found at inde= "+ i);
        return;
      }
    }
    System.out.println("value not found");
  }

  //Method to delete the entire array
  public void deleteArray()
  {
    // array are considered as reference data type in java programming language
    // to delet the array i am initializing it with null value
    arr = null;
    System.out.println("Array Deleted");
  }
  }
class Check
{
  public static void main(String[] args) {
    Sdarray obj = new Sdarray(5);
    obj.traverse();
    obj.delete(2);
    System.out.println("after delete");
    obj.traverse();
    // call various method as per need

  }
}