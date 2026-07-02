package com.ipl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.ipl.pojo.Player;

public class IplDaoJdbcImpl implements IplDao {

    @Override
    public boolean save(Player p) {

        String sql = "INSERT INTO player VALUES(?,?,?,?)";

        try {

            Connection conn = JdbcFactory.getConnection();

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, p.getPlayerId());
            stmt.setString(2, p.getPlayerName());
            stmt.setString(3, p.getTeamName());
            stmt.setDouble(4, p.getBid());

            stmt.executeUpdate();

            return true;

        } catch (SQLException e) {

            e.printStackTrace();
            return false;

        }
    }

    @Override
    public Optional<Player> find(int playerId) {

        String sql = "SELECT * FROM player WHERE playerId=" + playerId;

        try {

            Connection conn = JdbcFactory.getConnection();

            ResultSet rs = conn.createStatement().executeQuery(sql);

            Player p = null;

            if (rs.next()) {

                p = new Player();

                p.setPlayerId(rs.getInt(1));
                p.setPlayerName(rs.getString(2));
                p.setTeamName(rs.getString(3));
                p.setBid(rs.getDouble(4));

            }

            return Optional.ofNullable(p);

        } catch (SQLException e) {

            e.printStackTrace();

            return Optional.empty();
        }
    }

    @Override
    public List<Player> list() {

        String sql = "SELECT * FROM player";

        List<Player> players = new ArrayList<>();

        try {

            Connection conn = JdbcFactory.getConnection();

            ResultSet rs = conn.createStatement().executeQuery(sql);

            while (rs.next()) {

                Player p = new Player();

                p.setPlayerId(rs.getInt(1));
                p.setPlayerName(rs.getString(2));
                p.setTeamName(rs.getString(3));
                p.setBid(rs.getDouble(4));

                players.add(p);

            }

            return players;

        } catch (SQLException e) {

            e.printStackTrace();

            return null;
        }
    }

    @Override
    public boolean delete(int playerId) {

        String sql = "DELETE FROM player WHERE playerId=" + playerId;

        try {

            Connection conn = JdbcFactory.getConnection();

            Statement stmt = conn.createStatement();

            stmt.executeUpdate(sql);

            return true;

        } catch (SQLException e) {

            e.printStackTrace();

            return false;

        }
    }

    @Override
    public List<Player> findByBid(double min, double max) {

        String sql = "SELECT * FROM player WHERE bid BETWEEN ? AND ?";

        List<Player> players = new ArrayList<>();

        try {

            Connection conn = JdbcFactory.getConnection();

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setDouble(1, min);
            stmt.setDouble(2, max);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                Player p = new Player();

                p.setPlayerId(rs.getInt(1));
                p.setPlayerName(rs.getString(2));
                p.setTeamName(rs.getString(3));
                p.setBid(rs.getDouble(4));

                players.add(p);

            }

            return players;

        } catch (SQLException e) {

            e.printStackTrace();

            return null;

        }
    }
}