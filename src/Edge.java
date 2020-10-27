public class Edge
{
    Vertex  FromVertex;
    Vertex  ToVertex;
    Integer Weight;


    public Edge(Vertex from, Vertex to, Integer cost)
    {
        FromVertex = from;
        ToVertex   = to;
        Weight     = cost;

        from.AddOutEdge(this);

    }


    public Vertex getToVertex() {
        return ToVertex;
    }


    public Integer getWeight() {
        return Weight;
    }

}
