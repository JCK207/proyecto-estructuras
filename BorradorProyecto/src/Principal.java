import java.util.Scanner;

public class Principal {
    static Scanner sc;
    
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        
        System.out.println("GESTI�N DE TAREAS");
        
        int opcion;
        do {
            System.out.println();
            System.out.println("1. Crear Tarea");
            System.out.println("2. Ver Tareas");
            System.out.println("3. Ver Tareas Completas");
            System.out.println("3. Salir");
            System.out.print("Selecci�n: ");
            opcion = sc.nextInt();
            System.out.println();
            
            switch (opcion) {
                case 1 -> crearTarea();
                case 2 -> verTareas();
                case 3 -> verTareasCompletas();
                case 4 -> salir();
                default -> System.out.println("Selecci�n no v�lida");
            }
        } while (opcion!=4);
    }
    
    static void crearTarea() {
        
    }
    
    static void verTareas() {
        
    }
    
    static void verTareasCompletas() {
        
    }
    
    static void salir() {
        
    }
    
}
