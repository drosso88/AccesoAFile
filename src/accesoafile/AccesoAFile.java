/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoafile;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 *
 * @author rocio
 */
public class AccesoAFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //esto es la ruta relativa, en la que la carpeta debe de estar dentro del archivo del programa
        File f = new File("proyecto\\codigo_descarga_certificado.txt");
        SimpleDateFormat sdf= new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

        if (f.exists()) {
            System.out.println("Nombre" + f.getName());
            System.out.println("ultima modificación" + sdf.format(f.lastModified()));
            System.out.println("Directorio padre" + f.getParent());
            System.out.println("Ruta Relativa" + f.getPath());
            System.out.println("Ruta Absoluta" + f.getAbsolutePath());
        }else{
            System.out.println("Aquí no hay nada oiga!");
                    
        }
    }
}
