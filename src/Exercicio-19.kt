fun main(){
    loop@for (i in 1 .. 15){
        for (j in 1 .. 15){
            if(1 == 2 && j == 9)break@loop
            println("$i $j")
        }
        println("FIM")
    }
}