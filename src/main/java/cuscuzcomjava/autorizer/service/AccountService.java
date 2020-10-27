package cuscuzcomjava.autorizer.service;

import cuscuzcomjava.autorizer.entity.Account;
import cuscuzcomjava.autorizer.entity.Violation;
import cuscuzcomjava.autorizer.entity.enumeration.ViolationsEnum;
import cuscuzcomjava.autorizer.repository.AccountRepository;
import cuscuzcomjava.autorizer.repository.ViolationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    ViolationRepository violationRepository;


    Violation violation;
    List<Violation> violationList;

    public Account createAccount( Account account){
        if(accountRepository.findAll() == null){
            return accountRepository.save(account);
        }

        violation.setViolations(ViolationsEnum.ACCOUNT_ALREADY_INITIALIZED);
        violationRepository.save(violation);

        account = accountRepository.findAll().get(0);
        account.setViolationList(violationRepository.findAll());

        return account;
    }
}
