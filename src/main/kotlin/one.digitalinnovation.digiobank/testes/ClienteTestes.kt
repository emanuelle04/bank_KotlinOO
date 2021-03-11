package one.digitalinnovation.digiobank.testes

import one.digitalinnovation.digiobank.Cliente
import one.digitalinnovation.digiobank.ClienteTipo

fun main(){
    val clienteTeste = Cliente("Cliente Nome", "012.345.678-91", ClienteTipo.PF, "123456")
    println(clienteTeste)
    AutenticacaoTestes().autenticaLogin(clienteTeste)
}