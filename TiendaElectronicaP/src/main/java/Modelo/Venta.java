/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USER 17
 */
public class Venta {
    private int cantidad;
    private String cliente, fecha, hora, producto, ruc;
    private double precio;

    public Venta() {
    }

    public Venta(int cantidad, String cliente, String fecha, String hora, String producto, String ruc, double precio) {
        this.cantidad = cantidad;
        this.cliente = cliente;
        this.fecha = fecha;
        this.hora = hora;
        this.producto = producto;
        this.ruc = ruc;
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
   public double asignaPrecio(String producto) {
        switch (producto) {
            case "Lavadora":
                precio = 1500.00;
                break;
            case "Refrigeradora":
                precio = 3500.00;
                break;
            case "Licuadora":
                precio = 500.00;
                break;
            case "Extractora":
                precio = 150.00;
                break;
            case "Radiograbadora":
                precio = 750.00;
                break;
            case "DVD":
                precio = 100.00;
                break;
            case "Blue Ray":
                precio = 250.00;
                break;
            default:
                precio = 0.0; // Si el producto no está en la lista, se asigna un precio de 0
                break;
        }
        return precio;
    }

    // Método para calcular el subtotal
    public double calculaSubtotal() {
        return precio * cantidad;
    }
    
}
