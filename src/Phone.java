public class Phone {
    String number;
    String model;
    double weight;

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void getModelPhone() {
        System.out.println("The model phone:" + this.model);

    }

    public void CallPhoneNumber(){
        System.out.println("Call from a number:" + this.number);
    }

}