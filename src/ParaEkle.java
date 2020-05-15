import java.util.Scanner;

public class ParaEkle {
    double bakiye = 0;
    double para = 0;
    double silinecek=0;   //iade edilecek parayı tutmak için oluşturuldu.
        
    public ParaEkle(){
        
    }
    
    public void paraEkleme(){
        
        Scanner scanner=new Scanner(System.in);
        Scanner scanner2=new Scanner(System.in);
        while(true){
            
            System.out.print("Otomata para atiniz:");
            para=scanner.nextDouble();
            
            if(para == 0)
            {
                System.out.println(bakiye + "TL iade edildi");
                //bakiye-silinecek.
                break;
            }
            if (para==0.5||para==1||para==5||para==10)
            {
                bakiye += para;
                bakiye+=Avm.kalanPara;
                silinecek= para;
                System.out.print("Para eklemeye devam etmek için[Evet],Ürün almak için[Herhangi bir tuşa basiniz] yaziniz.İptal için önce [Evet] sonra 0'a basiniz.");
                String str = scanner2.nextLine();
                
                if(str.equals("Evet"))
                    continue;
                else{
                    Avm avm = new Avm(bakiye);
                    avm.alışveriş();
                    break;
                } 
            }
            else{
                System.out.print("Hata!");
                System.out.print("Lütfen belirtilen standartlarda para atiniz:");
                continue;
            }
                
        }
    }
}
