
package Modelo;
import java.util.*;

public class TarjetaGrafica extends Abstracta implements Interface {
private ArrayList<TarjetaGrafica> TarjetaGrafica= new ArrayList<TarjetaGrafica>();
Scanner n= new Scanner(System.in);
    public TarjetaGrafica(String marca, String modelo, int id, int precio, String color) {
        super(marca, modelo, id, precio, color);
    }
    
    public TarjetaGrafica completar(){
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
        
        TarjetaGrafica a= new TarjetaGrafica(marca,modelo,id,precio,color);
        return a;
    }
    public void crear(){
        TarjetaGrafica.add(completar());
    }
    public void modificar(){
        TarjetaGrafica.set(buscar(),completar());
    }
    public void eliminar(){
        TarjetaGrafica.remove(buscar());
    }
    public void mostrar(){
        TarjetaGrafica.get(buscar());
    }
    public int buscar(){
          System.out.println("ingrese el id del producto");
        int id = n.nextInt();
        
        
        for(int j=0;j<TarjetaGrafica.size();j++){
          TarjetaGrafica b= TarjetaGrafica.get(j);
            int var= b.getId();
            if(var==id){
                return j;
    }
  
}
     return 0;
    }
}
