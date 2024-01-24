interface Ihousing {
}

class Hut implements Ihousing {
  int capacity;
  int population;

  Hut(int capacity, int population) {
    this.capacity = capacity;
    this.population = population;
  }
  
  /* Template
   * Fields:
   * ... this.capacity ...   -- int
   * ... this.population ... -- int
   */
  
}

class Inn implements Ihousing {
  String name;
  int capacity;
  int population;
  int stalls;

  Inn(String name, int capacity, int population, int stalls) {
    this.name = name;
    this.capacity = capacity;
    this.population = population;
    this.stalls = stalls;
  }
  
  /* Template
   * Fields:
   * ... this.name ...          -- String
   * ... this.capacity ...      -- int
   * ... this.population ...    -- int
   * ... this.stalls ...        -- int
   */
}

class Castle implements Ihousing {
  String name;
  String familyName;
  int population;
  int carriageHouse;

  Castle(String name, String familyName, int population, int carriageHouse) {
    this.name = name;
    this.familyName = familyName;
    this.population = population;
    this.carriageHouse = carriageHouse;
  }
  
  /* Template
   * Fields:
   * ... this.name ...          -- String
   * ... this.familyName ...    -- String
   * ... this.population ...    -- int
   * ... this.carriageHouse ... -- int
   */

}



interface Itravel {
}

class Horse implements Itravel {
  String name;
  String color;
  Ihousing from;
  Ihousing to;

  Horse(String name, String color, Ihousing from, Ihousing to) {
    this.name = name;
    this.color = color;
    this.from = from;
    this.to = to;
	  
  }
  
  /* Template:
   * Fields:
   * ... this.name ...     -- String
   * ... this.color ...    -- String
   * ... this.from ...     -- Ihousing
   * ... this.to ...       -- Ihousing
   */
}

class Carriage implements Itravel {
  Ihousing from;
  Ihousing to;
  int tonnage;
  
  Carriage(Ihousing from, Ihousing to, int tonnage) {
    this.from = from;
    this.to = to;
    this.tonnage = tonnage; 
  }
  
  /* Template
   * Fields:
   * ... this.from ...     -- Ihousing
   * ... this.to ...       -- Ihousing
   * ... this.tonnage ...  -- int
   */
  
}


class ExamplesTravel {
  ExamplesTravel() {}
  
  // Housing examples: 
  Ihousing hovel = new Hut(5, 1);
  Ihousing winterfell = new Castle("Winterfell", "Stark", 500, 6);
  Ihousing crossroads = new Inn("Inn At The Crossroads", 40, 20, 12);
  Ihousing joshiHouse = new Castle("Frogtown base", "Joshi", 6, 12);
  Ihousing friend1 = new Inn("Awesome Inn", 55, 20, 5);
  Ihousing coolCrib = new Castle("Sick Castle Name", "Incredibles", 1500, 10);
  
  
  
  // Travel examples:
  Itravel horse1 = new Horse("Brad", "black", crossroads, friend1);
  Itravel horse2 = new Horse("Zack", "brown", friend1, coolCrib);
  Itravel carriage1 = new Carriage(joshiHouse, winterfell, 3);
  Itravel carriage2 = new Carriage(hovel, coolCrib, 1);
  
  
}





