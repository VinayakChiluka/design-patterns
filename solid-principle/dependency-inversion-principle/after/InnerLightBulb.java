interface Switchable {
    void turnOn();
    void turnOff();
} 


class LightBulb implements Switchable{
    public void turnOn(){
        System.out.println("LightBulb: Bulb turned on...");
    }
    public void turnOff(){
        System.out.println("LightBulb: Bulb turned off...");
    }
}

class Fan implements Switchable{
    public void turnOn(){
        System.out.println("Fan turned on...");
    }
    public void turnOff(){
        System.out.println("Fan turned off...");
    }
}


class AC implements Switchable{
    public void turnOn(){
        System.out.println("AC turned on...");
    }
    public void turnOff(){
        System.out.println("AC turned off...");
    }
}

class Switch{
    private Switchable switchable;
    public Switch(Switchable switchable){
        this.switchable = switchable;
    }
    public void operate(boolean on){
        if(on){
            switchable.turnOn();
        }else{
            switchable.turnOff();
        }
    }
}


class DriverClass{
    public static void main(String[] args) {
        Switchable s = new LightBulb();
        Switch s1 = new Switch(s);
        s1.operate(true);
        s1.operate(false);
    }
}