//#### TrustMe ###
//a simple console application that will determine if the person 
//can be trusted based on her/his response.




//Implementation and Usage of XOR logical operator
//XOR - means that if two values are different from each otherwise
// then true otherwise false. 

/*Sir Backsword met two men on the road. They asked to be his companions. They said that both of them had the same profession. He decided to find out what they were: knights, merchants, or robbers.

Write a program that will help him decide if he can trust the strangers. To answer this question, you need to read three booleans: firstAnswer, secondAnswer, and confession (each on a separate line):

firstAnswer and secondAnswer are what the two strangers themselves say about their profession. We assume that no one will ever say that robbery is their profession, so true here means knight and false means merchant.
confession will be true only if they confess in good faith that they are robbers.
The strangers can't be trusted if their answers don't match or if they confess that they are robbers. In this case, print false; otherwise, print true.

special thanks to https://hyperskill.org/tracks JETBRAINS ACADEMY
*/

// TRUTH TABLE 
/*
      |  firstQ |  secondQ | confession | result |
      |  false  |   false  |    false   |  true  | *
      |  false  |   false  |    true    |  false |
      |  false  |   true   |   false    |  false |
      |  false  |   true   |    true    |  false |
      |  true   |   false  |   false    |  false |
      |  true   |   false  |    true    |  false |
      |  true   |   true   |    false   |  true  | *
      |  true   |   true   |    true    |  false |
*/

fun main(args: Array<String>) {
	beTrusted()
}

fun beTrusted(){

    println("Question their profession: ")
    val firstQ = readLine().toBoolean()
    println("Repeat the Question: ")
    val secondQ = readLine().toBoolean()
    println("Did someone confess that they are robbers?")
    val confess = readLine().toBoolean()
    println()

    val result = (!(firstQ xor secondQ) and !confess)
    // (firstQ == secondQ) && !confession : Other formula

    if(result == true)
    {
        println("I can trust this guy!")
    }
    else
    {
        println("This guy cannot be trusted.")
    }
}