package HRY.ONE_WAY_GRAPH;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String name;
    private List<Vertex> neighbours;

    private List<Vertex> notReachNeighbours;

    public Vertex(String name){
        this.name = name;
        this.neighbours = new ArrayList<>();
        this.notReachNeighbours = new ArrayList<>();
    }

    public void addNeighbour(Vertex node){
        neighbours.add(node);
    }
    public void addnotReachNeighbour(Vertex node){
        notReachNeighbours.add(node);
    }

    public List<Vertex> getNotReachNeighbours(){return notReachNeighbours;}

    public String getName(){
        return this.name;
    }
    public List<Vertex> getNeighbours(){
        return neighbours;
    }
}
