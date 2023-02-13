fun main() {
    val amound = 10_000
    val minComission = 35
    val maxComission = 0.0075
    var Commission = if (amound * maxComission < minComission ) minComission else amound * maxComission
    println("Сумма комиссии состаяляет $Commission рублей")
    println()

    val likes = 65
    val manText = "человеку"
    val peopleText = "людям"
    var solution = if (likes % 10 == 1 && likes % 100 != 11) manText else peopleText
    println("Понравилось $likes $solution")
    println()

    var sum = 10_001
    val minDiscount = 100
    val maxDiscount = 0.05
    val minSum = 1000
    val maxSum = 10_000
    if (sum > minSum && sum <= maxSum) {
        sum -= minDiscount
    } else if (sum > maxSum) {
        sum = (sum - (sum * maxDiscount)).toInt()
    }
    println("Сумма покупки составила $sum")

}