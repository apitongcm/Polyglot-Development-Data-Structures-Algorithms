import java.util.Scanner


fun main(args: Array<String>) {


    var myTry = 10;
    var score = 0;

    do{
        println()
        println("ROCK, PAPER,and SCISSOR Game: ")
        println("which do you want to choice?")
        println("[0]:ROCK \n[1]:PAPER \n[2]: SCISSORS")
        println()


    val scanner = Scanner(System.`in`)
    var myChoice = scanner.nextInt()
    val enemyArr = arrayOf(0, 1, 2)
    val myIndex = (1..2)
    var myRan = myIndex.random()
    val strArr = arrayOf("Rock", "Paper", "Scissor")


    if (enemyArr[myRan] == 0 && myChoice == 1 ||
        enemyArr[myRan] == 1 && myChoice == 2 ||
        enemyArr[myRan] == 2 && myChoice == 0
    ) {
        println("You win!")
        score++



    } else {
        println("You Lose")
    }
        myTry--
        println("Current score: $score")
        println("You still have $myTry tries")
        println()
    }
        while(myTry > 0)

}