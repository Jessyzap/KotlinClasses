package Exercicio2

fun main() {

    val agenda = Agenda()

    // adicionar novo contato
    println(agenda.addContato(Contato(nome = "Angela",telefone = 44528548,email = "angelamoises@email.com")))

    //// adicionar contato repetido
    println(agenda.addContato(Contato(nome = "Angela",telefone = 44528548,email = "angelamoises@email.com")))

    //// remover contato
    //println(agenda.removerContato(Contato(nome = "Angela",telefone = 44528548,email = "angelamoises@email.com")))

    // verificar se o contato está na lista
    //println(agenda.buscarContato("Angela"))

    // lista de contatos salvos
    println(agenda.mostrarContatos())
}



