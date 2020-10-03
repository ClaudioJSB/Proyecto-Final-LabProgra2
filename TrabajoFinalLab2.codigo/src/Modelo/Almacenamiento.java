
package Modelo;

import java.util.*;
public class Almacenamiento extends Abstracta implements Interface{
private ArrayList<Almacenamiento> Almacenamiento= new ArrayList<Almacenamiento>();
Scanner n= new Scanner(System.in);
    public Almacenamiento(String marca, String modelo, int id, int precio, String color) {
        super(marca, modelo, id, precio, color);
    }
    
    public Almacenamiento completar(){
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
        
        Almacenamiento a= new Almacenamiento(marca,modelo,id,precio,color);
        return a;
    }
    public void crear(){
         Almacenamiento.add(completar());
    }
    public void modificar(){
         Almacenamiento.set(buscar(),completar());
    }
    public void eliminar(){
         Almacenamiento.remove(buscar());
    }
    public void mostrar(){
         Almacenamiento.get(buscar());
    }
    public int buscar(){
         System.out.println("ingrese el id del producto");
        int id = n.nextInt();
        
        
        for(int j=0;j< Almacenamiento.size();j++){
           Almacenamiento b=  Almacenamiento.get(j);
            int var= b.getId();
            if(var==id){
                return j;
    }
  
}
     return 0;
    }
    
}
