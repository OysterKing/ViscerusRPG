/*Comhghall McKeating
 * Player class; create character, view stats, level up, etc.
 */

public class Player {

	CharacterBasics characterBasics = new CharacterBasics("Jet Black", "Human", 34, 6.4, 240, "Brown", "Black");
	CharacterAbility[] characterAbilities = new CharacterAbility[7];
	CharacterSkill[] characterSkills = new CharacterSkill[20];

	public Player(){

		for(int i = 0; i < characterAbilities.length; i++){
			if(i == 0){
				characterAbilities[i] = new CharacterAbility(9, "Strength");
			}

			if(i == 1){
				characterAbilities[i] = new CharacterAbility(8, "Intelligence");
			}

			if(i == 2){
				characterAbilities[i] = new CharacterAbility(4, "Charisma");
			}

			if(i == 3){
				characterAbilities[i] = new CharacterAbility(4, "Agility");
			}

			if(i == 4){
				characterAbilities[i] = new CharacterAbility(5, "Dexterity");
			}

			if(i == 5){
				characterAbilities[i] = new CharacterAbility(5, "Aptitude");
			}

			if(i == 6){
				characterAbilities[i] = new CharacterAbility(6, "Perception");
			}
		}

		for(int i = 0; i < characterSkills.length; i++){
			if(i == 0){
				characterSkills[i] = new CharacterSkill("Endurance", 9, 9, 5);
			}

			if(i == 1){
				characterSkills[i] = new CharacterSkill("Acrobatics", 4, 5, 5);
			}

			if(i == 2){
				characterSkills[i] = new CharacterSkill("Stealth", 4, 5, 5);
			}

			if(i == 3){
				characterSkills[i] = new CharacterSkill("Diplomacy", 4, 8, 5);
			}

			if(i == 4){
				characterSkills[i] = new CharacterSkill("Intimidate", 9, 9, 5);
			}

			if(i == 5){
				characterSkills[i] = new CharacterSkill("Heavy Melee", 9, 5, 5);
			}

			if(i == 6){
				characterSkills[i] = new CharacterSkill("Light Melee", 5, 9, 5);
			}

			if(i == 7){
				characterSkills[i] = new CharacterSkill("Light Ranged", 5, 4, 5);
			}

			if(i == 8){
				characterSkills[i] = new CharacterSkill("Heavy Ranged", 5, 6, 5);
			}

			if(i == 9){
				characterSkills[i] = new CharacterSkill("Hacking", 8, 6, 5);
			}

			if(i == 10){
				characterSkills[i] = new CharacterSkill("Engineering", 8, 6, 5);
			}

			if(i == 11){
				characterSkills[i] = new CharacterSkill("Piloting", 6, 4, 5);
			}

			if(i == 12){
				characterSkills[i] = new CharacterSkill("Medicine", 8, 6, 5);
			}

			if(i == 13){
				characterSkills[i] = new CharacterSkill("Athletics", 9, 4, 5);
			}

			if(i == 14){
				characterSkills[i] = new CharacterSkill("Insight", 8, 6, 5);
			}

			if(i == 15){
				characterSkills[i] = new CharacterSkill("Memory", 6, 8, 5);
			}

			if(i == 16){
				characterSkills[i] = new CharacterSkill("Bluff", 4, 4, 5);
			}

			if(i == 17){
				characterSkills[i] = new CharacterSkill("Thievery", 5, 5, 5);
			}

			if(i == 18){
				characterSkills[i] = new CharacterSkill("Ecology", 6, 8, 5);
			}

			if(i == 19){
				characterSkills[i] = new CharacterSkill("Search", 6, 6, 5);
			}
		}

	}

	public void printAbilities(){
		for(int i = 0; i < characterAbilities.length; i++){
			System.out.println(characterAbilities[i].ability + ":\t" + characterAbilities[i].value);
		}
	}

	public void printSkills(){
		for(int i = 0; i < characterSkills.length; i++){
			System.out.println(characterSkills[i].skill + ":  \t" + characterSkills[i].skillvalue);
		}
	}

	public class CharacterBasics{
		String name;
		String race;
		int age;
		double height;
		int weight;
		String eye_colour;
		String hair_colour;

		public CharacterBasics(String name_value, String race_value, int age_value,
								double height_value, int weight_value,
								String eye_colour_value, String hair_colour_value){
			name = name_value;
			race = race_value;
			age = age_value;
			height = height_value;
			weight = weight_value;
			eye_colour = eye_colour_value;
			hair_colour = hair_colour_value;
		}

		public String getName(){
			return name;
		}

		public String getRace(){
			return race;
		}

		public int getAge(){
			return age;
		}

		public double getHeight(){
			return height;
		}

		public int getWeight(){
			return weight;
		}

		public String getEye_colour(){
			return eye_colour;
		}

		public String getHair_colour(){
			return hair_colour;
		}
	}

	public class CharacterAbility{
		int value;
		String ability;

		public CharacterAbility(int score, String name){
			value = score;
			ability = name;
		}

		public void displayAbility(){
			System.out.println(ability + ":\t" + value);
		}
	}

	public class CharacterSkill{
		int skillvalue;
		String skill;
		int parent_ability1_value;
		int parent_ability2_value;
		int parent_ability3_value;

		public CharacterSkill(String name, int value1, int value2, int value3){

			skill = name;
			parent_ability1_value = value1;
			parent_ability2_value = value2;
			parent_ability3_value = value3;
			skillvalue = 3*parent_ability1_value + 2*parent_ability2_value + parent_ability3_value;
		}

		public void displaySkill(){
			System.out.println(skill + ":\t" + skillvalue);
		}

	}

	public class CharacterStats{
		int hitpoints;
		int actionpoints;
		int fatepoints;
		int level;
		int experiece;
	}

	public class CharacterTrait{
		int modifier;
		String affects; //which ability or skill is affected
		String trait;
		String type;
	}

}
