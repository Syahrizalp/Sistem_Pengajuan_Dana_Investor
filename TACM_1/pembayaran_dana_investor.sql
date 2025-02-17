-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 04 Des 2024 pada 07.09
-- Versi server: 10.4.32-MariaDB
-- Versi PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pembayaran_dana_investor`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin_pelaksana`
--

CREATE TABLE `admin_pelaksana` (
  `id_admin` varchar(20) NOT NULL,
  `username` varchar(20) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Alamat` varchar(50) NOT NULL,
  `email` varchar(30) NOT NULL,
  `No_Telp` varchar(20) NOT NULL,
  `id_perusahaan` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `admin_pelaksana`
--

INSERT INTO `admin_pelaksana` (`id_admin`, `username`, `Nama`, `Alamat`, `email`, `No_Telp`, `id_perusahaan`) VALUES
('AD003', 'farhan', 'farhan', 'bandung', 'Farhan123@gmail.com', '0874673746', 'P001'),
('AD004', 'micel', 'Micel', 'Bandung', 'micel123@gmail.com', '0847578378', 'P001'),
('Am001', 'bagas', 'bagas', 'Sidoarjo', 'bagas123@gmail.com', '0879375927', '1');

-- --------------------------------------------------------

--
-- Struktur dari tabel `analis`
--

CREATE TABLE `analis` (
  `id_analis` varchar(20) NOT NULL,
  `username` varchar(20) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `email` varchar(30) NOT NULL,
  `no_telepon` varchar(15) NOT NULL,
  `id_investor` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `analis`
--

INSERT INTO `analis` (`id_analis`, `username`, `nama`, `alamat`, `email`, `no_telepon`, `id_investor`) VALUES
('AL001', 'fafa', 'fafa', 'bekasi', 'fafa@gmail.com', '0857876857', 'I002'),
('AN003', 'mawar', 'Mawar', 'bandung', 'mawar123@gmail.com', '08473748484', 'I003');

-- --------------------------------------------------------

--
-- Struktur dari tabel `danainvestor`
--

CREATE TABLE `danainvestor` (
  `dana` varchar(70) NOT NULL,
  `id_investor` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `danainvestor`
--

INSERT INTO `danainvestor` (`dana`, `id_investor`) VALUES
('5000000000', 'I002'),
('4000000', 'I002'),
('100', 'I002'),
('-4000000000', 'I003'),
('-4000000000', 'I003'),
('-4000000000', 'I003'),
('10000000000', 'I003'),
('1000000000', 'I003'),
('1000000000000', 'I003');

-- --------------------------------------------------------

--
-- Struktur dari tabel `danaproyek`
--

CREATE TABLE `danaproyek` (
  `id_dana` varchar(11) NOT NULL,
  `Dana` varchar(70) NOT NULL,
  `total` varchar(50) NOT NULL,
  `id_proyek` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `danaproyek`
--

INSERT INTO `danaproyek` (`id_dana`, `Dana`, `total`, `id_proyek`) VALUES
('1', 'Dana Sumber  Daya', '500000', 'Pr001'),
('101', 'DANA KEBANGKITAN', '5000000000', 'STORM'),
('102', 'RHINO', '1000000', 'STORM'),
('2', 'dana material', '100000', 'Pr001'),
('3', 'dana dana', '4000', 'Pr001'),
('DN001', 'Dana Material', '5000000000', 'PR003'),
('DN002', 'Dana Sumber Daya', '3000000000', 'PR003');

-- --------------------------------------------------------

--
-- Struktur dari tabel `finance`
--

CREATE TABLE `finance` (
  `id_finance` varchar(20) NOT NULL,
  `username` varchar(20) DEFAULT NULL,
  `nama` varchar(30) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `no_telepon` varchar(20) DEFAULT NULL,
  `id_perusahaan` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `finance`
--

INSERT INTO `finance` (`id_finance`, `username`, `nama`, `alamat`, `email`, `no_telepon`, `id_perusahaan`) VALUES
('F002', 'siti', 'Siti', 'Bandung', 'Siti@gmail.com', '08475839579', 'P001'),
('FN001', 'caca', 'Caca', 'Jawa', 'caca123@gmail.com', '0877383648368', '1');

-- --------------------------------------------------------

--
-- Struktur dari tabel `investor`
--

CREATE TABLE `investor` (
  `ID_investor` varchar(20) NOT NULL,
  `username` varchar(30) DEFAULT NULL,
  `nama` varchar(30) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `no_telp` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `investor`
--

INSERT INTO `investor` (`ID_investor`, `username`, `nama`, `alamat`, `email`, `no_telp`) VALUES
('I001', 'rizalmbah', 'rizal', 'buduran', 'rizalabubu@gmail.com', '089654784388'),
('I002', 'didi', 'Didi', 'jateng', 'Pdidi123@gmail.com', '08747354826'),
('I003', 'zaky', 'Zaky', 'Enter your address', 'Zaky13@gmail.com', '08674856867');

-- --------------------------------------------------------

--
-- Struktur dari tabel `login`
--

CREATE TABLE `login` (
  `username` varchar(50) NOT NULL,
  `user_password` varchar(255) NOT NULL,
  `status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `login`
--

INSERT INTO `login` (`username`, `user_password`, `status`) VALUES
('ali', 'ali', 'Manajer'),
('bagas', 'bagas', 'Admin pelaksana'),
('caca', 'caca', 'Finance'),
('didi', 'didi', 'Investor'),
('didit', 'didit', 'Pelaksana'),
('edi', '123', 'Supervisor'),
('fafa', 'fafa', 'Analis'),
('farhan', 'farhan', 'Admin Pelaksana'),
('handi', 'handi', 'Supervisor'),
('iqball', '123', 'Company'),
('majubahu123', 'majumaju', 'Company'),
('mawar', 'mawar', 'Analis'),
('micel', 'micel', 'Admin Pelaksana'),
('NusaIndah', 'nusaindah123', 'Company'),
('rafi', 'rafi', 'pelaksana'),
('reza', 'reza123', 'Manajer'),
('siti', 'siti123', 'Finance'),
('toni', 'toni', 'pelaksana'),
('zahra', 'zahra', 'Pelaksana'),
('zaky', 'zaky', 'Investor');

-- --------------------------------------------------------

--
-- Struktur dari tabel `manajer`
--

CREATE TABLE `manajer` (
  `id_manajer` varchar(11) NOT NULL,
  `username` varchar(20) NOT NULL,
  `Nama` varchar(30) NOT NULL,
  `Alamat` varchar(50) NOT NULL,
  `email` varchar(30) NOT NULL,
  `no_telepon` varchar(20) NOT NULL,
  `id_perusahaan` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `manajer`
--

INSERT INTO `manajer` (`id_manajer`, `username`, `Nama`, `Alamat`, `email`, `no_telepon`, `id_perusahaan`) VALUES
('MN002', 'reza', 'reza', 'Bandung', 'rezapratama@gmail.com', '085746578', 'P001'),
('NN001', 'ali', 'Ali', 'Nganjuk', 'Aliale@gmail.com', '08748264794', '1');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pelaksana`
--

CREATE TABLE `pelaksana` (
  `id_pelaksana` varchar(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `nama_pelaksana` varchar(100) DEFAULT NULL,
  `alamat` varchar(30) NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  `no_telepon` varchar(20) DEFAULT NULL,
  `id_perusahaan` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `pelaksana`
--

INSERT INTO `pelaksana` (`id_pelaksana`, `username`, `nama_pelaksana`, `alamat`, `email`, `no_telepon`, `id_perusahaan`) VALUES
('Pl001', 'rafi', '  rafi', '  Giriwoyo', '  Rafi123@gmail.com', '  0874783684', '1'),
('PL002', 'didit', 'Didit', 'bekasi', 'DiditKor@gmail.com', '0874747938', 'P001');

-- --------------------------------------------------------

--
-- Struktur dari tabel `perusahaan`
--

CREATE TABLE `perusahaan` (
  `id_perusahaan` varchar(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `alamat` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `no_telepon` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `perusahaan`
--

INSERT INTO `perusahaan` (`id_perusahaan`, `username`, `nama`, `alamat`, `email`, `no_telepon`) VALUES
('1', 'majubahu123', 'bajubahu123', 'Giriwoyo', 'majubahu123@gmail.com', '087257392132'),
('P001', 'NusaIndah', 'PT Nusa Indah', 'jakarta', 'NusaIndah@gmail.com', '08746483789');

-- --------------------------------------------------------

--
-- Struktur dari tabel `proyek`
--

CREATE TABLE `proyek` (
  `ID` varchar(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `nama_proyek` varchar(100) NOT NULL,
  `lokasi` varchar(100) NOT NULL,
  `estimasi` varchar(20) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `id_pelaksana` varchar(20) NOT NULL,
  `id_admin` varchar(20) NOT NULL,
  `id_manajer` varchar(20) DEFAULT NULL,
  `id_perusahaan` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `proyek`
--

INSERT INTO `proyek` (`ID`, `username`, `nama_proyek`, `lokasi`, `estimasi`, `status`, `id_pelaksana`, `id_admin`, `id_manajer`, `id_perusahaan`) VALUES
('Pr001', 'rafi', 'IKN', 'Kalimantan', '5 Tahun', 'Disetujui Manajer', 'Pl001', 'Am001', 'NN001', '1'),
('PR003', 'didit', 'VisionBuild', 'Bandung', '10 Tahun', 'Disetujui Manajer', 'PL002', 'AD003', 'MN002', 'P001'),
('PR004', 'didit', 'SmartTown', 'Tulungagung', '15 Tahun', '', 'PL002', 'AD004', NULL, 'P001'),
('STORM', 'rafi', 'PROJECT STORM', 'LOD', '5 TAHUN', 'Diajukan ke Manajer', 'Pl001', 'Am001', 'NN001', '1');

-- --------------------------------------------------------

--
-- Struktur dari tabel `status_investor`
--

CREATE TABLE `status_investor` (
  `id_status` int(11) NOT NULL,
  `status_supervisor` varchar(20) NOT NULL,
  `status_analis` varchar(20) NOT NULL,
  `id_proyek` varchar(20) NOT NULL,
  `id_investor` varchar(20) NOT NULL,
  `id_transaksi` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `status_investor`
--

INSERT INTO `status_investor` (`id_status`, `status_supervisor`, `status_analis`, `id_proyek`, `id_investor`, `id_transaksi`) VALUES
(1, 'Disetujui', '', 'Pr001', 'I002', 0),
(2, 'Disetujui', 'Disetujui', 'PR003', 'I003', 5),
(4, 'Disetujui', 'Disetujui', 'PR003', 'I003', 7);

-- --------------------------------------------------------

--
-- Struktur dari tabel `step_proyek`
--

CREATE TABLE `step_proyek` (
  `id_step` varchar(20) NOT NULL,
  `step` varchar(30) NOT NULL,
  `target` varchar(30) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `Dana_perstep` varchar(50) DEFAULT NULL,
  `id_proyek` varchar(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `step_proyek`
--

INSERT INTO `step_proyek` (`id_step`, `step`, `target`, `status`, `Dana_perstep`, `id_proyek`) VALUES
('SP001', 'Step 1', 'Pembangunan pondasi', 'Selesai', '3000000000', 'PR003'),
('SP002', 'step 2', 'Pembangunan dinding', '', '2500000000', 'PR003'),
('SP003', 'step 3', 'pembangunan atap', '', '2500000000', 'PR003'),
('St001', 'step 1', 'Pembangunan pondasi', 'Selesai', '300000', 'Pr001'),
('St002', 'step 2', 'pembangunan struktur dasar', 'Selesai', '200000', 'Pr001'),
('st003', 'step 3', 'pembanguan lantai', '', '100000', 'Pr001');

-- --------------------------------------------------------

--
-- Struktur dari tabel `supervisor`
--

CREATE TABLE `supervisor` (
  `id_supervisor` varchar(20) NOT NULL,
  `username` varchar(20) NOT NULL,
  `Nama` varchar(30) NOT NULL,
  `alamat` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `no_telepon` varchar(15) NOT NULL,
  `id_investor` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `supervisor`
--

INSERT INTO `supervisor` (`id_supervisor`, `username`, `Nama`, `alamat`, `email`, `no_telepon`, `id_investor`) VALUES
('Sp001', 'edi', 'edi', 'bandung', 'edi@gmail.com', '0876478368', 'I002'),
('SP002', 'handi', 'Handi', 'bandung', 'Handi1232gmail.com', '-9848575937', 'I003');

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `id_transaksi` int(20) NOT NULL,
  `nama_perusahaan` varchar(30) DEFAULT NULL,
  `nama_proyek` varchar(30) DEFAULT NULL,
  `nama_investor` varchar(20) DEFAULT NULL,
  `metode_transaksi` varchar(30) DEFAULT NULL,
  `lokasi_proyek` varchar(50) DEFAULT NULL,
  `estimasi_proyek` varchar(20) DEFAULT NULL,
  `total_dana` varchar(50) NOT NULL,
  `total_investasi` varchar(70) NOT NULL,
  `status_transaksi` varchar(20) DEFAULT NULL,
  `tanggal_pengajuan` date DEFAULT NULL,
  `tanggal_transaksi` date DEFAULT NULL,
  `Pencairan_tahap` varchar(50) DEFAULT NULL,
  `ID_investor` varchar(20) DEFAULT NULL,
  `ID_proyek` varchar(20) DEFAULT NULL,
  `ID_perusahaan` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`id_transaksi`, `nama_perusahaan`, `nama_proyek`, `nama_investor`, `metode_transaksi`, `lokasi_proyek`, `estimasi_proyek`, `total_dana`, `total_investasi`, `status_transaksi`, `tanggal_pengajuan`, `tanggal_transaksi`, `Pencairan_tahap`, `ID_investor`, `ID_proyek`, `ID_perusahaan`) VALUES
(2, 'bajubahu123', 'IKN', 'Didi', '', 'Kalimantan', '5 Tahun', '604000.0', '', 'Diajukan', '2024-12-01', NULL, '', 'I002', 'Pr001', '1'),
(5, 'PT Nusa Indah', 'VisionBuild', 'Zaky', 'Transfer Mandiri', 'Bandung', '10 Tahun', '8.000.000.000', '4000000000', 'Disetujui', '2024-12-04', '2024-12-04', 'Tahap 1', 'I003', 'PR003', 'P001'),
(7, 'PT Nusa Indah', 'VisionBuild', 'Zaky', 'Transfer Mandiri', 'Bandung', '10 Tahun', '8.000.000.000', '2000000000', 'Disetujui', '2024-12-04', '2024-12-04', 'Tahap 2', 'I003', 'PR003', 'P001');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `admin_pelaksana`
--
ALTER TABLE `admin_pelaksana`
  ADD PRIMARY KEY (`id_admin`),
  ADD KEY `username` (`username`),
  ADD KEY `id_perusahaan` (`id_perusahaan`);

--
-- Indeks untuk tabel `analis`
--
ALTER TABLE `analis`
  ADD PRIMARY KEY (`id_analis`),
  ADD KEY `username` (`username`);

--
-- Indeks untuk tabel `danainvestor`
--
ALTER TABLE `danainvestor`
  ADD KEY `id_investor` (`id_investor`);

--
-- Indeks untuk tabel `danaproyek`
--
ALTER TABLE `danaproyek`
  ADD PRIMARY KEY (`id_dana`),
  ADD KEY `id_proyek` (`id_proyek`);

--
-- Indeks untuk tabel `finance`
--
ALTER TABLE `finance`
  ADD PRIMARY KEY (`id_finance`),
  ADD KEY `username` (`username`),
  ADD KEY `id_perusahaan` (`id_perusahaan`);

--
-- Indeks untuk tabel `investor`
--
ALTER TABLE `investor`
  ADD PRIMARY KEY (`ID_investor`),
  ADD KEY `username` (`username`);

--
-- Indeks untuk tabel `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`username`);

--
-- Indeks untuk tabel `manajer`
--
ALTER TABLE `manajer`
  ADD PRIMARY KEY (`id_manajer`),
  ADD KEY `username` (`username`),
  ADD KEY `id_perusahaan` (`id_perusahaan`);

--
-- Indeks untuk tabel `pelaksana`
--
ALTER TABLE `pelaksana`
  ADD PRIMARY KEY (`id_pelaksana`),
  ADD UNIQUE KEY `username` (`username`),
  ADD KEY `id_perusahaan` (`id_perusahaan`);

--
-- Indeks untuk tabel `perusahaan`
--
ALTER TABLE `perusahaan`
  ADD PRIMARY KEY (`id_perusahaan`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indeks untuk tabel `proyek`
--
ALTER TABLE `proyek`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `username` (`username`),
  ADD KEY `id_pelaksana` (`id_pelaksana`),
  ADD KEY `id_admin` (`id_admin`) USING BTREE,
  ADD KEY `id_manajer` (`id_manajer`),
  ADD KEY `id_perusahaan` (`id_perusahaan`);

--
-- Indeks untuk tabel `status_investor`
--
ALTER TABLE `status_investor`
  ADD PRIMARY KEY (`id_status`),
  ADD KEY `id_investor` (`id_investor`),
  ADD KEY `id_transaksi` (`id_transaksi`);

--
-- Indeks untuk tabel `step_proyek`
--
ALTER TABLE `step_proyek`
  ADD PRIMARY KEY (`id_step`),
  ADD KEY `id_proyek` (`id_proyek`);

--
-- Indeks untuk tabel `supervisor`
--
ALTER TABLE `supervisor`
  ADD PRIMARY KEY (`id_supervisor`),
  ADD KEY `username` (`username`);

--
-- Indeks untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id_transaksi`),
  ADD KEY `ID_investor` (`ID_investor`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `status_investor`
--
ALTER TABLE `status_investor`
  MODIFY `id_status` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id_transaksi` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `admin_pelaksana`
--
ALTER TABLE `admin_pelaksana`
  ADD CONSTRAINT `admin_pelaksana_ibfk_1` FOREIGN KEY (`username`) REFERENCES `login` (`username`),
  ADD CONSTRAINT `admin_pelaksana_ibfk_2` FOREIGN KEY (`id_perusahaan`) REFERENCES `perusahaan` (`id_perusahaan`);

--
-- Ketidakleluasaan untuk tabel `analis`
--
ALTER TABLE `analis`
  ADD CONSTRAINT `analis_ibfk_1` FOREIGN KEY (`username`) REFERENCES `login` (`username`);

--
-- Ketidakleluasaan untuk tabel `danainvestor`
--
ALTER TABLE `danainvestor`
  ADD CONSTRAINT `danainvestor_ibfk_1` FOREIGN KEY (`id_investor`) REFERENCES `investor` (`ID_investor`);

--
-- Ketidakleluasaan untuk tabel `danaproyek`
--
ALTER TABLE `danaproyek`
  ADD CONSTRAINT `danaproyek_ibfk_1` FOREIGN KEY (`id_proyek`) REFERENCES `proyek` (`ID`);

--
-- Ketidakleluasaan untuk tabel `finance`
--
ALTER TABLE `finance`
  ADD CONSTRAINT `finance_ibfk_1` FOREIGN KEY (`username`) REFERENCES `login` (`username`),
  ADD CONSTRAINT `finance_ibfk_2` FOREIGN KEY (`id_perusahaan`) REFERENCES `perusahaan` (`id_perusahaan`);

--
-- Ketidakleluasaan untuk tabel `investor`
--
ALTER TABLE `investor`
  ADD CONSTRAINT `investor_ibfk_1` FOREIGN KEY (`username`) REFERENCES `login` (`username`);

--
-- Ketidakleluasaan untuk tabel `manajer`
--
ALTER TABLE `manajer`
  ADD CONSTRAINT `manajer_ibfk_1` FOREIGN KEY (`username`) REFERENCES `login` (`username`),
  ADD CONSTRAINT `manajer_ibfk_2` FOREIGN KEY (`id_perusahaan`) REFERENCES `perusahaan` (`id_perusahaan`);

--
-- Ketidakleluasaan untuk tabel `pelaksana`
--
ALTER TABLE `pelaksana`
  ADD CONSTRAINT `pelaksana_ibfk_1` FOREIGN KEY (`username`) REFERENCES `login` (`username`),
  ADD CONSTRAINT `pelaksana_ibfk_2` FOREIGN KEY (`username`) REFERENCES `login` (`username`),
  ADD CONSTRAINT `pelaksana_ibfk_5` FOREIGN KEY (`id_perusahaan`) REFERENCES `perusahaan` (`id_perusahaan`);

--
-- Ketidakleluasaan untuk tabel `perusahaan`
--
ALTER TABLE `perusahaan`
  ADD CONSTRAINT `perusahaan_ibfk_1` FOREIGN KEY (`username`) REFERENCES `login` (`username`);

--
-- Ketidakleluasaan untuk tabel `proyek`
--
ALTER TABLE `proyek`
  ADD CONSTRAINT `proyek_ibfk_1` FOREIGN KEY (`username`) REFERENCES `login` (`username`),
  ADD CONSTRAINT `proyek_ibfk_2` FOREIGN KEY (`username`) REFERENCES `login` (`username`),
  ADD CONSTRAINT `proyek_ibfk_5` FOREIGN KEY (`id_pelaksana`) REFERENCES `pelaksana` (`id_pelaksana`),
  ADD CONSTRAINT `proyek_ibfk_6` FOREIGN KEY (`id_admin`) REFERENCES `admin_pelaksana` (`ID_admin`),
  ADD CONSTRAINT `proyek_ibfk_7` FOREIGN KEY (`id_manajer`) REFERENCES `manajer` (`id_manajer`),
  ADD CONSTRAINT `proyek_ibfk_8` FOREIGN KEY (`id_perusahaan`) REFERENCES `perusahaan` (`id_perusahaan`);

--
-- Ketidakleluasaan untuk tabel `status_investor`
--
ALTER TABLE `status_investor`
  ADD CONSTRAINT `status_investor_ibfk_1` FOREIGN KEY (`id_investor`) REFERENCES `investor` (`ID_investor`),
  ADD CONSTRAINT `status_investor_ibfk_2` FOREIGN KEY (`id_transaksi`) REFERENCES `transaksi` (`id_transaksi`);

--
-- Ketidakleluasaan untuk tabel `step_proyek`
--
ALTER TABLE `step_proyek`
  ADD CONSTRAINT `step_proyek_ibfk_1` FOREIGN KEY (`id_proyek`) REFERENCES `proyek` (`ID`);

--
-- Ketidakleluasaan untuk tabel `supervisor`
--
ALTER TABLE `supervisor`
  ADD CONSTRAINT `supervisor_ibfk_1` FOREIGN KEY (`username`) REFERENCES `login` (`username`);

--
-- Ketidakleluasaan untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`ID_investor`) REFERENCES `investor` (`ID_investor`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
