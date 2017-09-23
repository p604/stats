package com.example.hockeystatsfinal.Controllers;

import com.example.hockeystatsfinal.Entities.Player;
import com.example.hockeystatsfinal.Service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @RequestMapping(value = "/players/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Player findById(@PathVariable("id") Long id) throws Exception{
        return playerService.findById(id);
    }

    @RequestMapping(value = "/players", method = RequestMethod.POST)
    @ResponseBody
    public Player createNewPlayer(@RequestBody final Player player) throws Exception{
        return playerService.createNewPlayer(player);
    }
}
