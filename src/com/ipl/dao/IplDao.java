package com.ipl.dao;

import java.util.List;
import java.util.Optional;

import com.ipl.pojo.Player;

public interface IplDao {

    boolean save(Player p);

    Optional<Player> find(int playerId);

    List<Player> list();

    boolean delete(int playerId);

    List<Player> findByBid(double min, double max);
}