public class TestMain {
    public static void main(String[] args) {
        Students std[]=new Students[3];
        std[0]=new Students();  //object refernce (3)
        std[1]=new Students();
        std[2]=new Students();

        std[0].setStudentName("Nandhini");
        std[0].setCity("Chennai");
        std[0].setStudentId(79);
        std[0].setMarks1(80);
        std[0].setMarks2(90);
        std[0].setMarks3(85);
        std[0].setFeePerMonth(25.45f);
        std[0].isEligibleForScholorship=true;

        std[1].setStudentName("Mikkalya");
        std[1].setCity("Cuddalore");
        std[1].setStudentId(77);
        std[1].setMarks1(88);
        std[1].setMarks2(95);
        std[1].setMarks3(84);
        std[1].setFeePerMonth(35.45f);
        std[1].isEligibleForScholorship=true;

        std[2].setStudentName("Sruthi");
        std[2].setCity("Coimbatore");
        std[2].setStudentId(514);
        std[2].setMarks1(77);
        std[2].setMarks2(82);
        std[2].setMarks3(89);
        std[2].setFeePerMonth(45.45f);
        std[2].isEligibleForScholorship=true;

        int htm=std[0].getTotalmarks();
        String htms=std[0].getStudentName();
        for(int i=1;i<3;i++){
            if(std[i].getTotalmarks()>htm){
                htm=std[i].getTotalmarks();
                htms=std[i].getStudentName();
            }
        }
        System.out.println(htm);
        System.out.println(htms);

        float lmf=std[0].getFeePerMonth();
        String lmfs=std[0].getStudentName();
        for(int i=1;i<3;i++){
            if(std[i].getFeePerMonth()<lmf){
                lmf=std[i].getFeePerMonth();
                lmfs=std[i].getStudentName();
            }
        }
        System.out.println(lmf);
        System.out.println(lmfs);

        double averagevalue;
        for(int i=1;i<3;i++){
            if(std[i].getAverage()>80d){
                std[i].setEligibleForScholorship(true);
                System.out.println(std[i].getStudentName()+" "+std[i].getTotalmarks()+" "+std[i].getAverage()+" "+std[i].getResults()+" Scholorship avaiable ");
            }
            else{
                std[i].setEligibleForScholorship(false);
                System.out.println(std[i].getStudentName()+" "+std[i].getTotalmarks()+" "+std[i].getAverage()+" "+std[i].getResults()+" Not Scholorship avaiable ");
            }
        }
    }
}
