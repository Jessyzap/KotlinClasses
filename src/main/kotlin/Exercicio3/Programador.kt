package Exercicio3

class Programador(
    private val idProgramador: String,
    private val nomeProgramador: String,
    private val cpfProgramador: String,
    private val salarioProgramador: Double,
) : Funcionario(
    id = idProgramador,
    nome = nomeProgramador,
    cpf = cpfProgramador,
    salario = salarioProgramador), AumentarSalario {
    override fun calcularSalario(): String {
        println()
        return "Nome: $nome, Salario atual + 20% de aumento R$${"%.2f".format(salario * 1.20)}"
    }
}


