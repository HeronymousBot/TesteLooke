import questoes.*

fun main() {
    Questao_1().lerToppings("https://sampletestingproject-4a8fc.web.app/teste.json")
    println(Questao_2().algoritmoRecursivo(12))

    println(Questao_3().rotacaoEsquerda(intArrayOf(1, 2, 3, 4, 5, 6, 7), 3, 7))

    println(
        Questao_4().ordenarListaVeiculos(
            listOf(
                Veiculo("Brasília", 8000),
                Veiculo("Fusca", 5000),
                Veiculo("Gol", 23000),
                Veiculo("Kombi", 39000)
            )
        )
    )

}