/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ex01.singleton.estrutura;

/**
 *
 * @author rafaelamoreira
 */
public class DemoSingleton {

    public static void main(String[] args) {
        System.out.println("""
                           Se você vir o mesmo valor, então o singleton foi reutilizado (oba!)
                           Se você vir valores diferentes, então 2 singletons foram criados (booo!!)
                           RESULTADO:  
                           """);
        Singleton s1 = Singleton.getInstance("FILME");
        Singleton s2 = Singleton.getInstance("SÉRIE");
        System.out.println(s1.value);
        System.out.println(s2.value);
        System.out.println(s1 == s2);
       
    }
}
