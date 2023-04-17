package Observer;

public class SellerNotifier implements OrderPlacedSubscriber{

    public SellerNotifier() {
        Amazon a = Amazon.getInstance();
        a.registerOrderPlacedSubscriber(this);
    }

    @Override
    public ReturnData orderPlaceEvent() {
        Observer.ReturnData r = new Observer.ReturnData("Notifying all seller after order placed");
        System.out.println("SellerNotifier listener - notify sellers");
        return r;
    }
}
