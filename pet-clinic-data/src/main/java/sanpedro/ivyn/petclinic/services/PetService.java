package sanpedro.ivyn.petclinic.services;

import sanpedro.ivyn.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
