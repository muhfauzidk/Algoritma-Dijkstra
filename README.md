# Algoritma-Dijkstra 
Implementasi Algoritma Dijkstra dengan Java.

## Run script
Simpan file Edge.java, Vert.java, PathFinder.java, Dijkstra.java dalam satu project(package) lalu run Dijkstra.java untuk melihat output.

## Screenshot input script
``` js
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
```
Script diatas untuk membuat sebuah graph seperti pada gambar dibawah :

![graph](https://github.com/muhfauzidk/Algoritma-Dijkstra/blob/dfb067bbc357ba07cc995beacfb3f2e673cdd936/graph.png)

## Screenshot output script
![output](https://github.com/muhfauzidk/Algoritma-Dijkstra/blob/e676ae24bc9a77d67ebd009abb09394101c340ba/output.png)
