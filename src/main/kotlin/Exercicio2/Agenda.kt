package Exercicio2

class Agenda() {

    val contato1 = Contato("Carlos", 85553658, "carlos@email.com")
    val contato2 = Contato("Angela", 49785254, "angela@email.com")

    val lista: MutableList<Contato> = mutableListOf(contato1, contato2)

    fun addContato(contato: Contato) {

        //confirmar se o novo contato está na lista (data class permite a comparação entre atributos)
        if ((lista.contains(contato)) && (lista.size <= 10)) {
            println("Esse contato ja existe na agenda!")
        }
        if (lista.size > 10) {
            println("A agenda esta cheia!")
        } else {
            lista.add(contato)
        }
    }

    fun removerContato(contato: Contato) {

        if (lista.contains(contato)) {
            println("Contato removido com sucesso!")
            lista.remove(contato)
        } else {
            println("Esse contato nao existe na agenda!")
        }
    }

    fun buscarContato(nomeContato: String) {

        for (item in lista) {
            if (item.toString().contains(nomeContato)) println(item)
        }
    }

    fun mostrarContatos(): MutableList<Contato> {
        return lista
    }
}


