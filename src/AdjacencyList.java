import java.text.DecimalFormat;
import java.util.*;

public class AdjacencyList
{
    public ArrayList<Vertex> vertices; // makes a graph of the different ArrayList's

    int Counter   = 0;

    int MSTLength = 0;

    public AdjacencyList()
    {
        vertices = new ArrayList<>();
    }

    public void addVertex(Vertex C)
    {
        vertices.add(C);
    }


    public void newEdge(Vertex from, Vertex to, Integer distance)
    {
        if (!(vertices.contains(from) && vertices.contains(to)))
        {
            System.out.println("This city do not exist");

        }
        new Edge(from, to, distance);
        new Edge(to, from, distance);
    }

    public void PrintEdges()
    {
        for (Vertex CurrentVertex: vertices)
        {
            Vertex      CurrentV;
            CurrentV  = CurrentVertex;

            System.out.println("Edge from Vertex: " + CurrentV.getName());
            System.out.println(" ");

            for (Edge OutEdge: CurrentV.getOut_Edges())
            {

                Integer DistanceV = OutEdge.getWeight();

                System.out.println("To " + OutEdge.getToVertex().getName() + "distance " + DistanceV);

                System.out.println(" ");

            }
        }

    }

    public void MST()

    {
        PriorityQueue<Vertex> Qet = new PriorityQueue<>();


        if (vertices.size() > 0)
        {
            vertices.get(0).Distance = 0;

            Qet.offer(vertices.get(0));
        }




        while(!Qet.isEmpty() && Counter < vertices.size())
        {
            Vertex SmallestCost            = Qet.poll();

            int index                      = vertices.indexOf(SmallestCost);

            ArrayList<Edge> OutEdgesOfU    = vertices.get(index).getOut_Edges();


            if ( !vertices.get(index).IsInTree)
            {
                for ( Edge edge: OutEdgesOfU)
                {
                    if( edge.getWeight() < edge.getToVertex().Distance && !edge.getToVertex().IsInTree)
                    {
                        edge.getToVertex().Distance          = edge.getWeight();
                        edge.getToVertex().PreviousVertex    = vertices.get(index);

                        Qet.offer(edge.ToVertex);

                    }
                }

                vertices.get(index).IsInTree = true;
                MSTLength                   += vertices.get(index).Distance;
                Counter++;
            }
        }
        System.out.println(" ");
    }

    public void PrintMST()
    {

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

        System.out.println(" The total distance for the network grid: " + MSTLength);

        System.out.println(" ");

        System.out.println(" The total cost for the network grid is: " +
                             new DecimalFormat("###,###,###").format(MSTLength*1000000) +  " kroner");

    }

}