package com.coconet.dao;

import com.coconet.model.Subscriber;

import java.util.List;

/**
 * Created by Admin on 04-02-2017.
 */
public interface SubscriberDao {
    public List<Subscriber> list();

    public Subscriber get(int id);

    public void saveOrUpdate(Subscriber user);

    public void update(Subscriber subscriber);

    public Subscriber findByEmail(String email);

    public Subscriber findByEmailAndToken(String email, String token);

    public Subscriber findByToken(String token);
}
