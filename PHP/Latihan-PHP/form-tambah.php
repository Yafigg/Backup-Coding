<?php
include 'connect-db.php';

$query = "SELECT * FROM kelas ORDER BY namakelas";

$result = pg_query($db, $query);
?>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ALOK JAMSUT FRISTAILE</title>
</head>
<body>
    <h1>Tambah Data Siswa</h1>
    <form action="proses-tambah.php" method="post">
        <div>
            <label>NIS</label> :
            <input type="text" name="nis">
        </div>
        <div>
            <label>Nama Lengkap</label> :
            <input type="text" name="namalengkap" id="">
        </div>
        <div>
            <label>Kelas</label> :
            <select name="id_kelas" id="">
                <?php
                while ($row = pg_fetch_assoc($result)) {
                ?>
                    <option value="<?= $row['id'] ?>">
                        <?= $row['namakelas']?>
                    </option>
                <?php
                }
                ?>
                ?>
            </select>
        </div>
        <div>
            <label>Tanggal Lahir</label> :
            <input type="date" name="tgllahir" id="">
        </div>
        <div>
            <label>Alamat</label> :
            <label>Nama Lengkap</label> :
            <input type="text" name="alamat" id="">
        </div>
        <div>
            <label>No Telp</label> :
            <input type="text" name="notelp" id="">
        </div>
        <input type="submit" value="Simpan">
    </form>
</body>
</html>