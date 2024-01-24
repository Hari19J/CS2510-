// To represent a Statue
class Statue {
  String name;
  String artist;
  int year;
  double weight;
  boolean whole;
  
  Statue(String name, String artist, int year, double weight, boolean whole) {
    this.name = name;
    this.artist = artist;
    this.year = year;
    this.weight = weight;
    this.whole = whole;

  }
  
  /* Template: 
   * Fields:
   * ... this.name ...      -- String
   * ... this.artist ...    -- String
   * ... this.year ...      -- int
   * ... this.weight ...    -- double
   * ... this.whole ...     -- boolean
   */
}





class ExamplesStatue {
  ExamplesStatue() {}

  Statue statueOfLiberty = new Statue("Statue Of Liberty", "Bartholdi", 1886, 450000, true);
  Statue venusDeMilo = new Statue("Venus de Milo", "Alexandros of Antioch", -115, 1984.16, false);
  Statue kenBlock = new Statue("Ken Block", "Hoonigan", 2023, 2500, true);

}