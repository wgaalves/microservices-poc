package br.com.willalves.microservicespoc.spendmoney.service;

import br.com.willalves.microservicespoc.spendmoney.client.AuthServiceClient;
import br.com.willalves.microservicespoc.spendmoney.model.Expense;
import br.com.willalves.microservicespoc.spendmoney.repository.ExpenseRepository;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j
@AllArgsConstructor
@Service
public class ExpenseServiceImpl implements ExpenseService {

    private ExpenseRepository expenseRepository;

    private AuthServiceClient authClient;

    @Override
    public Expense create(Expense expense, String owner) {
        expense.setOwner(owner);
        return expenseRepository.save(expense);
    }

    @Override
    public List<Expense> findAllByUser(String owner) {
        return expenseRepository.findAllByOwner(owner);
    }

    @Override
    public Expense find(Long id) {
        return expenseRepository.getById(id);
    }

}
