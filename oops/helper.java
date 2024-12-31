package oops;

public class helper {
    public static class student{
        int rNo;
        String name;
        private double perc;
        final String Class="12th Class";
        private static int noOfStudent;


        public student(){ //due to default constructor overriden 
            noOfStudent++;  
        }

        public student(int roll,String Name,double k){  //constructor
            rNo=roll;
            name=Name;
            perc=k;
            noOfStudent++;
        }

        public double getPerc(){  //getter
            return perc;
        }

        public void setPerc(double perc){  //setter
            this.perc=perc;
        }

        public static int getNoOfStudent(){
            return noOfStudent;
        }
}
}
