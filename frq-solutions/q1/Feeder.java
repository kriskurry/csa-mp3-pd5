import java.util.Random;

public class Feeder {
 private int currentFood;

 public Feeder(int initialFood) {
  this.currentFood = initialFood;
  }

 public void simulateOneDay(int numBirds) {
  Random rand = new Random();
  boolean isAbnormal = rand.nextDouble() < 0.05; // 5% chance for abnormal condition
  if (isAbnormal) {
   this.currentFood = 0; // Bear emptying the feeder
    } else {
  int totalFoodConsumed = 0;
  for (int i = 0; i < numBirds; i++) {
   int foodPerBird = rand.nextInt(41) + 10; // Random between 10 and 50 grams
      totalFoodConsumed += foodPerBird;
      }
     if (totalFoodConsumed > this.currentFood) {
       this.currentFood = 0;
       } else {
          this.currentFood -= totalFoodConsumed;
        }
       }
    }

  public int simulateManyDays(int numBirds, int numDays) {
    int daysWithFood = 0;
      
    for (int i = 0; i < numDays; i++) {
      simulateOneDay(numBirds);
     if (this.currentFood > 0) {
        daysWithFood++;
         System.out.println("Food left: " + currentFood);
         System.out.println();
    } else {
     break; // Exit loop if there's no more food in the feeder
       }
     }
    
      return daysWithFood;
    }

}
