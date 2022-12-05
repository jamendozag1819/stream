package KYRA;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Y la siguiente coleccion
public class Coleccion {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Cursos profesional de Java", 6.5f, 50, 200 ));
        cursos.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800 ));
        cursos.add(new Curso("Cursos profesional de DB", 4.5f, 70, 700 ));
        cursos.add(new Curso("Cursos profesional de Android", 7.5f, 10, 400 ));
        cursos.add(new Curso("Cursos profesional de Escritura", 1.5f, 10, 300));
    System.out.println("La cantidad de cursos mayor a cinco horas:"+cursos.stream().filter(mostrar->mostrar.getDuracion()>5).count());
    System.out.println("La cantidad de cursos menor de dos horas:"+cursos.stream().filter(mostrardos->mostrardos.getDuracion()<2).count());
    System.out.println("\n");
    cursos.stream().filter(mostrar3->mostrar3.getVideos()>=50).forEach(recorrido->System.out.println(recorrido.getTitulo()));
        System.out.println("\n"); System.out.println("Estos son los 3 cursos con mayor duracion");
    cursos.stream().sorted(Comparator.comparing(Curso::getDuracion).reversed()).limit(3).forEach(rec->System.out.println(rec.getTitulo()));
    System.out.println("la duracion total de los cursos:"+cursos.stream().mapToDouble(Curso::getDuracion).sum());
    double promedio=cursos.stream().mapToDouble(Curso::getDuracion).average().getAsDouble();System.out.println("El promedio es igual"+promedio);
    cursos.stream().filter(mostrar5->mostrar5.getDuracion()>promedio).forEach(recorre->System.out.println(recorre.getTitulo()));
    cursos.stream().filter(mostrar6->mostrar6.getAlumnos()<500).forEach(recoree->System.out.println(recoree.getDuracion()));
    double maxi=cursos.stream().mapToDouble(Curso::getDuracion).max().getAsDouble();
    cursos.stream().filter(mostrar7->mostrar7.getDuracion()==maxi).forEach(reco->System.out.println(reco.getTitulo()));
    List <String> listin = cursos.stream().map(mostrar8->mostrar8.getTitulo()).collect(Collectors.toList());
    System.out.println("los titulo del curso son: "+listin);



    }
    /**select  count(curso) from cursos where =duracion>5;
     * select count(curso) from cursos where duracion<2;
     * select titulocurso,count(videos),from cursos where videos>50  desc;
     * *select titulo,duracion from cursos limit 3  group by titulo,duracion asc ;
     * select sum(duracion) from cursos;
     * select avg(duracion)/5,titulo from cursos where duracion>5.7 group by titulo
     * select  titulo ,max(duracion) from cursos
     * select
    /***
     * Resolver los siguientes problemas:
     * Obtener la cantidad de cursos con una duración mayor a 5 horas.
     * Obtener la cantidad de cursos con una duración menor a 2 horas.
     * Listar el título de todos aquellos cursos con una cantidad de vídeos mayor
     * a 50.
     * Mostrar en consola el título de los 3 cursos con mayor duración.
     * Mostrar en consola la duración total de todos los cursos.
     * Mostrar en consola todos los cursos que superen el promedio en
     * cuanto a duración se refiere.
     * Mostrar en consola la duración de todos aquellos cursos que tengan una
     * cantidad de alumnos inscritos menor a 500.
     * Obtener el curso con mayor duración.
     * Crear una lista de Strings con todos los titulos de los cursos.
     *
     * Una vez terminado subirlo al repositorio
     */
}
