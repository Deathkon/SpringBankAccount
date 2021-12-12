package com.bank.bank;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankController {
    @GetMapping("/")
     public String viewHome(Model model) {
          // create a list of accounts
          Account banking;
          List<Account> account = new ArrayList<>();
          // create a list of saving account
          banking = new SavingAccount("Michael J. Mateo", "4432084367", 465000);
          account.add(banking);
          banking = new SavingAccount("Lindsey J. Day", "5068987212", 221500);
          account.add(banking);
          banking = new SavingAccount("Dorothy M. Hogan", "0819857862", 420000);
          account.add(banking);
          // create a list of checking account
          banking = new CheckingAccount("Bobby K. Wilson", "0452947859", 792000);
          account.add(banking);
          banking = new CheckingAccount("Robert T. Galvan", "8250666406", 600000);
          account.add(banking);
          banking = new CheckingAccount("Michael S. Maher", "6193310995", 124000);
          account.add(banking);
          // create a list of current account
          banking = new CurrentAccount("Gloria M. Mosley", "4743672716", 980000);
          account.add(banking);
          banking = new CurrentAccount("Rosa H. Burritt", "3417605102", 840000);
          account.add(banking);
          banking = new CurrentAccount("Larry B. Smith", "7060481316", 761000);
          account.add(banking);
          model.addAttribute("MyAccount", account);
        return "index";
     }
}


