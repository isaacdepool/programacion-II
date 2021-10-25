//crear un directorio y guardar esta clase, alli deben crear dos archivos de textos
//con los nombres de origen.txt y destino txt, al archivo origen deben abrir y escribir
//una linea cualquiera. Al ejecutar se observa que se hace una copia del contenido
//del archivo origen a destino
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo3
{
	static String ruta = "C:\\Users\\isac\\Desktop\\isaac\\Universidad\\Programacion II";

    public static void main(String[] args) throws IOException
    {	boolean aux = false;
		w("NOMBRE DEL ARCHIVO NUEVO: ");
		String nombre = KbInput.read();
		wln("\n");
		File f1 = new File(ruta + nombre);
		//createNewFile() => Crea un nuevo archivo (versiones >= 1.2)
		if(!f1.exists())	aux = f1.createNewFile();
		if(aux)	wln("ARCHIVO CREADO EXISTOSAMENTE");
		else	wln("NO SE PUDO CREAR EL ARCHIVO");

        FileInputStream in = null; //declara e inicializa streams de entrada
        FileOutputStream out = null;//declara e inicializa streams de salida

        try { //manejo de errores
            in = new FileInputStream(ruta + "origen.txt"); //abre arch. de entrada/lectura
            out = new FileOutputStream(ruta + nombre); //abre arch. de escritura/salida
            int c;//variable que almacenara la linea a leer o escribir
            while ((c = in.read()) != -1) { //mientras sea final de archivo o -1 lee
                out.write(c); //escribe en el arch. de salida el contenido de la
            }	//variable c
        } finally {
            if (in != null) { //al llegar al final del arch. hay que cerrar
                in.close();
            }
            if (out != null) {//al llegar al final del arch. hay que cerrar
                out.close();
            }
        }

    }//main

	static void w(String s)
	{	System.out.print(s);
	}//w

	static void wln(String s)
	{	System.out.println(s);
	}//wln

}//class
