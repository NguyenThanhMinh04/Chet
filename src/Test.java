/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
interface casi{
    public static final String mau_da="vang";
    void hat();//public abtract
}
class SonTungMTP extends Dongvat implements casi{
    @Override
    public void hat()
    {
        System.out.println("Hat nhac");
    }
    public void an()
    {
        System.out.println("hii");
    }
}
abstract class Dongvat implements casi{
    public void ngu()
    {
        System.out.println("Ngu");
    }
    public abstract void an();
    
}
class Cho extends Dongvat
{
    public void hat()
    {
        System.out.println("Hat");
    }
    @Override
    public void an()
    {
        System.out.println("Cho an thit");
    }
}
public class Test {
    public static void main(String[] args) {
        
    Dongvat dv = new Cho();
    dv.an();
    dv.ngu();
    
}
}
