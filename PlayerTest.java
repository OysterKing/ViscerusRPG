
public class PlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Player player = new Player();



		System.out.println("Name:\t" + player.characterBasics.getName());
		System.out.println("Age:\t" + player.characterBasics.getAge());
		System.out.println("Race:\t" + player.characterBasics.getRace());
		System.out.println("Height:\t" + player.characterBasics.getHeight());
		System.out.println("Weight:\t" + player.characterBasics.getWeight());
		System.out.println("Eye Colour:\t" + player.characterBasics.getEye_colour());
		System.out.println("Hair Colour:\t" + player.characterBasics.getHair_colour());
		System.out.println();

		System.out.println("ABILITIES:");
		player.printAbilities();
		System.out.println();
		System.out.println("SKILLS:");
		player.printSkills();

	}

}
