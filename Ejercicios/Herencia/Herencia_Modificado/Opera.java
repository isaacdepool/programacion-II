//CREACION DE LA SUBCLASE OPERA


public class Opera extends Valores
{	int k;

	public Opera(int a, int b, int c)
	{	super(a,b);
		k = c;
	}//Opera

	void mostrark()
	{	super.mostrarij();
		System.out.println("K: "+k);
	}

	void suma()
	{	System.out.println("I+J+K: "+(i+j+k));
	}
}

