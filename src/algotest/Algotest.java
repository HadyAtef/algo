/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algotest;

/**
 *
 * @author Hady cwarzma
 */
public class Algotest {

    public static void main(String[] args) {
    int x[] ={1,5,2,1,4,0};
    int R[] =new int[6];
    int L[] =new int[6];
       Algotest S=new Algotest();
       FGetArr A= new FGetArr();
        A.GetArr(x,R,L);
        A.InsertionSort(R);
        A.InsertionSort(L);    
        int intersections =A.GetIntersection(L, R);
        System.out.println("the intersections = "+intersections);
       for(int i=0;i<x.length;i++)
       {
           System.out.println(R[i]);
       }
       
    }
}

