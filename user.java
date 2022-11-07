import java.util.Scanner;
    
    public class user {
         public static void main(String[] args) {
          
            String username , password , evet , yenişifre , yenişifre2;
                
                Scanner inp = new Scanner(System.in);

                    System.out.print("\n\tKullanıcı adını giriniz :");

                        username = inp.nextLine();

                            System.out.print("\n\tŞifrenizi giriniz :");
                                
                                password = inp.nextLine();

                                    if (username.equals("patika") && password.equals("java1234")){
                                     
                                        System.out.println("\n\tGiriş yaptınız .");  }  
                                
                                     
                                        else {
                                            
                                            System.out.println("\n\tBilgileriniz yanlış\n");}

                                                System.out.println("\n\tŞifrenizi sıfırlamak istiyor musunuz ?"+"\n");
                                            
                                            System.out.println("\t1- Evet\n\t2- Hayır\n");
                                            
                                                    System.out.print("\tSeçiminiz :");
                                            
                                                        int select = Integer.parseInt(inp.nextLine());
                                            
                                        switch (select) {
                                            
                                            case 1:System.out.println("\n\tYeni şifrenizi farklı biçimde giriniz \n");
                                              
                                                System.out.print("\tYeni şifreniz :"); 
                                              
                                                    yenişifre = inp.nextLine();
                                              
                                                        System.out.println("\n\tŞifreniz başarılı bir şekilde değiştirildi\n");
                                   

                                                break;
                                            
                                                    case 2: System.out.println("\nGörüşmek üzere ..\n");
                                            
                                            default:
                                                
                                        }
                                        
                inp.nextInt();                        
                                        
}}
                                            
         
