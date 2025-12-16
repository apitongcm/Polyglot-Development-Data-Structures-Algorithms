import java.util.Scanner

fun easy() {
    var heart:Int = 8
    var enemylife = 3
    do {
        println()
        println("Number of hearts:$heart, Boss hearts:$enemylife")
        var listlvl1 = arrayOf(0,1,2)
        var index = (0..2).random()
        println("EASY:Guessing number from 0-2")
        val scanner = Scanner(System.`in`)
        var myguess = scanner.nextInt();
        if (myguess == listlvl1[index])
        {
            println("You guess it! +heart")
            enemylife --
            heart += 2
        }
        else
        {
            println("Wrong guess")
            heart--
        }
        if(heart <= 0 &&  enemylife > 0)
        {

            println("You are dead.")
            break

        }
        else if(enemylife == 0 && heart > 0)
        {
            println("Congratulations for conquering the stage")
            average()
            heart = 0

        }
    }
    while(heart > 0 || enemylife < 0)
}

fun average(){
    var heart = 0
    var myheart:Int = 8
    var enemyHeart:Int = 6
    do{
        println()
        println("remaining hearts: $myheart, enemy HP: $enemyHeart")
        println("AVERAGE: Guessing number from 0-3")
        //picking a random number
        val myArr = arrayOf(0,1,2,3)
        var index = (0..3).random()
        //user input
        val scanner = Scanner(System.`in`)
        var myChoice = scanner.nextInt()

        //condition to win the game
        if(myChoice == myArr[index])
        {
            println("You guess it right! +2 hearts")
            myheart += 2
            enemyHeart --
        }
        else
        {
            println("Wrong guess. -1 heart")
            myheart --
        }

        if(myheart == 0 && enemyHeart > 0)
        {
            println("Too bad, you died!!")
            break


        }
        else if(enemyHeart <= 0 && myheart > 0)
        {
            println("Congratulations! stage clear.")
            myheart = 0
        }

    }
    while (myheart > 0|| enemyHeart > 0)
}



fun main(args: Array<String>){
    easy()
}