package Observer;


public interface OrderCancelledSubscriber {
    ReturnData orderCancelledEvent();

    //default -> this.registerInAmazon -> orderCancelledEvent
}
