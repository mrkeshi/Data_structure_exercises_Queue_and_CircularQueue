public class BubbleSort {

    public static int[] sort(int[] A){
        for (int i=0;i<A.length-1;i++){
            for (int j=0;j< A.length-i-1;j++){
                if (A[j]>A[j+1]){
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
        return A;
    }
    public static void print(int[] A){
        for (int x:sort(A)){
            System.out.println(x);
        }
    }
    public static void main(String[] args){

        print(new int[]{2, 4, 5, 6, 7});
    }
}
