/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.if3000.biblioteca.domain;

import java.io.PrintStream;
import static java.lang.Boolean.TRUE;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author ValeriaLeivaQuirós
 */
public class PruebasVale {

    public static void main(String[] args) throws ParseException {

        Biblioteca biblioteca = new Biblioteca();
        String contraseña = "l";
        String contraseñaEncriptada = DigestUtils.md5Hex(contraseña);
        Autor autor = new Autor("l", contraseñaEncriptada, "l", "l", "l");
        Autor autor1 = new Autor("a", "b", "b", "a", "a");

        biblioteca.agregarPersona(autor);
        biblioteca.agregarPersona(autor1);

        for (int i = 0; i < biblioteca.getPersonas().size(); i++) {
            System.out.println(biblioteca.getPersonas().get(i).toString());

        }
        System.out.println(biblioteca.buscarPersona(autor1));

        Catalogo libro = new Libro("ss", "s", "sss");
        biblioteca.agregarCatalogo(libro);

        System.out.println("Libro" + biblioteca.getCatalogos().get(0));

        String date = "22-4-1812";
        String date1 = "22-9-1812";

        Prestamo prestamo = new Prestamo(0, autor, date, date1);

        biblioteca.registrarPrestamo(libro, prestamo);

        System.out.println("Prestamo" + biblioteca.getCatalogos().get(0).getPrestamo());

        System.out.println("Libros prestados" + biblioteca.catalogoPrestado().get(0));
   
        System.out.println(biblioteca.listadeUsuariosMorosos().get(0));
    }

}
