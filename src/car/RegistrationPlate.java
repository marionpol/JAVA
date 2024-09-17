package car;

public class RegistrationPlate {


    private final String regCode;
    private final String country;

    public RegistrationPlate(String regCode, String country) {
        this.regCode = regCode;
        this.country = country;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RegistrationPlate
                other = (RegistrationPlate) obj;
        return country.equals(other.country) && regCode.equals(other.regCode);
    }

    @Override
    public int hashCode() {
        int result = country.hashCode();
        result = 31 * result + regCode.hashCode();
        return result;
    }

    public String toString() {
        return country + " " + regCode; // Space separator for readability
    }
}

