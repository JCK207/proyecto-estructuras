import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    static Scanner sc;
    static List<Tarea> tareas;
    static List<Tarea> tareasCompletas;
    
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        tareas = new LinkedList();
        tareasCompletas = new LinkedList();
        
        System.out.println("GESTIÓN DE TAREAS");
        
        int opcion;
        do {
            System.out.println();
            System.out.println("1. Crear Tarea");
            System.out.println("2. Ver Tareas");
            System.out.println("3. Ver Tareas Completas");
            System.out.println("4. Salir");
            System.out.print("Selección: ");
            opcion = sc.nextInt();
            System.out.println();
            
            switch (opcion) {
                case 1 -> crearTarea();
                case 2 -> verTareas();
                case 3 -> verTareasCompletas();
                case 4 -> salir();
                default -> System.out.println("Selección no válida");
            }
        } while (opcion!=4);
    }
    
    static void crearTarea() {
        System.out.println("Descripcion de la tarea:");
        String descripcion = sc.next();
        tareas.add(new Tarea(descripcion));
    }
    
    
    static void verTareas() {
        if (tareas.isEmpty()){
            System.out.println("No hay tareas sin completar");
            if (!tareasCompletas.isEmpty())
                System.out.println("Puede desmacarcar como completa una tarea");
            return;
        }
        
        System.out.println("Tareas creadas:");
        imprimirTareas(tareas);
        
        System.out.println();
        System.out.println("Seleccione una Tarea para modificar");
        Tarea tarea = (Tarea)seleccionarDeLista(tareas);
        if (tarea==null) return;
        
        int opcion;
        do {
            System.out.println();
            System.out.println("1. Marcar como completa");
            System.out.println("2. Agregar subtarea");
            System.out.println("3. Modificar subtareas");
            System.out.println("4. Modificar descripción");
            System.out.println("5. Agregar o Modificar Fecha de entrega");
            System.out.println("6. Volver al Menú Principal");
            System.out.print("Selección: ");
            opcion = sc.nextInt();
            System.out.println();
            
            switch (opcion) {
                case 1 -> {
                    tareas.remove(tarea);
                    tareasCompletas.add(tarea);
                    System.out.println("Tarea marcada como completa");
                    return;
                }
                case 2 -> {
                    System.out.println("Descripción de subtarea:");
                    tarea.agregarSubtarea(sc.nextLine());
                }
                case 3 -> {
                    //Agregar menú;
                }
                case 4 -> {
                    System.out.println("Descripcion de la tarea:");
                    tarea.setDescripcion(sc.nextLine());
                }
                case 5 -> {
                    System.out.println("Fecha a entregar:");
                    tarea.setFecha(sc.nextInt());
                }
                case 6 -> System.out.println("Volviendo");
                default -> System.out.println("Selección no válida");
            }
        } while (opcion!=6);
    }
    
    
    static void verTareasCompletas() {
        if (tareasCompletas.isEmpty()){
            System.out.println("No hay tareas completas");
            return;
        }
        
        imprimirTareas(tareasCompletas);
        
        //Agregar menú
    }
    
    
    static void salir() {
        //Agregar menú
    }
    
    
    static void imprimirTareas(List lista) {
        for (int i=0; i<lista.size(); i++) {
            Tarea tarea = (Tarea)lista.get(i);
            System.out.print(i+1 + ". " + tarea.getDescripcion());
            
            if (tarea.getFecha()!=0)
                System.out.println(" Fecha: " + tarea.getFecha());
            
            List<String> subTareas = tarea.getSubtareas();
            if (subTareas!=null) {
                System.out.println("Subtareas:");
                for (String subTarea : subTareas) {
                    System.out.println(subTarea);
                }
            }
        }
    }
    
    
    static Object seleccionarDeLista(List lista) {
        int seleccion;
        System.out.println("0 para Cancelar");
        do {
            System.out.print("Selección: ");
            seleccion = sc.nextInt();
            if (seleccion==0) return null; //selección para cancelar
            if (seleccion<0 || seleccion>lista.size()) System.out.println("Selección no válida");
        } while (seleccion<0 || seleccion>lista.size());
        
        return lista.get(seleccion-1); //se requiere un cast de la clase de llegada al llamar el método
    }
    
    
}
