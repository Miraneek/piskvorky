package HRY.ONE_WAY_GRAPH;

public class Main {
    public static Graph graph = new Graph("Piškvorky");

    public static void main(String[] args) {

        Vertex prvniPozice = new Vertex("000000000");
        graph.addNode(prvniPozice);
        vytvoritTah(prvniPozice, false);
        System.out.println(graph.nodes.get(906409).getName());
    }

    public static void vytvoritTah(Vertex prvniPozice, boolean hrajeKolecko) {
        String temp = prvniPozice.getName();

        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == '0') {
                String s = temp.substring(0, i) + (hrajeKolecko ? "2" : "1") + temp.substring(i + 1);
                Vertex v = new Vertex(s);
                prvniPozice.addNeighbour(v);
                v.addnotReachNeighbour(prvniPozice);
                graph.addNode(v);
                vytvoritTah(v, !hrajeKolecko);
            }
        }
    }
}
