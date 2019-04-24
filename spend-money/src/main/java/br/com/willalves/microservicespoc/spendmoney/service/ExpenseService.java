package br.com.willalves.microservicespoc.spendmoney.service;

import br.com.willalves.microservicespoc.spendmoney.model.Expense;

import java.util.List;

public interface ExpenseService {

    Expense create(Expense expense, String owner);

    List<Expense> findAllByUser(String owner);

    Expense find(Long id);


}
