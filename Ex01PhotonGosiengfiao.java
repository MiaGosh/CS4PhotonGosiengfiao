package q1ex1;

public class Ex01PhotonGosiengfiao {
    public static void main(String[] args) {
        String name1 = "Mia";
        String name2 = "Amelia";
        int age1 = 15;
        int age2 = 16;
        String favfood1 = "Ruffles Cheddar and Sour Cream";
        String favfood2 = "Ruffles Cheddar and Sour Cream";
        String name3 = "Alisha";
        int age3 = 14;
        String favfood3 = "Tinola";
        
        System.out.printf("Name: %s %nAge: %d%nFavorite Food: %s%n%n", name1, age1, favfood1);
        System.out.printf("Name: %s %nAge: %d%nFavorite Food: %s%n%n", name2, age2, favfood2);
        System.out.printf("Name: %s %nAge: %d%nFavorite Food: %s%n%n", name3, age3, favfood3);
        
        
        System.out.println("Their ages added together: " + (age1+age2+age3));
        System.out.println("Is Mia older than Amelia? " + (age1>age2));
        System.out.println("Do they all have the same favorite food? " + (favfood1==favfood2 && favfood1==favfood3));
    }
    
}
