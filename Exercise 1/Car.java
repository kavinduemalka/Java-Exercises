class Car{
    String brand;
    String model;
    public Car (String brand, String model){
        this.brand = brand;
        this.model = model;
    public void DisplayInfo() {
        System.out.println("brand : "+ brand);
        System.out.println("model : "+ model);   
    }
}