package Graph01;

import Algs.WS_algorythm;
import queue.LIFOQueue;

import java.util.ArrayList;
import java.util.List;
public class Graph {
    public final String name;
    private List<Vertex> vertexList;
    public Graph(String name){
        this.name = name;
        this.vertexList = new ArrayList<>();
    }
    public void addVertex(Vertex node){
        vertexList.add(node);
    }

    public void colorNodes(){
        WS_algorythm alg = new WS_algorythm();
        this.vertexList = alg.colorNodes(vertexList);
    }

    public void printColors(){
        for(Vertex node : vertexList){
            System.out.println(node.getName() + " : " + node.getColor());
        }
    }


    /*
    public List<Vertex> search(){

        LIFOQueue<Vertex> LIFOQueue = new LIFOQueue<>();
        List<Vertex> newList = new LinkedList<>();

        for (Vertex vertex : vertexList) LIFOQueue.enqueue(vertex);

        while (!LIFOQueue.isEmpty()) {
            Vertex current = LIFOQueue.dequeue();

            if (newList.contains(current)) continue;

            newList.add(current);
            List<Vertex> neighbours = current.getNeighbours();
            System.out.print(current.getName() + " -> my neighbours: ");
            for (Vertex neighbour : neighbours) {
                System.out.print(neighbour.getName() + " ");
                if (!newList.contains(neighbour)) {
                    LIFOQueue.enqueue(neighbour);
                }
            }
            System.out.println();
        }
        return newList;
    }
     */
}
