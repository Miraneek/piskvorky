package Graph01;

public class Main {
    public static void main(String[] args) {

        Graph graph = new Graph("graf");
        Vertex A = new Vertex("A");
        Vertex B = new Vertex("B");
        Vertex C = new Vertex("C");
        Vertex D = new Vertex("D");
        Vertex E = new Vertex("E");
        Vertex F = new Vertex("F");

        A.addNeighbour(B);
        A.addNeighbour(C);

        B.addNeighbour(A);
        B.addNeighbour(C);

        C.addNeighbour(A);
        C.addNeighbour(B);
        C.addNeighbour(D);
        C.addNeighbour(E);

        D.addNeighbour(C);
        D.addNeighbour(E);

        E.addNeighbour(C);
        E.addNeighbour(D);
        E.addNeighbour(F);

        F.addNeighbour(E);

        graph.addVertex(A);
        graph.addVertex(B);
        graph.addVertex(C);
        graph.addVertex(D);
        graph.addVertex(E);
        graph.addVertex(F);

        graph.colorNodes();
        graph.printColors();
    }
}
