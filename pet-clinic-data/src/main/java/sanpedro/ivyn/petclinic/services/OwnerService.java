package sanpedro.ivyn.petclinic.services;

import sanpedro.ivyn.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
