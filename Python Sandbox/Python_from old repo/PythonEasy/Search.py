text = input()
word = input()

def search(text,word):
    find = text.split(" ")

    for el in find:
        print(el)
        if el == word:
            return print("Word found")
        else:
            continue
    return print("Word not found")        

search(text, word)
