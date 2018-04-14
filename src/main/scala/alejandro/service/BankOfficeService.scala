package alejandro.service

import alejandro.domain.{Bank, BankAccount, CreateAccountForm}

class BankOfficeService {
 def createAccount(form:CreateAccountForm): Unit ={
   if (form.initialCurrency > 0){
     val r = scala.util.Random
     val bankAccount = new BankAccount(r.nextLong(),form.person.id,
       form.personAddress,form.accountType,true)
     val list:List[BankAccount] = bankAccount::Nil
     val bank = new Bank(1,list)
   }
 }
}
