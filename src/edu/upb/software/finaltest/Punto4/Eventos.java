package edu.upb.software.finaltest.Punto4;

public class Eventos {

    private int id;
    private String nombre;
    private String direccion;
    private int hora;//Lo ponemos en INT para prevenir problemas en la codificacion que este configurada en el computador
    private int fecha;

    public Eventos(int id, String nombre, String direccion, int hora, int fecha) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.hora = hora;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String revisarEvento(Eventos e){
        return e.toString();
    }

    @Override
    public String toString() {
        return "Eventos{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", hora=" + hora +
                ", fecha=" + fecha +
                '}';
    }
}
