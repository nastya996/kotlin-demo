fun main() {
    println(calcTimeAgo(60 * 60 * 24))
}

fun calcTimeAgo(seconds: Int): String {
    val minCount = seconds.toDouble() / 60.toDouble()

    return when {
        minCount < 1 -> "Меньше минуты назад"
        minCount in 1.0..(1.5) -> "Минуту назад"
        minCount in 1.5..5.0 -> "5 минут назад"
        minCount in 5.0..10.0 -> "10 минут назад"
        minCount in 10.0..15.0 -> "15 минут назад"
        minCount in 15.0..20.0 -> "20 минут назад"
        minCount in 20.0..30.0 -> "30 минут назад"
        minCount in 30.0..40.0 -> "40 минут назад"
        minCount in 40.0..50.0 -> "50 минут назад"
        minCount in 50.0..60.0 -> "час назад"
        minCount in 60.0..(24 * 60.0) -> "Несколько часов назад"
        minCount > (24 * 60.00) -> "Более суток"
        else -> "Неcколько лет назад"
    }
}