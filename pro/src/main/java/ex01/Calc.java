package ex01;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/** Включає реалізацію методів для обчислення і відображення результатів.
 */
public class Calc {

 /** Ім'я файлу, використане при серіалізації. */
 private static final String FNAME = "Item2d.bin";

 /** Зберігає результати обчислень. Об'єкт класу {@linkplain Item2d} */
 private Item2d result;
 /** Ініціалізує {@linkplain Calc#result} */
 public Calc() {
  result = new Item2d();
 }
 /** Встановити значення {@linkplain Calc#result}
  * @param result - нове значення посилання на об'єкт {@linkplain Item2d}
  */
 public void setResult(Item2d result) {

  this.result = result;
 }
 /** Отримати значення {@linkplain Calc#result}
  * @return дане значення посилання на об'єкт {@linkplain Item2d}
  */
 public Item2d getResult() {
  return result;
 }
 /** Обчислює значення функції.
  * @param x - аргумент обчислення функції.
  * @param y - аргумент обчислення функції.
  * @return результат обчислення функції.
  */
 public String calc(double x, double y) {

  double radius = Math. sqrt(Math.pow(x,2)+Math.pow(y,2))/2;

  return (String)Integer.toBinaryString((int)(Math.PI*Math.pow(radius,2)));

 }

 public String calcR(double x, double y) {
  return (String)Integer.toHexString((int)(Math. sqrt(Math.pow(x,2)+Math.pow(y,2))/2));
 }

 /** Обчислює значення функції та зберігає
  * результат у об'єкті {@linkplain Calc#result}
  * @param x - аргумент обчислення функції.
  * @param y - аргумент обчислення функції.
  * @return результат обчислення функції у вигляді рядка.
  */
 public String init(double x, double y) {
  result.setX(x);
  result.setY(y);
  result.setRadius(calcR(x,y));
  return  result.setSqr(calc(x,y));
 }

 /** Виводит результат обчислень. */
 public void show() {
  System.out.println(result);
 }

 /** Зберігає {@linkplain Calc#result} в файлі {@linkplain Calc#FNAME}
  * @throws IOException
  */
 public void save() throws IOException {
  ObjectOutputStream os = new ObjectOutputStream(new
          FileOutputStream(FNAME));
  os.writeObject(result);
  os.flush();
  os.close();
 }

 /** Відновлює {@linkplain Calc#result} з файла {@linkplain Calc#FNAME}
  * @throws Exception
  */
 public void restore() throws Exception {
  ObjectInputStream is = new ObjectInputStream(new FileInputStream(FNAME));
  result = (Item2d)is.readObject();
  is.close();
 }
}