
package Modelo;
import java.util.*;

public class Procesador extends Abstracta implements Interface{
private ArrayList<Procesador> Procesador= new ArrayList<Procesador>();
Scanner n= new Scanner(System.in);
    public Procesador(String marca, String modelo, int id, int precio, String color) {
        super(marca, modelo, id, precio, color);
    }
    
    public Procesador completar(){
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
        
        Procesador a = new Procesador(marca,modelo,id,precio,color);
        return a ;
    }
    public void crear(){
        Procesador.add(completar());
    }
    public void modificar(){
        Procesador.set(buscar(),completar());
    }
    public void eliminar(){
        Procesador.remove(buscar());
    }
    public void mostrar(){
        Procesador.get(buscar());
    }
    public int buscar(){
          System.out.println("ingrese el id del producto");
        int id = n.nextInt();
        
        
        for(int j=0;j<Procesador.size();j++){
           Procesador b= Procesador.get(j);
            int var= b.getId();
            if(var==id){
                return j;
    }
  
}
     return 0;
    }
    
}
