
package Modelo;

import java.util.*;
public class PC_Escritorio extends Abstracta implements Interface{
    public Procesador procesador;
    public int numeroNucleos;
    public Memoria memoria;
    public Almacenamiento almacenamiento;
    public TarjetaGrafica trajetaGrafica;
    public SistemaOperativo sistemaOperativo;
    public PlacaMadre placaMadre;
    public Gabinete gabinete;
    public FuentePoder fuentePoder;
    public int peso;

    private ArrayList<PC_Escritorio>PC_Escritorio= new ArrayList<PC_Escritorio>();
    Scanner n= new Scanner(System.in);
    public PC_Escritorio(Procesador procesador, int numeroNucleos, Memoria memoria, Almacenamiento almacenamiento, TarjetaGrafica trajetaGrafica, SistemaOperativo sistemaOperativo, PlacaMadre placaMadre, Gabinete gabinete, FuentePoder fuentePoder, String marca, String modelo, int id, int precio, String color) {
        super(marca, modelo, id, precio, color);
        this.procesador = procesador;
        this.numeroNucleos = numeroNucleos;
        this.memoria = memoria;
        this.almacenamiento = almacenamiento;
        this.trajetaGrafica = trajetaGrafica;
        this.sistemaOperativo = sistemaOperativo;
        this.placaMadre = placaMadre;
        this.gabinete = gabinete;
        this.fuentePoder = fuentePoder;
    }
    
    public PC_Escritorio completar(){
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
        System.out.println("ingrese el numero de nucleos");
        int numNucleos=n.nextInt();
        Procesador p = new Procesador("","",0,0,"");
        Memoria m= new Memoria("","",0,0,"");
        Almacenamiento a= new Almacenamiento("","",0,0,"");
        TarjetaGrafica t= new TarjetaGrafica("","",0,0,"");
        SistemaOperativo s= new SistemaOperativo("","",0,0,"");
        PlacaMadre pl= new PlacaMadre("","",0,0,"");
        Gabinete g= new Gabinete("","",0,0,"");       
        FuentePoder f= new FuentePoder("","",0,0,"");
       
        PC_Escritorio pc= new PC_Escritorio(p.completar(),numNucleos,m.completar(),a.completar(),t.completar(),s.completar(),pl.completar(),g.completar(),f.completar(),marca,modelo,id,precio,color);
        return pc;
    }
    public void crear(){
        PC_Escritorio.add(completar());
    }
    public void modificar(){
        PC_Escritorio.set(buscar(),completar());
    }
    public void eliminar(){
        PC_Escritorio.remove(buscar());
    }
    public void mostrar(){
        PC_Escritorio.get(buscar());
    }
    public int buscar(){
          System.out.println("ingrese el id del producto");
        int id = n.nextInt();
        
        
        for(int j=0;j<PC_Escritorio.size();j++){
          PC_Escritorio b=PC_Escritorio.get(j);
            int var= b.getId();
            if(var==id){
                return j;
    }
  
}
     return 0;
    }

    public int getNumeroNucleos() {
        return numeroNucleos;
    }

    public int getPeso() {
        return peso;
    }

    public void setNumeroNucleos(int numeroNucleos) {
        this.numeroNucleos = numeroNucleos;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
}
