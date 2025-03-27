package HRY.ONE_WAY_GRAPH;

import queue.LIFOQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {
    public String name;
    public List<Vertex> nodes;

    public Graph(String name){
        this.name = name;
        nodes = new ArrayList<>();
    }

    public void addNode(Vertex node){
        nodes.add(node);
    }

    public List<Vertex> search(){

        LIFOQueue<Vertex> lifoQueue = new LIFOQueue<>();
        List<Vertex> newList = new LinkedList<>();
        List<Vertex> visitedN = new ArrayList<>();

        lifoQueue.enqueue(nodes.getFirst());

        while(!lifoQueue.isEmpty()){
            Vertex current = lifoQueue.dequeue();
            visitedN.add(current);
            int numOfVisitedN = 0;
            for(Vertex node : current.getNeighbours()){
                if(visitedN.contains(node)) numOfVisitedN++;
            }
            if(numOfVisitedN == current.getNeighbours().size()){
                if(!newList.contains(current)){
                    newList.add(current);
                }
            }else{
                lifoQueue.enqueue(current);
                for(Vertex neighbour : current.getNeighbours()){
                    lifoQueue.enqueue(neighbour);
                }
            }

        }
        //for(Vertex node : newList) System.out.println(node.getName());
        return newList;
    }

    public void findSafeNodes(){
        List<Vertex> list = search();
        List<Vertex> safeNodes = new ArrayList<>();
        list.remove(0);

        while(!list.isEmpty()){
            Vertex current = list.get(0);
            safeNodes.add(current);
            list.remove(current);
            for(Vertex neighbour : current.getNotReachNeighbours()){
                if(list.contains(neighbour)){
                    list.remove(neighbour);
                }
            }
        }
        for(Vertex node : safeNodes){System.out.println(node.getName());}

    }

}
