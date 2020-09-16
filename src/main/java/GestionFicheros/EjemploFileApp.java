package GestionFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class EjemploFileApp {

    public void ejemplo(){

        //Creamos objetos File
        File fichero=new File("C:\\Users\\Oscar\\Documents\\School\\2DAM\\Acceso a datos\\Ejercicio ficheros\\fich_binario.ddr"); // CAMBIAR DIRECTORIO !!!!
        File fichero2=new File("C:\\Users\\Oscar\\Documents\\School\\2DAM\\Acceso a datos\\Ejercicio ficheros\\fichero.txt");
        File directorio=new File("C:\\Users\\Oscar\\Documents\\School\\2DAM\\Acceso a datos\\Ejercicio ficheros\\prueba");
        File directorio2=new File("C:\\Users\\Oscar\\Documents\\School\\2DAM\\Acceso a datos\\Ejercicio ficheros\\directorio");

        //Creo los ficheros y directorios
        try {
            fichero.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fichero2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        directorio.mkdir();
        directorio2.mkdir();

        //Indica si existen los archivos
        System.out.println("Existencia: ");
        System.out.println("Fichero "+fichero.exists());
        System.out.println("Directorio "+directorio.exists());

        System.out.println("");

        //Indica si son directorios
        System.out.println("¿Son directorios?: ");
        System.out.println("Fichero "+fichero.isDirectory());
        System.out.println("Directorio "+directorio.isDirectory());

        System.out.println("");

        //Indica si son ficheros
        System.out.println("¿Son ficheros?: ");
        System.out.println("Fichero "+fichero.isFile());
        System.out.println("Directorio "+directorio.isFile());

        System.out.println("");

        //Indica la ruta absoluta del fichero o directorio
        System.out.println("Ruta absoluta: ");
        System.out.println("Fichero "+fichero.getAbsolutePath());
        System.out.println("Directorio "+directorio.getAbsolutePath());

        System.out.println("");

        //Indica si se puede leer
        System.out.println("¿Se pueden leer?:");
        System.out.println("Fichero "+fichero.canRead());
        System.out.println("Directorio "+directorio.canRead());

        System.out.println("");

        //Indica si se puede escribir
        System.out.println("¿Se pueden escribir?:");
        System.out.println("Fichero "+fichero.canWrite());
        System.out.println("Directorio "+directorio.canWrite());

        System.out.println("");

        //Indica si se puede ejecutar
        System.out.println("¿Se pueden ejecutar?:");
        System.out.println("Fichero "+fichero.canExecute());
        System.out.println("Directorio "+directorio.canExecute());

        System.out.println("");

        //Indica el nombre sin rutas
        System.out.println("Nombres sin rutas: ");
        System.out.println("Fichero "+fichero.getName());
        System.out.println("Directorio "+directorio.getName());

        System.out.println("");

        //Indica el nombre del directorio padre
        System.out.println("Nombre del directorio padre: ");
        System.out.println("Fichero "+fichero.getParent());
        System.out.println("Directorio "+directorio.getParent());

        System.out.println("");

        //Guarda en un array de File los directorios hijos, solo con directorios
        System.out.println("Nombre de los objetos File dentro de un array");
        File lista[]=directorio.listFiles();
        for(int i=0;i<lista.length;i++){
            System.out.println(lista[i]);
        }

        System.out.println("");

        //Guarda en un array de String los directorios hijos, solo con directorios
        System.out.println("Nombre de los objetos String dentro de un array");
        String listaString[]=directorio.list();
        for(int i=0;i<listaString.length;i++){
            System.out.println(listaString[i]);
        }

        System.out.println("");
    }
    public void mostrarContenido(String ruta){
        String[] nombres;
        String last3Letters = "";
        File directorio = new File(ruta);
        nombres = directorio.list();
        for(int i = 0; i < nombres.length; i++){
            last3Letters = nombres[i].substring(nombres[i].length() - 3);
            System.out.print(" " + nombres[i] + " ");
           if(last3Letters.equalsIgnoreCase("txt")){
               BufferedReader reader;
               try {
                   reader = new BufferedReader(new FileReader(ruta + File.separator + nombres[i]));
                   String line = reader.readLine();
                   while (line != null) {
                       System.out.println(line);
                       // read next line
                       line = reader.readLine();
                   }
                   reader.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }

        }

    }
    public void mostrarDiferenciaPath(String ruta){
        File file = new File(ruta);
        System.out.println("GET PATH: " + file.getPath());
        System.out.println("AbsolutePath: " + file.getAbsolutePath());
        try {
            System.out.println("CanonicalPath: " + file.getCanonicalPath() );
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}