## Nested Graph Navigation App

* Navigation component ile nested graph kullanımı.
* Login ve Main olmak üzere , iki ayrı nested graph kullanıldı. 
* Login ekranında işlem tamamlandıktan sonra main ekranından geri dönüş engellenmiş ve uygulamadan çıkışı sağlanmıştır.



https://user-images.githubusercontent.com/70481060/189529450-27c57824-3546-4d9e-9262-4da65460d96a.mp4


## Navigasyon Component nedir?
Mobil geliştirmede navigasyon temel olarak uygulama içindeki farklı ekranlar veya içerik parçaları arasındaki etkileşimi ifade eder. 
Android Jetpack'in mimarisi Navigasyon Bileşeni çok güçlüdür ve tutarlı ve öngörülebilir bir kullanıcı deneyimi sağlar. 
Navigasyon bileşeni, basit düğme tıklamaları ile uygulamadaki etkinlikler ve parçalar veya veri parçaları arasında Navigasyonun uygulanmasına yardımcı olur.

#### Navigasyonun üç temel özelliği şunlardır:
* Navigasyon Grafiği: Bu, hedefler olarak adlandırılan uygulamalar içindeki tüm bireysel içerik alanlarını içeren XML dosyasıdır.Bunlar, kullanıcıların uygulama boyunca izleyebilecekleri olası yollar olabilir.
* NavHost: Bu, kullanıcı gezinirken hedefleri görüntüleyen boş bir kapsayıcı olan XML dosyasıdır. Bu temel olarak Navigasyon Grafiğinden çeşitli hedefleri görüntüleyen NavHostFragment'ı içerir.
* NavController: NavController, NavHost ile hedeflerin navigasyonunu yöneten bir nesnedir. Bu, kullanıcı uygulama aracılığıyla hedefler arasında gezinirken hedef içeriğinin değiştirilmesini kontrol eder.

#### Geliştiricilerin Navigation Component'ten elde ettiği faydalar şunlardır:
* Navigasyon Bileşeni Fragment işlemini yönetir.
* Yukarı ve geri eylemlerini yönetir, temel olarak Backstack'i yönetir.
* NavHost'un içeriğini değiştirirken standartlaştırılmış animasyon ve geçişler sağlar.
* Derin bağlantıların kolay kullanımı ve uygulanmasını sağlar.
* Navigasyon Çekmecesi veya Alt Navigasyon Görünümleri vb. gibi Navigasyon kullanıcı arayüzü modellerinin kolay kullanımı ve uygulanmasını sağlar.
* Hedefler arasında tip güvenli veri aktarımı sağlayan bir Gradle eklentisi olan Safe Args mevcuttur.
* Navigasyon Bileşeni ViewModel'i de destekler. Hedefler arasında ilgili kullanıcı arayüzünü paylaşmak için bir görünüm modelini navigasyon grafiğine kapsamlandırabilir.


