fun main(args: Array<String>) {
	var hours = readLine()!!.toInt()
    var total : Double = 0.0

    if(hours <= 5)
    {
        total += hours
    }
    else if (hours >= 24)
    {
        while(hours >= 24)
        {
            hours -= 24
            total += 15
        }
        
        total += hours * 0.5
    }
    else
    {
        total += 5 + (hours -5) * 0.5
    }

    println(total)
}