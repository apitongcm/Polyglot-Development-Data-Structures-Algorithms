fun main() {
    val border = "`-._,-'"
    val timesToRepeat = 4
    val top = "="
    val mynum = 23
    val fire = "'"
    val candle = "|"
    val body = "@"
    val layer= 5
    printBorder(border, timesToRepeat)
    println("  Happy Birthday, Quenchie")
    printBorder(border, timesToRepeat) 
    println()
    printFire(fire,mynum)
    printCandle(candle,mynum)
    printTop(top,mynum)
    printBody(body,mynum,layer)
}

fun printFire(fire:String, mynum: Int)
{
    repeat(mynum)
    {
     print(fire)   
    }
    println()
}

fun printCandle(candle:String, mynum: Int)
{
    repeat(mynum)
    {
     print(candle)   
    }
    println()
}

fun printBody(body:String, mynum: Int, layer: Int)
{
    repeat(layer)
    {
     repeat(mynum){
    	print(body)
	    }
    	println()
     
     }
    }

fun printBorder(border:String, timesToRepeat: Int){
    repeat(timesToRepeat){
        print(border)
    }
    println()
}

fun printTop(top:String, mynum:Int)
{
    repeat(mynum)
    {
        print(top)
    }
    println()
}


