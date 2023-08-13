
public class Gerard_Fernandez_fe_gc_c4_ta19_5 {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=3;
		int d=4;
		
		//Muestra datos antes de modificarse
		System.out.println("Datos al principio");
		System.out.println("/ A="+a+"/ B="+b+"/ C="+c+"/ D="+d+"\n");
		
		//Traspaso de datos
		b=c;
		System.out.println("B->C");
		System.out.println("/ A="+a+"/ B="+b+"/ C="+c+"/ D="+d);
		c=a;
		System.out.println("C->A");
		System.out.println("/ A="+a+"/ B="+b+"/ C="+c+"/ D="+d);
		a=d;
		System.out.println("A->D");
		System.out.println("/ A="+a+"/ B="+b+"/ C="+c+"/ D="+d);
		d=b;
		System.out.println("D->B");
		System.out.println("/ A="+a+"/ B="+b+"/ C="+c+"/ D="+d);
	}

}
