package Algs;

import Graph01.Vertex;
import com.sun.tools.attach.AgentInitializationException;

import java.util.*;

public class WS_algorythm {

    private final List<Integer> colors;
    private final List<Vertex> orderedList;

    public WS_algorythm(){
        this.colors = new ArrayList<>();
        this.orderedList = new ArrayList<>();
    }

    private void orderNodes(List<Vertex> input){
        for(Vertex node : input){
            int i = 0;
            for(Vertex orderedNode : this.orderedList){
                if(node.getNumOfNeighbours() < orderedNode.getNumOfNeighbours()){
                    i++;
                }
            }
            this.orderedList.add(i,node);
        }
    }

    public List<Vertex> colorNodes(List<Vertex> input){
        orderNodes(input);

        for(Vertex node : orderedList){
            List<Integer> availableColors = new ArrayList<>(colors);
            for(Vertex neighbour : node.getNeighbours()){
                if(neighbour.getColor() == -1){
                    continue;
                }
                Iterator<Integer> iterator = availableColors.iterator();
                while (iterator.hasNext()) {
                    if (iterator.next() == neighbour.getColor()) {
                        iterator.remove();
                        break;
                    }
                }
            }
            if(availableColors.isEmpty()){
                int newColor = colors.size();
                colors.addLast(newColor);
                availableColors.add(newColor);
            }
            node.setColor(availableColors.getFirst());
        }
        return orderedList;
    }
}
