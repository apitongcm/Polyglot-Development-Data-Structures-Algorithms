import java.util.Scanner

fun main(args: Array<String>) {

            displayOption()



    // Try adding program arguments at Run/Debug configuration
   // println("Program arguments: ${args.joinToString()}")
}

fun calcVoltage()
{
    val scanner = Scanner(System.`in`)
    println("SOLVING VOLTAGE")
    println("Please enter the value of your Current in Amperes: ")
    val current = scanner.nextDouble()
    println("Thank you! Now please enter the value of your Resistance in ohms: ")
    val resistance = scanner.nextDouble()
    val voltage:Double = current * resistance
    println("The answer is: $voltage volts")
}

fun calcCurrent()
{
    val scanner = Scanner(System.`in`)
    println("SOLVING CURRENT")
    println("Please enter the value of your Voltage in Volts: ")
    val voltage = scanner.nextDouble()
    println("Thank you! Now please enter the value of your Resistance in ohms: ")
    val resistance = scanner.nextDouble()
    val current:Double = voltage / resistance
    println("The answer is: $current amperes")
}

fun calcResistance()
{
    val scanner = Scanner(System.`in`)
    println("SOLVING RESISTANCE")
    println("Please enter the value of your Voltage in Volts: ")
    val voltage = scanner.nextDouble()
    println("Thank you! Now please enter the value of your Current in Amperes: ")
    val current = scanner.nextDouble()
    val resistance:Double = voltage / current
    println("The answer is: $resistance ohms")
}

fun displayOption()
{
    println("Solving Ohm's Law")
    println("Please enter the number of your choice")
    println("[0]:Calculate Voltage \n[1]:Calculate Current \n[2]:Calculate Resistance \n[-1]:To Exit")

    val scanner = Scanner(System.`in`)
    val input1 = scanner.nextInt()

    while(input1 != -1)
    {
        if(input1 == 0)
        {
            calcVoltage()
            displayOption()
            break
        }
        else if(input1 == 1)
        {
            calcCurrent()
            displayOption()
            break
        }
        else if(input1 == 2)
        {
            calcResistance()
            displayOption()
            break
        }
        else
        {
            println("Invalid Command exit program:")
            break
        }
    }
}