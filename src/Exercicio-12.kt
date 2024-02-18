fun main(){
    val nota = 4
    when(nota){
        10,9 -> println("Fantastico")
        8,7 -> println("Parabens")
        6,5,4 -> println("Tem como recuperar")
        in 3 ..0 -> println("vejo pr´ximo semestre")
         else -> println("Nota Invalida")

    }

}