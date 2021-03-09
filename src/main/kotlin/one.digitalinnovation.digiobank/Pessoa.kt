package one.digitalinnovation.digiobank

class Pessoa{
    var nome: String ="Nome"
    var cpf: String = "123.456.789-10"
        private set //proibe a alteração da propriedade

    inner class Endereco{
        var rua:String = "Nome Rua"
    }
    constructor()

    fun pessoaInfo() = "$nome e $cpf"


}

fun main(){
val manu = Pessoa()
println(manu.pessoaInfo())
}

