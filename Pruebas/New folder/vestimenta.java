public class vestimenta {

objeto arti;
char t;
String m;

public vestimenta(String ds, float cp, int cb, short ex, char t, String m)
{
	arti = new objeto(ds, cp, cb, ex);
	this.t = t;
	this.m = m;
	arti.pb = calpb();
	arti.pv = calpv();
}

	//METODO PARA CALCULAR EL PRECIO BASE

	public float calpb()
{
	return arti.cp + arti.cp *(float)0.30;

}
	//METODO PARA CALCULA DESCUENTO

	public float calpv()
{
	float D = 0;
	if(arti.pb>170) {D = arti.pb *(float)0.15;}
	return arti.pb - D;
}
}