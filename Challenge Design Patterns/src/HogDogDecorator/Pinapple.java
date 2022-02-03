package HogDogDecorator;

public class Pinapple extends HotDogBasicDecorator{

    public Pinapple(IHotDogBasic iHotDogBasic){

        super(iHotDogBasic);
    }

    @Override
    public void addIngredients() {
        setAddition(addHotdog);
    }
    private void  setAddition(IHotDogBasic iHotDogBasic){
        System.out.println("Agregrando piña");
    }
}
