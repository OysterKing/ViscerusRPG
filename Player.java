/*Comhghall McKeating
 * Player class; create character, view stats, level up, etc.
 */

public class Player {
	CharacterBasics[] characterBasics = new CharacterBasics[5];
	CharacterAbility[] characterAbilities = new CharacterAbility[7];
	CharacterSkill[] characterSkills = new CharacterSkill[20];
	CharacterStats[] characterStats = new CharacterStats[5];

	public Player(){
		characterBasics[0] = new CharacterBasics("Name", "Jet Black");
		characterBasics[1] = new CharacterBasics("Age", "34");
		characterBasics[2] = new CharacterBasics("Race", "Human");
		characterBasics[3] = new CharacterBasics("Weight", "200lbs");
		characterBasics[4] = new CharacterBasics("Hair Colour", "Black");

		characterStats[0] = new CharacterStats("Hit Points", 60);
		characterStats[1] = new CharacterStats("Action Points", 5);
		characterStats[2] = new CharacterStats("Fate Points", 2);
		characterStats[3] = new CharacterStats("Level", 5);
		characterStats[4] = new CharacterStats("Experience", 2160);

		characterAbilities[0] = new CharacterAbility(9, "Strength");
		characterAbilities[1] = new CharacterAbility(8, "Intelligence");
		characterAbilities[2] = new CharacterAbility(4, "Charisma");
		characterAbilities[3] = new CharacterAbility(4, "Agility");
		characterAbilities[4] = new CharacterAbility(5, "Dexterity");
		characterAbilities[5] = new CharacterAbility(5, "Aptitude");
		characterAbilities[6] = new CharacterAbility(6, "Perception");

		characterSkills[0] = new CharacterSkill("Endurance", characterAbilities[0].value, characterAbilities[0].value, characterAbilities[5].value);
		//Strength, Strength, Aptitude

		characterSkills[1] = new CharacterSkill("Acrobatics", characterAbilities[3].value, characterAbilities[4].value, characterAbilities[5].value);
		// Agility, Dexterity, Aptitude

		characterSkills[2] = new CharacterSkill("Stealth", characterAbilities[3].value, characterAbilities[4].value, characterAbilities[5].value);
		// Agility, Dexterity, Aptitude

		characterSkills[3] = new CharacterSkill("Diplomacy", characterAbilities[2].value, characterAbilities[1].value, characterAbilities[5].value);
		// Charisma, Intelligence, Aptitude

		characterSkills[4] = new CharacterSkill("Intimidate", characterAbilities[2].value, characterAbilities[0].value, characterAbilities[5].value);
		// Charisma, Strength, Aptitude

		characterSkills[5] = new CharacterSkill("Heavy Melee", characterAbilities[0].value, characterAbilities[4].value, characterAbilities[5].value);
		// Strength, Dexterity, Aptitude

		characterSkills[6] = new CharacterSkill("Light Melee", characterAbilities[4].value, characterAbilities[0].value, characterAbilities[5].value);
		// Dexterity, Strength, Aptitude

		characterSkills[7] = new CharacterSkill("Light Ranged", characterAbilities[4].value, characterAbilities[3].value, characterAbilities[5].value);
		// Dexterity, Agility, Aptitude

		characterSkills[8] = new CharacterSkill("Heavy Ranged", characterAbilities[4].value, characterAbilities[6].value, characterAbilities[5].value);
		// Dexterity, Perception, Aptitude

		characterSkills[9] = new CharacterSkill("Hacking", characterAbilities[1].value, characterAbilities[6].value, characterAbilities[5].value);
		 // Intelligence, Perception, Aptitude

		characterSkills[10] = new CharacterSkill("Engineering", characterAbilities[1].value, characterAbilities[6].value, characterAbilities[5].value);
		// Intelligence, Perception, Aptitude

		characterSkills[11] = new CharacterSkill("Piloting", characterAbilities[6].value, characterAbilities[3].value, characterAbilities[5].value);
		// Perception, Agility, Aptitude

		characterSkills[12] = new CharacterSkill("Medicine", characterAbilities[1].value, characterAbilities[6].value, characterAbilities[5].value);
		// Intelligence, Perception, Aptitude

		characterSkills[13] = new CharacterSkill("Athletics", characterAbilities[0].value, characterAbilities[3].value, characterAbilities[5].value);
		// Strength, Agility, Aptitude

		characterSkills[14] = new CharacterSkill("Insight", characterAbilities[1].value, characterAbilities[6].value, characterAbilities[5].value);
		// Perception, Intelligence, Aptitude

		characterSkills[15] = new CharacterSkill("Memory", characterAbilities[6].value, characterAbilities[1].value, characterAbilities[5].value);
		// Perception, Intelligence, Aptitude

		characterSkills[16] = new CharacterSkill("Bluff", characterAbilities[2].value, characterAbilities[2].value, characterAbilities[5].value);
		// Charisma, Charisma, Aptitude

		characterSkills[17] = new CharacterSkill("Thievery", characterAbilities[4].value, characterAbilities[4].value, characterAbilities[5].value);
		// Dexterity, Dexterity, Aptitude

		characterSkills[18] = new CharacterSkill("Ecology", characterAbilities[6].value, characterAbilities[1].value, characterAbilities[5].value);
		// Perception, Intelligence, Aptitude

		characterSkills[19] = new CharacterSkill("Search", characterAbilities[6].value, characterAbilities[6].value, characterAbilities[5].value);
		// Perception, Perception, Aptitude
	}


	public void printCharacterSheet(){

		System.out.println("CHARACTER:");

		for(int i = 0; i < characterBasics.length; i++){
			System.out.println(characterBasics[i].attribute_name + ": \t" + characterBasics[i].attribute_value);
		}

		System.out.println();

		for(int i = 0; i < characterStats.length; i++){
			System.out.println(characterStats[i].stat + ": \t" + characterStats[i].stat_value);
		}

		System.out.println();

		System.out.println("ABILITIES:");

		for(int i = 0; i < characterAbilities.length; i++){
			System.out.println(characterAbilities[i].ability + ":\t" + characterAbilities[i].value);
		}

		System.out.println();

		System.out.println("SKILLS:");

		for(int i = 0; i < characterSkills.length; i++){
			System.out.println(characterSkills[i].skill + ":  \t" + characterSkills[i].skillvalue);
		}


	}

	public class CharacterBasics{
		String attribute_name;
		String attribute_value;

		public CharacterBasics(String name, String value){
			attribute_name = name;
			attribute_value = value;
		}


	}

	public class CharacterAbility{
		int value;
		String ability;

		public CharacterAbility(int score, String name){
			value = score;
			ability = name;
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

	}

	public class CharacterStats{
		String stat;
		int stat_value;

		public CharacterStats(String name, int value){
			stat = name;
			stat_value = value;
		}

	}
}
