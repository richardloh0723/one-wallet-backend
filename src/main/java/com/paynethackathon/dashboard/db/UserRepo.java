package com.paynethackathon.dashboard.db;

import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserEntity, Integer> {

}
