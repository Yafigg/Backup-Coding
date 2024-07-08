import base64


def add_base64_padding(s):
    return s + "=" * ((4 - len(s) % 4) % 4)


# Base64 encoded strings
Dec1 = "RnpaVFkwWDBac1lXZGZNWDA"
Dec2 = "UTNsamIwWnNZV2Q3UW0"

# Add necessary padding
Dec1_padded = add_base64_padding(Dec1)
Dec2_padded = add_base64_padding(Dec2)

# Decode the base64 encoded strings
decoded_Dec1 = base64.b64decode(Dec1_padded).decode("utf-8")
decoded_Dec2 = base64.b64decode(Dec2_padded).decode("utf-8")

# Concatenate the decoded strings
result = decoded_Dec2 + decoded_Dec1

# Add necessary padding to the final result
result_padded = add_base64_padding(result)

# Decode the final result string with added padding
final_result = base64.b64decode(result_padded).decode("utf-8")

# Print the final decoded result
print(final_result)
