package Tarea1Stream.MGAH;

import Tarea1Stream.Curso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Coleccion_MGAH {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Cursos profesional de Java", 6.5f, 50, 200 ));
        cursos.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800 ));
        cursos.add(new Curso("Cursos profesional de DB", 4.5f, 70, 700 ));
        cursos.add(new Curso("Cursos profesional de Android", 7.5f, 10, 400 ));
        cursos.add(new Curso("Cursos profesional de Escritura", 1.5f, 10, 300));

        /**Obtener la cantidad de cursos con una duración mayor a 5 horas.**/
        System.out.println("1.- Cantidad de cursos mayor a 5 hrs: " + cursos.stream()
                .filter(Curso->Curso.getDuracion()>5)
                .count());
        /**Obtener la cantidad de cursos con una duración menor a 2 horas.**/
        System.out.println("2.- Cantidad de cursos menor a 2 horas: " +cursos.stream()
                .filter(Curso->Curso.getDuracion()<2)
                .count());
        /**Listar el título de todos aquellos cursos con una cantidad de vídeos mayor a 50.**/

        System.out.println("3.- Títulos con cantidad mayor a 50 videos: ");
        cursos.stream()
                .filter(Curso->Curso.getVideos()>50)
                .map(Curso::getTitulo)
                .forEach(System.out::println);

        /**Mostrar en consola el título de los 3 cursos con mayor duración.**/
        System.out.println("4.- Títulos con duración mayor: ");

        cursos.stream().sorted(Comparator.comparing(Curso::getDuracion).reversed())
                .limit(3).forEach(curso -> System.out.println(curso.getTitulo()));


        /**Mostrar en consola la duración total de todos los cursos.**/
        /**System.out.println("Duración total de  cursos");
         Float sumaDuracion = 0.00f;
         for (Curso curso : cursos){
         sumaDuracion += curso.getDuracion();
         }
         System.out.println("Duración total de  cursos: " +sumaDuracion + "horas");**/

        System.out.println("5.-Duración total de los cursos: " +cursos.stream().mapToDouble(Curso::getDuracion).sum() + "hrs");

        /**Mostrar en consola todos aquellos libros que superen el promedio en cuanto a duración se refiere.**/

        DoubleSummaryStatistics prom = cursos.stream().collect(Collectors.summarizingDouble(Curso::getDuracion));
        System.out.println("6.- Promedio es igual a " + prom.getAverage() + " y los cursos con duración amyor al promedio son: ");
        cursos.stream().filter(Curso->Curso.getDuracion() > prom.getAverage()).map(Curso::getTitulo).forEach(System.out::println);


        /**Mostrar en consola la duración de todos aquellos cursos que tengan una cantidad de alumnos inscritos menor a 500.**/

        System.out.println("7.- Duración de los cursos con alumnos inscritos menor a 500");
        cursos.stream()
                .filter(Curso->Curso.getAlumnos()<500)
                .map(Curso::getDuracion)
                .forEach(System.out::println);

        /**Obtener el curso con mayor duración.**/
        Curso mayorD = cursos.stream().max(Comparator.comparing( p -> ((Curso) p).getDuracion())).get();
        System.out.println("8.- Curso con mayor duración: " + mayorD.getTitulo() + " con una duración de "+ mayorD.getDuracion() +"hrs");

        System.out.println("9.- Lista de títulos");
        cursos.stream()
                .map(Curso::getTitulo)
                .forEach(System.out::println);


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
