package trungmvph44499.fpoly.lab1_md18309.Lab3
fun main(){
    // Khai baos và sử dụng lambda function
    val soA : Int? = 5
    val soB : Int? = 10
    val tong = tinhTong(soA!!, soB!!)

    println("tong 2 so $soA va $soB = $tong")
    println("tong 2 so $soA va $soB = ${tinhHieu(soA,soB)}")
    println("binh phuong cua $soA = ${binhPhuong(soA)}")
    println("thuong cua $soA va $soB = ${tinhThuong(soA.toFloat(), soB.toFloat()) ()}")

    val tenSV = "nguyen van long"
    println("In hoa $tenSV = ${inHoa(tenSV)}")

    val length = tenSV.let {
    val l = it.length
    l
    }
    val a2= soA.run{
        val kt= this * 2
        kt
    }
    println("Do dai chuoi $tenSV = $length")
    println("$a2")
}
val inHoa : (String) -> String = String::uppercase

val tinhTong: (Int, Int) -> Int
        = {soA: Int, soB: Int -> (soA + soB)}

val tinhHieu = {soA: Int, soB: Int -> (soA - soB)}

val binhPhuong : (Int) -> Int = {it * it}

val tinhThuong = {soA: Float, soB: Float -> {
    if (soB == 0f){
        "so bi chia phai khac 0"
    }else{
       val c = (soA / soB)
        c
    }

}
}
