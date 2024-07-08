# Python script to decipher the message
encoded_message = "qnirroiybrbs5edmothssavetc8hebhwuibihh72eyaoepmlvoet9lobulpkyenf4xpulsloinmelllisyassnousa31mebneedtctg_"


def columnar_transposition_decrypt(text, num_columns):
    num_rows = len(text) // num_columns
    matrix = [text[i : i + num_columns] for i in range(0, len(text), num_columns)]
    decrypted_text = "".join(
        ["".join(row[i] for row in matrix) for i in range(num_columns)]
    )
    return decrypted_text


# Try different number of columns
for columns in range(5, 10):
    print(
        f"Columns: {columns}\n{columnar_transposition_decrypt(encoded_message, columns)}\n"
    )

# Checking outputs
