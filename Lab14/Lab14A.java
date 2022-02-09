class Main {
  public static void main(String[] args) {
    BuildingBlueprint buildingOne = new BuildingBlueprint();
    BuildingBlueprint buildingTwo = new BuildingBlueprint(30,30,0.75f);

    System.out.println("Year 2020:\nBuiliding 1 has " + buildingOne.getStories() + " floors, " + buildingOne.getApartments() + " apartments, and is " + (int)(buildingOne.getOccupancy()*100) + "% occupied. Full? " + buildingOne.getOccupied() + "\nBuiliding 2 has " + buildingTwo.getStories() + " floors, " + buildingTwo.getApartments() + " apartments, and is " + (int)(buildingTwo.getOccupancy()*100) + "% occupied. Full? " + buildingTwo.getOccupied());
    
    buildingOne.setOccupancy(0.0f);
    buildingTwo.setOccupancy(1.0f);

    System.out.println("\nMany years pass.\n\nYear 2043:\nBuiliding 1 has " + buildingOne.getStories() + " floors, " + buildingOne.getApartments() + " apartments, and is " + (int)(buildingOne.getOccupancy()*100) + "% occupied. Full? " + buildingOne.getOccupied() + "\nBuiliding 2 has " + buildingTwo.getStories() + " floors, " + buildingTwo.getApartments() + " apartments, and is " + (int)(buildingTwo.getOccupancy()*100) + "% occupied. Full? " + buildingTwo.getOccupied());

    System.out.println("\nLooks like people prefer taller buildings.");
  }
}

class BuildingBlueprint{
  private int stories;
  private int apartments;
  private float occupancy;
  private boolean occupied;

  public BuildingBlueprint(){
    stories = 10;
    apartments = 20;
    occupancy = 1.0f;
    occupied = true;
  }

  public BuildingBlueprint(int constructorStories, int constructorApartments, float constructorOccupancy){
    stories = constructorStories;
    apartments = constructorApartments;
    occupancy = constructorOccupancy;
    if(occupancy == 1.0f)
      occupied = true;
  }

  public void setOccupancy(float occupancyRate){
    occupancy = occupancyRate;
    if(occupancy == 1.0f)
      occupied = true;
    else 
      occupied = false;
  }

  public float getOccupancy(){
    return occupancy;
  }

  public int getStories(){
    return stories;
  }

  public int getApartments(){
    return apartments;
  }

  public boolean getOccupied(){
    return occupied;
  }
}