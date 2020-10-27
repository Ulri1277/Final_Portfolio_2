import java.util.ArrayList;

class Vertex implements Comparable <Vertex> // this is make this way because it is useful when making spanning trees and priorityQueues
{
    String Name;

    public ArrayList<Edge> getOut_Edges()
    {
        return Out_Edges;
    }


    ArrayList<Edge> Out_Edges;

    Integer Distance          = Integer.MAX_VALUE;
    Vertex  PreviousVertex    = null;
    boolean IsInTree          = false;



    public String getName()
    {
        return Name;
    }


    public Vertex (String city)
    {
        this.Name = city;
        Out_Edges = new ArrayList<>();
    }
    public void AddOutEdge(Edge outEdge)
    {
        Out_Edges.add(outEdge);

    }

    @Override
    public int compareTo(Vertex o) {
        return this.Distance.compareTo(o.Distance);

    }

}