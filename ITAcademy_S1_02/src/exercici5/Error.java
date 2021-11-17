package exercici5;

import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;

public class Error {
	
	public static void main(String[] args) {
		boolean resume = true;
		int i = 0;

		while(resume==true) {
			try {
				Image imatge = ImageIO.read(new File("j:/imatge.png"));
			}catch(Exception e) {
				System.out.println(e.getMessage());
			} finally {
				i++;
				if(i==10) {
					resume=false;
				}
			}
		}

	}

}
