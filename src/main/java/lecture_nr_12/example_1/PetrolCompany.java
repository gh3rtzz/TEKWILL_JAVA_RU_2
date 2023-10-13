package lecture_nr_12.example_1;

import java.util.LinkedList;
import java.util.List;

public class PetrolCompany {

    private final String name;
    private final String IDNO;
    private List<GasStation> gasStationList;

    public PetrolCompany(String name, String IDNO) {
        this.name = name;
        this.IDNO = IDNO;
        gasStationList = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public String getIDNO() {
        return IDNO;
    }

    public List<GasStation> getGasStationList() {
        return gasStationList;
    }

    public void setGasStationList(List<GasStation> gasStationList) {
        this.gasStationList = gasStationList;
    }

    public void addGasStationToList(GasStation... inputGasStations){
        for (GasStation element :
                inputGasStations) {
            gasStationList.add(element);
        }
    }
}
