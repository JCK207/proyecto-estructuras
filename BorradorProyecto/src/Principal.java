import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    static Scanner sc;
    static List<Tarea>tareas;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        tareas = new LinkedList();
        
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
        System.out.print("Descripcion de la tarea:");
        String descripcion = sc.next();
        System.out.print("Fecha a entregar: ");
        int fecha = sc.nextInt();
        sc.nextLine();
        Tarea tareita = new Tarea(descripcion,fecha);
        tareas.add(tareita);
    }
    
    static void verTareas() {
        
    }
    
    static void verTareasCompletas() {
        int op;
        do{/*if (tareasCompletas.isEmpty()) {
            System.out.println("No hay tareas completadas.");
            return;
        }*/
        System.out.println("Selecciona una opción: ");
        System.out.println("1. Desmarcar tarea como completa");
        System.out.println("2. Eliminar tarea");
        System.out.println("3. Volver al menú principal");
        System.out.print("Selección: ");
        op = sc.nextInt();
        sc.nextLine();
        switch(op){
            case 1 -> desmarcarTarea();
            case 2 -> eliminarTarea();
            case 3 -> System.out.println("Volviendo al menu principal");
            default -> System.out.println("Selección no válida");
        }
        } while (op!=3);
    }
    
    static void salir() {
        
    }
    static void desmarcarTarea(){
        System.out.println("Hola ");
        
    }
    static void eliminarTarea(){
        
    }
}
