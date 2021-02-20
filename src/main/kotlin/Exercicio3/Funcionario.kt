package Exercicio3

open class Funcionario(var id: String, var nome: String, var cpf: String, var salario: Double) {

    val listaFuncionarios: MutableList<Funcionario> = mutableListOf()

    fun salvarDados(funcionario: Funcionario): String {

        return when (funcionario.id) {
            "01" -> "Funcionario salvo com sucesso! ${
                listaFuncionarios.add(Gestor(
                    id, nome, cpf, salario))
            }"
            else -> "Funcionario salvo com sucesso! ${
                listaFuncionarios.add(Programador(
                    id, nome, cpf, salario))
            }"
        }
    }

    fun pesquisarFuncionario(id: String) {

        println()
        print("Digite '3' para exibir os dados ou '4' para aumentar o salario")
        //val leitor = 3
        val leitor = 4

        println()
        if (leitor == 3) {
            for (funcionario in listaFuncionarios) {
                if ((funcionario.id) == id) {
                    println("ID: ${funcionario.id}, " +
                            "NOME: ${funcionario.nome}, " +
                            "CPF: ${funcionario.cpf}, " +
                            "SALARIO: R$${funcionario.salario} ")
                }
            }
        }
        if (leitor == 4 && id == "01") {
            println(Gestor(id, nome, cpf, salario).calcularSalario())
        } else if (leitor == 4 && id == "02") {
            println(Programador(id, nome, cpf, salario).calcularSalario())
        }
    }
}



