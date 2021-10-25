import java.util.Random;
public class ram{
	public static void main(String arg[])
	{

			int M = h(20) ;

		System.out.print(""+M+"\n\n");


	}
	public static int h(int M)
		{
			Random R = new Random();
			return R.nextInt(M);
	}//Existencia
}