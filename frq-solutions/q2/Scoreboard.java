public class Scoreboard {
  private String team1;
  private String team2;
  private int team1Score;
  private int team2Score;
  private boolean activeTeam;

  public Scoreboard(String team1, String team2){
    this.team1 = team1;
    this.team2 = team2;
    this.team1Score = 0;
    this.team2Score = 0;
    this.activeTeam = true;
    
  }

  public void recordPlay(int points){
    if(points > 0){
      if(activeTeam == true){
        team1Score += points;
      }else{
        team2Score += points;
      }
      
    }else{
      activeTeam = false;
    }
  }

  public String getScore(){
    return team1Score +"-" + team2Score + "-" + activeTeam;
  }

 
}
