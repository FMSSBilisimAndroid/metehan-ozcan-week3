## Fragment LifeCycle Instance State App

### Instance State Nedir?
Android'de bir aktivite'nin kullanıcı arabirimi sistem tarafından başlatılan aktivite yok etme işlemleri arasında girilen değerleri korumak ve geri yüklemek kullanıcı deneyiminin önemli bir parçasıdır. Bu gibi durumlarda kullanıcı, kullanıcı arabiriminde durumunun aynı kalmasını bekler ancak sistem activity ve içinde saklanan tüm değerleri yok eder. Bunun sebebi Android‘in kullanıcıdan alınan değerleri tutup performansa olumsuz etkisi olmaması için statik değer olduğu farzedilen değerleri hafızada saklamamasıdır.

#### Bu sorunun çözmenin yolu; Save State kullanmaktır.

SavedInstanceState, her Android Aktivitesi için Create yöntemine geçirilen bir Bundle nesnesine referanstır. onSaveInstanceState metodu içerisinde bu şekilde kaybolan değerler Bundle tipindeki parametreye alınarak koruma altına alınır. Aşağıda bu örneği görebiliriz.

```kotlin
//Saves TextView Data To Bundle
override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("USER_TEXT", binding.textView.text.toString())
```
onRestoreInstanceState metodu içinde de onSaveInstanceState metodunda kaydedilen değerler alınarak ilgili öğeye atanır.
```kotlin
 ///Gets TextView Data From Bundle
        override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        if (savedInstanceState != null) {
            data = savedInstanceState.getString("USER_TEXT", "DEFAULT VAL")
        }
    }
 ```
 
 ### Uygulama Çalışma Biçimi Aşağıdaki Videoda Görülebilir
 ### savedInstanceState KULLANMADAN çalıştırırsak;
 * Eğer savedInstanceState kullanmasaydık, ekranımız döndüğünde kullanıcının verdiği veriyi göremeyecektik. Aşağıdaki videoda bunu açıkca görebiliriz.


https://user-images.githubusercontent.com/70481060/189531035-2ede8009-0507-4aad-b4b7-867c87a7eb61.mp4


### Ödev'de verilen konu savedInstanceState KULLANARAK çalıştırırsak;
 * Uygulamamızın beklenen davranışı kullanıcının girdiği değeri uygulama ekranı dönmesine rağmen Bundle'da tutup TextView olarak göstermesidir.
 
 
https://user-images.githubusercontent.com/70481060/189503650-72cfeb3c-5958-4ad4-9869-fa62adc91555.mp4

