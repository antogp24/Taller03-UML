package ec.edu.espol;

import java.time.LocalDateTime;
import java.util.List;

public class Incidente {
    protected int id;
    protected LocalDateTime fecha_reportado;
    protected String estado;
    protected String titulo;
    protected String descripción;
    protected List<String> log_actualizaciones;
    protected LocalDateTime fecha_cerrado;
    protected String tipo;
    private Usuario responsable;
    private PersonalAcademico beneficiario;
}
