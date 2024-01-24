// To represent a soup
interface ISoup {
}

// Represents a soup as broth 
class Broth implements ISoup {
  String type;

  Broth(String type) {
    this.type = type;
  }
  
  /* Template
   * Fields:
   * ... this.type ...   -- String
   */
}

// Represents soup as an ingredient
class Ingredient implements ISoup {
  ISoup more;
  String name;

  Ingredient(ISoup more, String name) {
    this.more = more;
    this.name = name;
  }

  Ingredient(String name) {
    this.name = name;
  }
  
  /* Template
   * Fields:
   * ... this.more ...   -- Isoup
   * ... this.name ...   -- String
   */
}

// Example soups 
class ExamplesSoup {
  ExamplesSoup() {
  }

  ISoup yummy = new Ingredient(
      new Ingredient(new Ingredient(new Broth("chicken"), "carrots"), "celery"), "noodles");

  ISoup noThankYou = new Ingredient(
      new Ingredient(new Ingredient(new Broth("vanilla"), "horseradish"), "hot dogs"),
      "plum sauce");
}
