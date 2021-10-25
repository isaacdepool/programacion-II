/* El Consejo Nacional Electoral, organismo  encargado  de realizar los procesos
   electorales a nivel nacional, requiere conocer cierta información estadística
   del mes de mayo, respecto  al  número  de  inscritos. Dicho  organismo  desea
   cuantificar:
   => El número de personas inscritas en el mes
   => El número de personas inscritas cada una de las semanas del mes.
   => Y por último desea determinar cuál de los días de inscripción resulta  más
      efectivo, es decir, reporta mayor cantidad de inscritos
   => Los datos suministrados son:

     	LUNES	MARTES	MIÉRCOLES	JUEVES	VIERNES
   1	2000	4000		3000	 2500	 5000
   2	2000	3000		2000	 2500	 4500
   3	1200	5000		3200	 4000	 3000
   4	3000	2500		7000	 2000	 2550

*/
public class CNE_basico
{	//DECLARACION DE LAS VARIABLES Y/O ARREGLOS GLOBALES
	//Tabla de Trabajo
	static int TT[][] = {{2000,4000,3000,2500,5000},
						 {2000,3000,2000,2500,4500},
						 {1200,5000,3200,4000,3000},
						 {3000,2500,7000,2000,2550}};

	//dias de la semanas
	static String Dia[] = {"LUN","MAR","MIE","JUE","VIE"};

	//Metodo Principal
	public static void main(String arg[])
	{
		byte opc;
		do{
			opc = menu();
			MCursor.BLinea(30);
			switch(opc)
			{
				case 1: MosTab();	break;
				case 2:	TotMes();	break;
				case 3:
				case 4:

			}
		}while(opc != 0);
	}

	//Metodo para Calcular y Mostrar el total de inscritos en el mes
	public static void TotMes()
	{
		int Total = 0;
		for(int i=0; i<4; i++)
			for(int j=0; j<5; j++)
				Total += TT[i][j];
		MCursor.TCen(10,"================================================================");
		MCursor.TCen(27,"REPUBLICA BONITA DE NARNIA");
		MCursor.TCen(27,"CONSEJO NACIONAL ELECTORAL");
		MCursor.TCen(26,"TOTAL DE INSCRITOS EN EL MES");
		MCursor.TCen(10,"================================================================");
		MCursor.TCen(35,"[ "+Total+" ]");
		MCursor.TCen(10,"================================================================");
		MCursor.Salida();
	}

	//Metodo para mostrar tabla de trabajo
	public static void MosTab()
	{
		MCursor.TCen(10,"================================================================");
		MCursor.TCen(27,"REPUBLICA BONITA DE NARNIA");
		MCursor.TCen(27,"CONSEJO NACIONAL ELECTORAL");
		MCursor.TCen(24,"TABLA DE INSCRITOS. MES DE MAYO");
		MCursor.TCen(10,"================================================================");
		MCursor.UCursor(15);
		System.out.print("\tS\t");
		for(int i=0; i<5; i++)
			System.out.print(Dia[i] + "\t");
		System.out.println();
		MCursor.TCen(10,"----------------------------------------------------------------");

		for(int i=0; i<4; i++)
		{	MCursor.UCursor(15);
			System.out.print("\t"+(i+1)+"\t");
			for(int j=0; j<5; j++)
				System.out.print(TT[i][j] + "\t");
			System.out.println();
		}//for de 1
		MCursor.TCen(10,"================================================================");
		MCursor.Salida();

		return;
	}//MosTab


	//Metodo para mostrar el menu de opciones
	public static byte menu()
	{
		MCursor.BLinea(30);
		MCursor.TCen(10,"================================================================");
		MCursor.TCen(27,"MENU PRINCIPAL DE OPCIONES");
		MCursor.TCen(10,"================================================================");
		MCursor.TCen(27,"1.- MOSTRAR TABLA DE TRABAJO");
		MCursor.TCen(27,"2.- TOTAL DE PERSONAS INSCRITAS EN EL MES");
		MCursor.TCen(27,"3.- TOTAL DE PERSONAS INSCRITAS EN CADA SEMANA");
		MCursor.TCen(27,"4.- DIA MAS EFECTIVO");
		MCursor.TCen(10,"----------------------------------------------------------------");
		MCursor.TCen(27,"0.- SALIR DEL SISTEMA");
		MCursor.TCen(10,"================================================================");
		MCursor.UCursor(17);
		return Leer.NByte("INGRESE SU OPCION = ");
	}//menu
}//class
