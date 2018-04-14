package alejandro.domain

sealed trait Currency
  case class Dollar(value:Double) extends Currency
  case class COP(value:Double) extends Currency

