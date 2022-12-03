package SBGH;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Resuelto {

    //* Obtener la cantidad de cursos con una duración mayor a 5 horas.
    public int duracionMayor5(List<Curso> cursos){
           return cursos.stream()
                   .filter(x-> x.getDuracion() > 5f)
                   .mapToInt(y ->1)
                   .sum();
    }
    //Obtener la cantidad de cursos con una duración menor a 2 horas.
    public int duracionMenor2(List<Curso> cursos) {
        return cursos.stream()
                .filter(x -> x.getDuracion() < 2f)
                .mapToInt(y -> 1)
                .sum();
    }
    //Listar el título de todos aquellos cursos con una cantidad de vídeos mayor
    //     * a 50.
    public void tituloCantidadCursosMayor50(List<Curso> cursos){
        cursos.stream()
                .filter(x -> x.getVideos()>50)
                .map(y -> y.getTitulo())
                .forEach(System.out::println);
    }
    //Mostrar en consola el título de los 3 cursos con mayor duración.
    public void tituloMayorDuracion3(List<Curso>cursos){
        cursos.stream()
                .sorted(Comparator.comparing(Curso::getDuracion).reversed())
                .limit(3)
                .forEach(x-> System.out.println(x.getTitulo()));
    }
    //Mostrar en consola la duración total de todos los cursos.
    public Double duracionTotal(List<Curso> cursos){
        return cursos.stream()
                .mapToDouble(x ->x.getDuracion())
                .sum();

    }
    //Mostrar en consola todos aquellos libros que superen el promedio en
    //     * cuanto a duración se refiere.
    public void mostrarCursosMayorPromedio(List<Curso> cursos){
      /* Double promedio= cursos.stream()
                .mapToDouble(x->x.getDuracion())
                .summaryStatistics()
                .getAverage();
        */
        double promedio =duracionTotal(cursos) / cursos.size();
        System.out.println("Promedio: " + promedio + " horas");
       cursos.stream()
               .filter(x->x.getDuracion() > promedio)
               .forEach(y-> System.out.println("Titulo: " + y.getTitulo()
                            +" , duracion: " + y.getDuracion() + " horas"));
    }
    //Mostrar en consola la duración de todos aquellos cursos que tengan una
    //     * cantidad de alumnos inscritos menor a 500.
    public void cursosMenos500Alumnos(List<Curso> cursos){
        cursos.stream()
                .filter(x->x.getAlumnos()<500)
                .forEach(y-> System.out.println(
                        "Titulo: " + y.getTitulo()
                        + ", Duracion: " + y.getDuracion()
                        + ", Alumnos: " + y.getAlumnos()));
    }
    public String cursoConMayorDuracion(List<Curso> cursos){
        return cursos.stream()
                .max(Comparator.comparing(Curso::getDuracion))
                .get().getTitulo();
    }
    // Crear una lista de Strings con todos los titulos de los cursos.
    public List<String> getListaDelCurso(List<Curso> curso){
        return curso.stream()
                .map(x-> x.getTitulo())
                .collect(Collectors.toList());
    }
}
