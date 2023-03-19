package service;

import model.Buyer;

public interface QueueBehavior {
    void takeInQueue(Buyer actor);
    void takeOrder();
    void giveOrder();
    void releaseFromQueue();
}
