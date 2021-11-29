# JavaConcurrency
Bir uygulama birden fazla şeyi aynı anda yapabiliyorsa buna concurrent uygulama denir. Concurrency kavramı aynı anda birden fazla işlem yapabilme yeteneğini ifade eder.
Java'da concurrency thread'lerle sağlanır.
### Threadleri Tanımlama, Başlatma 
- Thread, javada thread sınıfını extend ederek ve bu sınıfın run() metodunu override ederek oluşturulabilir.
- Thread nesnesi Thread constructor’ına runnable edilebilecek bir parametre vererekte yaratılabilir.
- Aynı thread sınıfı üzerinden birden çok nesne oluşturulabilir.
- Bir thread objesi yaratıldıktan sonra çalışması için start() metodunun çağırılmasını bekler. Start() metodu çağırılmadan thread çalışmaz.
### Multithreading
Java’da çoklu thread, maksimum CPU kullanımıyla aynı anda iki veya daha fazla iş parçacığı yürütme işlemidir.
Çok iş parçacıklı uygulamalar, iki veya daha fazla iş parçacığının aynı anda çalıştığı yerlerdir. Bu nedenle Java'da eş zamanlılık olarak da bilirir.
### Faydalanmış olduğum kaynaklar
- [Threads](http://admiralhopper.blogspot.com/2015/04/java-ve-concurrency-threads.html)
- [Interrupts](https://www.javadevjournal.com/java/how-to-kill-a-java-thread/)
- [Synchronized](https://www.baeldung.com/java-synchronized)
- [Multithreading](https://kplnosmn94.medium.com/java-multithreading-5-deadlock-livelock-and-wait-notify-16a145f800d)
