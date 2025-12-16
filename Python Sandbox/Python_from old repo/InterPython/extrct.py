#RegEx - Regular Expression is sequence of characters that forms a search pattern
import re

s = 'A message from csev@umich.edu to cwen@iupui.edu about meeting @2PM'
lst = re.findall('\\S+@\\S+',s)
print(lst)

#re.search() = returns True/False depending on whether the string matches the regular expression
#re.findall() = returns matching strings to be extracted.