/*
 * Copyright by Stepan Oliinyk (c) 2018.
 */

package oli.sport.sport.controller;

import oli.sport.sport.model.SportKind;
import oli.sport.sport.repository.SportKindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SportKindController {

    @Autowired
    private SportKindRepository sportKindRepository;

    public List<SportKind> getAllSportKinds(){
        return sportKindRepository.findAll();
    }
}
