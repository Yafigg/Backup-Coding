import itertools

ciphertext = "d24fe00395d364e12ea4ca4b9f2da4ca6f9a24b2ca729a399efb2cd873b3ca7d9d1fb3a66a9b73a5b43e8f3d"

# Generate semua kemungkinan kunci
keys = itertools.product(range(4), repeat=5)

# Loop melalui setiap kunci dan coba untuk mendekripsi
for key in keys:
    key_bytes = bytes(key)
    decrypted_message = "".join(
        [
            chr(c ^ key_bytes[idx % 5])
            for idx, c in enumerate(bytearray.fromhex(ciphertext))
        ]
    )
    if "GPNCTF" in decrypted_message:
        print("Possible flag:", decrypted_message)
        break
