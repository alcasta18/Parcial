package alejandro.service


import alejandro.domain._

class BankingService {
  def credit(accountType: AccountType, currency: Currency): Double ={
    accountType match {
      case SavingAccount(_,_,_,_,currentBalance) => currency match {
        case Dollar(money) => currentBalance+money
        case COP(money) => currentBalance+money
      }
      case CheckAccount(_,_,_,_,currentBalance) => currency match {
        case Dollar(money) => currentBalance+money
        case COP(money) => currentBalance+money
      }
      case FiduciaryAccount(_,_,_,_,currentBalance) => currency match {
        case Dollar(money) => currentBalance+money
        case COP(money) => currentBalance+money
      }
    }
  }

  def debit(accountType: AccountType, currency: Currency): Double ={
    accountType match {
      case SavingAccount(_,_,_,_,currentBalance) => currency match {
        case Dollar(money) if (currentBalance > money)  => currentBalance-money
        case COP(money) if (currentBalance > money) => currentBalance-money
      }
      case CheckAccount(_,_,_,_,currentBalance) => currency match {
        case Dollar(money) if (currentBalance > money) => currentBalance-money
        case COP(money) if (currentBalance > money) => currentBalance-money
      }
      case FiduciaryAccount(_,_,_,_,currentBalance) => currency match {
        case Dollar(money) if (currentBalance > money) => currentBalance-money
        case COP(money) if (currentBalance > money) => currentBalance-money
      }
    }
  }

  def transfer(accountType: AccountType,accountType2: AccountType,currency: Currency):Unit={
    accountType match {
      case SavingAccount(_,_,_,_,currentBalance) => debit(accountType,currency)
      case CheckAccount(_,_,_,_,currentBalance) => debit(accountType,currency)
      case FiduciaryAccount(_,_,_,_,currentBalance) => debit(accountType,currency)
    }
    accountType2 match {
      case SavingAccount(_,_,_,_,currentBalance) => credit(accountType,currency)
      case CheckAccount(_,_,_,_,currentBalance) => credit(accountType,currency)
      case FiduciaryAccount(_,_,_,_,currentBalance) => credit(accountType,currency)
    }
  }

  def balanceInquiry(accountType: AccountType): Double ={
    accountType match {
      case SavingAccount(_,_,_,_,currentBalance) => currentBalance
      case CheckAccount(_,_,_,_,currentBalance) => currentBalance
      case FiduciaryAccount(_,_,_,_,currentBalance) => currentBalance
     }
  }
}






