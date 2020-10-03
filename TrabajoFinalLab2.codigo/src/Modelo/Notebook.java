
package Modelo;
import java.util.*;

public class Notebook extends Abstracta implements Interface{
    
    public String procesador;
    public String memoriaRAM;
    public int pantalla;
    public String sistemaOperativo;
    public int numeroNucleos;
    public int almacenamiento;
    public String trajetaGrafica;
    public int peso;

    private ArrayList<Notebook>Notebook= new ArrayList<Notebook>();
    Scanner n= new Scanner(System.in);
    public Notebook(String procesador, String memoriaRAM, int pantalla, String sistemaOperativo, int numeroNucleos, int almacenamiento, String trajetaGrafica, String marca, String modelo, int id, int precio, String color, int peso) {
        super(marca, modelo, id, precio, color);
        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
        this.pantalla = pantalla;
        this.sistemaOperativo = sistemaOperativo;
        this.numeroNucleos = numeroNucleos;
        this.almacenamiento = almacenamiento;
        this.trajetaGrafica = trajetaGrafica;
        this.peso=peso;
    }

    public String getProcesador() {
        return procesador;
    }

    public String getMemoriaRAM() {
        return memoriaRAM;
    }

    public int getPantalla() {
        return pantalla;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public int getNumeroNucleos() {
        return numeroNucleos;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public String getTrajetaGrafica() {
        return trajetaGrafica;
    }

    public int getPeso() {
        return peso;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void setMemoriaRAM(String memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public void setPantalla(int pantalla) {
        this.pantalla = pantalla;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public void setNumeroNucleos(int numeroNucleos) {
        this.numeroNucleos = numeroNucleos;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void setTrajetaGrafica(String trajetaGrafica) {
        this.trajetaGrafica = trajetaGrafica;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
public Notebook completar(){
    System.out.println("ingrese el nombre del procesador");
    String proce=n.next();
    System.out.println("ingrese el nombre de la memoria");
    String memo=n.next();
    System.out.println("ingrese las pulgadas de la pantalla");
    int pulgadas= n.nextInt();
    System.out.println("ingrese el sistema operativo");
    String sistema=n.next();
    System.out.println("ingrese el numero de nucleos");
    int numeroNucleos= n.nextInt();
    System.out.println("ingrese la cantidad de almacenamiento");
    int cantidad=n.nextInt();
    System.out.println("ingrese el nombre de la tarjeta grafica");
    String tg=n.next();
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
        System.out.println("ingrese el peso");
        int peso=n.nextInt();
        
       Notebook a= new Notebook(proce,memo,pulgadas,sistema,numeroNucleos,cantidad,tg,marca,modelo,id,precio,color,peso);
        return a;
}
public void crear(){
    Notebook.add(completar());
}
public void modificar(){
    Notebook.set(buscar(),completar());
}
public void eliminar(){
    Notebook.remove(buscar());
}
public void mostrar(){
    Notebook.get(buscar());
}
public int buscar(){
     System.out.println("ingrese el id del producto");
        int id = n.nextInt();
        
        
        for(int j=0;j<Notebook.size();j++){
          Notebook b=Notebook.get(j);
            int var= b.getId();
            if(var==id){
                return j;
    }
  
}
     return 0;
}

  

   
    
}
