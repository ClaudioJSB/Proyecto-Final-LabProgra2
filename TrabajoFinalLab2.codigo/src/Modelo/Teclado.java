
package Modelo;

import java.util.*;
public class Teclado extends Abstracta implements Interface{
private ArrayList<Teclado>Teclado= new ArrayList<Teclado>();
Scanner n= new Scanner(System.in);
    public Teclado(String marca, String modelo, int id, int precio, String color) {
        super(marca, modelo, id, precio, color);
    }
    
    public Teclado completar(){
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
        
       Teclado a= new Teclado(marca,modelo,id,precio,color);
        return a;
    }
    public void crear(){
        Teclado.add(completar());
    }
    public void modificar(){
        Teclado.set(buscar(),completar());
    }
    public void eliminar(){
        Teclado.remove(buscar());
    }
    public void mostrar(){
        Teclado.get(buscar());
    }
    public int buscar(){
         System.out.println("ingrese el id del producto");
        int id = n.nextInt();
        
        
        for(int j=0;j<Teclado.size();j++){
           Teclado b=Teclado.get(j);
            int var= b.getId();
            if(var==id){
                return j;
    }
  
}
     return 0;
    }
}
