package alejandro.domain

case class BankAccount (accountNumber:Long,
                        hownerId:Long,
                        hownerAddress: MyAddress,
                        accountType: AccountType,
                        isActive:Boolean
                       )
