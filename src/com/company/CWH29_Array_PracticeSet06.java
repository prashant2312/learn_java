package com.company;

import java.util.Scanner;

public class CWH29_Array_PracticeSet06 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
//        int i,j=0,n;
//        n=sc.nextInt();
//        float [] arr = new float[n];
//        System.out.println("Enter element in array");
//        for (i=0;i<n;i++){
//            arr[i]=sc.nextFloat();
//        }
//        float sum=0;
//        for(i=0;i<n;i++)
//        {
//            sum=sum+arr[i];
//        }
//        System.out.println(sum);


//        int number=sc.nextInt();
//        int a[]={1,2,3,4,5,6,7,8,9,10};
//
//        for(int i=0;i<a.length;i++){
//            if(a[i]==number){
//                System.out.println("Number found");
//                break;
//            }
//            else{
//                System.out.println("Number not found");
//                break;
//            }
//        }



//        int [] student_marks={80,80,80,80,80};
//        float avg;
//        float total=0;
//        for(int i=0;i<student_marks.length;i++){
//            total+=student_marks[i];
//        }
//        System.out.println(total/5f);


//        int [][] a=new int[2][3];
//        int [][] b=new int[2][3];
//        int [][]c=new int[2][3];
//        int i,j,k;
//
//        for(i=0;i<2;i++){
//            for(j=0;j<3;j++){
//                a[i][j]=sc.nextInt();
//            }
//        }
//        System.out.println("Another array");
//        for(i=0;i<2;i++){
//            for(j=0;j<3;j++){
//                b[i][j]=sc.nextInt();
//            }
//        }
//
//        for(i=0;i<a.length;i++){
//            for (j=0;j<a[i].length;j++){
//                c[i][j]=a[i][j]+b[i][j];
//                System.out.print(c[i][j]+"\t");
//            }
//            System.out.println();
//        }


//        int []a={1,2,3,4,5,6,7};
//        int c,j,i;
//        int []b=new int[7];
//        int n=a.length-1;
//    for (i=0;i<a.length;i++){
//        b[i]=a[n];
//        n--;
//    }
//    for (i=0;i<a.length;i++)
//    {
//        System.out.println(b[i]);
//    }



//        int [] a={11,22,41,11,23,44,12,75};
//        int max = 0,i,j,temp=0;
//        for (i=0;i<a.length;i++)
//        {
//            for(j=i+1;j<a.length-1;j++)
//            {
//                if(a[i]>a[j]){
//                    temp=a[i];
//                    a[i]=a[j];
//                    a[j]=temp;
//                }
//            }
//        }
//        for(i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }
//max=a[a.length-1];
//        System.out.println(max);

        int a[][]={{1,1,1},{2,2,2},{3,3,3}};
        int b[][]={{1,1,1},{2,2,2},{3,3,3}};

//creating another matrix to store the multiplication of two matrices
        int c[][]=new int[3][3];  //3 rows and 3 columns

//multiplying and printing multiplication of 2 matrices
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }//end of k loop
                System.out.print(c[i][j]+" ");  //printing matrix element
            }//end of j loop
            System.out.println();//new line
        }



    }
}
