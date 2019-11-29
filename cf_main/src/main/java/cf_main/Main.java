package cf_main;

import animals.Cat;
import cf_im.ICatFight;
import cf_servises.CatFight;

public class Main {

	public static void main(String[] args) {
		Cat vasia = new Cat("Vasia", 6, 5, 10);
		Cat ryzhyk = new Cat("Ryzhyk", 7, 7);
		Cat pushok = new Cat("Pushok", 9, 6);
		Cat solomonIsrailevich = new Cat("Solomon Israilevich", 7, 8, 9);
		ICatFight box = new CatFight();
		box.fight(vasia, ryzhyk);
		box.fight(solomonIsrailevich, pushok);

		

	}


}
