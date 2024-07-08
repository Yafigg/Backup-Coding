<?php
$host = "localhost";
$dbname = "db_perpustakaan";
$user = "postgres";
$password = "Socrates36";

$dsn = "pgsql:host=$host;dbname=$dbname";
try {
    $pdo = new PDO($dsn, $user, $password);
} catch (PDOException $e) {
    die("Could not connect to the database $dbname :" . $e->getMessage());
}
?>