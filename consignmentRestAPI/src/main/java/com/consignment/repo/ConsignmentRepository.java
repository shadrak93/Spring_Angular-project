package com.consignment.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsignmentRepository extends CrudRepository<ConsignmentEntity, Integer> {

}
