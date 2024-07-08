<?php
include 'connect-db.php';

$query = "SELECT * FROM siswa inner join kelas on siswa.id_kelas =  kelas.id";

$result = pg_query($db, $query);

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP</title>
</head>
<body>
    <h1>Data Siswa</h1>
    <p>
        <a href="form-tambah.php">Tambah Data</a>
    </p>
    <table border="1">
        <tr>
            <th>NIS</th>
            <th>Nama Lengkap</th>
            <th>Kelas</th>
            <th>Tanggal Lahir</th>
            <th>No. Telp</th>
            <th>Aksi</th>
        </tr>
        <?php
        while ($row = pg_fetch_assoc($result)) {
            ?>

             <tr>
                 <td><?php echo $row['nis'];?></td>
                 <td><?php echo $row['namalengkap'];?></td>
                 <td><?php echo $row['id_kelas'];?></td>
                 <td><?php echo $row['tgllahir'];?></td>
                 <td><?php echo $row['NoTelp'];?></td>
                 <td>
                     <a href="form-ubah.php?id=<?php echo $row['id'];?>">Ubah</a>
                     <a href="hapus.php?id=<?php echo $row['id'];?>">Hapus</a>
                 </td>
             </tr>
             <?php
        }
        ?>
    </table>
</body>
</html>