package pruebasunitarias;

import java.util.InputMismatchException;
import java.util.Scanner;
import pruebasunitarias.clases.Operacion;
import pruebasunitarias.implementaciones.ImpOperacion;
import pruebasunitarias.interfaces.IOperacion;

public class PruebasUnitarias2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Creamos un objeto de la clase
        Operacion objoperacion = new Operacion();
        // Implementamos el interfaz
        IOperacion operaciones = new ImpOperacion();
        // Declaramos las variables
        double n1 = 0, n2 = 0, sum = 0, res = 0, mul = 0, div = 0;
        // Capturando valores
        try {
            System.out.println("Ingresa el número 1: ");
            n1 = sc.nextDouble();
            System.out.println("Ingresa el número 2: ");
            n2 = sc.nextDouble();
            // Enviamos los valores a la clase
            objoperacion.setNumero1(n1);
            objoperacion.setNumero2(n2);
            // Calcula las operaciones
            sum = operaciones.CalculaSuma(objoperacion);
            mul = operaciones.CalculaMultiplicacion(objoperacion);
            div = operaciones.CalculaDivision(objoperacion);
            res = operaciones.CalculaResta(objoperacion);
            // Enviamos los valores
            objoperacion.setSuma(sum);
            objoperacion.setResta(res);
            objoperacion.setMultiplicacion(mul);
            objoperacion.setDivision(div);
            // Mostramos los datos
            operaciones.MostrarDatos(objoperacion);
        } catch (InputMismatchException e) {
            System.err.println("El valor no es permitido.");
        }
    }
}
