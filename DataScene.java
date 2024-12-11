import org.code.theater.*;
import org.code.media.*;

/**
 * Represents a Scene to be played in the Theater using data from
 * a choses dataset
 */
public class DataScene extends Scene {

  private Villager[] villager;      // 1D array of Villager objects

  /** Constructor */
  public DataScene() {
    villager = createVillager();
  }

  /** Returns a 1D array of Villager objects using the txt files in this project */
  public Villager[] createVillager() {
    String[] names = FileReader.toStringArray("names.txt");
    String[] species = FileReader.toStringArray("species.txt");
    String[] gender = FileReader.toStringArray("gender.txt");
    String[] personality = FileReader.toStringArray("personality.txt");
    String[] hobby = FileReader.toStringArray("hobby.txt");
    
    Villager[] villagerArray = new Villager[names.length];
    for (int i = 0; i < villagerArray.length; i++) {
      villagerArray[i] = new Villager(names[i], species[i], gender[i], personality[i], hobby[i]);
    }

    return villagerArray;
  }

  /**
   * Top-level method to draw the animation
   */
  public void drawScene() {

    // Plays background music
    // https://www.youtube.com/watch?v=8kBlKM71pjc
    playSound("ACgameSound.wav");

    // Randomizes an index from the villager array
    int index = (int) (Math.random() * villager.length);

    // Changes the background depending on the gender of the villager
    if (villager[index].getGender().equals("Male")) {
      clear("blue");
    } else if (villager[index].getGender().equals("Female")) {
      clear("pink");
    } else {
      clear("gold");
    }

    // Sets the stroke and fill color to white
    setStrokeColor("white");
    setFillColor("white");

    // Draww two rectangles
    drawRectangle(25, 35, 350, 80);
    drawRectangle(25, 130, 350, 225);

    // Sets the text height and style
    setTextHeight(40);
    setTextStyle(Font.SANS, FontStyle.BOLD_ITALIC);

    // Draws text
    drawText("Name: ", 40, 90);
    drawText(villager[index].getName(), 170, 90);

    // Sets the text height and style
    setTextHeight(30);
    setTextStyle(Font.SANS, FontStyle.ITALIC);

    // Draws texts
    drawText("Species: " + villager[index].getSpecies(), 40, 170);
    drawText("Gender: " + villager[index].getGender(), 40, 220);
    drawText("Personaility: " + villager[index].getPersonality(), 40, 270);
    drawText("Hobby: " + villager[index].getHobby(), 40, 320);

    // Draws an image
    drawImage("animalCross.png", 255, 285, 150);
    
  }

  
}