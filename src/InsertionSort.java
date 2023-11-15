public class InsertionSort {
    public static int[] sort(int[] A ){

    int n= A.length;
        for (int i=1;i<n;i++){
            int key=A[i];
            int j=i-1;
            while (key<A[j] && j>=0 ){
                A[j+1]=A[j];
                j-=1;
            }
            A[j+1]=key;
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
