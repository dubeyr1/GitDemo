package Programs;

public class RemoveJunk {

	public static void main(String[] args) {
		
		
		String s = "$$%^^@$%%# Hello Testing )(*&&^%%";
		
		//Regular expression a-z, A_Z,0-9
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
		
		
	
		
		
		
		

	}

}
