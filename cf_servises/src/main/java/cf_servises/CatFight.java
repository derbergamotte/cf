package cf_servises;

import animals.Cat;
import cf_im.ICatFight;

public class CatFight implements ICatFight{

	@Override
	public void fight(Cat cat1, Cat cat2) {
		
		int c1 = cat1.getExpierence()/10+cat1.getStrenght()+cat1.getWeight()/2;
		int c2 = cat2.getExpierence()/10+cat2.getStrenght()+cat2.getWeight()/2;
		if(c1 > c2) {
			cat1.setExpierence(cat1.getExpierence()+2);
			cat2.setExpierence(cat2.getExpierence()+1);
			System.out.println("And the wiiiiinnnner is by means of knockout... " + cat1.getName());
		} else if(c2 > c1) {
			cat2.setExpierence(cat2.getExpierence()+2);
			cat1.setExpierence(cat1.getExpierence()+1);
			System.out.println("And the wiiiiinnnner is by means of technical knockout... " + cat2.getName());
		} else {
			cat1.setExpierence(cat1.getExpierence()+1);
			cat2.setExpierence(cat2.getExpierence()+1);
			System.out.println("Ladies and gentlemen, we have a tie.");
		}
	}

}
