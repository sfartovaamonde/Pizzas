package com.samu.lecturaFicheiros;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BuilderPizzas miBuilder=new BuilderPizzas();
        BuilderPizzas miBuilder2=new BuilderPizzas();
        Pizza miPizza=miBuilder.setMasa("fina").setRelleno(false).setSalsa(true).setTipo_Salsa("Barbacoa").build();
        System.out.println(miPizza.toString());
        Pizza miPizza2=miBuilder2.setMasa("pan").setRelleno(false).setSalsa(false).setTipo_Salsa(null).build();
        System.out.println((miPizza2.toString()));
    }
}
