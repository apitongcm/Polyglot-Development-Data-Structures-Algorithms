class MusicPlayer {
    private var playlist: Array<String> = arrayOf()
    //your code goes here
    fun show()
    {
        var index:Int = 0
        for(track in playlist)
        {
            println(playlist[index])
            index++
        }
    }
    fun add(input:String)
    {
        playlist += input
    }    
    fun play()
    {
        println("Playing " + playlist[0])
    }
}
fun main(args: Array<String>) {
    val m = MusicPlayer()
    
    while(true) {
        var input = readLine()!!
        if(input == "stop") {
            break
        }
        m.add(input)
    }
    m.show()
    m.play()
}