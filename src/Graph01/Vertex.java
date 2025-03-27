package Graph01;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private final String name;
    private final List<Vertex> neighbours;

    private int color;
    public Vertex(String name) {
        this.name = name;
        this.neighbours = new ArrayList<>();
        this.color = -1;
    }

    public void addNeighbour(Vertex node){
        this.neighbours.add(node);
    }

    public int getNumOfNeighbours(){return neighbours.size();}

    public List<Vertex> getNeighbours(){
        return neighbours;
    }
    public String getName(){
        return name;
    }

    public void setColor(int num){this.color = num;}
    public int getColor(){return this.color;}


}
