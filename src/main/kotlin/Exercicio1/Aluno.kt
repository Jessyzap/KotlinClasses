package Exercicio1

data class Aluno(
    private val nomeAluno: String,
    private val dataNascAluno: String,
    private val alturaAluno: Double): Pessoa(
    nome = nomeAluno,
    dataNasc = dataNascAluno,
    altura = alturaAluno)
