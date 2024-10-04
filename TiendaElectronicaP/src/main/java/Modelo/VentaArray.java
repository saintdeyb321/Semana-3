/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author USER 17
 */
public class VentaArray {
    private ArrayList<Venta> listaVentas;

    // Constructor
    public VentaArray() {
        listaVentas = new ArrayList<>();
    }

    // Método para agregar una venta (puede ser Contado o Credito)
    public void agregarVenta(Venta venta) {
        listaVentas.add(venta);
    }

    // Método para eliminar una venta por índice
    public void eliminarVenta(int index) {
        if (index >= 0 && index < listaVentas.size()) {
            listaVentas.remove(index);
        }
    }

    // Método para obtener una venta por índice
    public Venta obtenerVenta(int index) {
        if (index >= 0 && index < listaVentas.size()) {
            return listaVentas.get(index);
        }
        return null;
    }

    // Método para obtener todas las ventas
    public ArrayList<Venta> obtenerTodasLasVentas() {
        return listaVentas;
    }

    // Método para obtener el número de ventas registradas
    public int obtenerNumeroDeVentas() {
        return listaVentas.size();
    }
}