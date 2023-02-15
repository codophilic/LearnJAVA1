

public class Array{

    public static void main(String args[]){

        //Single Dim Array will have same datatype values

        // Default value of an integer array when initilizate is always zero

        int arr[]={1,2,3,4}; //Declaring using values

        int arr1[] = new int[4] ;//Declaring array using size

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            arr1[i]=arr[i];
        }

        // Multi-Dim Array

        int mularr[][] = new int[3][4];

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                mularr[i][j] =(int)(Math.random() * 100);
                System.out.print(mularr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        for(int r[]: mularr){
            for(int c: r){
                System.out.print(c+" ");
            }
            System.out.println();
        }

        // Jagged Arrays We can have defined rows and undefined columns

        int jag[][] = new int[3][];

        // We cannot have undefined rows and undefined columns
    }
}