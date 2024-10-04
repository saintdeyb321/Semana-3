/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USER 17
 */
public class Contado extends Venta {

    private int n;

    // Constructor
    public Contado(int cantidad, String cliente, String fecha, String hora, String producto, String ruc, double precio, int n) {
        super(cantidad, cliente, fecha, hora, producto, ruc, precio);
        this.n = n;
    }

    // Método para obtener la cantidad de productos
    public int getN() {
        return n;
    }

    // Método para calcular el descuento basado en el subtotal
    public double calculaDescuento(double subtotal) {
        double descuento;
        if (subtotal < 1000) {
            descuento = subtotal * 0.03; 
        } else if (subtotal <= 3000) {
            descuento = subtotal * 0.05; 
        } else {
            descuento = subtotal * 0.8; 
        }
        return descuento;
    }
}
