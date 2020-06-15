package questoes

class Questao_2 {
    //Algoritmo que encorpora o padrão funcional da recursividade, neste caso, usando fatoriais.
    fun algoritmoRecursivo(numero : Long): Long{
        if(numero <= 1) return numero
        return numero * algoritmoRecursivo(numero -1)
    }
}

