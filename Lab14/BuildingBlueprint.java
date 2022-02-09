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