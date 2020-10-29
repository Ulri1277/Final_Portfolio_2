import java.text.DecimalFormat;
import java.util.*;

public class AdjacencyList
{
    public ArrayList<Vertex> vertices; // makes a graph of the different ArrayList's

    // set the length and the counter which tell us something about how many vertex we have visited so far
    int Counter   = 0;

    int MSTLength = 0;

    public AdjacencyList()
    {
        vertices = new ArrayList<>();
    }

    // adding vertexes to to our list
    public void addVertex(Vertex C)
    {
        vertices.add(C);
    }

    //Making a method there makes new vertices
    public void newEdge(Vertex from, Vertex to, Integer distance)
    {
        // controls if the edge contains the edge we are try to add is already in the list else we add the edge
        if (!(vertices.contains(from) && vertices.contains(to)))
        {
            System.out.println("This city do not exist");

        }
        new Edge(from, to, distance);
        new Edge(to, from, distance);
    }

    public void PrintEdges()
    {
        // for loop there takes the current vertex and where in the list we are in relations to all of the vertices
        for (Vertex CurrentVertex: vertices)
        {
            // initialization of the Vertex and insert value for the vertex, used to print the current position in the list.
            Vertex      CurrentV;
            CurrentV  = CurrentVertex;

            System.out.println("Edge from Vertex: " + CurrentV.getName());
            System.out.println(" ");

            // for loop there checks if the edge OutEdge is in relation to the current vertex and what distance,
            // and the weight of the edge between the OutEdge and the current vertex.
            for (Edge OutEdge: CurrentV.getOut_Edges())
            {
                Integer DistanceV = OutEdge.getWeight();

                System.out.println("To " + OutEdge.getToVertex().getName() + "distance " + DistanceV);

                System.out.println(" ");

            }
        }

    }

    // make a method for the minimum spanning tree for our list
    public void MST()

    {
        // makes a priorityQueue for our vertex and saves then in a priority list
        PriorityQueue<Vertex> Qet = new PriorityQueue<>();

        // a if statment there looks for the fist vertex to put in the priority list.
        if (vertices.size() > 0)
        {
            vertices.get(0).Distance = 0;

            Qet.offer(vertices.get(0));
        }


        // a while statment there looks at the prioritylist and
        // see if its empty and if counter is bigger then the number of vertices in the Adjacency list

        while(!Qet.isEmpty() && Counter < vertices.size())
        {
            // make a vertex for the smallest edge and poll it from the priority list,
            // simplify the if statement and for loop by making a integer for the index of the vertex smallestcost
            // we also makes a list for the type edges, there contains the vertices index for their out edges.
            Vertex SmallestCost            = Qet.poll();

            int index                      = vertices.indexOf(SmallestCost);

            ArrayList<Edge> OutEdgesOfU    = vertices.get(index).getOut_Edges();


            // if statement there checks if the vertexes index are in the tree if the index is not in the tree already
            if ( !vertices.get(index).IsInTree)
            {
                // for loop there looks at the edge in relation to the out edges of our current vertex
                for ( Edge edge: OutEdgesOfU)
                {
                    // looks for the edges weight and if its bigger then the to vertexes distance
                    // and look if the edge of the vertex is not in the tree
                    // make to new variables there storages the weight of the to- vertex and the previous vertex from the current vertex
                    if( edge.getWeight() < edge.getToVertex().Distance && !edge.getToVertex().IsInTree)
                    {
                        edge.getToVertex().Distance          = edge.getWeight();
                        edge.getToVertex().PreviousVertex    = vertices.get(index);

                        // offer the edges to vertex to the priority list
                        Qet.offer(edge.ToVertex);

                    }
                }
                //if the conditions of the if-statement is not true we states that the vertex is in the tree.
                // the trees length and the counter is updated contently to the vertex index and distance

                vertices.get(index).IsInTree = true;
                MSTLength                   += vertices.get(index).Distance;
                Counter++;
            }
        }
        System.out.println(" ");
    }

    // method to print the minimum spanning tree, looks for the root of the tree and parent for the vertices
    public void PrintMST()
    {

        // for loop there looks at the vertex in relation to the vertices if the vertex is in relation already
        // we get the name, if the vertex previous is not equal to zero and the weight of the edge between them,
        // if is is not we stat that the vertex has no parent
        for(Vertex vertex : vertices)
        {
                System.out.print(vertex.getName());

                if(vertex.PreviousVertex != null)
                    System.out.print(" coming from " + vertex.PreviousVertex.getName()
                                      + "The cost " + vertex.Distance);
                else
                    {
                    System.out.println("Vertex " + vertex.getName() +" Has not parent");
                    }

                System.out.println(" ");
        }
        System.out.println(" ");

        // print the trees length out
        System.out.println(" The total distance for the network grid: " + MSTLength + " Km");

        System.out.println(" ");

        // print the cost of the grid, in a ny format.
        System.out.println(" The total cost for the network grid is: " +
                             new DecimalFormat("###,###,###").format(MSTLength*1000000) +  " kroner");

    }

}