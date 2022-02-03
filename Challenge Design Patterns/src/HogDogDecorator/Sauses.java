package HogDogDecorator;

public class Sauses extends HotDogBasicDecorator{

        public Sauses(IHotDogBasic iHotDogBasic){
            super(iHotDogBasic);
        }

        @Override
        public void addIngredients() {
            addHotdog.addIngredients();
            setAddition(addHotdog);
        }
        private void  setAddition(IHotDogBasic iHotDogBasic){
            System.out.println("Agregrando salsas");
        }
    }

