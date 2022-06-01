https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1/?page=1&company[]=Flipkart&curated[]=1&sortBy=submissions#



class Solution {
    int MissingNumber(int array[], int n) {
       Arrays.sort(array);
       int k=0;
       for(int i=0;i<array.length;i++)
       {
           if(array[i]!=i+1)
           {
             k=i+1;
               break;
           }
       }
       if(k==0)
       return n;
       
       return k;
    }
}
