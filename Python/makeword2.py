import itertools

# Daftar karakter favorit
karakter_favorit = [
    "Kaneki",
    "Naruto",
    "Haxor",
    "Guts",
    "Suneo",
    "Lawliet",
    "Nobita",
    "Sasuke",
]

# Daftar kata favorit
kata_favorit = ["anjay", "mabar", "hayuk"]

# Daftar angka favorit
angka_favorit = [str(i) for i in range(1, 10)]

# Bagian terakhir dari password
last_part_password = ["", "123", "321", "2022", "2023"]

# Membuat wordlist
wordlist = []

for nama in karakter_favorit:
    for angka in angka_favorit:
        for kata in kata_favorit:
            for karakter in karakter_favorit:
                for last_part in last_part_password:
                    password = f"{nama}{angka}{kata}{karakter}{last_part}"
                    wordlist.append(password)

# Menyimpan wordlist ke file
with open("wordlist.txt", "w") as file:
    for password in wordlist:
        file.write(password + "\n")

print("Wordlist telah berhasil dibuat.")
