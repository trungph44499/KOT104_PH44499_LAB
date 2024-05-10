package trungmvph44499.fpoly.lab1_md18309.Lab1
fun main() {

    println("======================")
    val numbers = listOf(1, -2, 3, -4, 5, -6)     // 1

    val doubled = numbers.map { x -> x * 2 }      // 2

    val tripled = numbers.map { it * 3 }          // 3

    val first = numbers.first()                          // 4

    val last = numbers.last()                            // 5
    val positives = numbers.filter { x -> x > 0 }  // 6

    val negatives = numbers.filter { it < 0 }      // 7

    val anyNegative = numbers.any { it < 0 }             // 8

    val anyGT6 = numbers.any { it > 6 }                  // 9

    val totalCount = numbers.count()                     // 10
    val evenCount = numbers.count { it % 2 == 0 }        // 11
    println("1.Mảng số: $numbers")
    println("2.Mảng số nhân 2: $doubled")
    println("3.Mảng số nhân 3: $tripled")
    println("4.Số đầu: $first, Số cuối: $last")
    println("5.Số dương: $positives")
    println("6.Số âm: $negatives")
    println("7.Trong mảng có số lơn hơn 0: $anyNegative")
    println("8.Trong mảng có số lơn hơn 6: $anyGT6")
    println("9.Tổng số phần tử: $totalCount")
    println("10.Số phần tử chẵn: $evenCount")
    println("======================")
}
class bai4 {
}