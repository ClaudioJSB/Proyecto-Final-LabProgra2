
package Modelo;

import java.util.*;
public class FuentePoder extends Abstracta implements Interface{
 private ArrayList<FuentePoder> FuentePoder= new ArrayList<FuentePoder>();
    Scanner n= new Scanner(System.in);
    public FuentePoder(String marca, String modelo, int id, int precio, String color) {
        super(marca, modelo, id, precio, color);
    }
    
    public FuentePoder completar(){
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
        
        FuentePoder a= new FuentePoder(marca,modelo,id,precio,color);
        return a ;
    }
    public void crear(){
        FuentePoder.add(completar());
    }
    public void modificar(){
        FuentePoder.set(buscar(),completar());
    }
    public void eliminar(){
        FuentePoder.remove(buscar());
    }
    public void mostrar(){
        FuentePoder.get(buscar());
    }
    public int buscar(){
        System.out.println("ingrese el id del producto");
        int id = n.nextInt();
        
        
        for(int j=0;j<FuentePoder.size();j++){
           FuentePoder b= FuentePoder.get(j);
            int var= b.getId();
            if(var==id){
                return j;
    }
  
}
     return 0;
    }
    
}
