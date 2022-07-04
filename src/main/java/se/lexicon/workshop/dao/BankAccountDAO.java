package se.lexicon.workshop.dao;

import se.lexicon.workshop.model.BankAccount;
import se.lexicon.workshop.model.Customer;

import java.util.ArrayList;

public class BankAccountDAO {

    private ArrayList<BankAccount> bankAccounts;

    public BankAccountDAO() {
        bankAccounts = new ArrayList<>();
    }

    public boolean add(double balance, Customer owner) {
        BankAccount btoAdd = new BankAccount(balance, owner);
        bankAccounts.add(btoAdd);
        return true;
    }

    public BankAccount findBankAccountById(int bankAccountId) {
        for (BankAccount ba : bankAccounts) {
            if (ba.getId() == bankAccountId) {
                return ba;
            }
        }
        return null;
    }

    public boolean remove(BankAccount bankAccount) {
        return bankAccounts.remove(bankAccount);
    }

    public boolean remove(int bankAccountID){
        BankAccount bankAccountById = findBankAccountById(bankAccountID);
        return remove(bankAccountById);
    }
}
