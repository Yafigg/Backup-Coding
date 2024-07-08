import math
from sympy import isprime
from Crypto.Util.number import long_to_bytes

# Given values
n = 1048576
e = 65537
ciphertext = 475005


# Function to factorize n
def factorize_n(n):
    for i in range(2, math.isqrt(n) + 1):
        if n % i == 0:
            return i, n // i
    return None, None


# Function to compute the modular inverse
def modular_inverse(e, phi):
    def egcd(a, b):
        if a == 0:
            return b, 0, 1
        g, x1, y1 = egcd(b % a, a)
        x = y1 - (b // a) * x1
        y = x1
        return g, x, y

    g, x, y = egcd(e, phi)
    if g != 1:
        raise Exception("Modular inverse does not exist")
    else:
        return x % phi


# Factorize n
p, q = factorize_n(n)
if p is None or q is None or not isprime(p) or not isprime(q):
    raise Exception("Failed to factorize n or p, q are not prime")

# Compute phi(n)
phi = (p - 1) * (q - 1)

# Compute the private key d
d = modular_inverse(e, phi)

# Decrypt the ciphertext
plaintext = pow(ciphertext, d, n)

# Convert the plaintext to bytes and decode it
plaintext_bytes = long_to_bytes(plaintext)
plaintext_message = plaintext_bytes.decode()

# Search for the keyword "MOKLET{"
if "MOKLET{" in plaintext_message:
    print("Found the keyword in the message!")
    print("Decrypted message:", plaintext_message)
else:
    print("Keyword not found in the message.")
