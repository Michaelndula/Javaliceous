package decision_making;

public class nested_if_condition {
    public static void main(String[] args) {
        String address = "Nairobi, Kenya";

        if(address.endsWith("Kenya")) {
            if(address.contains("Kampala")) {
                System.out.println("Your city is Kampala");
            }else if(address.contains("Lusaka")) {
                System.out.println("Your city is Lusaka");
            }else {
                System.out.println(address.split(",")[0]);
            }
        }else {
            System.out.println("You are not living in Kenya");
        }
    }
}
