package pack1;

public class HowTORemoveJunkandSpecialfileFromString {

	public static void main(String[] args) {
		String s="###Java$$$Selenium%%###%Java&%%%49";
		s=s.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(s);
		
		// TODO Auto-generated method stub

	}

}
