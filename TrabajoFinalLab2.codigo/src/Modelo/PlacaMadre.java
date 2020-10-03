
package Modelo;

import java.util.*;
public class PlacaMadre extends Abstracta implements Interface{
 private ArrayList<PlacaMadre> PlacaMadre= new ArrayList<PlacaMadre>();
 Scanner n= new Scanner(System.in);
    public PlacaMadre(String marca, String modelo, int id, int precio, String color) {
        super(marca, modelo, id, precio, color);
    }
    public PlacaMadre completar(){
         System.out.println("ingrese la marca");
        String marca= n.next();
        System.out.println("ingrese el modelo");
        String modelo= n.next();
        System.out.println("ingrese el id");
        int id= n.nextInt();
        System.out.println("ingrese el precio");
        int precio=n.nextInt();
        System.out.println("ingrese el color");
        String color=n.next();
        
        PlacaMadre a = new PlacaMadre(marca,modelo,id,precio,color);
        return a;
    }
    public void crear(){
        PlacaMadre.add(completar());
    }
    public void modificar(){
        PlacaMadre.set(buscar(),completar());
    }
    public void eliminar(){
        PlacaMadre.remove(buscar());
    }
    public void mostrar(){
        PlacaMadre.get(buscar());
    }
    public int buscar(){
          System.out.println("ingrese el id del producto");
        int id = n.nextInt();
        
        
        for(int j=0;j<PlacaMadre.size();j++){
           PlacaMadre b= PlacaMadre.get(j);
            int var= b.getId();
            if(var==id){
                return j;
    }
  
}
     return 0;
    }
            
    
}
