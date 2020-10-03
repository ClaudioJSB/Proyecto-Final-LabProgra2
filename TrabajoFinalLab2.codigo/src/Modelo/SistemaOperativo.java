
package Modelo;

import java.util.*;
public class SistemaOperativo extends Abstracta implements Interface{
private ArrayList<SistemaOperativo> SistemaOperativo= new ArrayList<SistemaOperativo>();
  Scanner n= new Scanner(System.in);
    public SistemaOperativo(String marca, String modelo, int id, int precio, String color) {
        super(marca, modelo, id, precio, color);
    }
    
    public SistemaOperativo completar(){
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
        
        SistemaOperativo a= new SistemaOperativo(marca,modelo,id,precio,color);
        return a;
    }
    public void crear(){
        SistemaOperativo.add(completar());
    }
    public void modificar(){
     SistemaOperativo.set(buscar(),completar());
    }
    public void eliminar(){
     SistemaOperativo.remove(buscar());
    }
    public void mostrar(){
        SistemaOperativo.get(buscar());
    }
    public int buscar(){
         System.out.println("ingrese el id del producto");
        int id = n.nextInt();
        
        
        for(int j=0;j<SistemaOperativo.size();j++){
           SistemaOperativo b=SistemaOperativo.get(j);
            int var= b.getId();
            if(var==id){
                return j;
    }
  
}
     return 0;
    }

   
}
