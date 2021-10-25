import java.io.*;

public class FileDemo05
{
	static String ruta = "C:\\Users\\isac\\Desktop\\isaac\\Universidad\\Programacion II\\Base de Datos\\";

    public static void main(String[] args) throws IOException
    {	boolean aux = false;
		w("NOMBRE DEL ARCHIVO NUEVO: ");
		String nombre = KbInput.read();
		wln("\n");
		File f1 = new File(nombre);
		//if(!f1.exists())	aux = f1.createNewFile();
		//if(aux)
		//{
			escribir(nombre);
			wln("ARCHIVO CREADO EXITOSAMENTE\n\n");
			Leer(nombre);
		//}//if
		//else	wln("NO SE PUDO CREAR EL ARCHIVO");
	}//main

	//METODO PARA ESCRIBIR EN UN ARCHIVO
	public static void escribir(String nombreArchivo)
	{
		File f = new File(nombreArchivo);
		//Escritura
		try{
			FileWriter w = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(w);
			PrintWriter wr = new PrintWriter(bw);
			//write() => Se utiliza para escribir en el archivo
			wr.append("Esta es una linea de codigo"+"\r\n");
			//NOTA: "\r\n" es la manera como se debe bajar lineas en el archivo
			//luego que se ha escrito la primera vez, las siguientes se debe es concatenar
			//para eso se usa append()
			wr.append(" y esta es otra linea de codigo x"+"\r\n");
		    //finalmente se debe cerrar los flujos de canales de datos, al cerrarlos el
		    //archivo quedará guardado con información escrita de no hacerlo no se
		    //escribirá nada en el archivo
			wr.close();
			bw.close();
		}catch(IOException e){};
	}//escribir


	/*Función que lee el contenido de un fichero de texto
	  Parámetro:Ffichero. Objeto de la clase file donde se va a leer*/
	public static  void Leer(String nombreArchivo)
	{	File f = new File(nombreArchivo);
   		try
   		{	/*Si existe el fichero*/
       		if(f.exists())
       		{	/*Abre un flujo de lectura a el fichero*/
           		BufferedReader Flee = new BufferedReader(new FileReader(nombreArchivo));
           		String Slinea;
           		System.out.println("**********Leyendo Fichero***********");
           		/*Lee el fichero linea a linea hasta llegar a la ultima*/
           		while((Slinea=Flee.readLine())!=null)
           		{	/*Imprime la linea leida*/
           			System.out.println(Slinea);
           		}//WHILE
           		System.out.println("*********Fin Leer Fichero**********");
           		/*Cierra el flujo*/
           		Flee.close();
         	}
         	else
           		System.out.println("Fichero No Existe");
   		}//try
   		catch (Exception ex)
   		{  	/*Captura un posible error y le imprime en pantalla*/
        	System.out.println(ex.getMessage());
   		}//catch
 	}//Leer

	static void w(String s)
	{	System.out.print(s);
	}//w

	static void wln(String s)
	{	System.out.println(s);
	}//wln

}//class
