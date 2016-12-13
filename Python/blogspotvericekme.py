import requests
from bs4 import BeautifulSoup

url = "http://.blogspot.com.tr"
r = requests.get(url)
soup = BeautifulSoup(r.content ,"html.parser")
soup.prettify()
text_file = open("Output.txt" , "w")
for tags in soup.find_all('div' , {'class':'MsoNormal'}):
     if len(tags.text) > 1:
      print(tags.text)
      text_file.writelines(tags.text)
