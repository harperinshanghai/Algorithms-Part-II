package Week2_MST;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class MST {
    public MST(EdgeWeightedGraph G){

    }

    public Iterable<Edge> edges(){

    }

    public double weigth(){}

    public static void main(String[] args){
        In in = new In(args[0]);
        EdgeWeightedGraph G = new EdgeWeightedGraph(in);
        MST mst = new MST(G);
        for (Edge e : mst.edges())
            StdOut.println(e);
        StdOut.printf("%.2f\n", mst.weigth());
    }
}
