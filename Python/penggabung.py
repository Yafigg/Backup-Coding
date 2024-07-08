import json

# Membaca data dari file JSON
file_path = r"C:\Users\Yafig\Documents\CodingProject\Python Project"
with open(file_path, "r") as f:
    data = json.load(f)
with open("flag.json", "r") as f:
    data = json.load(f)

# Menggabungkan potongan-potongan flag menjadi satu string
flag_combined = "".join(data["flag_parts"])

# Menyimpan flag yang telah digabungkan ke dalam file JSON baru
with open("flag_combined.json", "w") as f:
    json.dump({"flag_combined": flag_combined}, f, indent=4)
