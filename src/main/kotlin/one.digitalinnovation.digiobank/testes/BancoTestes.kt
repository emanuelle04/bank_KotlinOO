package one.digitalinnovation.digiobank.testes
import one.digitalinnovation.digiobank.Banco

fun main(){
    val digiOneBank = Banco(Nome="DigiOne", Numero=12)
    println(digiOneBank.Nome)
    println(digiOneBank.Numero)

    val digiOneBank2  = digiOneBank.copy(Nome="OutroNome")//cria uma cópia para alterar informações das val
    println(digiOneBank2.info())
}

