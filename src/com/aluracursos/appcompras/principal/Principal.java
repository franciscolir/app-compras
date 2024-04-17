package com.aluracursos.appcompras.principal;

import com.aluracursos.appcompras.modelos.Compra;
import com.aluracursos.appcompras.modelos.TarjetaCredito;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba el límite de la tarjeta: ");
        double limiteDeCompra = teclado.nextDouble();
        TarjetaCredito tarjeta = new TarjetaCredito(limiteDeCompra);

        int salir = 1;
        while(salir != 0) {
            System.out.println("Escriba la descripción de la compra:");
            String descripcion = teclado.next();

            System.out.println("Escriba el valor de la compra:");
            double valor = Double.valueOf(teclado.next());

            Compra compra = new Compra(descripcion, valor);
            boolean compraRealizada = tarjeta.lanzarCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada!");
                if(tarjeta.getSaldoTarjeta() == 0) {
                    System.out.println("Haz alcanzado el limte de Compra.");
                }
                System.out.println("Escriba 0 para salir o 1 para continuar");
                salir = teclado.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                salir = 0;
            }
        }
        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");
        for (Compra compra : tarjeta.getListaDeCompra()) {
            System.out.println(compra.getDescripcion() + " - " +compra.getValor());
        }
        System.out.println("\n***********************");
        System.out.println("\nSaldo de la tarjeta: " +tarjeta.getSaldoTarjeta());


    }}