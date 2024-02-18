inline fun <T> executarComLog(nomeFuncao:String, funcao: () -> T): T {
    print("Entrando no Método $nomeFuncao...")
    try {
        return funcao()
    }finally {
        println("Metodo $nomeFuncao finalizado...")
    }
}

fun somar(a:Int, b:Int): Int{
    return a+b
}

fun main(){
    val resultado = executarComLog("somar"){
        somar(4,5)
    }
    println(resultado)
}