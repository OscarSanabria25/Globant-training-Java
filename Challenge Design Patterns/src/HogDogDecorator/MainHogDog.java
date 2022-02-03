package HogDogDecorator;

public class MainHogDog {
    public static void main(String[] args) {
        IHotDogBasic prueba=new HotDog();

        IHotDogBasic addPineapple=new Pinapple(new HotDog());
        IHotDogBasic addPotato=new Potatoes(new HotDog());
        IHotDogBasic addBacon=new Bacon(new HotDog());
        IHotDogBasic addSauses=new Sauses(new HotDog());

prueba.addIngredients();
      addBacon.addIngredients();
      addPineapple.addIngredients();
    }
}
