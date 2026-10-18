import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WalletSystem {
    public static void main(String[] args) {
        System.out.println("--- GIAO DICH NAP TIEN ---");

        ViDienTu vi = new ViDienTu(2_147_000_000L);

        try {
            vi.napTien(1_000_000L);
            System.out.println("So du hien tai: "
                    + vi.getSoDu() + " VND");
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Loi: " + e.getMessage());
        }
    }

    static class ViDienTu {
        private long soDu;
        private final List<Long> lichSuChiTieu;

        public ViDienTu(long soDuBanDau) {
            if (soDuBanDau < 0) {
                throw new IllegalArgumentException(
                        "So du ban dau khong hop le!");
            }

            this.soDu = soDuBanDau;
            this.lichSuChiTieu = new ArrayList<>();
        }

        // Lay so du
        public long getSoDu() {
            return soDu;
        }

        // Nap tien an toan
        public void napTien(long soTien) {
            if (soTien <= 0) {
                throw new IllegalArgumentException(
                        "So tien nap phai lon hon 0!");
            }

            // Kiem tra tran so truoc khi cap nhat
            long soDuMoi = Math.addExact(soDu, soTien);

            // Chi cap nhat neu phep tinh thanh cong
            soDu = soDuMoi;

            System.out.println("Nap tien thanh cong!");
            System.out.println("So du hien tai: "
                    + soDu + " VND");
        }

        // Chi tieu
        public void chiTieu(long soTien) {
            if (soTien <= 0) {
                throw new IllegalArgumentException(
                        "So tien chi phai lon hon 0!");
            }

            if (soTien > soDu) {
                throw new IllegalArgumentException(
                        "So du khong du de thanh toan!");
            }

            soDu -= soTien;
            lichSuChiTieu.add(soTien);

            System.out.println("Thanh toan thanh cong!");
            System.out.println("So du hien tai: "
                    + soDu + " VND");
        }

        // Tinh chi tieu trung binh
        public double tinhChiTieuTrungBinh() {
            // Xu ly truong hop chua co giao dich
            if (lichSuChiTieu.isEmpty()) {
                return 0.0;
            }

            long tongChiTieu = 0;

            for (long soTien : lichSuChiTieu) {
                tongChiTieu = Math.addExact(
                        tongChiTieu, soTien);
            }

            return (double) tongChiTieu
                    / lichSuChiTieu.size();
        }

        // Hien thi thong ke
        public void thongKeChiTieu() {
            if (lichSuChiTieu.isEmpty()) {
                System.out.println(
                        "Ban chua co giao dich chi tieu.");
                System.out.println(
                        "Chi tieu trung binh: 0 VND");
                return;
            }

            double trungBinh = tinhChiTieuTrungBinh();

            System.out.println("So giao dich chi tieu: "
                    + lichSuChiTieu.size());
            System.out.printf(
                    "Chi tieu trung binh: %.2f VND%n",
                    trungBinh);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // So du ban dau cua khach hang VIP

            ViDienTu vi = new ViDienTu(2_147_000_000L);

            int luaChon = -1;

            do {
                System.out.println("\n===== PAYFAILS =====");
                System.out.println("1. Xem so du");
                System.out.println("2. Nap tien");
                System.out.println("3. Chi tieu");
                System.out.println("4. Thong ke chi tieu trung binh");
                System.out.println("0. Thoat");
                System.out.print("Nhap lua chon: ");

                try {
                    luaChon = Integer.parseInt(sc.nextLine());

                    switch (luaChon) {
                        case 1:
                            System.out.println(
                                    "So du hien tai: "
                                            + vi.getSoDu() + " VND");
                            break;

                        case 2:
                            System.out.print(
                                    "Nhap so tien can nap: ");
                            long tienNap = Long.parseLong(
                                    sc.nextLine());

                            vi.napTien(tienNap);
                            break;

                        case 3:
                            System.out.print(
                                    "Nhap so tien can chi: ");
                            long tienChi = Long.parseLong(
                                    sc.nextLine());

                            vi.chiTieu(tienChi);
                            break;

                        case 4:
                            vi.thongKeChiTieu();
                            break;

                        case 0:
                            System.out.println(
                                    "Cam on ban da su dung PayFails!");
                            break;

                        default:
                            System.out.println(
                                    "Lua chon khong hop le!");
                    }

                } catch (NumberFormatException e) {
                    System.out.println(
                            "Loi: Vui long nhap mot so nguyen hop le!");

                } catch (ArithmeticException e) {
                    System.out.println(
                            "Loi: Phep tinh bi tran so!");

                } catch (IllegalArgumentException e) {
                    System.out.println(
                            "Loi: " + e.getMessage());
                }

            } while (luaChon != 0);

            sc.close();
        }
    }
}
