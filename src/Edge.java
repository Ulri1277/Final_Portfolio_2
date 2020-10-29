// a class there makes egdes
public class Edge
{
    // makes three variables there storages the vertex the edge comes from and the vertex it comes to as well as as the weight of the edge
    Vertex  FromVertex;
    Vertex  ToVertex;
    Integer Weight;

    // initialization the edge with the tree variables in it and make a this statment which we can use in main
    public Edge(Vertex from, Vertex to, Integer cost)
    {
        FromVertex = from;
        ToVertex   = to;
        Weight     = cost;

        from.AddOutEdge(this);

    }

    // make a getter for the to-vertex
    public Vertex getToVertex() {
        return ToVertex;
    }

    // make a getter for the weight
    public Integer getWeight() {
        return Weight;
    }

}
