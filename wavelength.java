package paki4;
 
import java.util.Scanner;
 
import javax.swing.JOptionPane;
 
public class wavelength {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a color code");
		int wave = sc.nextInt();
		if(wave>=380 && wave<=450) {
			System.out.println("The color is Violet");
		} else {
			if(wave>=450 && wave<=495) {
				System.out.println("The color is Blue");
			} else {
				if(wave>=495 && wave<=570) {
					System.out.println("The color is Green");
				} else {
					if(wave>=570 && wave<=590) {
						System.out.println("The color is Yellow");
					} else {
						if(wave>=590 && wave<=620) {
							System.out.println("The color is Orange");
						} else {
							if(wave>=620 && wave<=750) {
								System.out.println("The color is Red");
							} else {
								JOptionPane.showMessageDialog(null,
										"The entered wavelength is not a part of the visible spectrum",
										"Error",0);
							}
						}
					}
				}
			}
		}
 
		sc.close();
	}
 
}