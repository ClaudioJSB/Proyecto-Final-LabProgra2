
package Modelo;

import java.util.*;
public class Mouse extends Abstracta implements Interface{
private ArrayList<Mouse>Mouse= new ArrayList<Mouse>();
Scanner n= new Scanner(System.in);
    public Mouse(String marca, String modelo, int id, int precio, String color) {
        super(marca, modelo, id, precio, color);
    }
    public Mouse completar(){
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
        
       Mouse a= new Mouse(marca,modelo,id,precio,color);
        return a;
    }
    public void crear(){
        Mouse.add(completar());
    }
    public void modificar(){
        Mouse.set(buscar(),completar());
    }
    public void eliminar(){
        Mouse.remove(buscar());
    }
    public void mostrar(){
        Mouse.get(buscar());
    }
    public int buscar(){
        System.out.println("ingrese el id del producto");
        int id = n.nextInt();
        
        
        for(int j=0;j<Mouse.size();j++){
          Mouse b=Mouse.get(j);
            int var= b.getId();
            if(var==id){
                return j;
    }
  
}
     return 0;
    }
    
}
