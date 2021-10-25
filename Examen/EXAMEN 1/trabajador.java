public class trabajador
{
	String NB;
	long CI;
	char SX;
	String EC;
	float SH;
	float HS;
	float S1=0;
	float S2=0;
	float S3=0;
	float S4=0;
	float S5=0;
	float S6=0;
	float S7=0;
//CONSTRUCTOR
public trabajador(String NB, Long CI, char SX, String EC, float SH, float HS, float S1, float S2, float S3, float S4, float S5, float S6, float S7)
{
	this.NB = NB;
	this.CI = CI;
	this.SX = SX;
	this.EC = EC;
	this.SH = SH;
	this.HS = HS;
	this.S1 = S1;
	this.S2 = S2;
	this.S3 = S3;
	this.S4 = S4;
	this.S5 = S5;
	this.S6 = S6;
	this.S7 = S7;
	}

//CALCULAR SALARIO
public void sal(int pos, String Texto)
{

	int i=0;
	MCursor.TCen(10, "==================================================================================================");
	MCursor.TCen(pos, Texto +"\t"+ NB +"\t" +CI+"   \t\t"+SX+"\t"+EC+"\t"+SH+"\t"+HS+"\t"+S1+"\t"+S7+"\t"+S4);
	i++;
				return;
}
}
