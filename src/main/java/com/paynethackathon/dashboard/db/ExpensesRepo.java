package com.paynethackathon.dashboard.db;

import org.springframework.data.repository.CrudRepository;

public interface ExpensesRepo extends CrudRepository<ExpensesEntity, Integer> {

}
