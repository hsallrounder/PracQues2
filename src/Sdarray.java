// Simple operations that we perform on array

// insert value into the array
// traverse/print the array
// accessing particular element from the array
// search for the element in given array
// delete a particular value from the array
// delete the entire array

import java.util.Scanner;

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
                System.out.println("value found at index = "+ i);
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
        Sdarray obj = null;
        // call various method as per need
        Scanner sc= new Scanner(System.in);
        int v=1;
        while(v!=0){
            System.out.println("\nWelcome to the Array Menu");
            System.out.println("1 - To initialize array.");
            System.out.println("2 - To insert value in the array.");
            System.out.println("3 - To print the array.");
            System.out.println("4 - To access a particular element from the array.");
            System.out.println("5 - To search for the element in the given array.");
            System.out.println("6 - To delete a particular index value from the array.");
            System.out.println("7 - To delete the array.");
            System.out.println("0 - To Exit the Menu.");
            System.out.print("Enter your choice: ");
            v=sc.nextInt();

            switch (v){
                case 1 -> {
                    System.out.println("\nEnter the size of array.");
                    obj=new Sdarray(sc.nextInt());
                    System.out.println("Array has been initialized.");
                }
                case 2 -> {
                    System.out.print("\nEnter the value you want to insert: ");
                    int val=sc.nextInt();
                    System.out.print("Enter the index at which you wish to insert: ");
                    int i=sc.nextInt();
                    obj.insert(i,val);
                    System.out.println("\nValue has been inserted in the desired location.");
                }
                case 3 -> {
                    System.out.println("\nDisplaying the array:");
                    obj.traverse();
                }
                case 4 -> {
                    System.out.print("\nEnter the index you want to access: ");
                    int i=sc.nextInt();
                    obj.accessingCell(i);
                }
                case 5 -> {
                    System.out.print("\nEnter the value you want to search: ");
                    int val=sc.nextInt();
                    obj.searchInAnArray(val);
                }
                case 6 -> {
                    System.out.print("\nEnter the index of value you want to delete: ");
                    int i=sc.nextInt();
                    obj.delete(i);
                    System.out.println("\nAfter delete");
                    obj.traverse();
                }
                case 7 -> {
                    obj.deleteArray();
                }
            }
        }
        sc.close();
    }
}