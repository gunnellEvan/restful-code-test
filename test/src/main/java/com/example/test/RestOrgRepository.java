package com.example.test;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//Repository tag manages API. Extension provides functions such as PUT, DELETE, etc. 
@RepositoryRestResource
public interface RestOrgRepository extends CrudRepository<Organization, String>{

}
