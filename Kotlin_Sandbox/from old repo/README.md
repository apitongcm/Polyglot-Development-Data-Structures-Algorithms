<h1>EXPLORING KOTLIN <h1>
# Kotlin-lab

<h2>a pet projects that I created while studying the basic syntax and functions of the KOTLIN language. <h2>


<ul>
    <li>birthdayStringCake is the first project in the Developer.Android.com
    ##printing out Strings to make a Birthday CAKE out of it.
    if you are interested in learning Kotlin developer.android.com is a good resources.
   https://developer.android.com  
    </li>
  
</ul>
<ul>
    <li>
     parkingLotFee is one of the task of solo learn in learning kotlin. https://www.sololearn.com 
    ##the program will ask for the number of hours the car stayed in the parking lot and will generate the exact amount of money they need to pay for the parking fee.
    The fee is calculated based on the following price structure:
   
            #1- the first 5 hours are billed at $1 per hour.
            #2- after that, each hour is billed at $0.5 per hour.
            #3- for each 24 hours, there is a flat fee of $15.
   
     <code>
         // the first 5 hours
         total += hours
         
         // exceeding 5 hours
          total += 5 + (hours -5) * 0.5
         
         //if the car stayed overnight
         while(hours >= 24)
        {
            hours -= 24
            total += 15
        }
        
        total += hours * 0.5
        </code>
        
</ul>
<ul>
    <li>
         waterConsumption will perform simple calculation on how much you need to pay by getting input from user(years) and multiply to the number of days and the rate.
         <code> 
             var con = noDays * watCom * years
        </code>
    </li>
</ul>
<ul>
    <li>
        MusicPlayer program that will able to let the user add track to playlist and as well as showing all the available track in your playlist. It can also perform playing the first song inside the array. 
    </li>    
</ul>
    
<ul>
    <li>
        shippingFee program will calculate the total amount you need to pay for the order.  It has an option if it is international or local. 
    </li>
</ul>
    
<ul>
    <li>
       	ohmsLaw program will help you calculate the voltage, current or resistance of the circuit.It is a console application running in loop.To exit just type -1 in the console. 
    </li>
</ul>
