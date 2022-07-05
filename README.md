<<<<<<< HEAD
=======

week1-homework-dogukan1047 created by GitHub Classroom
# homeworks-dogukan1047
 -----------------------------------------------------------------------------------------------------------------------------------------
![Ekran görüntüsü 2022-06-24 135605](https://user-images.githubusercontent.com/70372233/175521142-4a2d49c3-e586-4dab-8c0e-91f6b79fd369.png)
-------------------------------------------------------------------------------------------------------------------------------------------
´JAVA CLASS DİAGRAM AND DEPENDENCY{}´
![Ekran görüntüsü 2022-06-24 132115](https://user-images.githubusercontent.com/70372233/175522530-2b61e327-4161-4f10-8f4a-c4b7d7e90abb.png)

**Araştırma Konusu**
# JVM nedir ve nasıl çalışır? Mimarisi nasıldır? Java 8 ile birlikte JVM mimarisinde ne gibi değişiklikler olmuştur??

**What is JVM and how is it made?**
JVM nedir?
Bu:
<p> JVM (Java Sanal Makinesi) bir soyut makinedir. Java Sanal Makinesi (JVM), Java bytecode’nu makine diline çevirir. JVM, Java Çalışma Ortamının (JRE) bir parçasıdır. Başka programlama dillerinde, derleyici, belirli bir sistem için makine kodu üretir. Ancak, Java derleyicisi, Java Sanal Makinesi olarak bilinen bir Sanal Makine için kod üretir.Java platformdan bağımsızdır. Java’ nın “bir kez yaz, her yerde çalıştır” felsefesi de platform bağımsızlığını ifade eder. Platform bağımsızlığını sağlayan bileşen (Java Virtual Machine) Java Sanal Makinasıdır. JVM, tüm platformlarda Java kodlarını çalıştırmak üzere geliştirilmiş ve hemen her platforma uygun sürümü olan bir bileşendir. Linux ve Windows birbirinden çok farklı platformlar olmasına rağmen Java ile geliştirilmiş bir yazılım bu iki platformda da bulunan Java Sanal Makinası sayesinde kullanılabiliyor.

 <p> Java Sanal Makineleri pek çok donanım ve yazılım platformu için uygundur.

## Java Sanal Makinesi Nasıl Çalışır?
İlk olarak Java kodunu bytecode’a derler. Bu bayt kodu `(bytecode)`farklı makineler üzerinde yorumlanır. Ana makine ve Java kaynağı arasında, Bytecode aracı bir dildir.

Java Sanal Makinesi (JVM), hafıza alanı (memory space) bölüştürmek için sorumludur.

Herhangi bir java sınıfını maksibet çalıştırdığınızda, bir JVM nesnesi oluşturulur.
  
![1_uSSNB1lvZbCSOzxPOLG-Pw](https://user-images.githubusercontent.com/70372233/175828446-4557cf77-0004-456f-8f74-27e796964f68.png)


## JDK Nedir?
-JDK, Java Development Kit‘ in ilk harflerinden oluşan kısaltmadır ve JDK programcıya yazılım geliştirme sürecinde gerekli olacak bileşenleri içeren bir pakettir.
## JRE Nedir, Ne İşe Yarar?
-Java Runtime Environment kullanıcıların Java programlarını çalıştırabilmeleri için gerekli yazılımdır. İçerisinde Java Sanal Makinasını ve Java kütüphanelerini barındırır. 
  
![1_L4ts5-Qf76nkz3KLNeXwfQ](https://user-images.githubusercontent.com/70372233/175828553-d570643d-2b82-4fcb-b62e-f25a6942bd57.png)
  
O zaman Özetle şu şekilde düşünebiliriz:<br>
-JRE=JVM + Java Kütüphaneleri<br>
-JDK=JRE + Compiler + debugger

## Java Sanal Makine Mimarisi (JVM Architecture)
  <p> Machine Code (Machine Language): Makine kodu ya da makine dili, direkt olarak bir mikroişlemci/mikrodenetleyici üzerinde işletilebilecek komutlardan oluşan en alt seviyedeki programlama dilidir. İşlemci mimarisine/donanımına göre komut seti (instruction set) değişebilmektedir. Donanım diline uzak, insan diline yakın olan yüksek seviyeli diller ile yazılmış kodlar, hangi işlemci üzerinde çalışacak ise öncelikle bu işlemcinin komut setine uygun olarak derlenerek makine kodu oluşturulmak zorundadır.
   
 -![JVM-Architecture](https://user-images.githubusercontent.com/70372233/175829226-b85a45b5-db51-4727-a701-e2ef943cf8e2.png)
**Class Loader:**
<p> Bir “.java” kaynak kod dosyası derlendiğinde,bu kaynak kod dosyası byte koduna dönüştürülür ve “.class” olarak yeni bir dosya(.class) oluşturulur. Dönüştürülen bu .class dosyası programda kullanıldığında ve bu dosya çalıştırılırken,class loader bunu belleğe yükler. Bu yükleme işlemi belli bir sıraya göre yapılmaktadır. Bildiğiniz gibi tüm süreçler`“main”`ana fonksiyonu ve bu fonksiyonun bulunduğu class’dan başlar. Dolayısıyla belleğe yüklenecek ilk class,genellikle “main()” ana fonksiyonu içeren sınıf olacaktır.

<p>Yukarıda verilen görüntüde görüldüğü üzere “Class Loader” kendi içinde üç aşamaya sahiptir. Bunlar:

1-Loading(Yükleme)<br>
2-Linking(Bağlama)<br>
3-Initialization(Başlatma)<br>
-Loading:<br>
Sahip olduğumuz class’lar bu bileşen tarafından yüklenecektir. Bu bileşen bünyesinde bulunan “Bootstrap Class Loader,Extension Class Loader ve Application Class Loader” alt bileşenleri,bunu başarmamıza yardımcı olacak bileşenlerdir. Bu alt bileşenleri inceleylim. <br>
**Bootstrap Class Loader:** “Loading(Yükleme)” üst bileşeninde en öncelikli yükleyicidir.Öncelikli olmanın sebebi ise,Standart Java Edition’ın tüm sınıflarını içeren “rt.jar” paketini yüklemesidir.
Bu paket tüm diğer “Loader”’lardan önce yüklenmesi gerekir. Çünkü bu paket içinde “java.lang,java.net,java.util,java.io,…” gibi standart java paketleri bulunur.Dolayısıyla temel java paketleri yüklenmeden diğer aşamaların yüklenmesi tamamen gereksizdir. Çünkü diğer aşamalar bu paketi taban alarak çalışacaktır. <br>
 
 **Extension Class Loader:** İkinci sırada öncelikli olan yükleyicidir. Bu yükleyici `“$JAVA_HOME/jre/lib/ext”`dizininde bulunan standart java paketlerini(.jar) yükler.<br>
 **Application Class Loader:** Bu yükleyici “classpath”’da bulunan class’ları yükler. Default olarak “classpath”,uygulamanın geçerli dizinine ayarlanır. Class yolu ayarlamaları “-classpath” veya “-cp” komutu ile yapılabilir. Dolayısıyla bu yükleyicinin görevi,uygulama seviyesinde olan class’ları yüklemekle sorumludur. Aşağıda uygulama seviyesinde class yüklemeye bir örnek verilmiştir:
 
 -Linking:
Bir class belleğe yüklendikten sonra “bağlama(linking)” sürecinden geçer. Bir class veya arayüzü(interface) bağlamak,programın farklı öğelerini ve bağımlılıklarını bir araya getirmeyi içerir.
Linking(bağlama) işlemi aşağıdaki adımları içerir<br>

Verify-Verification: Bu aşama,.class dosyasının yapısal doğruluğunu bir dizi kural veya kısıtlamaya göre kontrol ederek doğrulama işlemi uygular.Yani oluşturulan byte kodunun doğru olup olmadığını,geçerli bir derleyici tarafından oluşturulup oluşturulmadığını doğrulayacaktır. Eğer doğrulama işlemi herhangi bir nedenden dolayı başarısız olursa,”VerifyError,VerifyException” istisnası(Exception) fırlatılacaktır.
Örneğin,java 16 sürümü kullanılarak uygulama geliştirilmişse ancak java 8 yüklü bir sistemde çalıştırılıyorsa,bu durumda doğrulama aşamasında başarısızlık meydana gelecektir.<br>
 <br>
Prepare-Preparation: Bu aşamada JVM,bir class’ın veya interface’in static alanları için bellek ayırır ve bunları default değerlerle başlatır.
Örneğin Main.java class’da aşağıdaki değişkeni tanımladığımızı varsayalım:
 `private static final boolean DEBUG = true;`
Bu aşamda JVM DEBUG değişkeni için bellek ayırır ve` “true”` değerini default olarak ayarlar.

Resolve-Resolution: Bu aşamada sembolik referanslar çalışma zamanı sabit havuzunda bulunan doğrudan referanslarla değiştirilir.Örneğin diğer sınıflara veya diğer sınıflarda bulunan sabit değişkenlere referanslarınız varsa,bunlar bu aşamada çözülür ve gerçek referanslarıyla değiştirilir.<br>
-Initialization:
Bu class yüklemenin son aşamasıdır.Bu aşamada class yapıcısını(Constructor) çağırmayı,statik blokları yürütmeyi ve tüm statik değişkenlere değer atamayı içerebilir. Örnek olması açısından şağıdaki kodu inceleyelim.<br>

`private static final boolean DEBUG = true;`
DEBUG değikeni Preparation(hazırlık) aşamasında`“false”`değeri default olarak ayarlanır. Ancak Initialization(başlatma) aşamasında bu değişkene gerçek değeri olan `“true”` atanır.<br>

NOT: JVM çoklu iş parçacığıyla(Multithreaded) çalışır.Birden fazla iş parçacığı aynı anda aynı class’ı başlatmaya çalışıyor olabilir.Bu durum eşzamanlılık sorunlarına yol açacaktır.Programın çoklu iş parçacıklı bir ortamda stabil çalıştığından emin olmamız gerekir.

 ## JAVA 8 İLE GELEN YENİLİKLER
-Lambda expressions <br>
-Functional interfaces<br>
-Method references<br>
-Stream API<br>
-Optional class<br>
-Concurrency Enhancements<br>
-JDBC Enhancements etc.<br>
 
### SOLİD PRENSİPLERİ
1. (S)ingle Responsibility Principle<br>

2. (O)pen/Closed Principle<br>

3. (L)iskov ‘s Substitution Principle<br>

4. (I)nterface Segregation Principle<br>

5. (D)ependency Inversion Principle<br>

```Single Responsibility```
<p> Bir sınıf (nesne) yalnızca bir amaç uğruna değiştirilebilir, o da o sınıfa yüklenen sorumluluktur, yani bir sınıfın(fonksiyona da indirgenebilir) yapması gereken yalnızca bir işi olması gerekir.<br>

![Single](https://user-images.githubusercontent.com/70372233/177010330-3fa60592-336b-4820-8ca8-ecd5d50c2930.png)
 
```Open-Closed```
<p>Open Sınıf için yeni davranışlar eklenebilmesini sağlar. Gereksinimler değiştiğinde, yeni gereksinimlerin karşılanabilmesi için bir sınıfa yeni veya farklı davranışlar eklenebilir olmasıdır.Gelişme açık değişme kapalı olmalıdır

![Ekran görüntüsü 2022-07-02 202803](https://user-images.githubusercontent.com/70372233/177010527-85c518e3-1c97-4278-8d60-17efdeb5fb51.png)

```(L)iskov ‘s Substitution Principle```
<p>Kodlarımızı değiştirmeden türettiğimiz sınıfta üst sınfın özelliklerini kullanabilmeliyiz. Türeyen yani alt sınıfımız üst sınıftaki tüm özellikleri kullanabilmeli ve kendine has özellikleri kolaylıkla tanımlayabilmelidir. Burada alt sınıf üst sınıfa şöyle der: Senin metotların benim metotlarım, benim metotlarım gene benim metotlarım. Ve maalesef üst sınıf bu konuda birşey yapamaz 

![Ekran görüntüsü 2022-07-02 203535](https://user-images.githubusercontent.com/70372233/177010673-e48c1da1-128f-4263-a893-cb7051d7f68f.png)
 
 ```(I)nterface Segregation Principle```
 <p>“Arayüz Ayırımı” prensibinde; bir interface’e gerekenden fazla metot ve değişken eklemek yerine, daha çok özelleştirilmiş birden fazla interface oluşturulmalıdır. Nesneler, ihtiyacı olmayan özellik veya metotlar içeren interface’leri miras almaya zorlanmamalıdır. Sizinde farkettiğiniz üzere “Single Responsibility” ve “Interface Segregation” prensipleri birbirine oldukça benzemekte ve aynı amaca hizmet etmektedirler. Ancak burada gözden kaçırılmaması gereken en önemli husus şudur ki; ‘Interface Segregation’ prensibi interface’ler ile ilgilenirken, ‘Single Responsibility’ prensibi class’lar ile ilgilenmektedir
 
![Ekran görüntüsü 2022-07-02 203741](https://user-images.githubusercontent.com/70372233/177010746-03b22f14-fb04-48bf-9614-4ec6bde78ebd.png)

 ```(D)ependency Inversion Principle```
 <p>Bu prensip ise şunu savunur. Üst seviye sınıflar alt seviyedeki sınıflara bağımlı olmamalıdır. Yani yazdığımız projede sınıflar arası bağımlılıklar minimum seviyede olmalıdır.

Mesela türettiğimiz sınıftaki yaptığımız değişiklik ana sınıfımızı etkilememelidir. Bu durumda ana sınıfta da değişiklik yapmamız gerekecek. Ana sınıfta da değişiklik yapınc aana sınıftan türettiğimiz tüm sınıflarda değişiklik yapmak zorunda kalacağız. Proje tarhana çorbası gibi olacaktır.

![Ekran görüntüsü 2022-07-02 204147](https://user-images.githubusercontent.com/70372233/177010851-b11396a2-407c-4217-b3c8-45c7dabe6d4b.png)



>>>>>>> 0ea0a5cf06545c6b34b524c538e9d7fdff8355b2
