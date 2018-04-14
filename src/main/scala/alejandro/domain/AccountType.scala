package alejandro.domain

import java.util.Date

sealed trait AccountType
  case class CheckAccount(name:String,avalibleAccount:AvalibleAccount,startDate:Date
                              ,endDate:Date, currentBalance:Double) extends AccountType
  case class SavingAccount(name:String,avalibleAccount:AvalibleAccount,startDate:Date
                               ,endDate:Date, currentBalance:Double) extends AccountType
  case class FiduciaryAccount(name:String,avalibleAccount:AvalibleAccount,startDate:Date
                                  ,endDate:Date, currentBalance:Double) extends AccountType

