package org.example;

import org.example.modelos.*;
import org.example.validaciones.OfertaValidacion;
import org.example.validaciones.UsuarioValidacion;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        UsuarioValidacion usuarioValidacion = new UsuarioValidacion();
        OfertaValidacion ofertaValidacion = new OfertaValidacion();
        Scanner teclado= new Scanner(System.in);
        Usuario objetoUsuario = new Usuario();
        Local objetoLocal = new Local();
        Oferta objetoOferta = new Oferta();
        Reserva objetoReserva = new Reserva();

        System.out.println("Digite su nombre ");
        objetoUsuario.setNombre(teclado.nextLine());

        System.out.println("Ingrese su ubicación");
        objetoUsuario.setUbicacion(teclado.nextInt());
        teclado.nextLine();

        System.out.println("Ingrese su correo");
        objetoUsuario.setCorreo(teclado.nextLine());

        System.out.println("Ingrese fecha inicio");
        objetoOferta.setFechainicio(teclado.nextLine());


        System.out.println("ingrese fecha fin");
        objetoOferta.setFechafin(teclado.nextLine());

        System.out.println("Ingrese el costo de la persona");
        objetoOferta.setCostopersona(Double.valueOf(teclado.nextLine()));

        System.out.println("Ingrese el nit");
        objetoLocal.setNit(teclado.nextLine());

        System.out.println("Ingrese el nombre de la empresa");
        objetoLocal.setNombre(teclado.nextLine());

        System.out.println("Ingrese la fecha de reserva");
        objetoReserva.setFechareserva(teclado.nextLine());

        System.out.println("Ingrese el numero de personas para reservar");
        objetoReserva.setNumeroPer(teclado.nextInt());

        System.out.println("registro completo");
    }
}