//To perform binary search algorithm

public class binarySearch{

    //returns searching element when it is present in array
    int search(int[] arr, int num){
        int left = 0, right = arr.length-1;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            //check if number present at mid, it will return the mid value
            if (arr[mid] == num)
                return mid;

            //check if number is greater than mid, then ignore the left half
            if (arr[mid] < num)
                left = mid + 1;

            //check if number is smaller than mid, then ignore right half
            else
                right = mid - 1;
        }
        //it returns -1 when number will not present in array
        return -1;
    }

    public static void main(String[] args){
        binarySearch obj = new binarySearch();
        int arr[] = {2, 3, 10, 30, 40};
        int num = 30;

        //to print result
        int result = obj.search(arr, num);
        if(result == -1)
            System.out.println("Element is not present in array");

        else
            System.out.println(num + " is present at index number: " + result);
    }
}


//Time complexity = O(logn)