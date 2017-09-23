package com.example.hockeystatsfinal.Service;

import com.example.hockeystatsfinal.DAO.PlayerDao;
import com.example.hockeystatsfinal.Entities.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class PlayerService {

    @Autowired
    private PlayerDao playerDao;

   public Player findById(Long id) throws Exception{
       if(id == null){
           throw new Exception("Id cannot be null");
       }
       return playerDao.findOne(id);
   }

   public Player createNewPlayer(Player player) throws Exception {
       if(player == null){
           throw new Exception("Player cannot be null");
       }

       return playerDao.save(player);
   }


}
