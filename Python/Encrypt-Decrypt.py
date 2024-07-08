import random

def decrypt(encrypted_text, key):
    decrypted_text = ""
    for ch in encrypted_text:
        d = chr((ord(ch) // key) % 0x110000)
        decrypted_text += d
    return decrypted_text

encrypted_text = "19a128e7ed2007c57ec63b60717439e320d0a2956c1159766c3269b317b55633"

for key in range(1, 500):
    decrypted_text = decrypt(encrypted_text, key)
    try:
        print(f"Key: {key}, Decrypted Text: {decrypted_text}")  
    except UnicodeEncodeError:
        print(f"Key: {key}, Decrypted Text (Hex): {decrypted_text.encode('utf-8').hex()}")
