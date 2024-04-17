package com.aluracursos.appcompras.modelos;

import java.util.ArrayList;
import java.util.List;

public class TarjetaCredito {

    private double saldoTarjeta;
    private double limiteCompra;
    private List<Compra> listaDeCompra;


    public TarjetaCredito( double limiteCompra) {
        this.saldoTarjeta = limiteCompra;
        this.limiteCompra = limiteCompra;
        this.listaDeCompra = new ArrayList<>();
    }

    public boolean lanzarCompra (Compra compra){
        if(this.saldoTarjeta > compra.getValor()){
            this.saldoTarjeta -= compra.getValor();
            this.listaDeCompra.add(compra);
            return true;
        }
        return false;
    }

    public double getLimiteCompra() {
        return limiteCompra;
    }


    public List<Compra> getListaDeCompra() {
        return listaDeCompra;
    }


    public double getSaldoTarjeta() {
        return saldoTarjeta;
    }




}
