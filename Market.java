package service;

import model.Buyer;

import java.util.*;

public class Market implements MarketBehavior, QueueBehavior {
    List<Buyer> actors = new LinkedList<>();
    Queue<Buyer> actorsQueue = new ArrayDeque<>();

    @Override
    public void acceptToMarket(Buyer actor) {
        System.out.println(actor.getName() + " зашел в магазин");
        actors.add(actor);
    }

    @Override
    public void releaseFromMarket(Buyer actor) {
        actors.remove(actor);
        System.out.println(actor.getName() + " покинул магазин");
    }

    @Override
    public void update() {
    }

    @Override
    public void takeInQueue(Buyer actor) {
        actorsQueue.add(actor);
        System.out.println(actor.getName() + " встал в очередь");
    }

    @Override
    public void takeOrder() {
        assert actorsQueue.peek() != null;
        actorsQueue.peek().isTakeOrder();
        assert actorsQueue.peek() != null;
        System.out.println(actorsQueue.peek().getName() + " забрал заказ");
    }

    @Override
    public void giveOrder() {
        assert actorsQueue.peek() != null;
        actorsQueue.peek().isMakeOrder();
        assert actorsQueue.peek() != null;
        System.out.println(actorsQueue.peek().getName() + " сделал заказ");
    }

    @Override
    public void releaseFromQueue() {
        assert actorsQueue.peek() != null;
        System.out.println(actorsQueue.peek().getName() + " покинул очередь");
        actorsQueue.poll();
    }
}
