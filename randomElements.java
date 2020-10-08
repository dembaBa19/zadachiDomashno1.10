package paki4;

public class randomElements {

	public static void main(String[] args) {
	    for (int i = 0; i<20; i++) {
	        int randomNum = 0 + (int)(Math.random() * 127);
	        System.out.print((char)randomNum);
	    }
	}

}
