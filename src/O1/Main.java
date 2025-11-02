package O1;

class Main
{
  public static void main(String[] args)
  {
    Hero super_hero = new Hero("Sergey Dobsov");
    super_hero.move();

    super_hero.set_movement_strategy(new HorseStrategy());
    super_hero.move();

    super_hero.set_movement_strategy(new WalkStrategy());
    super_hero.move();

    super_hero.set_movement_strategy(new FlyStrategy());
    super_hero.move();
  }
}

