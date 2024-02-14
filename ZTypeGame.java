import tester.*;                // The tester library
import javalib.worldimages.*;   // images, like RectangleImage or OverlayImages
import javalib.funworld.*;      // the abstract World class and the big-bang library
import java.awt.Color;          // general colors (as triples of red,green,blue values)
                                // and predefined colors (Red, Green, Yellow, Blue, Black, White)
import java.util.Random;

class ZTypeWorld extends World{
  int GAMEHEIGHT = 600;
  int GAMEWIDTH = 400;

  ILoWord list;
  
  
  public WorldScene makeScene() {
    return this.list.draw(new WorldScene(GAMEHEIGHT, GAMEWIDTH));
  }
  
  

}

class Utils {
  
  String getRandomLetter() {
    String c = "abcdefghijklmnopqrstuvwxyz";
    int r = new Random().nextInt(26);
    
    return c.substring(r - 1, r);
  }
  
  String getString(int length) {
    
    if(length == 0) {
      return "";

    } else {
      return getString(length - 1) + getRandomLetter();
    }
  }
  
}

//a class to represent a word with a fontSize, color and location
class Word {
  String word;
  int fontSize;
  Color c;
  int x;
  int y;
  Random rand;

  Word(String word, Color c, int fSize) {
    this.word = word;
    this.fontSize =  fSize;
    this.c = c;
    this.x = rand.nextInt(400);
    this.y = 0;
    this.rand = new Random();
  }
  
  Word(String word, Color c, int fSize, int x, int y) {
    this.word = word;
    this.fontSize =  fSize;
    this.c = c;
    this.x = x;
    this.y = y;
    this.rand = new Random();
  }
  

  //draw this word 
  WorldImage draw() {
    return new TextImage(this.word, this.fontSize, this.c);
  }

  //create a new dot that is like this Dot but is shifted on the x-axis
  Word move() {
    return new Word(this.word, this.c, this.fontSize, this.x, this.y - 5);
  }

}


//represents a list of Words
interface ILoWord {
  //draws Words from this list onto the given scene
  WorldScene draw(WorldScene w);

  //moves this list of Words
  ILoWord move();
 
  
}

//represents a non-empty list of words
class MtLoWord implements ILoWord {

  //draws words from this empty list onto the 
  //image of the scene so far
  public WorldScene draw(WorldScene w) {
    return w;
  }

  //move the words in this empty list
  public ILoWord move() {
    return this;
  }


}

//represents an empty list of word
class ConsLoWord implements ILoWord {

  //draws words from this empty list onto the 
  //image of the scene so far
  
  
  WorldScene draw(WorldScene w) {
  return new ;
  }

  //move the words in this empty list
  public ILoWord move() {
    return this;
  }  


}





class ExamplesGame {
  
}