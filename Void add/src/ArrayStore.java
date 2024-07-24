import java.util.Scanner;
import java.util.Arrays;

public class ArrayStore {
    int arr[]=new int[10];
    int size=0;

    //Accept 10 integers and store them into the array
    public void acceptNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
            size++;
        }
    }

    //Display the elements of the array using while loop
    public void displayArray(){
        System.out.println("Display the elements of the array using while loop");
        int i=0;
        while(i<size){
            System.out.print(arr[i]+" ");
            i++;
        }
        System.out.println();
    }

    //Display the elements of the array using for loop
    public void printArray(){
//        System.out.println("Printing the elements of the array using for loop");
        int i=0;
        for(i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    //Sort the array
    public void sortArray(){
        Arrays.sort(arr);
    }

    //Accept a number and return the number of times it occurs in the array
    public int acceptNumber(int num){
        int count=0;
        for(int i=0;i<size;i++){
            if(arr[i]==num){
                count++;
            }
        }
        return count;
    }

    //Insert a number into the array at a specified position
    public void insertNumber(int number,int pos){
        //int pos=5;
        for(int i=size-1;i>=pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos-1]=number;
    }

    //return array that excludes duplicate elements in original array
    public int duplicateNumber(){
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if((arr[i]!=0) && (arr[j]!=0) && (arr[i]==arr[j])){
                    arr[j]=0;
                }
            }
        }
        for(int i=0;i<size;i++){
            if(arr[i]!=0){
                System.out.print(arr[i]+" ");
            }
        }
        return size;
    }

    public static void main(String[] args) {
        ArrayStore a=new ArrayStore();
        a.acceptNumber();
        a.displayArray();
        System.out.println("Printing the elements of the array using for loop");
        a.printArray();

        a.sortArray();
        System.out.println("Sorted the array: ");
        a.printArray();

        Scanner sc=new Scanner(System.in);
        System.out.print("Number of times it occurs in the array: ");
        int num=sc.nextInt();
        int count=a.acceptNumber(num);
        System.out.println("number of occurences of " + num + ": " + count);

        System.out.print("Number to be inserted into the array: ");
        int number=sc.nextInt();
        System.out.println("Enter the position to insert the number: ");
        int pos=sc.nextInt();
        System.out.println("Array after insertion: ");
        a.insertNumber(number,pos);
        a.printArray();

        System.out.println("After Duplication: ");
        a.duplicateNumber();
    }

}
