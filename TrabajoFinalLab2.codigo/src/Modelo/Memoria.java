
package Modelo;
import java.util.*;

public class Memoria extends Abstracta implements Interface{
 private ArrayList<Memoria> Memoria= new ArrayList<Memoria>();
 Scanner n= new Scanner(System.in);
    public Memoria(String marca, String modelo, int id, int precio, String color) {
        super(marca, modelo, id, precio, color);
    }

    
    public void crear() {
        Memoria.add(completar());
    }

    public void modificar() {
    Memoria.set(buscar(),completar());
    }

  
    public void eliminar() {
        
       Memoria.remove(buscar());
    }
    public void mostrar() {
         Memoria.get(buscar());
    }
    public Memoria completar(){
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
        Memoria a = new Memoria(marca,modelo,id,precio,color);
        
        return a;
    }
    public int buscar(){
        System.out.println("ingrese el id del producto");
        int id = n.nextInt();
        
        
        for(int j=0;j<Memoria.size();j++){
           Memoria b= Memoria.get(j);
            int var= b.getId();
            if(var==id){
                return j;
    }
  
}
     return 0;
    }
}
