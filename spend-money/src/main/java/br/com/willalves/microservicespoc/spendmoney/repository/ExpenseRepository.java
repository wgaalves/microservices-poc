package br.com.willalves.microservicespoc.spendmoney.repository;

import br.com.willalves.microservicespoc.spendmoney.model.Expense;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense, Long> {

    List<Expense> findAllByOwner(String owner);


    Expense getById(Long id);
}
