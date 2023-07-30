def binary_search(list, x):
  low = 0
  high = len(list) - 1
  while low <= high:
    mid = (low + high) // 2
    guess = list[mid]
    if guess == x:
      return mid
    if guess > x:
      high = mid - 1
    else:
      low = mid + 1
  return None
my_list = [1, 3, 78, 90, 123, 145, 167]
txt = input("Введите искомое число:")
i=int(txt)
print (binary_search(my_list, i))
my_list1 = ["Аня", "Валя", "Марина", "Нина", "Яна"]
txt1 = input("Введите искомое имя:")
print (binary_search(my_list1, txt1))