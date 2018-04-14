package alejandro.domain

sealed trait PersonType
case class NaturalPerson() extends PersonType
case class JuridicPerson() extends PersonType
