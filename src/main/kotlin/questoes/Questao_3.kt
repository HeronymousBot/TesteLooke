package questoes

class Questao_3 {

    fun rotacaoEsquerda(numerosArray: IntArray, numeroRotacoes: Int, numeroItens: Int) {
        for (i in 0 until numeroRotacoes) rotacaoUnitaria(numerosArray, numeroItens)

        for(index in numerosArray.indices) print("${numerosArray[index]} ")

        println()
    }

    fun rotacaoUnitaria(numerosArray: IntArray, n: Int) {
        val temp: Int = numerosArray[0]
        var index: Int = 0
        while (index < n - 1) {
            numerosArray[index] = numerosArray[index + 1]
            index++
        }
        numerosArray[index] = temp
    }
}