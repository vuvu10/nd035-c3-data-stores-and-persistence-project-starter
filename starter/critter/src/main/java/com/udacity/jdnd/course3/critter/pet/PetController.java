package com.udacity.jdnd.course3.critter.pet;

import org.springframework.web.bind.annotation.*;
import com.udacity.jdnd.course3.critter.PetDTO;
import com.udacity.jdnd.course3.critter.Entity.Pet;
import com.udacity.jdnd.course3.critter.service.PetService;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Handles web requests related to Pets.
 */
@RestController
@RequestMapping("/pet")
public class PetController {

    @Autowired
    private PetService petService;


    private pet convertPetToPetDTO(PetDTO petDTO) {
        Pet pet = new pet();
        BeanUtils.copyProperties(PetDTO, pet);
        return pet;
    }

    private PetDTO convertPetToPetDTO(Pet pet) {
        PetDTO petDTO = new PetDTO();
        BeanUtils.copyProperties(pet, petDTO);
        return petDTO;
    }


    @PostMapping
    public PetDTO savePet(@RequestBody PetDTO petDTO) {
        Pet pet = convertPetToPetDTO(petDTO);
        Pet savedPet = petService.savePet(pet);
        return convertPetToPetDTO(Pet pet);

    }

    @GetMapping("/{petId}")
    public PetDTO getPet(@PathVariable long petId) {
        Pet pet = petService.findPetById(petId);
        return convertPetToPetDTO(Pet pet);
    }

    @GetMapping
    public List<PetDTO> getPets(){

        throw new UnsupportedOperationException();
    }

    @GetMapping("/owner/{ownerId}")
    public List<PetDTO> getPetsByOwner(@PathVariable long ownerId) {
        List<Pet> pet = petService.findPetsByOwner(OwnerId);
        List<PetDTO> petDTO = new ArrayList<PetDTO>();

        for (Pet pet: pet) {
            petDTO.add(convertPetToPetDTO(pet));
        }
        return petDTO;
    }
}
