package nl.itvitae.spartans.controller;

import nl.itvitae.spartans.domain.Game;
import nl.itvitae.spartans.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/game")

public class GameController{

    @Autowired
    private GameRepository gameRepository;

    @GetMapping("getAll")
    public List<Game> getAllGames(){
        return gameRepository.findAll();
    }
    @GetMapping("add")
    public String addGame(){
        gameRepository.save(new Game(400));
        return "game added";
    }

}
