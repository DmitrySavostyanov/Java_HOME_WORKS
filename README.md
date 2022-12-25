# Java_HOME_WORKS
## Шаги: 
1)	 Создаем пустую папку – MyHomeWorks_Java.
2)	Открываем папку – MyHomeWorks_Java в терминале: вводим команду CD  MyHomeWorks.
3)	Инициализируем  в папке – MyHomeWorks_Java пустой локальный репозиторий : вводим  команду Git init.
4)	Делаем связку локального репо с удаленным: Вводим команду
   git remote add origin git@github.com:DmitrySavostyanov/Java_HOME_WORKS.git.
* адрес SSH копируем из удаленного репозитория.

5)	Параллельно решаем задачи в IDEA. Решили домашку №2 из двух задач. 
6)	Копируем пакеты (папки) с Java файлами  из папки проекта в IDEA в папку MyHomeWorks.
7)	В териминале по адресу папки MyHomeWorks:
Вводим команду  git add  .
Вводим команду git commit  -m “add new tasks”
Вводим команду git branch –M main
Вводим команду git push –u origin main
## Результат: 
### На удаленном репозитории в GitHub появляется новая папка с новыми задачами в Java файлах.
