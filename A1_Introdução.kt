// Aula 1: Primeiro contato

fun main() {
    println("1. Olá, mundo!")

    print("2. Samuel Bomfim")
    print(" ")
    print("Samuel")

    println()

    var nome = "3. Samuel Bomfim\nXamu\nSamuel"
    println(nome)

    // var nome = "Não posso redeclarar uma variável"
    nome = "Samuel" // mas posso reatribuir um novo valor
    print("4. Olá, " + nome + "\n")

    var sobrenome = "Samuel"
    println("5. Como vai, $nome $sobrenome?")

    val variavelEstatica = "Bom dia"
    // variavelEstatica = "Não posso reatribuir um novo valor!"

    val nomeCompleto = "6. " + nome + " Xamu " + sobrenome
    println(nomeCompleto)
    println("7. $variavelEstatica, ${nomeCompleto}!")
}