/*
 * Copyright by Stepan Oliinyk (c) 2018.
 */

package oli.sport.sport.controller;

import oli.sport.sport.model.Gym;
import oli.sport.sport.repository.GymRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GymController {

    @Autowired
    private GymRepository gymRepository;

    @GetMapping("/gyms")
    public List<Gym> getAllGyms(){
        return gymRepository.findAll();
    }
}
