/*
 * Copyright by Stepan Oliinyk (c) 2018.
 */

package oli.sport.sport.controller;

import oli.sport.sport.model.SportClub;
import oli.sport.sport.repository.SportClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SportClubController {

    @Autowired
    private SportClubRepository sportClubRepository;

    public List<SportClub> getAllSportClubs(){
        return sportClubRepository.findAll();
    }
}
