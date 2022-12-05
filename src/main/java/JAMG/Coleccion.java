package JAMG;

import Tarea1Stream.Curso;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

// Y la siguiente coleccion
public class Coleccion {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Cursos profesional de Java", 6.5f, 50, 200));
        cursos.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800));
        cursos.add(new Curso("Cursos profesional de DB", 4.5f, 70, 700));
        cursos.add(new Curso("Cursos profesional de Android", 7.5f, 10, 400));
        cursos.add(new Curso("Cursos profesional de Escritura", 1.5f, 10, 300));


        /* Obtener la cantidad de cursos con una duración mayor a 5 horas. */
        System.out.println("Obtener la cantidad de cursos con una duración mayor a 5 horas.");
        System.out.println("Total : " + cursos.stream().filter(curso -> curso.getDuracion() > 5f)
                .count());
        /* Obtener la cantidad de cursos con una duración menor a 2 horas. */
        System.out.println("Obtener la cantidad de cursos con una duración menor a 2 horas.");
        System.out.println("Total : " + cursos.stream().filter(curso -> curso.getDuracion() < 2f)
                .count());

        /* Listar el título de todos aquellos cursos con una cantidad de vídeos mayor 50 */
        System.out.println("Listar el título de todos aquellos cursos con una cantidad de vídeos mayor 50.");
        System.out.println("Total : " + cursos.stream().filter(curso -> curso.getVideos() > 50)
                .count());

        /* Mostrar en consola el título de los 3 cursos con mayor duración. */
        System.out.println("Mostrar en consola el título de los 3 cursos con mayor duración.");
        cursos.stream().map(curso -> curso.getDuracion()).
                sorted((o1, o2) -> o2.compareTo(o1)).
                limit(3).
                forEach(c -> {
                    System.out.println("Curso : " + cursos.stream().filter(curso -> curso.getDuracion() == c).findFirst().get().getTitulo());
                });

        /* Mostrar en consola la duración total de todos los cursos. */
        System.out.println("Mostrar en consola la duración total de todos los cursos.");
        double sumaDuracion = cursos.stream()
                .mapToDouble(value -> value.getDuracion())
                .reduce((x, y) -> x + y).getAsDouble();
        System.out.println("Total : " + sumaDuracion);

        /* Mostrar en consola todos aquellos cursos que superen el promedio en cuanto a duración se refiere. */
        System.out.println("Mostrar en consola todos aquellos cursos que superen el promedio en cuanto a duración se refiere.");
        double promedio = sumaDuracion / cursos.size();
        System.out.println("Promedio : " + promedio);
        cursos.stream().filter(curso -> curso.getDuracion() > promedio)
                .forEach(curso -> {
                    System.out.println(curso.getTitulo());
                });

        /* Mostrar en consola la duración de todos aquellos cursos que tengan una cantidad de alumnos inscritos menor a 500. */
        System.out.println("Mostrar en consola la duración de todos aquellos cursos que tengan una cantidad de alumnos inscritos menor a 500.");
        System.out.println("Total duración: " + cursos.stream().filter(curso -> curso.getAlumnos() < 500)
                .map(curso -> curso.getDuracion())
                .mapToDouble((x) -> x).sum()
        );

        /* Obtener el curso con mayor duración. */
        System.out.println("Obtener el curso con mayor duración.");
        System.out.println("Duración : " + cursos.stream().map(curso -> curso.getDuracion()).max((o1, o2) -> o1.compareTo(o2)).get());

        /* Crear una lista de Strings con todos los titulos de los cursos. */
        System.out.println("Crear una lista de Strings con todos los titulos de los cursos.");
        List<String> listaTitulos = (List<String>) cursos.stream().map(curso -> curso.getTitulo()).collect(Collectors.toList());

        listaTitulos.forEach(System.out::println);
    }
    /***
     * Resolver los siguientes problemas:
     * Obtener la cantidad de cursos con una duración mayor a 5 horas.
     * Obtener la cantidad de cursos con una duración menor a 2 horas.
     * Listar el título de todos aquellos cursos con una cantidad de vídeos mayor
     * a 50.
     * Mostrar en consola el título de los 3 cursos con mayor duración.
     * Mostrar en consola la duración total de todos los cursos.
     * Mostrar en consola todos aquellos cursos que superen el promedio en
     * cuanto a duración se refiere.
     * Mostrar en consola la duración de todos aquellos cursos que tengan una
     * cantidad de alumnos inscritos menor a 500.
     * Obtener el curso con mayor duración.
     * Crear una lista de Strings con todos los titulos de los cursos.
     *
     * Una vez terminado subirlo al repositorio
     */
}
