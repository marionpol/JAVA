package car;

import java.util.HashMap;
import java.util.HashSet;

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;


    private VehicleRegister(){
        owners = new HashMap<>();
    }

    public boolean add(RegistrationPlate plate, String owner){
    if(!owners.containsKey(owner)){
        owners.put(plate, owner);
        return true;
    }
    return false;
    }
    public String get(RegistrationPlate plate){
        return owners.get(plate);
    }
    public boolean delete(RegistrationPlate plate){
        return owners.remove(plate) != null;
    }
    public void printRegistrationPlates(){
        for(RegistrationPlate plate : owners.keySet()){
            System.out.println(plate);
        }
    }
    public void printOwners(){
        HashSet<String> uniqueOwners = new HashSet<>(owners.values());
        for(String owner : uniqueOwners){
            System.out.println(owner);
        }
    }
}
