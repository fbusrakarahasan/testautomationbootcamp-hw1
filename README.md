 
 <h1 align="center"> :bookmark_tabs: Enuygun - Test Automation Bootcamp - HW1 </h1>
 
> ###  ``` 1 -) Aynı özellikteki iki sınıf(Implement[Interface], Extend[Class]), üçüncü sınıfta çağırılırsa hangisi önce yürütülür? ```

Implement ve Extend kalıtımın olmazsa olmazlarıdır. Kalıtımda classların içindeki metodları başka classlara aktarmak için kullanılır. Kalıtım bilindiği üzere her classta aynı kodları yazmak yerine yazılmış olan sınıftan yeni sınıf türetilmesidir.
  
Bir **Class** başka bir **Class**'ı extend edebilir.

Bir **Class** başka bir **Abstract Class**'ı extend edebilir. Ederse Abstract Class'in tüm abstract metod deklarasyonlarini implemente etmek zorundadır.

Bir **Class** bir **Interface**'i implements edebilir. Ederse interface'in icindeki tüm metod deklarasyonlarini implemente etmek mecburiyetindedir.

Bir **Class** bir **Abstract Class**'ı implements edemez.

**:link: [Projeye Ulaşmak İçin Tıklayınız](https://github.com/enuygun-test-automation-bootcamp/homework1-fbusrakarahasan/tree/main/ImplementExtend)** 
```java
/*
    Enuygun Bootcamp HW-1
    Fatma Büşra KARAHASAN
*/

interface Implement {
    default public void out() {
        System.out.println("Implements once yurutulur.");
    }
}
class Extend {
    public void out() {
        System.out.println("Extend once yurutulur.");
    }
}

public class Main extends Extend implements Implement {
    public static void main(String[] args) {
        Main oncelik = new Main();
        oncelik.out();
    }
}
```

:heavy_check_mark: **Çıktı:**

```java
Extend once yurutulur.
```
 


> ###  ``` 2 -) Internal Nedir?  ```

Internal ile tanımladığımız bir sınıf ya da değişkene aynı Public'de olduğu gibi proje içerisinde ya da Namespace (isim alanı) içerisinde erişebiliyoruz. Internal'ın Public'ten farkı ise tanımladığı yapıya diğer projelerden ulaşım iznini vermemesidir. Internal aynı zamanda bir sınıfın varsayılan belirleyicisidir. Bir sınıfı class SınıfAdı ile Internal Class SınıfAdı tanımlamak arasında herhangi bir fark yoktur. 

Yani işin özü, kendi projesi içerisinde public, farklı bir projeden/dışarıdan çağırılmak istenildiğinde ise private özelliklerini taşır.

> ###  ``` 3 -) Abstraction Nedir? Abstraction'a örnek veriniz.  ``` 
 
 
**OOP**'nin ilk ayağı **Abstraction**(Soyutlama)dır. Soyutlama, kullanıcıya yalnızca ilgili bilgileri göstermek için verileri seçme işlemidir. Nesne yönelimli programlamada, nesnelerin **soyutlanmasında**, **geliştirilebilir** ve **değiştirilebilir** kodlar yazılmasında büyük kolaylık sağlamaktadır. Ayrıca **Kod tekrarını engelleyerek** hem daha derli toplu bir görüntü sağlar hem de hata yapma riskini azaltır. Ortak bir şablon üzerinden ilerleme imkanı sunar ve bu sınıfların temel amacı da budur.

Abstraction yapısı kurularak kullanıcıya yapılacak işlemin **fonksiyonelliği** sunulur. Bu şekilde kullanıcı kullandığı metodun ne yaptığıyla ilgilenirken, nasıl yaptığıyla ilgilenmez. Bu durumda fonksiyonellik ön plana çıkarken, işin nasıl yapıldığı gizlenir. Yani biz sınıf yazarken o sınıfın işi nasıl yaptığı ile ilgilenmeyiz ne iş yaptığı ile ilgileniriz. Örneğin, cep telefonundan mesaj yazıp gönderdiğimizde telefonun içinde dönen işlemden çok mesajın ulaşıp ulaşmadığı bizi alakadar eder. Mesajın gönderilip yerine ulaşması sürecinde geçen olaylar bizi ilgilendirmez.

**Abstract** olarak **tanımlanan** sınıf **abstract olmayan sınıflardan kalıtılabilir** ya da **abstract olmayan** sınıflar **abstract olan sınıflardan kalıtılabilir**. Her ikisi de mümkündür ancak abstract sınıftan kalıtılan alt sınıfta abstract sınıfta tanımlanmış abstract metodlar kesinlikle bulunmalıdır.
  
Yani işin özü, soyut bir sınıf kullanmanın temel faydası, birkaç ilgili sınıfı kardeş olarak gruplandırmanıza izin vermesidir. Soyutlama, yazılımın tasarım ve uygulama sürecinin karmaşıklığını azaltmaya yardımcı olur.

**:link: [Projeye Ulaşmak İçin Tıklayınız](https://github.com/enuygun-test-automation-bootcamp/homework1-fbusrakarahasan/tree/main/Abstraction)**

```java
/*
    Enuygun Bootcamp HW-1
    Fatma Büşra KARAHASAN
*/

abstract class A {
    void callA() {
        System.out.println("Enuygun Test Otomasyon Bootcamp'ine");
    }
}
class B extends A {
    void callB() {
        System.out.println("hos geldiniz.");
    }
}

class SoyutlamaOrnek {
    public static void main(String[] args) {
        B b = new B();
        b.callA();
        b.callB();
    }
}
```

:heavy_check_mark: **Çıktı:**

```java
Enuygun Test Otomasyon Bootcamp'ine
hos geldiniz.
```

