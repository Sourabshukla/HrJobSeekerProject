import java.util.Scanner;

public class Launch {
    public static void main(String[] args) {
        //System.out.println("hi");
        String role=" ";  //human resource & job seeker


        job[] jobs=new job[10];
        job job1=new job(101,"java Dev","java");
        job job2=new job(101,".net Dev","c#");
        job job3=new job(101,"python Dev","python");
        job job4=new job(101,"python Dev","php");
        jobs[0]=job1;
        jobs[1]=job1;
        jobs[2]=job1;
        jobs[3]=job1;
        int i=4;
        boolean flag=true;
        while(flag) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter your role");
            role= sc.nextLine();


            if (role.equals("HR")) {
                System.out.println("Hi, HR please enter job details");

                job j1 = new job();
                System.out.println("enter id");
                j1.setId(Integer.parseInt(sc.nextLine()));
                System.out.println("enter profile");
                j1.setProfile(sc.nextLine());

                System.out.println("Enter tech");
                j1.setTech(sc.nextLine());
                jobs[i]=j1;
                i++;
                System.out.println(j1.toString());
                System.out.println("will get back to you");
            } else if(role.equals("JS")){
                for (job job:jobs){
                    if (job!=null)
                    System.out.println(job);
                }
                System.out.println("enter the text you want to search");
                String input=sc.nextLine();

                for (job job:jobs){
                    if (job != null && job.getTech().contains(input) || job.getProfile().contains(input))

                        System.out.println(job);
                }

            }
            else if(role.equals("exit")) {
                flag=false;
            }
        }
    }
}
