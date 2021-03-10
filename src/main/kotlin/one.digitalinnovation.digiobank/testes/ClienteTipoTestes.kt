package one.digitalinnovation.digiobank.testes
import one.digitalinnovation.digiobank.ClienteTipo

fun main(){
    ClienteTipo.values().forEach{tipoPessoa->
        println("${tipoPessoa.name} - ${tipoPessoa.descricao}")
    }

    var tipoPF = ClienteTipo.PF

    var tipoPJ = ClienteTipo.PJ

    println(">> ${tipoPF.name} - ${tipoPF.descricao}")
    println(">> ${tipoPJ.name} - ${tipoPJ.descricao}")

}