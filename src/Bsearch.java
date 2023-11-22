public class Bsearch {
    public static int search(int[] A, int x, int low, int height){
        if (low<=height){
            int mid=(low+height)/2;
            if (A[mid]>x){
                search(A,x,low,mid-1);
            } else if (x>A[mid]) {
                search(A,x,mid+1,height
                );
            }else {
            return A[mid];
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int[] ali={24,28,46,65,75,98,100};
        System.out.println(search(ali,75,0,ali.length-1));
    }
}
