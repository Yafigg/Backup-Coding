import argparse
from PIL import Image
import numpy as np
import scipy.io.wavfile as wavfile
import os


def video_decrypter(video_path, output_image_path):
    sample_rate, audio_signal = wavfile.read(video_path)
    audio_signal = audio_signal.astype(np.float32)

    audio_channels = audio_signal.reshape(-1, 3)
    red_channel = (audio_channels[:, 0] + 1) / 2 * 255
    green_channel = (audio_channels[:, 1] + 1) / 2 * 255
    blue_channel = (audio_channels[:, 2] + 1) / 2 * 255

    red_channel = red_channel.astype(np.uint8)
    green_channel = green_channel.astype(np.uint8)
    blue_channel = blue_channel.astype(np.uint8)

    # Menghitung sisi gambar dari total jumlah piksel
    image_size = int(
        np.sqrt(len(red_channel) // 3)
    )  # Menggunakan akar kuadrat untuk menghitung sisi gambar

    # Mengonversi sinyal audio ke dalam bentuk gambar
    decoded_pixels = []
    for i in range(image_size):
        for j in range(image_size):
            red = red_channel[i * image_size + j]
            green = green_channel[i * image_size + j]
            blue = blue_channel[i * image_size + j]
            decoded_pixels.append((red, green, blue))

    # Membuat gambar dari daftar piksel yang didekode
    decoded_image = Image.new("RGB", (image_size, image_size))
    decoded_image.putdata(decoded_pixels)

    # Menentukan jenis file berdasarkan ekstensi yang diminta
    output_image_ext = os.path.splitext(output_image_path)[1].lower()
    if output_image_ext == ".jpg" or output_image_ext == ".jpeg":
        decoded_image.save(output_image_path, "JPEG")
    elif output_image_ext == ".png":
        decoded_image.save(output_image_path, "PNG")
    else:
        print(
            "Format file output tidak didukung. Silakan gunakan ekstensi .jpg, .jpeg, atau .png."
        )

    print("Video Decrypted Successfully!")
    print("Thanks for using our script! :)")
