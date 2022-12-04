package Tarea1Stream.CHGT;

import Tarea1Stream.Curso;

import java.awt.font.NumericShaper;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

// Y la siguiente coleccion
public class Coleccion {
    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Curso profesional de Java", 6.5f, 50, 200 ));
        cursos.add(new Curso("Curso profesional de Python", 8.5f, 60, 800 ));
        cursos.add(new Curso("Curso profesional de DB", 4.5f, 70, 700 ));
        cursos.add(new Curso("Curso profesional de Android", 7.5f, 10, 400 ));
        cursos.add(new Curso("Curso profesional de Escritura", 1.5f, 10, 300));


        System.out.println("********************************************************\n");

        Long cantidad = cursos.stream()
                .filter(value -> value.getDuracion() >= 5f)
                .count();
        System.out.println("Ejercicio 1: Cantidad de cursos mayores a 5 Horas: " + cantidad);

        System.out.println("\n********************************************************\n");

        cantidad = cursos.stream()
                        .filter(value -> value.getDuracion() <= 2f)
                        .count();
        System.out.println("Ejercicio 2: Cursos menores a 2 Horas: " + cantidad);

        System.out.println("\n********************************************************\n");
        System.out.println("Ejercicio 3: Cursos con mas de 50 videos: ");
        cursos.stream()
                .filter(value -> value.getVideos() >= 50)
                .forEach(a -> System.out.print("-"+a.getTitulo()+"\n"));

        System.out.println("\n********************************************************\n");
        System.out.println("Ejercicio 4: Estos son los 3 cursos mas largos");
         cursos.stream().
         sorted(Comparator.comparing(Curso::getDuracion).reversed())
                 .limit(3)
                 .forEach(a -> System.out.println(a.getTitulo()));


        System.out.println("\n********************************************************\n");
        System.out.println("Ejercicio 5: ");
        System.out.println("Esta es la duracion total de los cursos = "+cursos.stream()
                .mapToDouble(value -> value.getDuracion())
                .sum() + " Horas\n");

        System.out.println("********************************************************\n");
        Double promedio = cursos.stream()
                .mapToDouble(value -> value.getDuracion())
                .average()
                .getAsDouble();
        System.out.println("Ejercicio 6: Libros con mayor duracion al promedio("+promedio+"): ");
        cursos.stream()
                .filter(value -> value.getDuracion() >promedio)
                .forEach(a -> System.out.print("-"+a.getTitulo()+"\n"));

        System.out.println("\n********************************************************\n");
        System.out.println("Ejercicio 7: Duracion de los cursos con menos de 500 alumnos:");
        cursos.stream()
                .filter(value -> value.getAlumnos() <500)
                .forEach(a -> System.out.print("-"+a.getDuracion()+" Horas\n"));

        System.out.println("\n********************************************************\n");
        System.out.println("Ejercicio 8: Curso con mayor duracion es el");
        double cursoMasLargo = cursos.stream()
                .mapToDouble(value -> value.getDuracion())
                .max()
                .getAsDouble();
        cursos.stream()
                .filter(value -> value.getDuracion() >= cursoMasLargo)
                .forEach(a -> System.out.println(a.getTitulo()));

        System.out.println("\n********************************************************\n");
        System.out.println("Ejercicio 9: Lista de todos los cursos:");
        List<String> list;
        list= cursos.stream()
                .map(a->a.getTitulo())
                .collect(Collectors.toList());
        System.out.println(list);
    }

    /***
     * Resolver los siguientes problemas:
     * Obtener la cantidad de cursos con una duración mayor a 5 horas.
     * Obtener la cantidad de cursos con una duración menor a 2 horas.
     * Listar el título de todos aquellos cursos con una cantidad de vídeos mayor
     * a 50.
     * Mostrar en consola el título de los 3 cursos con mayor duración.
     * Mostrar en consola la duración total de todos los cursos.
     * Mostrar en consola todos aquellos libros que superen el promedio en
     * cuanto a duración se refiere.
     * Mostrar en consola la duración de todos aquellos cursos que tengan una
     * cantidad de alumnos inscritos menor a 500.
     * Obtener el curso con mayor duración.
     * Crear una lista de Strings con todos los titulos de los cursos.
     *
     * Una vez terminado subirlo al repositorio
     */
}
