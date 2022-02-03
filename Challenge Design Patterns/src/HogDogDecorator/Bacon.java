package HogDogDecorator;


    public class Bacon extends HotDogBasicDecorator{

        public Bacon(IHotDogBasic iHotDogBasic){
            super(iHotDogBasic);
        }

        @Override
        public void addIngredients() {
            setAddition(addHotdog);
        }
        private void  setAddition(IHotDogBasic iHotDogBasic){
            System.out.println("Agregrando tocineta");
        }
    }
