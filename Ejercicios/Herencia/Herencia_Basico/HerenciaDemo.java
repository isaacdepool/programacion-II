//CREACION DE LA CLASE PRINCIPAL

public class HerenciaDemo
{	public static void main(String arg[])
	{	Valores superOb = new Valores();
		Opera subOb = new Opera();

/*		//SE PUEDE UTILIZAR LA SUPERCLASE INDEPENDIENTEMENTE
		superOb.i = 10;
		superOb.j = 20;
		System.out.println("CONTENIDO DE SUPEROB = ");
		superOb.mostrarij();
		System.out.println();

		//UTILIZACION DE LA SUBCLASE
		subOb.i = 25;
		subOb.j = 35;
		subOb.k = 45;
		System.out.println("CONTENIDO DE SUBOB = ");
		subOb.mostrarij();
		subOb.mostrark();
		System.out.println();

		System.out.println("SUMA DE I+J+K EN SUBOB = ");
		subOb.suma();

*/





		//INGRESANDO LOS DATOS POR TECLADO
		System.out.print("INGRESE EL VALOR DE I = ");
		subOb.i = Integer.parseInt(KbInput.read());
		System.out.print("INGRESE EL VALOR DE J = ");
		subOb.j = Integer.parseInt(KbInput.read());
		System.out.print("INGRESE EL VALOR DE K = ");
		subOb.k = Integer.parseInt(KbInput.read());
		System.out.println("CONTENIDO DE SUBOB = ");
		subOb.mostrarij();
		subOb.mostrark();
		System.out.println();

		System.out.println("SUMA DE I+J+K EN SUBOB = ");
		subOb.suma();

	}
}