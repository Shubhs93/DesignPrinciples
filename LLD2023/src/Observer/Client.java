package Observer;


public class Client {
    public static void main(String[] args) {
        Amazon a = Amazon.getInstance();
        SCMNotifier scmNotifier = new SCMNotifier();
        //observer.Amazon.CustomerNotifier customerNotifier = new observer.Amazon.CustomerNotifier();
        SellerNotifier sellerNotifier = new SellerNotifier();
        OrderPlacedSubscriber n = new SCMNotifier();
      //  a.registerOrderPlacedSubscriber();
        a.orderPlaceEvent();
        a.orderCancelledEvent();
    }
}
