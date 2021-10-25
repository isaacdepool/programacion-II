import java.io.*;
import java.io.PrintWriter;

public class FileDemo06
{
	static String ruta = "E:\\GILBERTO\\";

    public static void main(String[] args) throws IOException
    {	byte opc;
    	do{	opc = menu();
    		BL(30);
    		switch(opc)
    		{	case 1: CrearA();	break;
    			case 2: EscribeA();	break;
    			case 3: MostrarA();	break;
			}//switch
		}while(opc != 0);
	}//main

	//METODO PARA CREAR UN ARCHIVO
	public static void CrearA() throws IOException
	{	boolean aux = false;
		w("NOMBRE DEL ARCHIVO NUEVO: ");
		String nombre = KbInput.read();
		wln("\n");
		File f1 = new File(ruta + nombre);
		if(!f1.exists())	aux = f1.createNewFile();
		if(aux)	wln("ARCHIVO CREADO EXITOSAMENTE");
		else	wln("NO SE PUDO CREAR EL ARCHIVO");
		Detener();
	}//CrearA

	//METODO PARA MOSTRAR EL MENU DE OPCIONES
	public static byte menu()
	{	BL(30);
		wln("\tMENU PRINCIPAL DE OPCIONES:\n");
		wln("0.- SALIR DEL SISTEMA");
		wln("1.- CREAR ARCHIVO NUEVO");
		wln("2.- INGRESAR DATOS A UN ARCHIVO");
		wln("3.- MOSTRAR DATOS DE UN ARCHIVO\n");
		w("ESCOJA SU OPCION = ");
		return Byte.parseByte(KbInput.read());
	}//menu


	//METODO PARA ESCRIBIR EN UN ARCHIVO
	public static void EscribeA() throws IOException
	{	w("NOMBRE DEL ARCHIVO NUEVO: ");
		String nombre = KbInput.read();
		File f = new File(ruta + nombre);
		if(f.exists())
		{	BufferedWriter bw = new  BufferedWriter( new OutputStreamWriter(new FileOutputStream(ruta + nombre, true)));
			w("NOMBRE DEL ALUMNO = ");
			String nom = KbInput.read();
			w("APELLIDO DEL ALUMNO = ");
			String ape = KbInput.read();
			w("CEDULA = ");
			int ced = Integer.parseInt(KbInput.read());
			bw.write(nom + " " + ape + " " + ced);
			bw.newLine();
			bw.flush();
			bw.close();
			wln("DATOS GUARDADOS CON EXITO EN EL ARCHIVO");
		}//if
		else
			wln("EL ARCHIVO SOLICITADO NO HA SIDO CREADO");
		Detener();
		return;
	}//escribeA

	public static  void MostrarA() throws IOException
	{	w("NOMBRE DEL ARCHIVO NUEVO: ");
		String nombre = KbInput.read();
		File f = new File(ruta + nombre);
   		try
   		{	if(f.exists())
       		{	BufferedReader Flee= new BufferedReader(new FileReader(ruta + nombre));
           		String Slinea;
           		wln("**********Leyendo Fichero***********\n");
           		while((Slinea=Flee.readLine())!=null)
           			System.out.println(Slinea);
           		System.out.println("\n*********Fin Leer Fichero**********");
           		Detener();
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

	//METODOS AUXILIAR
	public static void w(String s)
	{	System.out.print(s); }//w

	public static void wln(String s)
	{	System.out.println(s); }//wln

	public static void BL(int nl)
	{	for(int l=1; l<=nl; l++)
			System.out.println();
	}//BL

	public static void Detener()
	{	BL(2);
		wln("PRESIONE ENTER PARA CONTINUAR");
		KbInput.read();
		return;
	}//Detener
}//class
