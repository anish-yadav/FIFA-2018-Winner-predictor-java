/*Didnt knew much concepts so
 * used only basic concepts 
 * and if anyone find any site for improvement lease say it
 */
 import java.io.*;
public class FIFA
{
    int winner(int team)
    {
        int i= (int)Math.floor(Math.random()*team);
        return(i);
    }
    public static void main(String args[]) throws IOException
    {
        BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
        FIFA ob = new FIFA();
        String grp_A[]={"Russia","Uruguay","Egypt","Saudia Arabia"};
        String grp_B[]={"Spain","portugal","Iran","Morocco"};
        String grp_C[]={"France","Denmark","Australia","Peru"};
        String grp_D[]={"Croatia","Iceland","Argentina","Nigeria"};
        String grp_E[]={"Serbia","Brazil","Switzerland","Costa rica"};
        String grp_F[]={"Sweden","Mexico","Germany","South Korea"};
        String grp_G[]={"Belgium","England","Tunisia","Panama"};
        String grp_H[]={"Japan","Senegal","Poland","Colombia"};
        int a=ob.winner(4);
        int b=ob.winner(4);
        int c=ob.winner(4);
        int d=ob.winner(4);
        int e=ob.winner(4);
        int f=ob.winner(4);
        int g=ob.winner(4);
        int h=ob.winner(4);
        System.out.println("*******************************************Winners of group Matches************************************************************* ");
        System.out.println("                    Group A :"+grp_A[a]+"                              Group B :"+grp_B[b]);
        System.out.println("                    Group C :"+grp_C[c]+"                              Group D :"+grp_D[d]);
        System.out.println("                    Group E :"+grp_E[e]+"                              Group F :"+grp_F[f]);
        System.out.println("                    Group G :"+grp_G[g]+"                              Group H :"+grp_H[h]);
        System.out.println("==================================================================================================================");
        System.out.println("-----------------------------------------------------Quater Finals---------------------------------------------------");
        String QF1[]={grp_A[a],grp_H[h]};
        String QF2[]={grp_B[b],grp_G[g]};
        String QF3[]={grp_C[c],grp_F[f]};
        String QF4[]={grp_D[d],grp_E[e]};
        String a1=QF1[ob.winner(2)];
        String b1=QF2[ob.winner(2)];
        String c1=QF3[ob.winner(2)];
        String d1=QF4[ob.winner(2)];
        System.out.println("                                               "+QF1[0]+" Vs "+QF1[1]+"                                        Winner : "+a1);
        System.out.println("                                               "+QF2[0]+" Vs "+QF2[1]+"                                        Winner : "+b1);
        System.out.println("                                               "+QF3[0]+" Vs "+QF3[1]+"                                        Winner : "+c1);
        System.out.println("                                               "+QF4[0]+" Vs "+QF4[1]+"                                        Winner : "+d1);
         System.out.println("==================================================================================================================");
        System.out.println("**********************************************Semi Finals********************************************************************");
        String SF1[]={a1,d1};
        String SF2[]={b1,c1};
        String a2=SF1[ob.winner(2)];
        String b2=SF2[ob.winner(2)];
        System.out.println("                                      "+SF1[0]+" Vs "+SF1[1]+"                                         Winner : "+a2);
        System.out.println("                                      "+SF2[0]+" Vs "+SF2[1]+"                                         Winner : "+b2);
        String F[]={a2,b2};
        String a3=F[ob.winner(2)];
        System.out.println("==================================================================================================================");        
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-FIFA WORLDCUP 2018 FINALS*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("                                       "+F[0]+" Vs "+F[1]);  
        System.out.println();
        System.out.println("The Winner of 2018 FIFA World Cup is : "+a3); 
    }
}
