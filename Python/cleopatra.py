from pydoc import plain
import random

FLAG = "REDACTED"
encrypted_text = ""
key = 20
plaintext = "ټـդԼڐդ٨ټজ࡜ߤࣨࡈАݬިޔࠌतࣼࣼݬࢄАࡈतݬࢄАࡈतৄ"

for ch in plaintext:
    e = chr(ord(ch) * key)
    encrypted_text += e

print("Key:", 20)
print("Encrypted Text:", encrypted_text)


with open('flag.enc', 'w', encoding='utf-8') as file:
    file.write(encrypted_text)
