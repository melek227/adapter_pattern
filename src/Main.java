/* SENARYO
Geliştirdiğimiz uygulamada JSON işlemleri için sistemimizin IJsonSerializer arayüzünü kullandığını düşünelim.
 İlerleyen süreçte bu işlemleri gerçekleştirmek için 3. parti bir yazılım kullanmak istediniz fakat daha sonradan
  eklediğiniz yapı sisteminiz ile uyumsuz çünkü sistem IJsonSerializer arayüzünü uyguluyor fakat yeni gelen yapı bunu
  uygulamamaktadır ve yeni gelen yapıya da müdahalede bulunamıyorsunuz. Bu sorunu adapter ile aşağıdaki gibi çözüme
  götürebiliriz.

 */
public class Main {
    public static void main(String[] args) {

        CustomOperation customOperation = new CustomOperation(new CustomSerializerAdapter());
        String serializedObject = customOperation.SerializeObject(new Object());

        System.out.println(serializedObject);

        }
    }
