// mayor elemento de una lista

public class mayor
{
static int n;
	public static void main(String arg[])
	{
		do{ n=tam();
			if(n<=1)
			System.out.println("EL ARREGLO DEBE SER MAYOR A DOS O IGUAL");
			}while(n<=1);
                arr();

    }//main
  //PEDIR TAMAÑO DEL ARREGLO
    public static int tam()
  {
	return Leer.NInt("INGRESE EL TAMAÑO DEL ARREGLO = ");
}
	  // metodo para rellenar arreglo

	 public static void arr()
	 {int i;

	  int lista[] = new int[n];
	  int aux=lista[0];
	  for (i= 0; i<n ; i++ )

	    lista[i]=Leer.NInt("INGRESE EL ELEMENTO NUMERO = [" +(i+1)+ "]");

	    for(int x:lista){
	    if(aux<x)
	    aux=x;
		}
		System.out.println(aux);
}
}
