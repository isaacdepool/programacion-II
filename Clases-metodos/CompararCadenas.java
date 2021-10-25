public class CompararCadenas
{
	// DECLARACION DE VARIABLES LOCALES
	static String nom[] = new String[5];
	static String ape[] = new String[5];
	static int nota[][] = new int[5][3];
	static int i,j;

	// METODO PRINCIPAL
	public static void main(String arg[])
	{
		int opc;
		do {
			Limpiar();
			System.out.println("MENU PRINCIPAL");
			System.out.println("1 .- INGRESAR LOS DATOS");
			System.out.println("2 .- MOSTRAR LOS DATOS");
			System.out.println("3 .- BUSCAR UN ALUMNO");
			System.out.println("4 .- SALIR DEL SISTEMA");
			System.out.print("ESCOJA SU OPCION: ");
			opc = Integer.parseInt(KbInput.read());
			switch(opc)
			{
				case 1: Limpiar();
						Ingreso();
				break;
				case 2: Limpiar();
						Mostrar();
				break;
				case 3: Limpiar();
						System.out.print("INGRESE EL NOMBRE A BUSCAR: ");
						String nombre = KbInput.read();
						Buscar(nombre);
				break;
			}
		} while(opc != 4);
	} // main

	//METODO PARA LIMPIAR LA PANTALLA
	public static void Limpiar()
	{
		for(i=0; i<30; i++)
			System.out.println("\n");
		return;
	}// Limpiar

	// METODO PARA INGRESAR LOS DATOS
	public static void Ingreso()
	{
		int k;
		for(i=0; i<5; i++)
		{
			k=i+1;
			System.out.println("ALUMNO NUMERO "+k);
			System.out.println("\n\n\n");
			System.out.print("NOMBRE: ");
			nom[i] = KbInput.read();
			System.out.println("\n");
			System.out.print("APELLIDO: ");
			ape[i] = KbInput.read();
			System.out.println("\n");
			System.out.println("INGRESE LAS NOTAS: ");
			for(j=0; j<3; j++)
			{
				System.out.println("\n");
				k=j+1;
				System.out.print("NOTA "+k+" = ");
				nota[i][j] = Integer.parseInt(KbInput.read());
			}
		}
		return;
	}//Ingreso

	// METODO PARA MOSTRAR LOS DATOS
	public static void Mostrar()
	{
		int k;
		for(i=0; i<5; i++)
		{
			k=i+1;
			System.out.println("\n\n\n");
			System.out.println("ALUMNO NUMERO "+k);
			System.out.println("\n");
			System.out.println(nom[i]+" "+ape[i]);
			System.out.println("LAS NOTAS SON: ");
			for(j=0; j<3; j++)
				System.out.print(nota[i][j]+" ");
			KbInput.read();
		}
		return;
	}//Mostrar

	// METODO PARA BUSCAR UN ALUMNO
	public static void Buscar(String nomb)
	{
		int k=0;
		for(i=0; i<5; i++)
		{
			if(nom[i].compareTo(nomb)==0)
			{
				k++;
				System.out.println("\n\n\n");
				System.out.println(nom[i]+" "+ape[i]);
				System.out.println("LAS NOTAS SON: ");
				for(j=0; j<3; j++)
					System.out.print(nota[i][j]+" ");
				KbInput.read();
			}
		}
		if(k==1)
		{
			System.out.println("NO HAY NINGUN ALUMNO CON ESE NOMBRE");
			KbInput.read();
		}
		return;
	}//Buscar

}//class
