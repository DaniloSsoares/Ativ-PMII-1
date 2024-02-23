fun main(){
var fatorial: Int = 0
println("Digite um valor para fazer o fatorial dela!")
val valor = readLine()
val n = valor?.toIntOrNull()

if (n != null) {
    var fatorial: Int = 1
    for (i in 1..n){
        fatorial *= i
    }
    println(fatorial)

}else{
    println("Digite um valor valido!")
}

}