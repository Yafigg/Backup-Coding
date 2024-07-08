# Daftar nilai yang diberikan
values = [230, 229, 243, 244, 233, 146, 144, 146, 148, 219, 248, 144, 242, 255, 226, 148, 211, 145, 195, 211, 221]

# Fungsi untuk mencoba mendekripsi menggunakan XOR dengan kunci tertentu
def xor_decrypt(values, key):
    return ''.join(chr(v ^ key) for v in values)

# Mencoba semua kemungkinan kunci (0-255)
for key in range(256):
    decrypted_message = xor_decrypt(values, key)
    # Mencetak pesan yang didekripsi jika cocok dengan pola "FESTI2024{...}"
    if decrypted_message.startswith("FESTI2024{"):
        print(f"Kunci: {key}, Pesan: {decrypted_message}")
