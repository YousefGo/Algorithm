/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.week1;

/**
 *
 * @author mobai
 */
public class BTS {

    public static int BinarySearch(int list[], int key, int high, int low) {
        int mid =( high +low ) /2; 
        while (high>=low){
            
        if (list[mid]==key){
        return mid ;
        }
        else if (list[mid]>key){
        high = mid-1 ; 
           mid =( high +low ) /2;
        }
        else if (list[mid]<key){
        low = mid +1 ;
           mid =( high +low ) /2;
        }
           
        }
        
                
               
        /*
        int max = val1 >= val2 ? val1 : val2;
        */
       return -1 ; 
    }



public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5, 6, 7, 8, 11, 13};
        System.out.println(BinarySearch(arr, 8,  arr.length - 1,0));

    }
}
