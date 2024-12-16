class Solution {
    public double[] convertTemperature(double celsius) {
        double answer[]= new double[2];
         // Correct case sensitivity issue
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00; // Rename to camelCase
        
         answer[0]=kelvin;
         answer[1]=fahrenheit;
         return answer;
    }
}
