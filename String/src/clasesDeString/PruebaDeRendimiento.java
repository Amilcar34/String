package clasesDeString;

public class PruebaDeRendimiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        StringBuffer textoBuffer = new StringBuffer();
        
        long inicio = System.currentTimeMillis();
        
        for (int i=0; i<1000000; i++){
        	textoBuffer.append(i);
        	StringBuffer buffer = textoBuffer.append(i);
        }
        		
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo del StringBuffer: " + (fin-inicio));

        StringBuilder textoBuilder = new StringBuilder();
        inicio = System.currentTimeMillis();
        
        for (int j=0; j<1000000; j++){
        	textoBuilder.append(j);
          StringBuilder builder = textoBuilder.append(j);
        }
        
        fin = System.currentTimeMillis();
        System.out.println("Tiempo del StringBuilder: " + (fin-inicio));
	}

}
