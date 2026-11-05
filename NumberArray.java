public class NumberArray {
    public static void main(String[] args) {
        int []arr = {4,12,5,8,9,3,1};
        int index = minValue(arr);
        System.out.println("so nho nhat trong mang do la:" + arr[index] );
        
    }
    public static int minValue(int[] array){
        int index = 0;
        for(int i = 1;i<array.length;i++){
            if(array[i] < array[index]){
                index = i;
            }
        }
        return index;
    }
}
