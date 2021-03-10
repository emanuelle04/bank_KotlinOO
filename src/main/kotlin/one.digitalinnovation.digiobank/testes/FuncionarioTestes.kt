package one.digitalinnovation.digiobank.testes
import one.digitalinnovation.digiobank.Funcionario
import java.math.BigDecimal
import one.digitalinnovation.digiobank.Pessoa

fun main(){
    val objetoPessoa = Pessoa("Teste Nome Pessoa", "012.345.678-91")
    val objetoFuncionario = Funcionario("Pessoa Nome Teste", "012.345.678-91", BigDecimal(5000))
    println(objetoFuncionario.salario)

}