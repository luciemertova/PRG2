package OOP;

public class Match {
   private int hostScore, visitingScore;

    public int getHostScore() {
        return hostScore;
    }
    public int getVisitingScore() {
        return visitingScore;
    }

    public void setHostScore(int hostScore) {
        this.hostScore = hostScore;
    }

    public void setVisitingScore(int visitingScore) {
        this.visitingScore = visitingScore;
    }

    void getResult(){
        if (hostScore > visitingScore){
            System.out.println("Vyhrali domaci");
        } else if (hostScore < visitingScore) {
            System.out.println("Vyhrali hoste");
        }else {
            System.out.println("Remiza");
        }
    }

}
