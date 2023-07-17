package decision_making;

public class if_else_if_ladder {
    public static void main(String[] args) {
        String city = "Nairobi";
        if(city == "Kakamega") {
            System.out.println("city is Kakamega");
        }else if (city == "Nakuru") {
            System.out.println("city is Nakuru");
        }else if(city == "Kisumu") {
            System.out.println("city is Kisumu");
        }else {
            System.out.println(city);
        }
    }
}
