// 704 binary search question on leetcode solved using the iterative approach
// recursive tc and sc o(logn)

// class BinarySearch { 
//     // Returns index of x if it is present in arr[l.. r], else return -1 
//     int binarySearch(int arr[], int l, int r, int x) 
//     { 
//         //Write your code here
//         int midIndex = l+((r-l)/2);
//         int middleElement = arr[midIndex];
//         if(r>=l){
//             if(x==middleElement) return midIndex;
//             if(x<middleElement)
//             {
//                 return binarySearch(arr, l, midIndex-1, x);
//             }
//             if(x>middleElement){
//                 return binarySearch(arr, midIndex+1, r, x);
//             }
//         }
        
        
//         return -1;
//     } 
  
//     // Driver method to test above 
//     public static void main(String args[]) 
//     { 
//         BinarySearch ob = new BinarySearch(); 
//         int arr[] = { 2, 3, 4, 10, 40 }; 
//         int n = arr.length; 
//         int x = 10; 
//         int result = ob.binarySearch(arr, 0, n - 1, x); 
//         if (result == -1) 
//             System.out.println("Element not present"); 
//         else
//             System.out.println("Element found at index " + result); 
//     } 
// } 


// iterative solution
// tc o(1)
//sc o(1)
class BinarySearch { 
    // Returns index of x if it is present in arr[l.. r], else return -1 
    int binarySearch(int arr[], int l, int r, int x) 
    { 
        //Write your code here
        
        
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==x){
                return mid;
            }
            if(arr[mid]>x){
                r=mid-1;
            }
            if(arr[mid]<x){
                l=mid+1;
            }
        }
        return -1;
    } 
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int n = arr.length; 
        int x = 10; 
        int result = ob.binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 
} 
