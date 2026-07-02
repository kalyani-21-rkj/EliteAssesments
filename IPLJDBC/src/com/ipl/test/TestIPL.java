package com.ipl.test;

import com.ipl.dao.IplDao;
import com.ipl.dao.IplDaoJdbcImpl;
import com.ipl.pojo.Player;

public class TestIPL {

    public static void main(String[] args) {

        IplDao dao = new IplDaoJdbcImpl();

        Player p = new Player(10, "Virat Kohli", "RCB", 21.00);

        if (dao.save(p))
            System.out.println("Player Inserted");

        System.out.println("\nFind Player:");
        System.out.println(dao.find(10));

        System.out.println("\nAll Players:");
        dao.list().forEach(System.out::println);

        System.out.println("\nPlayers with Bid Between 10 and 25:");

        dao.findByBid(10, 25).forEach(System.out::println);

        if (dao.delete(10))
            System.out.println("\nPlayer Deleted");
    }
}