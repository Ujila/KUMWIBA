
public class Article {

	import java.util.HashMap;
	import java.util.Map.Entry;

	public class Article {

		public static void main(String[] args) {
			HashMap <Long, String> maparticle = new HashMap<Long, String>();
			maparticle.put(1L, "TELEPHONE");
			maparticle.put(2L, "CHEMISE");
			maparticle.put(3L, "PANTALON");
			maparticle.put(4L, "POLO");
			maparticle.put(5L, "SINGLET");
			maparticle.put(6L, "CHAUSETTE");
			maparticle.put(7L, "PAGNE");
			maparticle.put(8L, "CASEROLE");
			maparticle.put(9L, "LA TOMATE");
			maparticle.put(10L, "BIC");
			maparticle.put(11L, "CAHIER");
			maparticle.put(12L, "ORDINATEUR");
			maparticle.put(13L, "IMPRIMANTE");
			maparticle.put(14L, "FLASH");
			maparticle.put(15L, "DISQUE DUR");
			maparticle.put(16L, "RJ45");
			maparticle.put(17L, "CLAVIER");
			maparticle.put(18L, "CD");
			maparticle.put(19L, "CAMERA");
			maparticle.put(20L, "SWITCH");
			 for (Entry<Long, String> mapentry: maparticle.entrySet()) {
				 if (mapentry.getValue().equals("ORDINATEUR"))
					 System.out.println("cle:"+mapentry.getKey() 
					 +"value:"+mapentry.getValue());

		}

	}

}
