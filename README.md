# **Not Ortalaması Hesaplama Programı**


# Alt Bilgi
**Öğrenciler için not ortalaması hesaplama yapmak amacıyla oluşturuldu.**

# Languages

* JAVA

# İçerik

* Ders değişkenleri oluşturuldu.

* Scanner sınıfı tanımlandı.

* Kullanıcıdan not değerleri alındı.

* Derslerin ortalaması oluşturuldu.

* Ortalama sonucunda kullanıcının geçti/kaldı koşulu oluşturuldu.

```Java
        int matematik, fizik, kimya, turkce, tarih, muzik;

        Scanner input   =   new Scanner(System.in);
```

```Java
        int a = 60, b = 60;

        boolean ort1 = sonuc > a;
        boolean ort2 = sonuc > b;

        boolean deger1 = ort1 || ort2;
        boolean deger2 = (sonuc > a) || (sonuc > b);

        String str = (deger2) ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println(str);
```


```bash
    Matematik Notunuz :90
    Fizik Notunuz :70
    Kimya Notunuz :55
    Türkçe Notunuz :80
    Tarih Notunuz :60
    Müzik Notunuz :75
    Ortalamanız :71.0
    Sınıfı Geçti
```

```bash
    Matematik Notunuz :60
    Fizik Notunuz :40
    Kimya Notunuz :50
    Türkçe Notunuz :35
    Tarih Notunuz :70
    Müzik Notunuz :46
    Ortalamanız :50.0
    Sınıfta Kaldı
```


>[Patika.dev](https://app.patika.dev/fogomurphy)


| Name |  Email |
| ---- |  ----- |
| Tuncay | tuncaydemir682@gmail.com |
