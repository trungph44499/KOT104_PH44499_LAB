package trungmvph44499.fpoly.lab1_md18309.Lab3.BaiTapOOP

import java.util.Scanner
class QuanLyCBGV {
    val danhSachCBGV: MutableList<CBGV> = mutableListOf()
    fun themCBGV() {
        val scanner = Scanner(System.`in`)

        print("Nhập họ tên: ")
        val hoTen = scanner.nextLine()

        print("Nhập tuổi: ")
        val tuoi = scanner.nextInt()
        scanner.nextLine()

        print("Nhập quê quán: ")
        val queQuan = scanner.nextLine()

        print("Nhập mã số: ")
        val maSo = scanner.nextLine()

        print("Nhập lương cứng: ")
        val luongCung = scanner.nextFloat()

        print("Nhập lương thưởng: ")
        val luongThuong = scanner.nextFloat()

        print("Nhập tiền phạt: ")
        val tienPhat = scanner.nextFloat()

        val cbgv = CBGV(
            hoTen,
            tuoi,
            queQuan,
            maSo,
            luongCung,
            luongThuong,
            tienPhat
        )
        danhSachCBGV.add(cbgv)
        println("Thêm cán bộ giáo viên thành công!")
    }

    fun xoaCBGV(maSo: String) {
        val cbgv = danhSachCBGV.find { it.msgv == maSo }
        if (cbgv != null) {
            danhSachCBGV.remove(cbgv)
            println("Xóa cán bộ giáo viên thành công!")
        } else {
            println("Không tìm thấy cán bộ giáo viên có mã số $maSo")
        }
    }
    fun xuatDanhSachCBGV() {
        if (danhSachCBGV.isEmpty()) {
            println("Danh sách cán bộ giáo viên rỗng.")
        } else {
            println("Danh sách cán bộ giáo viên:")
            for (cbgv in danhSachCBGV) {
                println("Họ tên: ${cbgv.hoten}")
                println("Tuổi: ${cbgv.tuoi}")
                println("Quê quán: ${cbgv.quequan}")
                println("Mã số: ${cbgv.msgv}")
                println("Lương lĩnh: ${cbgv.lThuclinh}")
                println()
            }
        }
    }
}
fun main() {
    val quanLy = QuanLyCBGV()
    val scanner = Scanner(System.`in`)
    var luaChon: Int

    do {
        println("----- MENU -----")
        println("1. Thêm cán bộ giáo viên")
        println("2. Xuất danh sách cán bộ giáo viên")
        println("3. Xóa cán bộ giáo viên")
        println("0. Thoát")
        print("Nhập lựa chọn của bạn: ")
        luaChon = scanner.nextInt()

        when (luaChon) {
            1 -> {
                println("--- Thêm cán bộ giáo viên ---")
                quanLy.themCBGV()
                println()
            }
            2 -> {
                println("--- Xuất danh sách cán bộ giáo viên ---")
                quanLy.xuatDanhSachCBGV()
                println()
            }
            3 -> {
                println("--- Xóa cán bộ giáo viên ---")
                print("Nhập mã số cán bộ giáo viên cần xóa: ")
                val maSo = scanner.next()
                quanLy.xoaCBGV(maSo)
                println()
            }
            0 -> println("Kết thúc chương trình.")
            else -> println("Lựa chọn không hợp lệ.")
        }
    } while (luaChon != 0)
}