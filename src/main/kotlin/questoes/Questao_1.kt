package questoes

import com.google.gson.GsonBuilder
import com.google.gson.annotations.SerializedName
import java.net.URL

class Questao_1 {
    //Função simples para ler URL, desserializar JSON e imprimir os itens requeridos, no caso, os objetos "Toppings".
    //GSON foi utilizado por simplicidade.
    fun lerToppings(url: String) {
        val resposta = URL(url).readText()

        val gson = GsonBuilder().create()
        val listaResponses = gson.fromJson(resposta, Array<Response>::class.java).toList()
        listarToppings(listaResponses)


    }

    fun listarToppings(listaResponses: List<Response>) {
        for (response in listaResponses) {
            println("Response de id ${response.id}")
            println("Toppings: ")
            val toppings = response.toppings!!
            for (topping in toppings) {
                println("${topping.id} : ${topping.type}")
            }
            println()
        }
    }
}

data class Response(
    @SerializedName("id")
    val id: String?,
    @SerializedName("type")
    val type: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("ppu")
    val ppu: Float?,
    @SerializedName("batters")
    val batters: Batters?,
    @SerializedName("topping")
    val toppings: List<Topping>?
)

data class Batter(
    @SerializedName("id")
    val id: String?,
    @SerializedName("type")
    val type: String?
)

data class Batters(
    @SerializedName("batter")
    val batter: List<Batter>?
)

data class Topping(
    @SerializedName("id")
    val id: String?,
    @SerializedName("type")
    val type: String?
)