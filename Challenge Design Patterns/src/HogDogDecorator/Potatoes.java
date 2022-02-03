package HogDogDecorator;


    public class Potatoes extends HotDogBasicDecorator{

        public Potatoes(IHotDogBasic iHotDogBasic){
            super(iHotDogBasic);
        }

        @Override
        public void addIngredients() {
            addHotdog.addIngredients();
            setAddition(addHotdog);
        }
        private void  setAddition(IHotDogBasic iHotDogBasic){
            System.out.println("Agregrando papitas");
        }
    }