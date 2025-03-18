package Services.SearchService;

import Vehicles.VehicleType;

public class Filter {
    String model;
    String companyName;
    VehicleType type;

    // 🔹 Constructor
    public Filter(String model, String companyName, VehicleType type) {
        this.model = model;
        this.companyName = companyName;
        this.type = type;
    }
    public Filter(VehicleType type) {
        this(null, null, type);
    }
    // 🔹 Getters
    public String getModel() {
        return model;
    }

    public String getCompanyName() {
        return companyName;
    }

    public VehicleType getType() {
        return type;
    }

    // 🔹 Setters (optional, if values need modification)
    public void setModel(String model) {
        this.model = model;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Filter[Model: " + model + ", Company: " + companyName + ", Type: " + type + "]";
    }
}
