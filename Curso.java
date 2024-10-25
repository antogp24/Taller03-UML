package ec.edu.espol;

import java.util.List;

public class Curso {
    private String id;
    private String nombre;
    private boolean estadoDisponible;
    private List<Foro> foros;
    private List<ActividadSumativa> actividadesSumativas;
    private List<Estudiante> estudiantesInscritos;
    private List<Estudiante> estudiantesEnEsperaDeInscripcion;
    private Profesor responsable;
}
