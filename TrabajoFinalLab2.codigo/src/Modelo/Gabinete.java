
package Modelo;
import java.util.*;
public class Gabinete extends Abstracta implements Interface{
private ArrayList<Gabinete> Gabinete= new ArrayList<Gabinete>();
Scanner n= new Scanner(System.in);
    public Gabinete(String marca, String modelo, int id, int precio, String color) {
        super(marca, modelo, id, precio, color);
    }
    
    public Gabinete completar(){
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
        
        Gabinete a= new Gabinete(marca,modelo,id,precio,color);
        return a;
    }
    public void crear(){
        Gabinete.add(completar());
    }
    public void modificar(){
        Gabinete.set(buscar(),completar());
    }
    public void eliminar(){
        Gabinete.remove(buscar());
    }
    public void mostrar(){
        Gabinete.get(buscar());
    }
    public int buscar(){
         System.out.println("ingrese el id del producto");
        int id = n.nextInt();
        
        
        for(int j=0;j<Gabinete.size();j++){
          Gabinete b= Gabinete.get(j);
            int var= b.getId();
            if(var==id){
                return j;
    }
  
}
     return 0;
    }
    
}
