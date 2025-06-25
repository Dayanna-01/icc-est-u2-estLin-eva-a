package main;

import java.util.LinkedList;
import java.util.Queue;
import static main.LogicaClasificacion.invertirColaNombres;
import utils.StudentValidator;

public class App {
    public static void main(String[] args) {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ

        // Ejercicio 1
        System.out.println("Ejercicio 1");

        Queue<String> nombres = new LinkedList<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Pedro");

        Queue<String> invertida = invertirColaNombres(nombres);

        System.out.println("Los nombres ya ingresados son: " + nombres);
        System.out.println("Cola invertida: " + invertida);
    }
}
