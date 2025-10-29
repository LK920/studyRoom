package algorithm_theory.binarySearch;

public class Ex02_BinarySearchAdvance {
    public static void main(String[] args){
        int[] arr = {1,3,5,7,9,10};
        int target = 7;
        int first = lowerBound(arr, target);
        System.out.println("특정 값보다 크거나 같은 첫 번째 값 : " + first);
        int first2 = upperBound(arr, target);
        System.out.println("특정 값보다 큰 첫 번째 값 : " + first2);
    }
    // 특정 값보다 크거나 같은 첫 번째 값 찾기
    public static int lowerBound(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            int mid = (left + right) /2;
            if(arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return left;
    }

    public static int upperBound(int[] arr, int target){
        int left = 0;
        int right = arr.length;

        while(left < right){
            int mid = (left + right) / 2;
            System.out.println("mid : " + mid + ", arr[mid] : " + arr[mid]);
            if(arr[mid] < target){
                System.out.println("left : " + left + ", right : " + right);
                left = mid + 1;
            }else{
                System.out.println("left : " + left + ", right : " + right);
                right = mid;
            }
        }
        return left;
    }
}
