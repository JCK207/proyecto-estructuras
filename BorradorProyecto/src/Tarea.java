
import java.util.LinkedList;
import java.util.List;

public class Tarea {

    String descripcion;
    int fecha;
    List<Tarea> subTareas;

    public Tarea(String descripcion, int fecha) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.subTareas = new LinkedList();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public List getSubTareas() {
        return subTareas;
    }

    public void setSubTareas(List subTareas) {
        this.subTareas = subTareas;
    }

}
