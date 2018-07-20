package algorithm;

public class BinarySearch {
    public int search(int[] arrays,int num){
        int mid = arrays.length/2;

        int start = 0;
        int end  = arrays.length;

        while(start<end){
            if(arrays[mid] == num) return mid;
            else if(arrays[mid] > num){
                end = mid-1;
            }else {
                start = mid+1;
            }
            mid = (end-start)/2+start;
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int index = binarySearch.search(nums,7);
        System.out.println(nums[index]);
    }
}
