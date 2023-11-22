public class Graph {
    public int[][] matrix;
    public Graph(int n){
matrix=new int[n][n];
    }
    public void degCalculationDirectedgraph(int index){
        int inputDeg=0,outputdeg=0;
        for (int i=0;i<matrix.length;i++){
            inputDeg+=matrix[i][index];
            outputdeg+=matrix[index][i];
        }
        System.out.println("The entry deg is equal to: "+inputDeg);
        System.out.println("The output deg is equal to: "+outputdeg);
    }
    public void degCalculateGraph(int index){
        int Deg=0;
        for (int i=0;i<matrix.length;i++){
            Deg+=matrix[i][index];

        }
        System.out.println("The entry deg is equal to: "+Deg);
    }
}
