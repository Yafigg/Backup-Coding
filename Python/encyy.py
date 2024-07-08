import io


def decrypt_image(path, key):
    # Buka file gambar dalam mode baca biner ('rb')
    with open(path, "rb") as f:
        # Baca seluruh konten file gambar
        image = bytearray(f.read())

    # Lakukan operasi XOR pada setiap byte dalam gambar dengan kunci
    for index, value in enumerate(image):
        image[index] = value ^ key

    # Kembalikan hasil dekripsi dalam bentuk bytearray
    return image


def is_valid_image(image):
    # Anda dapat menggunakan modul PIL atau library lain untuk memeriksa apakah gambar valid
    # Misalnya, dengan mencoba membuka gambar menggunakan PIL
    try:
        from PIL import Image

        Image.open(io.BytesIO(image))
        return True
    except Exception as e:
        return False


def brute_force_decrypt(path):
    # Loop melalui semua kemungkinan kunci (nilai dari 0 hingga 255)
    for key in range(256):
        # Dekripsi gambar menggunakan kunci saat ini
        decrypted_image = decrypt_image(path, key)
        # Periksa apakah hasil dekripsi adalah gambar yang valid
        if is_valid_image(decrypted_image):
            # Jika valid, cetak kunci dan hasil dekripsi, lalu keluar dari loop
            print(f"Key found: {key}")
            with open("decrypted_image.jpg", "wb") as f:
                f.write(decrypted_image)
            print("Decrypted image saved as 'decrypted_image.jpg'")
            break


# Path dari gambar yang dienkripsi
path = "awv.jpg"

# Panggil fungsi untuk melakukan brute force dekripsi
brute_force_decrypt(path)
