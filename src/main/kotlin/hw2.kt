fun main() {
val BodyHeight = 1.60
    val BodyMass = 55
    val index = MassIndex(BodyHeight,BodyMass)
    val verdict = when{
        (index<16) -> "Выраженный дефицит массы тела"
        (index<18.5) -> "Недостаточная (дефицит) масса тела"
        (index<25) -> "Норма"
        (index<30) -> "Избыточная масса тела (предожирение)"
        (index<35) -> "Ожирение"
        (index<40) -> "Ожирение резкое"
        else -> "Очень резкое ожирение"
    }
    println(verdict)

}
fun MassIndex(
    BodyHeight: Double,
    BodyMass: Int
): Double {
    return BodyMass/BodyHeight/BodyHeight
}