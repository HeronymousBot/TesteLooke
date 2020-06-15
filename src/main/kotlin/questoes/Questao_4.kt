package questoes

class Questao_4 {
    /*
    O algoritmo a seguir é derivado do bubble sorting, ou ordenamento de flutuação.
    Sendo um algoritmo simples e de fácil entendimento, foi utilizado neste projeto devido a baixa complexidade
    do problema.

    Nele, percorre-se a lista o número de vezes necessária, sempre trocando o primeiro número(i) pelo seu conseguinte(i+1)
    caso seu valor seja superior ao outro; esta alternativa se segue até que todos os itens
    estejam ordenados de forma crescente ou decrescente.

    serão comentadas as partes relevantes para o entendimento do algoritmo.

     */

    //O Algoritmo de ordenamento, que receberá a lista de veículos proposta no teste.
    fun ordenarListaVeiculos(listaVeiculos: List<Veiculo>): List<Veiculo> {

        //Esta é a condicional que guiará o percorrimento da lista.
        var ordenado: Boolean = false
        var contador: Int = 0

        //Aqui é utilizada a ferramenta de controle while, visto que não se sabe o número de vezes que será necessário percorrer a lista enquanto a condição não for alcançada.
        while (!ordenado) {
            ordenado = true
            //Se a condição de ordenação não tiver sido alcançada, se rodará a lista até que todos os itens tenham sido devidamente organizados.
            for (i in 0 until listaVeiculos.size - contador - 1 step 1) {
                if (listaVeiculos[i].valor > listaVeiculos[i + 1].valor) {
                    troca(i, i + 1, listaVeiculos)
                    ordenado = false
                }
            }
            contador++
        }
        return listaVeiculos

    }
    //Algoritmo de troca; Simplesmente, caso os valores de i seja maior que de j(i + 1), haverá uma troca nos itens que ocupam a memória.
    private fun troca(i: Int, j: Int, veiculos: List<Veiculo>) {
        var temp: Veiculo = veiculos[j].copy()
        veiculos[j].apply {
            valor = veiculos[i].valor
            tipo = veiculos[i].tipo
        }


        veiculos[i].apply {
            valor = temp.valor
            tipo = temp.tipo
        }


    }

}

// Classe montada para satisfazer o requisito do teste, de ordenar veiculos por valor.
data class Veiculo(var tipo: String, var valor: Int)
