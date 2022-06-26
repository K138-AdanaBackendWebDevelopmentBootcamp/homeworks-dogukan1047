# homeworks-dogukan1047
 -----------------------------------------------------------------------------------------------------------------------------------------
![Ekran görüntüsü 2022-06-24 135605](https://user-images.githubusercontent.com/70372233/175521142-4a2d49c3-e586-4dab-8c0e-91f6b79fd369.png)
-------------------------------------------------------------------------------------------------------------------------------------------
JAVA CLASS DİAGRAM AND DEPENDENCY{}
![Ekran görüntüsü 2022-06-24 132115](https://user-images.githubusercontent.com/70372233/175522530-2b61e327-4161-4f10-8f4a-c4b7d7e90abb.png)
<h3 align="left">RESEARCH SUBJECT: What is JVM and how is it made? What is its architecture like? What welcome from the JVM with Java 8?</h3>
  JVM, bilgisayarınızda bulunan bir sanal makinedir ve kullandığı makine dili ise bayt kodudur. Bu her farklı tip makine için farklı bir makine kodu yaratmak yerine JVM için sadece bayt kodu üretmesi gerektiğinden derleyicinin işini kolaylaştırır. JVM, derleyici tarafından üretilen bayt kodunu çalıştırır ve bir çıktı üretir. Yani Java’nın platform bağımsız çalışmasını sağlayan yapıdır.Her işletim sistemi farklı bir JVM’e sahiptir, ancak bayt kodunu çalıştırdıktan sonra ürettikleri çıktı tüm işletim sistemlerinde aynıdır.
![download](https://user-images.githubusercontent.com/70372233/175523162-ff4d3851-c887-47a8-ac57-4f0a9a1f13d1.png)
<h4 align="left">JAVA MİMARİSİ</h4>
![0_X9H_1QON1SKYMh8M](https://user-images.githubusercontent.com/70372233/175523301-a9641d75-cf1a-40e4-a30f-1f7f11ecc02b.png)


CLASS LOADER:.class uzantılı bayt kodunu okur ve Method Area kısmına kaydeder
METHOD AREA:.class uzantılı bayt kodun sınıf bilgilerini tutar
PC Registers:HAngi proseslerin işlendiğini ve işleneceğini izler

------------------------------------------------------------------------------------
JRE: java sanal makinesinin çalıştığı ortamdır. JRE derleyici ve debugger haricinde, JVM ve sınıf kütüphaneleri gibi dosyaları içerir. Bu, kodu JRE üzerinde çalıştırabileceğiniz, ancak JRE üzerinde geliştiremeyeceğiniz veya derleyemeyeceğiniz anlamına gelir.

JVM:JVM kodu JRE tarafından sağlanan sınıf, kütüphaneler ve dosyaları kullanarak çalıştırır.

JDK: JRE’nin bir üst kümesidir. JRE’nin derleyici, debugger vb. geliştirme araçlarıyla birlikte sahip olduğu her şeyi içerir.

