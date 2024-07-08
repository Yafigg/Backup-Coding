import binascii

m = 2317

flag = "{:x}".format(m)
print(binascii.unhexlify(flag))