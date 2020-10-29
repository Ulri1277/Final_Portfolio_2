import java.util.ArrayList;

// makes a class of vertex there are comparable to Vertex class, makes a name for the vertices

class Vertex implements Comparable <Vertex> // this is make this way because it is useful when making spanning trees and priorityQueues
{
    String Name;

    // makes a arraylist of the class edge and makes a getter for the list.
    public ArrayList<Edge> getOut_Edges()
    {
        return Out_Edges;
    }

    // init the list
    ArrayList<Edge> Out_Edges;

    // makes variables there storage different values for the edges
    Integer Distance          = Integer.MAX_VALUE;
    Vertex  PreviousVertex    = null;
    boolean IsInTree          = false;


    // getter for the string name
    public String getName()
    {
        return Name;
    }


    // making a method for the vertex there takes a String, sets the string name as city and out edges as a new arraylist
    public Vertex (String city)
    {
        this.Name = city;
        Out_Edges = new ArrayList<>();
    }

    // make method for adding the out edges
    public void AddOutEdge(Edge outEdge)
    {
        Out_Edges.add(outEdge);

    }

    // method there compares the vertices distance with one another
    @Override
    public int compareTo(Vertex o) {
        return this.Distance.compareTo(o.Distance);

    }

}