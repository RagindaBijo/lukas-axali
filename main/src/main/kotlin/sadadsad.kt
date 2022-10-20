fun main(){
    println(operacia.gamokleba.binaluri_operacia())

}

interface Number{
    fun binaluri_operacia() : String

}

enum class operacia(var operatori:String) :Number {

    shekreba("+"){
        override fun binaluri_operacia(): String = "+"
    },

    gamokleba("-"){
        override fun binaluri_operacia(): String = "-"
    },

    gamravleba("*"){
        override fun binaluri_operacia(): String = "*"
    }

}












class generic<in T>(value: T){



}
