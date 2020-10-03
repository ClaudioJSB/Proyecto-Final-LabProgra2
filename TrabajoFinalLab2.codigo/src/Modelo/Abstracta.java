
package Modelo;
import java.util.*;
public abstract class Abstracta {
    protected String marca;
    protected String modelo;
    protected int id;
    protected int precio;
    protected String color;

  
    public Abstracta(String marca, String modelo, int id, int precio,String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.id = id;
        this.precio = precio;
        this.color=color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getId() {
        return id;
    }

    public int getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
   
}
