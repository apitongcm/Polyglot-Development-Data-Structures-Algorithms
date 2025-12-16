fun shippingCost(amount: Double, international: Boolean): Double
{ 
    var shippingFee: Double = 0.0;
    if(international != true)
    {
        if(amount >= 75)
        {
            
            shippingFee += 0.0
            return shippingFee
        }
        else
        {
            shippingFee += amount * 0.1
             return shippingFee
        }
      
    }
    else 
    {
        
       
        if (amount >= 333.3333)
        {
            shippingFee += 50
            return shippingFee
        }
        else
        {
            shippingFee += amount * 0.15
             return shippingFee
        }
        
    }

    
}


fun main(args: Array<String>) {
    val amount = readLine()!!.toDouble()
    val international = readLine()!!.toBoolean()    
    println(shippingCost(amount, international))
}