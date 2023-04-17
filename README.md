# 34_Galanin_Rostislav


<h3 align="center">task01</h3>

**Завдання:** Виконати розробку найпростішої консольної програми на Java, наприклад,
що виводить на екран усі аргументи командного рядка, задані при запуску
та розмістити її у локальному сховищі.

# Результат запуску коду:

[1AF60CCC-0117-43E0-AD46-68D4A44E21CF.png](https://github.com/Rostislav22222/34_Galanin_Rostislav/blob/main/Task01/1AF60CCC-0117-43E0-AD46-68D4A44E21CF.png)

<h3 align="center">Завдання 1</h3>
Умова:
<ul>
  <li>Розробити клас, що серіалізується, для зберігання параметрів і результатів обчислень.</li>
  <li>Використовуючи агрегування, розробити клас для знаходження рішення задачі.</li>
  <li>Розробити клас для демонстрації в діалоговому режимі збереження та відновлення стану об'єкта, використовуючи серіалізацію. Показати особливості використання transient полів.</li>
  <li>Розробити клас для тестування коректності результатів обчислень та серіалізації/десеріалізації.</li>
  <li>Використовувати докладні коментарі для автоматичної генерації документації засобами javadoc.</li>
</ul>

# Результат запуску коду:

(https://github.com/Rostislav22222/34_Galanin_Rostislav/blob/main/pro/png/ex01/Task02.png)
(https://github.com/Rostislav22222/34_Galanin_Rostislav/blob/main/pro/png/ex01/Task02(2).png)

# Алгоритм роботи програми:
![image](https://user-images.githubusercontent.com/119488812/232429053-4eacb0f4-2b9c-49e1-ae16-013dde778b43.png)


<h3 align="center">Завдання 2</h3>
Умова:
 <ul>
		<li>Використати вихідний текст проекту попередньої лабораторної роботи як основу. Забезпечити розміщення результатів обчислень у колекції з можливістю збереження/відновлення.</li> 
    <li>Використовуючи шаблон проектування Factory Method (Virtual Constructor), розробити ієрархію, яка передбачає розширення за рахунок додавання нових класів, що відображаються.</li>
		<li>Розширити ієрархію інтерфейсом "фабрикованих" об'єктів, що представляє набір методів для відображення результатів обчислень. Реалізувати ці методи виведення результатів у текстовому вигляді. Розробити та реалізувати інтерфейс для "фабрикуючого" методу.</li>
		<li>Забезпечити діалоговий інтерфейс із користувачем.</li>
		<li>Розробити клас для тестування основної функціональності.</li>
		<li>Використати коментарі для автоматичної генерації документації засобами javadoc.</li>
	</ul>
  
  # Результат запуску коду:
  
  (https://github.com/Rostislav22222/34_Galanin_Rostislav/blob/main/pro/png/ex02/Task02(1).png)
  (https://github.com/Rostislav22222/34_Galanin_Rostislav/blob/main/pro/png/ex02/Task02(2).png)
  
  # Алгоритм роботи програми:
  
  ![image](https://user-images.githubusercontent.com/119488812/232429292-601ffa14-d442-41bf-a84c-6babb4abf375.png)

  <h3 align="center">Завдання 3</h3>
Умова:
<ul>
  <li>Як основа використовувати вихідний текст проекту попередньої лабораторної роботи Використовуючи шаблон проектування Factory Method (Virtual Constructor), розширити ієрархію похідними класами, реалізують методи для подання результатів у вигляді текстової таблиці. Параметри відображення таблиці мають визначатися користувачем.</li>
<li>Продемонструвати заміщення (перевизначення, overriding), поєднання (перевантаження, overloading), динамічне призначення методів (Пізніше зв'язування, поліморфізм, dynamic method dispatch).</li>
<li>Забезпечити діалоговий інтерфейс із користувачем.</li>
<li>Розробити клас для тестування основної функціональності.</li>
<li>Використати коментарі для автоматичної генерації документації засобами javadoc.</li>
    </ul>
    
   # Результат запуску коду:
   
   (https://github.com/Rostislav22222/34_Galanin_Rostislav/blob/main/pro/png/ex03/Task03(1).png)
   (https://github.com/Rostislav22222/34_Galanin_Rostislav/blob/main/pro/png/ex03/Task03(2).png)
   (https://github.com/Rostislav22222/34_Galanin_Rostislav/blob/main/pro/png/ex03/Task03(3).png)
   (https://github.com/Rostislav22222/34_Galanin_Rostislav/blob/main/pro/png/ex03/Task03(4).png)
   (https://github.com/Rostislav22222/34_Galanin_Rostislav/blob/main/pro/png/ex03/Task03(5).png)
   
   # Алгоритм роботи програми:
   
   ![image](https://user-images.githubusercontent.com/119488812/232429488-f12d74e8-2fac-45dc-9940-b3ba70b07d33.png)

   
   <h3 align="center">Завдання 4</h3>
Умова:
     <ul>
    <li>Використовуючи створені раніше класи та шаблон проектування Command, розробити клас Menu як контейнер команд, що розширюється, реалізувати обробку даних колекції та окремих елементів (масштабування, інтерполяція, нормалізація, сортування, пошук тощо).</li>
<li>Реалізувати можливість скасування (undo) операцій (команд).</li>
<li>Продемонструвати поняття "макрокоманда".</li>
<li>Під час розробки програми використовувати шаблон Singletone.</li>
<li>Забезпечити діалоговий інтерфейс із користувачем.</li>
<li>Розробити клас для тестування функціональності програми.</li>
<li>Використати коментарі для автоматичної генерації документації засобами javadoc.</li>
  </ul>
      
   # Результат запуску коду:
   
   (https://github.com/Rostislav22222/34_Galanin_Rostislav/blob/main/pro/png/ex04/Task04(1).png)
   (https://github.com/Rostislav22222/34_Galanin_Rostislav/blob/main/pro/png/ex04/Task04(2).png)
   (https://github.com/Rostislav22222/34_Galanin_Rostislav/blob/main/pro/png/ex04/Task04(3).png)
   (https://github.com/Rostislav22222/34_Galanin_Rostislav/blob/main/pro/png/ex04/Task04(4).png)
   (https://github.com/Rostislav22222/34_Galanin_Rostislav/blob/main/pro/png/ex04/Task04(5).png)
   (https://github.com/Rostislav22222/34_Galanin_Rostislav/blob/main/pro/png/ex04/Task04(6).png)
   (https://github.com/Rostislav22222/34_Galanin_Rostislav/blob/main/pro/png/ex04/Task04(7).png)
   
   # Алгоритм роботи програми:
   
   ![image](https://user-images.githubusercontent.com/119488812/232429699-875c5f85-05af-4b74-871e-b8b10360409b.png)
   
   <h3 align="center">Завдання 5</h3>
Умова:
<ul>
	<li>Продемонструвати можливість паралельної обробки елементів колекції (пошук мінімуму, максимуму, обчислення середнього значення, відбір за критерієм, статистична обробка тощо).</li>
<li>Управління чергою завдань (команд) реалізувати за допомогою шаблону Worker Thread.</li>
<li>Забезпечити діалоговий інтерфейс із користувачем.</li>
<li>Розробити клас для тестування функціональності програми.</li>
<li>Використати коментарі для автоматичної генерації документації засобами javadoc.</li>
	</ul>
	
# Результат запуску коду:

(https://github.com/Rostislav22222/34_Galanin_Rostislav/blob/main/pro/png/ex05/Task05(1).png)
(https://github.com/Rostislav22222/34_Galanin_Rostislav/blob/main/pro/png/ex05/Task05(2).png)
(https://github.com/Rostislav22222/34_Galanin_Rostislav/blob/main/pro/png/ex05/Task05(3).png)
(https://github.com/Rostislav22222/34_Galanin_Rostislav/blob/main/pro/png/ex05/Task05(4).png)

# Алгоритм роботи програми:

![image](https://user-images.githubusercontent.com/119488812/232429812-a49e43b9-06dc-4880-8b97-10d43e94c444.png)

