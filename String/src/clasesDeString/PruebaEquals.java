package clasesDeString;

public class PruebaEquals {

	public static void main(String[] args) {
		
		String le = "le";
		String lo = "le";
		String la = "lo";
		
		if(lo == la) System.out.println("true false");
		if(lo == le) System.out.println("true ture");
		if(le.equals(lo)) System.out.println("equals true true");
		if(le.equals(la)) System.out.println("equals true false");
		
		System.err.println("------------");
		//objeto con espacio en memoria
		String re = new String("cha");
		String ro = new String("cha");
		String ri = new String("oro");
		
		if(re == ro) System.out.println("tambien true ture");
		if(re == ri) System.out.println("tambien true false");
		if(re.equals(ro)) System.out.println("tambien equals true true");
		if(re.equals(ri)) System.out.println("tambien equals true true");

	}
}
