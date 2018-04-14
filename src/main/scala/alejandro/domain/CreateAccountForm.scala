package alejandro.domain

case class CreateAccountForm (personAddress:MyAddress,
                              person:AccountOwner,
                              accountType: AccountType,
                              initialCurrency:Double)
