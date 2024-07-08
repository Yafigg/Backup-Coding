from Crypto.Util.number import bytes_to_long
from Crypto.Cipher import AES
from Crypto.Util.Padding import pad
from Crypto.Util.number import long_to_bytes
from hashlib import sha256

p = 0x555150545457575752555655555D565D55555D57
g = 0x5D5C53515C5D5D525C5C535255575C5D53555C
A = 0x5D54535D51545D515756515651575052575751
B = 0x50545D5D525453545355555356545C52545C5C
ciphertext = b"M)\x03C\xbb\xaf\\\x9e\xb3l*\xdax\xa4`=\x92\x12i!\xdd`\xbd\xddOJ\x13\xdf\xe44\xac?#\x9a\x13m\x82\\D\xf24\xff?\x84\xe8\xc3\xb6\x1c&\xf0J\xd6\x16ai\xf3\xd4\x86qk\x9a\xe3\x8c2"

# Calculate the shared secret
s = pow(B, A, p)

# Use the shared secret as the key for AES
hash = sha256()
hash.update(long_to_bytes(s))
key = hash.digest()[:16]

# Decrypt the ciphertext
iv = b'\x96F\x84"\x89\xce\x11<v\x8c\xff\xf0%\xa6\xf2O'
cipher = AES.new(key, AES.MODE_CBC, iv)
plaintext = cipher.decrypt(ciphertext)

try:
    print("Key:", key)
    print("Decrypted Text:", plaintext.decode())
except UnicodeDecodeError:
    print("Decryption failed. Decrypted Text (Hex):", plaintext.hex())
