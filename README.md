# Java_HOME_WORKS
## Шаги: 
1)	 Создаем на локальном ПК пустую папку с названием - MyHomeWorks_Java.
2)	Открываем папку – MyHomeWorks_Java в терминале: Введите команду -> CD MyHomeWorks/.
3)	Инициализируем  в папке – MyHomeWorks_Java пустой локальный репозиторий: Введите  команду -> Git init.
4)	Делаем связку локального репо с удаленным: Введите команду ->
   git remote add origin git@github.com:DmitrySavostyanov/Java_HOME_WORKS.git.
* где, адрес SSH: (git@github.com:DmitrySavostyanov/Java_HOME_WORKS.git) копируем из удаленного репозитория.
5)	Параллельно решаем задачи в IDEA. Например - решили домашку №2 из двух задач. 
	далее копируем пакеты (папки) с Java файлами из папки src проекта в IDEA в папку MyHomeWorks нашего локального репозитория.
7)	В териминале по адресу папки MyHomeWorks последовательно вводим ряд команд:
 - Вводим команду  git add  .
 - Вводим команду git commit  -m “add new tasks”
 - Вводим команду git branch –M main
 - Вводим команду git push –u origin main
## Результат: 
#### На удаленном репозитории в GitHub появляется новая папка с новыми задачами в Java файлах.
