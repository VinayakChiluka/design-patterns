interface UberUser{
    void ride();
    void trackRide();
    void trackEarning();

    void aceptRide();
    void bookRide();
    void cancelRide();
    void rateRide();
    void payRide();
}


class Rider implements UberUser{

    @Override
    public void ride() {

        throw new UnsupportedOperationException("UnSupported method 'ride'");
    }

    @Override
    public void trackEarning() {

        throw new UnsupportedOperationException("Unsupported method 'trackEarning'");
    }

    @Override
    public void aceptRide() {

        throw new UnsupportedOperationException("Unsupported method 'aceptRide'");
    }

    @Override
    public void trackRide() {

        System.out.println("Rider trackRide");
    }

    @Override
    public void bookRide() {

        System.out.println("Rider bookRide");
    }

    @Override
    public void cancelRide() {
        System.out.println("Rider cancelRide");
    }

    @Override
    public void rateRide() {

       System.out.println("Rider rateRide");
    }

    @Override
    public void payRide() {
        System.out.println("Rider payRide");
   }
    
}
