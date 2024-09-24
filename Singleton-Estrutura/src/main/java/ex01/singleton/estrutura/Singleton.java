/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.singleton.estrutura;

/**
 *
 * @author rafaelamoreira
 */
public class Singleton {
    
    private static Singleton instance;
    public String value;
    private Singleton(String value) {
      System.out.println("Criando uma instância Singleton");
      this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}

