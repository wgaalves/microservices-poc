package br.com.willalves.microservicespoc.spendmoney.controller;

import br.com.willalves.microservicespoc.spendmoney.model.Expense;
import br.com.willalves.microservicespoc.spendmoney.service.ExpenseService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;
import java.util.List;

@RestController
public class ExpenseController {

    private ExpenseService expenseService;

    @RequestMapping(path = "/spent",
                    method = RequestMethod.GET,
                    produces = "application/json")
    public List<Expense> getAllExpenses(Principal principal){
        return expenseService.findAllByUser(principal.getName());
    }

    @RequestMapping(path = "/spent/{id}",
                    method = RequestMethod.GET,
                    produces = "application/json")
    public Expense getExpense(@Valid @PathVariable Long id){
        return expenseService.find(id);
    }

    @RequestMapping(path = "/spent",
                    method = RequestMethod.POST,
                    consumes = "application/json",
                    produces = "application/json")
    public Expense addNewExpense(Principal principal, @RequestBody Expense expense ){
        return expenseService.create(expense, principal.getName());
    }


}
