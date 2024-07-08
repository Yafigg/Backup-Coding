# Nilai p, g, A, dan B yang telah diberikan
p = 0xc1236c3346eba5ab
g = 0x2fb42659cddffd5b
A = 0b1011110110011101000101100011010010001000101000011011010110000001
B = 0o633107552131466416105

# Nilai a dan b (harus disesuaikan dengan nilai yang digunakan dalam perhitungan)
a = random.randint(1, p - 1)
b = random.randint(1, p - 1)

# Hitung nilai C dan periksa kesetaraannya dengan A^b mod p
C = pow(B, a, p)
assert C == pow(A, b, p)

print("Nilai C:", C)
