package org.example;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//        Optional<String> optionalName = Optional.of(null);//Hata verir :  java.util.Objects.requireNonNull
        Optional<String> optionalName = Optional.ofNullable("Ridvan");

        //Eğer optionalName içerisinde bir değer varsa, o değeri yazdır.
        optionalName.ifPresent(name -> System.out.println("Name: " + name));

        //Eğer optionalName içerisinde bir değer yoksa, "Name not found" yazdır.
        optionalName.ifPresentOrElse(
                name -> System.out.println("Name: " + name),
                () -> System.out.println("Name not found")
        );


        String name = null;
        Optional<String> optionalName2 = Optional.ofNullable(name);

        // Değer varsa yazdır, yoksa varsayılan değeri kullan
        String result = optionalName2.orElse("Default Name");
        System.out.println("Name2: " + result);

        //Optional sınıfı, bir nesnenin zorunlu olup olmamasını belirtmek için kullanılır.
        Optional<String> optionalName3 = Optional.empty();

        // Değer var mı kontrolü
        boolean hasValue = optionalName3.isPresent();
        System.out.println("Has Value: " + hasValue);

        //Optional sınıfı, değeri işlemek için çeşitli metodlar sağlar.
        Optional<String> optionalName4 = Optional.of("Ridvan");

        // Değer üzerinde işlem yapma
        optionalName4.map(String::toUpperCase)
                .map(upperCaseName -> "Mr. " + upperCaseName)
                .ifPresent(upperCaseName -> System.out.println("Upper Case Name: " + upperCaseName));


    }
}