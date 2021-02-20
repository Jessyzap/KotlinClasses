package Exercicio3

class Gestor(
    private val idGestor: String,
    private val nomeGestor: String,
    private val cpfGestor: String,
    private val salarioGestor: Double,
) : Funcionario(
    id = idGestor,
    nome = nomeGestor,
    cpf = cpfGestor,
    salario = salarioGestor), AumentarSalario {
    override fun calcularSalario(): String {
        println()
        return "Nome: $nome, Salario atual + 10% de aumento R$${"%.2f".format(salario * 1.10)}"
    }
}


