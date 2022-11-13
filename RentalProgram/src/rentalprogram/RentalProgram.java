//package domain;

public class PropertyOwner {
    private int ownerID;
    private String name;
    private String address;
    private String city;
    private String state;
    private int zipCode;
    private String phoneNumber;
    
    public String getAddress(){
        return address;
    }
    
    public String getCity(){
        return city;
    }
    
    public String getName(){
        return name;
    }
    
    public int getOwnerID(){
            return OwnerID;
    }
    
    public String getPhoneNumber(){
            return phoneNumber;
    }
    
    public String getState(){
        return state;
    }
    
    public int getZipCode(){
        return zipCode;
    }
    
    public void setAddress(String a){
        address = a;
    }
    
    public void setCity(String c){
        city = c;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public void setOwnerID(int id){
        ownerId = id;
    }
    
    public void setPhoneNumber(String p){
        phoneNumber = p;
    }
        
    public void setZipCode(int z){
        zipCode = z;
    }
    
    public String toString(){
        return ownerId + " " + name + " " + address + " " + city + "," + state + " " + zipCode + " " + zipCode + " " + phoneNumber;
    }   
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    
    
}
