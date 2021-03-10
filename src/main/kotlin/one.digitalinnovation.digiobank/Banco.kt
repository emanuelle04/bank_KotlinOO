package one.digitalinnovation.digiobank

data class Banco(
    val Nome:String,
    val Numero:Int
){
    fun info() = "Nome do banco: $Nome \nNúmero do banco: $Numero"
}
