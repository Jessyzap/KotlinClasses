package Exercicio1

// Construtor primário
//class Pessoa(nomeAluno: String, dataNascAluno: String, alturaAluno: Double) {
//    private val nome: String = nomeAluno
//    private val dataNasc: String = dataNascAluno
//    private val altura: Double = alturaAluno

open class Pessoa (private val nome: String,
                   private val dataNasc: String,
                   private val altura: Double) {

    fun getNome(): String {
        return nome
    }
    fun getDataNasc(): String {
        return dataNasc
    }
    fun getAltura(): Double {
        return altura
    }

    fun calcularIdade(): Int {

        val dataNascInteiro = dataNasc.toInt()
        val dataNasc = dataNascInteiro % 10000  // 4 últimos dígitos
        return 2021 - dataNasc
    }

    private fun mostrarDia(): String {

        return dataNasc.substring(0,2)  // valores de 0 e antes de 2 da string
    }

    private fun mostrarMes(): String {

        val dataNasc = dataNasc.substring(2,4)

        val mes = when (dataNasc) {
            "01" -> "janeiro"
            "02" -> "fevereiro"
            "03" -> "março"
            "04" -> "abril"
            "05" -> "maio"
            "06" -> "junho"
            "07" -> "julho"
            "08" -> "agosto"
            "09" -> "setembro"
            "10" -> "outubro"
            "11" -> "novembro"
            else -> "dezembro"
        }
        return mes
    }

    fun exibirDados(): String {
        return "$nome nasceu em ${mostrarDia()} de ${mostrarMes()}, tem ${calcularIdade()} anos e possui $altura de altura."
    }
}
