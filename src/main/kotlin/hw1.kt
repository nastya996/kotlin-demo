fun main() {
    println(calculateFee(200, 11_000));
    println(calculateFee(200, 111_000));
    println(calculateFee(200, 111_000, exclusive = true));
    println(calculateFee(200, 0, exclusive = true));
    println(calculateFee(amount = 200, exclusive = false, total = 1000000));
}

fun calculateFee(amount: Int, total: Int, exclusive: Boolean = false) =
    (amount * calculateTax(total, exclusive)).toInt()

fun calculateTax(total: Int, exclusive: Boolean = false): Double =
    (when (total) {
        in 0..1000 -> 0.3
        in 1001..10_000 -> 0.25
        in 10_001..50_000 -> 0.20
        else -> 0.15
    }) - if (exclusive) 0.05 else 0.0