package com.aluracursos.appcompras.principal;

import com.aluracursos.appcompras.modelos.Compra;
import com.aluracursos.appcompras.modelos.TarjetaCredito;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        TarjetaCredito tarjetaCredito = new TarjetaCredito();
        System.out.println("Ingrese limite de tarjeta");
        tarjetaCredito.setSaldoTarjeta(teclado.nextInt());
        System.out.println("Este es el saldo " + tarjetaCredito.getSaldoTarjeta());
        Compra compra = new Compra();


        for (int i = 0; i < 1; ) {

           compra.setNumeroDeOpcion(1);
            System.out.println("numero de opcion antes del if" + compra.numeroDeOpcion);
            if (compra.getNumeroDeOpcion() == 1) {
                System.out.println("Ingrese descripcion de la compra");
                compra.setArticulo(teclado.next());
                System.out.println("Ingrese valor de la compra");
                compra.setPrecio(teclado.nextInt());
                compra.sumaDeCompras();
                tarjetaCredito.setSaldoTarjeta(tarjetaCredito.getSaldoTarjeta() - compra.getPrecio());

                ArrayList<Compra> lista= new ArrayList<>();

               // lista.add(miPelicula);
               // lista.add(otraPelicula);
                //lista.add(peliculaDeEjemplo);
                //lista.add(casaDragon);


                if (compra.getTotalDeCompra() > tarjetaCredito.getSaldoTarjeta()) {
                    System.out.println("Excede maximo");
                } else {
                    System.out.println("Suma de compras " + compra.getTotalDeCompra());
                    System.out.println("Este es el saldo " + tarjetaCredito.getSaldoTarjeta());
                    System.out.println("Compra Realizada!");
                    System.out.println("Escriba 0 para salir o 1 para continuar");
                    compra.setNumeroDeOpcion(teclado.nextInt());
                    System.out.println("numero de opcion en else " + compra.getNumeroDeOpcion());
                }
            } else if (compra.getNumeroDeOpcion() == 0) {
                i = 1;
            } else {
                //System.out.println("Ingrese opcion valida");
                //numeroDeOpcion (teclado.nextInt());

            }

            System.out.println("Muchas gracias");


        }

    }}