import java.io.Reader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class deleteDemo
{
   public static void main(String args[])
   {
     StringBuffer sb = new StringBuffer("ESTO ES UNA PRUEBA");
     System.out.println("MENSAJE INICIAL: "+ sb);

     sb.delete(4,7);
     System.out.println("Tras delete: "+ sb);

     sb.deleteCharAt(1);
     System.out.println("Tras deleteCharAt: "+ sb);

   }
}