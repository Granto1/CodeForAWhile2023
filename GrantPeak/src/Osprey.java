import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Osprey {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        ArrayList<house> birds = new ArrayList<>();
        ArrayList<house> houses = new ArrayList<>();

        int wH = Integer.parseInt(input.nextLine());

        for (int x = 0; x < wH; x++) {
            String line = input.nextLine();
            for (int y = 0 ; y < wH; y++) {
                if (line.charAt(y) == 'O' || line.charAt(y) == 'o') {
                    birds.add(new house(x, y));
                }
                if ((line.charAt(y) == 'H' || line.charAt(y) == 'h')) {
                    houses.add(new house(x, y));
                }
            }
        }

        int[] maxs = new int[birds.size()];
        for (int z = 0; z < birds.size(); z++) {
//            for each bird, determine the distance from each house
            double[] houseDistances = new double[houses.size()];
            for (int w = 0; w < houses.size(); w++) {
                houseDistances[w] = houses.get(w).realDistance(birds.get(z).getX(), birds.get(z).getY());
            }

//            determine which index in houses the minimum distance occurs
            int houseIndex = 0;
            double currentDist = Integer.MAX_VALUE;
            for (int i = 0; i < houseDistances.length; i++) {
                if (houseDistances[i] < currentDist) {
                    currentDist = houseDistances[i];
                    houseIndex = i;
                }
            }

//            determine the maximum manhattan distance to the shortest distance
            maxs[z] = birds.get(z).manDist(houses.get(houseIndex).getX(), houses.get(houseIndex).getY());
        }

//        determine the maximum distance out of all maxs for each bird
        int max = 0;
        for (int i = 0; i < maxs.length; i++) {
            if (maxs[i] > max) {
                max = maxs[i];
            }
        }

        System.out.println(max);
    }
    public static class house {
        int x, y;
        public house(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public int manDist(int x1, int y1) {
            return (Math.abs(x - x1)) + (Math.abs(y - y1));
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public double realDistance(int x1, int y1) {
            return Math.sqrt(Math.pow(x1-x, 2)+Math.pow(y1-y, 2));
        }
    }
}