// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {

            Graph Graph=new Graph(5);
            Graph.matrix= new int[][]{
                    {0, 1, 0, 0, 1},
                    {1, 0, 1, 0, 0},
                    {0, 1, 0, 1, 0},
                    {0, 0, 1, 0, 1},
                    {1, 0, 1, 1, 0},
            };
            Graph.degCalculateGraph(1);

    }
}