import GestionFicheros.EjemploFileApp;

public class Main {
    public static void main(String[] args) {
        EjemploFileApp efa = new EjemploFileApp();
        efa.ejemplo();
        efa.mostrarContenido("C:\\Users\\Oscar\\Documents\\School\\2DAM\\Acceso a datos\\Ejercicio ficheros");
        efa.mostrarDiferenciaPath("C:\\Users\\Oscar\\Documents\\School\\2DAM\\Acceso a datos\\Ejercicio ficheros");

    }
}
