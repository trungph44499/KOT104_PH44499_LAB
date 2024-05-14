package trungmvph44499.fpoly.lab1_md18309.Lab3

import java.util.*

class SinhVien(val hoTen: String, val tuoi: Int, val lop: String)

data class TheMuon(val maPhieuMuon: String, val ngayMuon: Int, val hanTra: Int, val soHieuSach: String, val sinhVien: SinhVien)

class QuanLyTheMuon {
    val danhSachTheMuon: MutableList<TheMuon> = mutableListOf()

    fun themTheMuon(theMuon: TheMuon) {
        danhSachTheMuon.add(theMuon)
        println("Thêm thẻ mượn thành công!")
    }

    fun xoaTheMuon(maPhieuMuon: String) {
        val theMuon = danhSachTheMuon.find { it.maPhieuMuon == maPhieuMuon }
        if (theMuon != null) {
            danhSachTheMuon.remove(theMuon)
            println("Xóa thẻ mượn thành công!")
        } else {
            println("Không tìm thấy thẻ mượn có mã phiếu mượn $maPhieuMuon")
        }
    }

    fun hienThiThongTinTheMuon() {
        if (danhSachTheMuon.isEmpty()) {
            println("- Danh sách thẻ mượn rỗng.")
        } else {
            println("- 2Danh sách thẻ mượn:")
            for (theMuon in danhSachTheMuon) {
                println("Mã phiếu mượn: ${theMuon.maPhieuMuon}")
                println("Ngày mượn: ${theMuon.ngayMuon}")
                println("Hạn trả: ${theMuon.hanTra}")
                println("Số hiệu sách: ${theMuon.soHieuSach}")
                println("Thông tin sinh viên:")
                println("- Họ tên: ${theMuon.sinhVien.hoTen}")
                println("- Tuổi: ${theMuon.sinhVien.tuoi}")
                println("- Lớp: ${theMuon.sinhVien.lop}")
                println()
            }
        }
    }
}

fun main() {
    val quanLyTheMuon = QuanLyTheMuon()
    val scanner = Scanner(System.`in`)
    var luaChon: Int

    do {
        println("----- MENU -----")
        println("1. Thêm thẻ mượn")
        println("2. Xóa thẻ mượn")
        println("3. Hiển thị thông tin thẻ mượn")
        println("0. Thoát")
        print("Nhập lựa chọn của bạn: ")
        luaChon = scanner.nextInt()

        when (luaChon) {
            1 -> {
                println("--- Thêm thẻ mượn ---")
                print("Nhập mã phiếu mượn: ")
                val maPhieuMuon = scanner.next()
                print("Nhập ngày mượn: ")
                val ngayMuon = scanner.nextInt()
                print("Nhập hạn trả: ")
                val hanTra = scanner.nextInt()
                print("Nhập số hiệu sách: ")
                val soHieuSach = scanner.next()
                scanner.nextLine() // Xóa bộ đệm
                print("Nhập họ tên sinh viên: ")
                val hoTen = scanner.nextLine()
                print("Nhập tuổi sinh viên: ")
                val tuoi = scanner.nextInt()
                scanner.nextLine() // Xóa bộ đệm
                print("Nhập lớp sinh viên: ")
                val lop = scanner.nextLine()

                val sinhVien = SinhVien(hoTen, tuoi, lop)
                val theMuon = TheMuon(maPhieuMuon, ngayMuon, hanTra, soHieuSach, sinhVien)
                quanLyTheMuon.themTheMuon(theMuon)
            }
            2 -> {
                println("--- Xóa thẻ mượn ---")
                print("Nhập mã phiếu mượn cần xóa: ")
                val maPhieuMuon = scanner.next()
                quanLyTheMuon.xoaTheMuon(maPhieuMuon)
            }
            3 -> {
                println("--- Hiển thị thông tin thẻ mượn ---")
                quanLyTheMuon.hienThiThongTinTheMuon()
            }
            0 -> {
                println("Thoát chương trình.")
            }
            else -> {
                println("Lựa chọn không hợp lệ. Vui lòng chọn lại.")
            }
        }

        println()
    } while (luaChon != 0)
}