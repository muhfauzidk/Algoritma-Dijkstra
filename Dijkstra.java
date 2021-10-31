package djikstra.algorithm;

public class Dijkstra {
public static void main(String[] args) {
		
		Vert vA = new Vert("A"); //create vertice A
		Vert vB = new Vert("B"); //create vertice B
		Vert vC = new Vert("C"); //create vertice C
		Vert vD = new Vert("D"); //create vertice D
		
		vA.addNeighbour(new Edge(10,vA,vC)); //value A to C: 10
		vA.addNeighbour(new Edge(5,vA,vB)); //value A to B: 5
		vC.addNeighbour(new Edge(3,vC,vB)); //value C to B: 3
		vC.addNeighbour(new Edge(2,vC,vD)); //value C to D: 2
		vB.addNeighbour(new Edge(3,vB,vC)); //value B to C: 3
		vB.addNeighbour(new Edge(11,vB,vD)); //value B to D: 11
	
		PathFinder shortestPath = new PathFinder();
		shortestPath.ShortestP(vA);
		System.out.println("Shortest Path from A to B: "+shortestPath.getShortestP(vB)+" = "+vB.getDist());
		System.out.println("Shortest Path from A to C: "+shortestPath.getShortestP(vC)+" = "+vC.getDist());
		System.out.println("Shortest Path from A to D: "+shortestPath.getShortestP(vD)+" = "+vD.getDist());
		
		
	}
}
