package com.example.patterns_banking.services.commands;

import com.example.patterns_banking.models.Account;
import com.example.patterns_banking.repositories.IAccountRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class SearchAccountsCommand implements ICommand<List<Account>> {
    private final IAccountRepository accountRepository;

    @Override
    public List<Account> execute() {
        return this.accountRepository.findAll();
    }

}
