public class mayor
{
	public static void main(String arg[])
{
	int N = Leer.NInt("INGRESE TAMANO DEL ARREGLO = ");
	System.out.println("INGRESE VALORES AL ARREGLO");
	int A[] = new int[N];
	for (int i=0; i<N; i++)
	{
		System.out.print("INGRESE DATO "+(i+1)+ " = ");
		A[i] = Integer.parseInt(KbInput.read( ));
	}
	for(int i=0; i<(N-1); i++)
	for(int j=0; j<(N-1); j++)
	{
		if(A[j]>A[j+1])
	{
		int aux = A[j];
		A[j]=A[j+1];
		A[j+1]=aux;
}
}
	System.out.print("SU ARREGLO ES = \n");
	for (int i=0;i<N; i++){
			System.out.print(+A[i]+);
		System.out.println("");}
}

}
