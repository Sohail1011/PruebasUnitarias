package pruebasunitarias;

import java.util.*;
import pruebasunitarias.clases.Sueldo;
import pruebasunitarias.implementaciones.ImpSueldo;
import pruebasunitarias.interfaces.ISueldo;

public class PruebasUnitarias3 {

    public static void main(String[] args) {
        Sueldo objsueldo = new Sueldo();
        ISueldo sueldos = new ImpSueldo();
        Scanner sc = new Scanner(System.in);
        double nh = 0, ch = 0, sb = 0, bon1 = 0, bon2 = 0, des = 0, sf = 0;
        int nhij = 0;

        try {
            System.out.println("Ingresa el numero de horas:");
            nh = sc.nextDouble();
            System.out.println("Ingrese el costo por hora:");
            ch = sc.nextDouble();
            System.out.println("Ingrese el numero de hijos:");
            nhij = sc.nextInt();
            objsueldo.setNumerohoras(nh);
            objsueldo.setCostoporhora(ch);
            objsueldo.setNumerohijos(nhij);
            sb = sueldos.CalcularBasico(objsueldo);
            objsueldo.setSueldobasico(sb);
            bon1 = sueldos.CalcularBonificacion1(objsueldo);
            objsueldo.setBonificacion1((int) bon1);
            bon2 = sueldos.CalcularBonificacion2(objsueldo);
            objsueldo.setBonificacion2((int) bon2);
            des = sueldos.CalcularDescuento(objsueldo);
            objsueldo.setDescuento(des);
            sf = sueldos.CalcularFinal(objsueldo);
            objsueldo.setSueldofinal(sf);
            sueldos.MostrarResultados(objsueldo);
        } catch (InputMismatchException ex) {
            System.err.println("Su ingreso de ese tipo de valor no esta permitido.");
        }

    }
}
