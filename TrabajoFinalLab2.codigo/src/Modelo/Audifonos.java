
package Modelo;

import java.util.*;
public class Audifonos extends Abstracta implements Interface{
private ArrayList<Audifonos> Audifonos= new ArrayList<Audifonos>();
Scanner n= new Scanner(System.in);
    public Audifonos(String marca, String modelo, int id, int precio, String color) {
        super(marca, modelo, id, precio, color);
    }
    
    public Audifonos completar(){
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
        
        Audifonos a= new Audifonos(marca,modelo,id,precio,color);
        return a;
    }
    public void crear(){
        Audifonos.add(completar());
    }
    public void modificar(){
        Audifonos.set(buscar(),completar());
    }
    public void eliminar(){
        Audifonos.remove(buscar());
    }
    public void mostrar(){
        Audifonos.get(buscar());
    }
    public int buscar(){
           System.out.println("ingrese el id del producto");
        int id = n.nextInt();
        
        
        for(int j=0;j<Audifonos.size();j++){
           Audifonos b= Audifonos.get(j);
            int var= b.getId();
            if(var==id){
                return j;
    }
  
}
     return 0;
    }
}
