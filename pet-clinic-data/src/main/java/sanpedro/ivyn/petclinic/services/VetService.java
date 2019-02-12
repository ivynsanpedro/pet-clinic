package sanpedro.ivyn.petclinic.services;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Owner> findAll();

}
