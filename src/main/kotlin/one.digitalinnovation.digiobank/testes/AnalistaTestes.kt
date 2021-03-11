package one.digitalinnovation.digiobank.testes
import one.digitalinnovation.digiobank.Funcionario
import one.digitalinnovation.digiobank.Analista

fun main(){
    val objetoFuncionario = Analista("Pessoa Nome Teste", "012.345.678-91", 5000.00)
    imprimeRelatorio(objetoFuncionario)
}

fun imprimeRelatorio(funcionario:Funcionario){
    println(funcionario.toString())
}