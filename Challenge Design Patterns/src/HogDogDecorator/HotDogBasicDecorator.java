package HogDogDecorator;

public abstract class HotDogBasicDecorator implements IHotDogBasic {

    protected  IHotDogBasic addHotdog;

    public HotDogBasicDecorator(IHotDogBasic addHotdog){
        this.addHotdog=addHotdog;
    }

    public void addIngredients(){

        addHotdog.addIngredients();
    }


}
