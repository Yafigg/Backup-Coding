<?php

$nama = $_GET['nama'];
$kelas = $_GET['kelas'];
$alamat = $_GET['alamat'];

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<?php

    echo "Nama Siswa: " . $nama . '<br>';
    echo "Kelas Siswa: " . $kelas . '<br>';
    echo "Alamat Siswa: " . $alamat . '<br>';

    ?>
</body>
</html>