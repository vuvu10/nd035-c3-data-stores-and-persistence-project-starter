package com.udacity.jdnd.course3.critter.pets;

//import org.springframework.web.bind.annotation.*;
import com.udacity.jdnd.course3.critter.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Handles web requests related to Pets.
 */
@RestController
@RequestMapping("/pet")
public class PetController {

    @Autowired
    private PetService petService;
    private PetDTO petDTO;


    @PostMapping
    public PetDTO savePet(@RequestBody PetDTO petDTO) {
        return this.petService.savePet(petDTO);
    }

    @GetMapping("/{petId}")
    public PetDTO getPet(@PathVariable long petId) {
        return this.petService.getPet(petId);
    }

    @GetMapping
    public List<PetDTO> getPets() {
        return this.petService.getsPet();

    }

    @GetMapping("/owner/{ownerId}")
    public List<PetDTO> getPetsByOwner(@PathVariable long ownerId) {
        return this.petService.getPetByOwner(OwnerId);

    }


}
