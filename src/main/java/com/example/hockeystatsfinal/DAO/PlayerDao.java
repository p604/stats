package com.example.hockeystatsfinal.DAO;

import com.example.hockeystatsfinal.Entities.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

public interface PlayerDao extends JpaRepository<Player, Long> {




}
