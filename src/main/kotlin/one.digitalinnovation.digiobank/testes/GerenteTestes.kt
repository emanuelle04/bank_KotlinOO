package one.digitalinnovation.digiobank.testes
import one.digitalinnovation.digiobank.Funcionario
import one.digitalinnovation.digiobank.Gerente

fun main(){
    val objetoFuncionario = Gerente("Gerente Nome Teste", "012.345.678-91", 3000.00)
    imprimeRelatorio(objetoFuncionario)
}

