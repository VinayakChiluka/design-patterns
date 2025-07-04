interface Appliances{
    void turnOn();
    void turnOff();
    void cook();
    void heat();
    void washClothes();
    void washDishes();
    void playMusic();
    void playVideo();   
}

class Microwave implements Appliances{
    @Override
    public void turnOn() {
        System.out.println("Microwave turnOn");
    }
    @Override
    public void turnOff() {
        System.out.println("Microwave turnOff");
    }
    @Override
    public void cook() {  
         System.out.println("Microwave cook");
    }
    @Override
    public void heat() {
        System.out.println("Microwave heat");
    }
    @Override
    public void washClothes() {
        throw new UnsupportedOperationException("Unsupported method 'washClothes'");
    }
    @Override
    public void washDishes() {
        throw new UnsupportedOperationException("Unsupported method 'washDishes'");
    }
    @Override
    public void playMusic() {
        throw new UnsupportedOperationException("Unsupported method 'playMusic'");
    }
    @Override
    public void playVideo() {
        throw new UnsupportedOperationException("Unsupported method 'playVideo'");
    }

}