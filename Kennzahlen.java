import java.util.Arrays;

public class Kennzahlen {
   public static double max(double[] values){
      double kleinstenWert=0, speicher=0;
      for (int i = 0; i < values.length; i++) {speicher=values[i];
         for (int j = i+1; j < values.length; j++) {
            if(values[i]>values[j]){
               values[i]=values[j];
               values[j]=speicher;

            }

         }
         kleinstenWert=speicher;

      }
      return kleinstenWert;}
   public static double min(double[] values){
      double kleinstenWert=0, speicher=0;
      for (int i = 0; i < values.length; i++) {speicher=values[i];
         for (int j = i+1; j < values.length; j++) {
            if(values[i]<values[j]){
               values[i]=values[j];
               values[j]=speicher;

         }

      }
         kleinstenWert=speicher;

      }
   return kleinstenWert;}

   public static double Average(double[] value){
      double speicher =0;
      for (double b:value) {
         speicher+=b;

      }
      return speicher/value.length;
   }

   public static double [] metrics (double [] values){
      double []rückgabeMetrics= new double[3];
      rückgabeMetrics[0]=min(values);
      rückgabeMetrics[1]=max(values);
      rückgabeMetrics[2]=Average(values);

   return rückgabeMetrics;}

   public static int [] filter (char[] values, char toSelect){
      int j=0;

      for (int i = 0; i < values.length; i++) {
         if(values[i]==toSelect){
            j++;}}
            int []rückgabefilter= new int [j];
            for (int i = 0, s=0; i < values.length; i++) {
            if(values[i]==toSelect){
            rückgabefilter[s]=i;
            s++;}}
   return rückgabefilter;}
   public static double [] select(double [] values, int [] indices){
     double [] newArray=new double[indices.length];
      for (int i = 0; i < indices.length; i++) {
         newArray[i]=values[indices[i]];

      }
   return newArray;}

   public static void main(String[] args) {

      double[] ages = {20, 45, 69, 70, 45, 16, 59, 45, 24, 54, 53, 65, 61, 3, 48, 47, 13, 85, 27, 69, 45, 20, 67, 63, 18, 56, 25, 35, 35, 24, 70, 65, 34, 32, 23, 67, 53, 35, 33, 38, 22, 27, 69, 64, 36, 27, 51, 48, 46, 85, 38, 41, 24, 22, 73, 69, 23, 41, 32, 40, 65, 56, 47, 65, 70, 23, 65, 37, 63, 59, 26, 63, 69, 23, 24, 33, 35, 70, 36, 53, 35, 1, 60, 22, 18, 21, 21, 23, 70, 32, 38, 18, 74, 21, 20, 44, 38, 21, 42, 68, 29, 58, 1, 51, 45, 32, 34, 24, 48, 35, 26, 73, 75, 67, 67, 65, 44, 62, 75, 60, 1, 80, 72, 71, 65, 66, 55, 22, 50, 80, 50, 45};
      char[] stati = {'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'd', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'd', 'r', 'r', 'r', 'r', 'd', 'r', 'r', 'r', 'd', 'r', 'r', 'd', 'r', 'r', 'r', 'r', 'r', 'r', 'd', 'r', 'r', 'r', 'r', 'r', 'd', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'd', 'r', 'r', 'd', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'd', 'r', 'r', 'd', 'r', 'd', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'd', 'r', 'r', 'd', 'r', 'r', 'r', 'd', 'r', 'r', 'r', 'r', 'd', 'r', 'r', 'r', 'd', 'r', 'r', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd'};
      double [] verstorben=metrics(select(ages,filter(stati,'d')));
      double [] genesen=metrics(select(ages,filter(stati,'r')));
      System.out.println("Verstorben - Min: " +verstorben[0]+", Max: " +verstorben[1]+", Mean: " +verstorben[2]);
      System.out.println("Genesen - Min: " + genesen[0]+" , Max:"+ genesen[1]+", Mean:"+ genesen[2]);
   }
}
