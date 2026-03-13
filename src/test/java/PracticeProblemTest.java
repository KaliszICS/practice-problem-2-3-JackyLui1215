import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PracticeProblemTest {

   @Test
   void circleAreaTest1() {
      assertEquals(0, PracticeProblem.circleArea(0));
   }

   @Test
   void circleAreaTest2() {
      assertEquals((Math.PI * 1),PracticeProblem.circleArea(-1)); 
   }

   @Test
   void circleAreaTest3() {
      assertEquals((Math.PI * 39495493 * 39495493), PracticeProblem.circleArea(39495493));
   }

   @Test
   void circleAreaTest4() {
      assertEquals((Math.PI * 6.7 * 6.7), PracticeProblem.circleArea(6.7));
   }
   
   @Test
   void circleAreaTest5() {
      assertEquals((Math.PI * 0.001 * 0.001), PracticeProblem.circleArea(0.001));
   }

   @Test
   void timeConvertionTest1() {
      assertEquals(("1 hours and 0 minutes"), PracticeProblem.minutesToHours(60));
   }

   @Test
   void timeConvertionTest2() {
      assertEquals(("0 hours and 0 minutes"), PracticeProblem.minutesToHours(0));
   }

   @Test
   void timeConvertionTest3() {
      assertEquals(("0 hours and -1 minutes"), PracticeProblem.minutesToHours(-1));
   }

   @Test
   void timeConvertionTest4() {
      assertEquals(("10 hours and 50 minutes"), PracticeProblem.minutesToHours(650));
   }

   @Test
   void timeConvertionTest5() {
      assertEquals(("0 hours and 30 minutes"), PracticeProblem.minutesToHours(30));
   }

   @Test
   void simpleInterestTest1() {
      assertEquals((80.0), PracticeProblem.simpleInterest(50, 20, 8));
   }

   @Test
   void simpleInterestTest2() {
      assertEquals((0.0), PracticeProblem.simpleInterest(0, 0, 0));
   }

   @Test
   void simpleInterestTest3() {
      assertEquals((-0.15000000000000002), PracticeProblem.simpleInterest(-1, 5, 3));
   }

   @Test
   void simpleInterestTest4() {
      assertEquals((-0.06), PracticeProblem.simpleInterest(3, -1, 2));
   }

   @Test
   void simpleInterestTest5() {
      assertEquals((-0.56), PracticeProblem.simpleInterest(7, 8, -1));
   }

   @Test
   void hypotenuseTest1() {
      assertEquals((8.981091247727083), PracticeProblem.hypotenuse(5.5, 7.1));
   }

   @Test
   void hypotenuseTest2() {
      assertEquals((14.142135623730951), PracticeProblem.hypotenuse(10,10));
   }

   @Test
   void hypotenuseTest3() {
      assertEquals((0.223606797749979), PracticeProblem.hypotenuse(0.1, 0.2));
   }

   @Test
   void hypotenuseTest4() {
      assertEquals((1.4142135623730951), PracticeProblem.hypotenuse(1, 1));
   }

   @Test
   void hypotenuseTest5() {
      assertEquals((7.0710678118654755), PracticeProblem.hypotenuse(-5, -5));
   }

   

}
