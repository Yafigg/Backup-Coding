import random

def decrypt(encrypted_text, key):
    decrypted_text = ""
    for ch in encrypted_text:
        d = chr((ord(ch) // key) % 0x110000)
        decrypted_text += d
    return decrypted_text

encrypted_text = "ae80d9e716afabf1c5298c8ff1c8238ead"

for key in range(1, 500):
    decrypted_text = decrypt(encrypted_text, key)
    try:
        print(f"Key: {key}, Decrypted Text: {decrypted_text}")
    except UnicodeEncodeError:
        print(f"Key: {key}, Decrypted Text (Hex): {decrypted_text.encode('utf-8').hex()}")
