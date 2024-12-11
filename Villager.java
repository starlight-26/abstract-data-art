/**
 * Represents a Villager with a name
 */
public class Villager {

  private String name;          // name of the villager
  private String species;       // species of the villager
  private String gender;        // gender of the villager
  private String personality;   // personality of the villager
  private String hobby;         // hobby of the villager

  /** Constructor */
  public Villager(String name, String species, String gender, String personality, String hobby) {
    this.name = name;
    this.species = species;
    this.gender = gender;
    this.personality = personality;
    this.hobby = hobby;
  }

  /** Accessor Method for name */
  public String getName() {
    return name;
  }

  /** Accessor Method for species */
  public String getSpecies() {
    return species;
  }

  /** Accessor Method for gender */
  public String getGender() {
    return gender;
  }

  /** Accessor Method for personality */
  public String getPersonality() {
    return personality;
  }

  /** Accessor Method for hobby */
  public String getHobby() {
    return hobby;
  }
  
  /** toString Method override */
  public String toString() {
    return "Name: " + name
      + "\nSpecies: " + species
      + "\nGender: " + gender
      + "\nPersonality: " + personality
      + "\nHobby: " + hobby;
  }
  
}