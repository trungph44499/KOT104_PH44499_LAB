package trungmvph44499.fpoly.lab1_md18309.Lab3

import java.util.Scanner
data class CBGV(val maSo: String, val hoTen: String, val tuoi: Int, val queQuan: String, val luongCung: Float, val luongThuong: Float, val tienPhat: Float)

class QuanLyCBGV {
    val danhSachCBGV: MutableList<CBGV> = mutableListOf()

    fun themCBGV() {
        val scanner = Scanner(System.`in`)

        print("Nhập mã số: ")
        val maSo = scanner.nextLine()

        print("Nhập họ tên: ")
        val hoTen = scanner.nextLine()

        print("Nhập tuổi: ")
        val tuoi = scanner.nextInt()
        scanner.nextLine()

        print("Nhập quê quán: ")
        val queQuan = scanner.nextLine()

        print("Nhập lương cứng: ")
        val luongCung = scanner.nextFloat()

        print("Nhập lương thưởng: ")
        val luongThuong = scanner.nextFloat()

        print("Nhập tiền phạt: ")
        val tienPhat = scanner.nextFloat()

        val cbgv = CBGV(maSo, hoTen, tuoi, queQuan, luongCung, luongThuong, tienPhat)
        danhSachCBGV.add(cbgv)
        println("Thêm cán bộ giáo viên thành công!")
    }

    fun xoaCBGV(maSo: String) {
        val cbgv = danhSachCBGV.find { it.maSo == maSo }
        if (cbgv != null) {
            danhSachCBGV.remove(cbgv)
            println("Xóa cán bộ giáo viên thành công!")
        } else {
            println("Không tìm thấy cán bộ giáo viên có mã số $maSo")
        }
    }
    fun tinhLuongThuc(maSo: String) {
        val cbgv = danhSachCBGV.find { it.maSo == maSo }
        if (cbgv != null) {
            val luongThuc = cbgv.luongCung + cbgv.luongThuong - cbgv.tienPhat
            println("Lương thực của cán bộ giáo viên ${cbgv.hoTen} (Mã số: ${cbgv.maSo}) là: $luongThuc")
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
                println("Mã số: ${cbgv.maSo}")
                println("Họ tên: ${cbgv.hoTen}")
                println("Tuổi: ${cbgv.tuoi}")
                println("Quê quán: ${cbgv.queQuan}")
                println("Lương cứng: ${cbgv.luongCung}")
                println("Lương thưởng: ${cbgv.luongThuong}")
                println("Tiền phạt: ${cbgv.tienPhat}")
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
        println("2. Xóa cán bộ giáo viên")
        println("3. Tính lương thực lĩnh cho giáo viên")
        println("4. Xuất danh sách cán bộ giáo viên")
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
                println("--- Xóa cán bộ giáo viên ---")
                print("Nhập mã số cán bộ giáo viên cần xóa: ")
                val maSo = scanner.next()
                quanLy.xoaCBGV(maSo)
                println()
            }
            3 -> {
                println("--- Tính lương thực lĩnh cho giáo viên ---")
                print("Nhập mã số giáo viên: ")
                val maSo = scanner.next()
                quanLy.tinhLuongThuc(maSo)
                println()
            }
            4 -> {
                println("--- XuấtDanh sách cán bộ giáo viên ---")
                quanLy.xuatDanhSachCBGV()
                println()
            }
            0 -> println("Kết thúc chương trình.")
            else -> println("Lựa chọn không hợp lệ.")
        }
    } while (luaChon != 0)
}