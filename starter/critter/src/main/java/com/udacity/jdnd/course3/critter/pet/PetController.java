package com.udacity.jdnd.course3.critter.pet;

//import org.springframework.web.bind.annotation.*;
import com.udacity.jdnd.course3.critter.pet.PetDTO;
import com.udacity.jdnd.course3.critter.entity.Pet;
import com.udacity.jdnd.course3.critter.service.PetService;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Handles web requests related to Pets.
 */
@RestController
@RequestMapping("/pet")
public class PetController {

    @Autowired
    private PetService petService;
    private PetDTO PetDTO;


    private Pet convertPetToPetDTO(PetDTO petDTO) {
        Pet pet = new Pet();
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
        return this.petService.getPet(petId);

    }

    @GetMapping("/{petId}")
    public PetDTO getPet(@PathVariable long petId) {
        return this.petService(petDTO);
    }

    @GetMapping
    public List<PetDTO> getPets(){
        List<Pet> pet = petService.findAllPet();
        return this.petService.getPet(petId);
    }

    @GetMapping("/owner/{ownerId}")
    public List<PetDTO> getPetsByOwner(@PathVariable long ownerId) {
        List<Pet> pet = petService.findPetsByCustomerId(OwnerId);
        List<PetDTO> petDTO = new ArrayList<PetDTO>();

        for (Pet pet: pet) {
            petDTO.add(convertPetToPetDTO(pet));
        }
        return petDTO;
    }
}
