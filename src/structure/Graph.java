/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structure;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author dwife
 */


public class Graph {
    private HashMap<String, ArrayList<String>> graph;

    public Graph() {
        graph = new HashMap<>();
    }

    public void addVertex(String nama) {
        graph.putIfAbsent(nama, new ArrayList<>());
    }

    public void addEdge(String a, String b) {
        graph.get(a).add(b);
        graph.get(b).add(a);
    }

    public ArrayList<String> getConnections(String nama) {
        return graph.get(nama);
    }

    public void displayGraph() {
        for (String key : graph.keySet()) {
            System.out.print(key + " -> ");

            for (String value : graph.get(key)) {
                System.out.print(value + " ");
            }

            System.out.println();
        }
    }
}
