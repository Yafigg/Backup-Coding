import random

flag = "灩捯䍔䙻ㄶ形楴獟楮獴㌴摟潦弸強㕤㐸㤸扽"
for i in range(0, len(flag)):
    character1 = chr((ord(flag[i]) >> 8))
    character2 = chr(flag[i].encode("utf-16be")[-1])
    flag += character1
    flag += character2

print("Flag: " + flag)
