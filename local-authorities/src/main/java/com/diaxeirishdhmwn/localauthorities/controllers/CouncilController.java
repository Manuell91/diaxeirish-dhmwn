package com.diaxeirishdhmwn.localauthorities.controllers;

import com.diaxeirishdhmwn.localauthorities.entities.Council;
import com.diaxeirishdhmwn.localauthorities.services.CouncilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/councils")
public class CouncilController {

    @Autowired
    private CouncilService councilService;

    @GetMapping
    public Iterable<Council> findAllCouncils() {
        return councilService.findAllCouncils();
    }

    @GetMapping("/{councilId}")
    public Council findCouncilById(@PathVariable Long councilId) {
        return councilService.findCouncilById(councilId);
    }
}
