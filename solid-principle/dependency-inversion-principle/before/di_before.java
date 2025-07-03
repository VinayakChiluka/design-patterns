class LightBulb{
    public void turnOn(){
        System.out.println("LightBulb: Bulb turned on...");
    }
    public void turnOff(){
        System.out.println("LightBulb: Bulb turned off...");
    }
}


class Switch{
    private LightBulb bulb;
    public Switch(LightBulb bulb){
        this.bulb = bulb;
    }
    public void operate(boolean on){
        if(on){
            bulb.turnOn();
        }else{
            bulb.turnOff();
        }
    }
}

class Main{
    public static void main(String[] args) {
        Switch s = new Switch(new LightBulb());
        s.operate(true);
        s.operate(false);
    }
}