import java.util.Scanner;

enum Check{CORRECT,WRONG,UNANSWERED};
class MCQ{
    char[] correctAns={'C','A','B','D'};
    char[] ans;
    Check[] Result=new Check[4];
    int correct;
    int wrong;
    public void CheckAnswers(char[] ans){
        this.ans=ans;
        correct=0;
        wrong=0;
        for(int i=0;i<4;i++){
            if(ans[i]==correctAns[i]){
                Result[i]=Check.CORRECT;
                correct++;
            }
            else if(ans[i]=='A' || ans[i]=='B' || ans[i]=='C' || ans[i]=='D'){
                Result[i]=Check.WRONG;
                wrong++;
            }
            else Result[i]=Check.UNANSWERED;
        }
    }
    public void printResult(){
          System.out.println("QUESTION SUBMITTED CORRECT RESULT"); 
          for(int i=0;i<4;i++){
            System.out.println((i+1)+"\t"+ans[i]+"\t"+correctAns[i]+"\t"+Result[i]);
          } 
          System.out.println("No.of correct answers: "+correct);
          System.out.println("No.of wrong answers: "+wrong);
          if(correct/4.0>=0.5){
            System.out.println("The Candidate has Passed");
          }
          else{
            System.out.println("The Candidate has Failed");
          }
    }
}
public class L7P7 {
    public static void main(String[] args) {
        MCQ mcq=new MCQ();
        char[] ans=new char[4];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Answers:");
        for(int i=0;i<4;i++){
            ans[i]=sc.next().charAt(0);
        }
        mcq.CheckAnswers(ans);
        mcq.printResult();
    }
}
