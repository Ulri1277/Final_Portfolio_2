@SuppressWarnings("ALL")
public class Main {

    public static void main(String[] args)
    {
        AdjacencyList NetworkGrid = new AdjacencyList();
        AddingVerticesAndEgdes(NetworkGrid);

       NetworkGrid.PrintEdges();

       NetworkGrid.MST();

       NetworkGrid.PrintMST();


    }
     public static AdjacencyList AddingVerticesAndEgdes(AdjacencyList Cities)
     {
            Vertex Eskildstrup      = new Vertex("  Eskildstrup    ");
            Vertex Haslev           = new Vertex("  Haslev         ");
            Vertex Holbaek          = new Vertex("  Holbaek        ");
            Vertex Jaergerspris     = new Vertex("  Jaergerspris   ");
            Vertex Kalundborg       = new Vertex("  Kalundborg     ");
            Vertex Korsoer          = new Vertex("  Korsoer        ");
            Vertex Koege            = new Vertex("  Koege          ");
            Vertex Maribo           = new Vertex("  Maribo         ");
            Vertex Nakskov          = new Vertex("  Nakskov        ");
            Vertex Nykoebing_F      = new Vertex("  Nykoebing_F    ");
            Vertex Nsaetved         = new Vertex("  Nsaetved       ");
            Vertex Ringsted         = new Vertex("  Ringsted       ");
            Vertex Roskilde         = new Vertex("  Roskilde       ");
            Vertex Slagelse         = new Vertex("  Slagelse       ");
            Vertex Soroe            = new Vertex("  Soroe          ");
            Vertex Vordingborg      = new Vertex("  Vordingborg    ");

            // Here the Vertex is added to the graph
            Cities.addVertex(Eskildstrup);
            Cities.addVertex(Haslev);
            Cities.addVertex(Holbaek);
            Cities.addVertex(Jaergerspris);
            Cities.addVertex(Kalundborg);
            Cities.addVertex(Korsoer);
            Cities.addVertex(Koege);
            Cities.addVertex(Maribo);
            Cities.addVertex(Nakskov);
            Cities.addVertex(Nykoebing_F);
            Cities.addVertex(Nsaetved);
            Cities.addVertex(Ringsted);
            Cities.addVertex(Roskilde);
            Cities.addVertex(Slagelse);
            Cities.addVertex(Soroe);
            Cities.addVertex(Vordingborg);

// Here we add all the egdes between the different cities they are parted by the start city.
            Cities.newEdge(Eskildstrup,  Maribo,          28);
            Cities.newEdge(Eskildstrup,  Nykoebing_F,     13);
            Cities.newEdge(Eskildstrup,  Vordingborg,     24);

            Cities.newEdge(Haslev,       Korsoer,         60);
            Cities.newEdge(Haslev,       Koege,           24);
            Cities.newEdge(Haslev,       Nsaetved,        25);
            Cities.newEdge(Haslev,       Ringsted,        19);
            Cities.newEdge(Haslev,       Roskilde,        47);
            Cities.newEdge(Haslev,       Slagelse,        48);
            Cities.newEdge(Haslev,       Soroe,           34);
            Cities.newEdge(Haslev,       Vordingborg,     40);

            Cities.newEdge(Holbaek,      Jaergerspris,    34);
            Cities.newEdge(Holbaek,      Kalundborg,      44);
            Cities.newEdge(Holbaek,      Korsoer,         66);
            Cities.newEdge(Holbaek,      Ringsted,        36);
            Cities.newEdge(Holbaek,      Roskilde,        32);
            Cities.newEdge(Holbaek,      Slagelse,        46);
            Cities.newEdge(Holbaek,      Soroe,           34);


            Cities.newEdge(Jaergerspris, Korsoer,         95);
            Cities.newEdge(Jaergerspris, Koege,           58);
            Cities.newEdge(Jaergerspris, Ringsted,        56);
            Cities.newEdge(Jaergerspris, Roskilde,        33);
            Cities.newEdge(Jaergerspris, Slagelse,        74);
            Cities.newEdge(Jaergerspris, Soroe,           63);


            Cities.newEdge(Kalundborg,   Ringsted,        62);
            Cities.newEdge(Kalundborg,   Roskilde,        70);
            Cities.newEdge(Kalundborg,   Slagelse,        39);
            Cities.newEdge(Kalundborg,   Soroe,           51);

            Cities.newEdge(Korsoer,      Nsaetved,        45);
            Cities.newEdge(Korsoer,      Ringsted,        20);

            Cities.newEdge(Koege,        Nsaetved,        45);
            Cities.newEdge(Koege,        Ringsted,        28);
            Cities.newEdge(Koege,        Roskilde,        25);
            Cities.newEdge(Koege,        Vordingborg,     60);

            Cities.newEdge(Maribo,       Nakskov,         27);
            Cities.newEdge(Maribo,       Nykoebing_F,     26);

            Cities.newEdge(Nsaetved,     Roskilde,        57);
            Cities.newEdge(Nsaetved,     Ringsted,        26);
            Cities.newEdge(Nsaetved,     Slagelse,        37);
            Cities.newEdge(Nsaetved,     Soroe,           32);
            Cities.newEdge(Nsaetved,     Vordingborg,     28);

            Cities.newEdge(Ringsted,     Roskilde,        31);
            Cities.newEdge(Ringsted,     Soroe,           15);
            Cities.newEdge(Ringsted,     Vordingborg,     58);


            Cities.newEdge(Slagelse,     Soroe,           14);

            return Cities;
        }
}
