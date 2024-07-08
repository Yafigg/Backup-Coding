$siswa = [
    'name' => 'Yafigg',
    'kelas' => 'X RPL 2',
    'jurusan' => 'Rekayasa Perangkat Lunak',
    'alamat' => 'Malang',
    'umur' => 16,
    'nilai' => 90
];


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Data Siswa</title>
</head>
<body>
    <h1>Data Siswa SMK Telkom Malang</h1>
    <table>
        <tr>
            <th>Nama</th>
            <th>Kelas</th>
            <th>Alamat</th>
        </tr>
        <?php
        foreach ($siswa as $x) {
            ?>
        </tr>
            <td><?php echo $x['Nama '];?></td
            <td><?php echo $x['Kelas '];?></td
            <td><?php echo $x['Alamat '];?></td>

        <?php    
        }
        
        ?>

    </table>
</body>
</html>