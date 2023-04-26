public class HistoriaClinica {
    private int nroHistoriaClinica;
    private Date fechaCreacion;
    private int nroPaciente;
    private int matriculaMedico;
    
    
    public HistoriaClinica(int nroHistoriaClinica, Date fechaCreacion, int nroPaciente, int matriculaMedico) {
        this.nroHistoriaClinica = nroHistoriaClinica;
        this.fechaCreacion = fechaCreacion;
        this.nroPaciente = nroPaciente;
        this.matriculaMedico = matriculaMedico;
    }
    
    public int getNroHistoriaClinica() {
        return nroHistoriaClinica;
    }
    
    public void setNroHistoriaClinica(int nroHistoriaClinica) {
        this.nroHistoriaClinica = nroHistoriaClinica;
    }
    
    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    public int getNroPaciente() {
        return nroPaciente;
    }
    
    public void setNroPaciente(int nroPaciente) {
        this.nroPaciente = nroPaciente;
    }
    
    public int getMatriculaMedico() {
        return matriculaMedico;
    }
    
    public void setMatriculaMedico(int matriculaMedico) {
        this.matriculaMedico = matriculaMedico;
    }
}

public class Paciente extends HistoriaClinica {
    private String nombre;
    private String apellido;
    
    
    public Paciente(int nroHistoriaClinica, Date fechaCreacion, int nroPaciente, int matriculaMedico,
                    String nombre, String apellido) {
        super(nroHistoriaClinica, fechaCreacion, nroPaciente, matriculaMedico);
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}

public class Medico extends HistoriaClinica {
    private String nombre;
    private String apellido;
    
    
    public Medico(int nroHistoriaClinica, Date fechaCreacion, int nroPaciente, int matriculaMedico,
                  String nombre, String apellido) {
        super(nroHistoriaClinica, fechaCreacion, nroPaciente, matriculaMedico);
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}

