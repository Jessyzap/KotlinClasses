package Exercicio3

fun main() {

    val funcionario1 = Funcionario(id = "01", nome = "Airlton", cpf = "x203584796", salario = 3000.0)
    val funcionario2 = Funcionario(id = "02", nome = "Katia", cpf = "x048759630", salario = 2500.0)
    val funcionario3 = Funcionario(id = "02", nome = "Angela", cpf = "x897520146", salario = 2500.0)

    // Salvar funcionários
    println(funcionario1.salvarDados(funcionario1))
    println(funcionario2.salvarDados(funcionario2))
    println(funcionario3.salvarDados(funcionario3))

    // Pesquisar funcionário pelo id e escolher entre mostrar os dados ou aumentar o salário
    println(funcionario1.pesquisarFuncionario(id = "01"))
    println(funcionario2.pesquisarFuncionario(id = "02"))
    println(funcionario3.pesquisarFuncionario(id = "02"))


//    println("||==============================================||")
//    println("||                                              ||")
//    println("|| Digite '1' para inserir novo funcionario     ||")
//    println("|| Digite '2' para pesquisar funcionario        ||")
//    println("||                                              ||")
//    println("||==============================================||")
//    println("||  readLine()                                  ||")
//    println("||______________________________________________||")
//    println()
//    val numeroDigitado = 1
//    //val numeroDigitado = 2
//
//
//    if (numeroDigitado == 1) {
//        println("||==============================================||")
//        println("||                                              ||")
//        println("|| Digite o id: readLine()                      ||")
//        println("|| Digite o nome: readLine()                    ||")
//        println("|| Digite o CPF: readLine()                     ||")
//        println("|| Digite o salario: readLine()                 ||")
//        println("||                                              ||")
//        println("||==============================================||")
//        println()
//
//        // readLine()
//        var opcao: String
//        val id = "01"
//        val nome = "Airlton"
//        val cpf = "x203584796"
//        val salario = 3000.0
//        val funcionario = Funcionario(id, nome, cpf, salario)

////        do {
////           println(funcionario.salvarDados(funcionario))
////            println("Deseja inserir outro funcionario? S/N")
////            // opcao = 's' // readLine()
////        } while (opcao == 's' || opcao == 'S')

////      teste
//        for (i in 0..2) {
//            println(funcionario.salvarDados(funcionario))
//        }
//    }
//
//    if (numeroDigitado == 2) {
//        println("||==============================================||")
//        println("|| Digite o id do funcionario: readLine()       ||")
//        println("||______________________________________________||")
//        val funcionario = Funcionario("", "", "", 0.0)
//
//        //readLine()
//        val id = "01"
//        println(funcionario.pesquisarFuncionario(id))
//    }
}

