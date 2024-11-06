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
            System.out.println("3. Salir");
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
        System.out.println("Fecha a entregar: ");
        int fecha = sc.nextInt();
        Tarea tareita = new Tarea(descripcion,fecha);
        tareas.add(tareita);
    }
    
    static void verTareas() {
        
    }
    
    static void verTareasCompletas() {
        
    }
    
    static void salir() {
        
    }
    
}
