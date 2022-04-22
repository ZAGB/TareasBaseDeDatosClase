/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseGrafos;

/**
 *
 * @author zujeily
 */
public class MatrizAdyacencia {
    
       public int numVertices; //Contamos cuantos vertices hay en el grafo
    private int maxCapacity; //Maxima capacidad de vertices
    private Vertices [] vertices; //Almacenamos la lista de vertices
    private int[][] edges; //Almacenamos las aristas

    public MatrizAdyacencia() {
        this.numVertices = 0;
        this.maxCapacity = 2;
        this.vertices = new Vertices [this.maxCapacity];
        this.edges = new int [this.maxCapacity][this.maxCapacity];
        
    }

   
    public void addVertex(Vertices vertex){
      if(this.numVertices == this.maxCapacity){
        System.out.println("El grafo ya esta lleno.");
        return;
     }
    else if(vertex != null){
      System.out.println("No se puede insertar un grafo nulo");
      return;
      }
    
      this.vertices[this.numVertices] = vertex;
      for (int i = 0; i < this.numVertices; i++){
      this.edges[this.numVertices][i] = 0;
      this.edges[i][this.numVertices] = 0;
      
}
    this.numVertices++;
 }

          

      private int findVertex(Vertices vertex){
         for (int i=0; i< this.vertices.length; i++){
           if(this.vertices[i].equals(vertex)){
            return i;
           }
         }
            return -1;
       }
      
      public int getWeidght(Vertices fromVertex, Vertices toVertex){
         int row = findVertex(fromVertex);
         int column = findVertex(toVertex);
         if(row != -1 && column != -1){
            return this.edges[row][column];
         }
         else {
          return -1;         

         }
      }
      
      public void addEdge(Vertices fromVertex, Vertices toVertex, int weight){
        int row = findVertex(fromVertex);  
        int column = findVertex(toVertex);   
        if(row != -1 && column != -1){
         this.edges[row][column] = weight;
         this.edges[column][row] = weight;     
        }
        else {
           System.out.println("No se puede crear una arista entre vertices que no estan en el grafo."); 
            
        }
        
      }
      
      public void print(){
        for(int i=0; i< this.maxCapacity; i++){
            for(int j=0; j< this.maxCapacity; j++){
                System.out.print( edges[i][j] + "  " );        
            }
            System.out.println();
      
      
      
}
      }
}
    
    
   
