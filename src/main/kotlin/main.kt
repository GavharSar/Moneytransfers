fun main() {
    val amound = 10_000
    var Commission = if (amound / 100 * 0.75 < 35 ) 35 else amound / 100 * 0.75
    println("Сумма комиссии состаяляет $Commission рублей")
    println()

    val likes = 65
    var solution = if (likes % 10 == 1 && likes % 100 != 11) "человеку" else "людям"
    println("Понравилось $likes $solution")
    println()

    var sum = 1500
    val discount = 100
    if (sum > 1000 && sum < 10_000) {
        sum -= discount
    } else if (sum > 10_000) {
        sum = sum / 100 * 5
    }
    println("Сумма покупки составила $sum")

}