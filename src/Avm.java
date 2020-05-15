
import java.util.Scanner;

public class Avm {
    private static double bakiye = 0;
    private final int kola = 15;
    private final int fanta = 20;
    private final int gazoz = 30;
    
    
    enum icecekler{
        k(1),f(2),g(3);
        public int deger;
        icecekler(int deger){
            this.deger=deger;
        }
    }
    public static double kalanPara=0;
   
    public Avm(double bakiye){
        System.out.println("Toplam bakiye: " + bakiye+"TL");
        this.bakiye = bakiye;
    }
    
    public void alışveriş(){
        
        Scanner scanner=new Scanner(System.in);
        while(true){
            
            if(bakiye == 0)
                break;
            System.out.println("Ne almak istersiniz?Kola için [1],Fanta için[2],Gazoz için[3]'e basiniz.");
            int avm = scanner.nextInt();
            
            if(avm==1 && bakiye >= kola ){
                bakiye -= kola;
                System.out.println("Kola aldiniz.Afiyet olsun.");
            } 
            else if(avm==2 && bakiye >= fanta){
                bakiye -= fanta;
                System.out.println("Fanta aldiniz.Afiyet olsun.");
            }  
            else if(avm==3 && bakiye >= gazoz ){
                bakiye -= gazoz;
                System.out.println("Gazoz aldiniz.Afiyet olsun.");
            }
            else if(avm!=1&&avm!=2&&avm!=3)
                continue;
            else{
                System.out.println("Bakiye yetersiz.Güncel bakiye:"+bakiye+"TL");
                kalanPara=bakiye;
                
                ParaEkle paraEkle = new ParaEkle();
                paraEkle.paraEkleme();
                break;
            }
            System.out.println("Mevcut bakiye:" +bakiye+"TL" );
            
        }
       
    }
}
