package nosql.redis;

import redis.clients.jedis.Client;
import redis.clients.jedis.JedisPubSub;

public class RedisSubscriber extends JedisPubSub {

    @Override
    public int getSubscribedChannels() {
        // TODO Auto-generated method stub
        return super.getSubscribedChannels();
    }

    @Override
    public boolean isSubscribed() {
        // TODO Auto-generated method stub
        return super.isSubscribed();
    }

    @Override
    public void onMessage(String channel, String message) {
        System.out.println("Message sent from channel " + channel + " : " + message);
    }

    @Override
    public void onPMessage(String pattern, String channel, String message) {
        System.out.println("Message sent from channel " + channel + " with pattern ' " + pattern + "' : " + message);
    }

    @Override
    public void onPSubscribe(String pattern, int subscribedChannels) {
        // TODO Auto-generated method stub
        super.onPSubscribe(pattern, subscribedChannels);
    }

    @Override
    public void onPUnsubscribe(String pattern, int subscribedChannels) {
        // TODO Auto-generated method stub
        super.onPUnsubscribe(pattern, subscribedChannels);
    }

    @Override
    public void onSubscribe(String channel, int subscribedChannels) {
        // TODO Auto-generated method stub
        super.onSubscribe(channel, subscribedChannels);
    }

    @Override
    public void onUnsubscribe(String channel, int subscribedChannels) {
        // TODO Auto-generated method stub
        super.onUnsubscribe(channel, subscribedChannels);
    }

    @Override
    public void proceed(Client client, String... channels) {
        // TODO Auto-generated method stub
        super.proceed(client, channels);
    }

    @Override
    public void proceedWithPatterns(Client client, String... patterns) {
        // TODO Auto-generated method stub
        super.proceedWithPatterns(client, patterns);
    }

    @Override
    public void psubscribe(String... patterns) {
        // TODO Auto-generated method stub
        super.psubscribe(patterns);
    }

    @Override
    public void punsubscribe() {
        // TODO Auto-generated method stub
        super.punsubscribe();
    }

    @Override
    public void punsubscribe(String... patterns) {
        // TODO Auto-generated method stub
        super.punsubscribe(patterns);
    }

    @Override
    public void subscribe(String... channels) {
        // TODO Auto-generated method stub
        super.subscribe(channels);
    }

    @Override
    public void unsubscribe() {
        // TODO Auto-generated method stub
        super.unsubscribe();
    }

    @Override
    public void unsubscribe(String... channels) {
        // TODO Auto-generated method stub
        super.unsubscribe(channels);
    }

}
