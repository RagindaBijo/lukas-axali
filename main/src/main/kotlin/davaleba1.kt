fun main() {

    var parameters = My3DVector(1.0, 4.0, 2.2, 3.0 , 2.5,1.5)
    println("skalaruli namravli= ${parameters.skalaruliNamravli}")
    println("veqtoruli namravlit miigeba veqtori koordinatebit: (${parameters.x} ; ${parameters.y} ; ${parameters.z})")
}

class My3DVector(var a1: Double, var a2: Double, var a3: Double, var b1: Double, var b2: Double, var b3: Double) {

    var skalaruliNamravli = (a1 * b1 ) + (a2 * b2) + (a3 * b3)
    var x= a2*b3-a3*b2
    var y= a3*b1-a1*b3
    var z= a1*b2-a2*b1

}


