import java.util.Random;

    public class Main {
        public static void main(String[] args) {
            Random rd = new Random();
            int[] x = new int[8];
            int[] y = new int[8];
            int[] l = new int[8];
            for(int i=0; i<x.length; i++){
                x[i]= rd.nextInt(11);
                System.out.print(x[i]+" ");
            }
            System.out.println();
            for(int i=0; i<y.length; i++){
                y[i]= rd.nextInt(11);
                System.out.print(y[i]+" ");
            }
            System.out.println();
            for(int i=0; i<l.length; i++){
                l[i]= (int) Math.sqrt(Math.pow(x[i], 2)+Math.pow(y[i], 2));
                System.out.print(l[i]+" ");
            }
        }// и это тоже
    }

