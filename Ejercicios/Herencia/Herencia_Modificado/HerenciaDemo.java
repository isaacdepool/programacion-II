//CREACION DE LA CLASE PRINCIPAL

public class HerenciaDemo
{	public static void main(String arg[])
	{
/*
  	    //SE PUEDE UTILIZAR LA SUPERCLASE INDEPENDIENTEMENTE
		Valores superOb = new Valores(10,20);
		System.out.println("CONTENIDO DE SUPEROB = ");
		superOb.mostrarij();
		System.out.println();

		//UTILIZACION DE LA SUBCLASE
		Opera subOb = new Opera(25,35,45);
		System.out.println("CONTENIDO DE SUBOB = ");
		subOb.mostrark();
		System.out.println();

		System.out.println("SUMA DE I+J+K EN SUBOB = ");
		subOb.suma();
*/


		//INGRESANDO LOS DATOS POR TECLADO
		System.out.print("INGRESE EL VALOR DE I = ");
		int a = Integer.parseInt(KbInput.read());
		System.out.print("INGRESE EL VALOR DE J = ");
		int b = Integer.parseInt(KbInput.read());
		System.out.print("INGRESE EL VALOR DE K = ");
		int c = Integer.parseInt(KbInput.read());
		Opera subOb = new Opera(a,b,c);
		System.out.println("CONTENIDO DE SUBOB = ");
		subOb.mostrark();
		System.out.println();

		System.out.println("SUMA DE I+J+K EN SUBOB = ");
		subOb.suma();

	}
}