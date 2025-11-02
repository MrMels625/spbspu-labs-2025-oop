package O1;

class Hero
{
  private String name_;
  private MovementStrategy strategy_;

  public Hero(String name)
  {
    this.name_ = name;
    this.strategy_ = new WalkStrategy();
  }

  public void set_movement_strategy(MovementStrategy strategy)
  {
    this.strategy_ = strategy;
  }

  public void move()
  {
    System.out.print(name_ + " is ");
    strategy_.move();
  }
}

