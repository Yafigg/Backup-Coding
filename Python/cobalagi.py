import requests

url = "https://wangy.cyberspecters.com/"
headers = {"Content-Type": "application/x-www-form-urlencoded"}

name = "flag_bendera"
payload = f"name={name}"

response = requests.get(url, params=payload, headers=headers)

# Periksa respons, misalnya dengan cara:
if response.status_code == 200:
    print("Berhasil mendapatkan flag bendera!")
    print(response.text)
else:
    print("Gagal, respons dengan kode: ", response.status_code)
