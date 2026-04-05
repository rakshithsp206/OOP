import java.util.Scanner;
enum Check{CORRECT,WRONG,UNANSWERED};
class MCQ{
    char[] correctAns={'C','A','B','D','B','C','C','A'};
    char[] ans;
    Check[] Result=new Check[8];
    public void CheckAnswers(char[] ans){
        this.ans=ans;
        for(int i=0;i<8;i++){
            if(ans[i]==correctAns[i]){
                Result[i]=Check.CORRECT;
            }
            else if(ans[i]=='A' || ans[i]=='B' || ans[i]=='C' || ans[i]=='D'){
                Result[i]=Check.WRONG;
            }
            else Result[i]=Check.UNANSWERED;
        }
    }
    public void printResult(){
          System.out.println("QUESTION SUBMITTED CORRECT RESULT"); 
          for(int i=0;i<8;i++){
            System.out.println((i+1)+"\t"+ans[i]+"\t"+correctAns[i]+"\t"+Result[i]);
          } 
    }
}
public class l5p7 {
    public static void main(String[] args) {
        MCQ mcq=new MCQ();
        char[] ans=new char[8];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Answers:");
        for(int i=0;i<8;i++){
            ans[i]=sc.next().charAt(0);
        }
        mcq.CheckAnswers(ans);
        mcq.printResult();
    }
}
