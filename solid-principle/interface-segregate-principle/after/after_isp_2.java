interface BasicAppliance {
    void turnOn();
    void turnOff();
}

interface CookingAppliance {
    void cook();
}

interface MusicPlayer {
    void playMusic();
}

interface WashingMachine {
    void washClothes();
}

// Microwave only implements what it needs
class Microwave implements BasicAppliance, CookingAppliance {
    public void turnOn() { System.out.println("Microwave on"); }
    public void turnOff() { System.out.println("Microwave off"); }
    public void cook() { System.out.println("Microwave cooking"); }
}

// Washing machine implements appropriate interfaces
class WashingMachineImpl implements BasicAppliance, WashingMachine {
    public void turnOn() { System.out.println("Washing machine on"); }
    public void turnOff() { System.out.println("Washing machine off"); }
    public void washClothes() { System.out.println("Washing clothes"); }
}
