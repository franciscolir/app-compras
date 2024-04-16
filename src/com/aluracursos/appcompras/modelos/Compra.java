package com.aluracursos.appcompras.modelos;

public class Compra extends TarjetaCredito {

private String articulo;
private int precio;
private int totalDeCompra = 0;
    public int numeroDeOpcion = 1;


    public int getNumeroDeOpcion() {
        return numeroDeOpcion;
    }

    public void setNumeroDeOpcion(int numeroDeOpcion) {
        this.numeroDeOpcion = numeroDeOpcion;
    }



    public void sumaDeCompras (){
    totalDeCompra += precio;
   }

    public int getTotalDeCompra() {
        return totalDeCompra;
    }

    public void setTotalDeCompra(int totalDeCompra) {
        this.totalDeCompra = totalDeCompra;
    }


    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


    public void numeroDeOpcion(int i) {
    }
}
