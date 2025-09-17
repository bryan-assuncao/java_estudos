package assuncao.bryan.maratonajava.javacore.W_Colecoes.domain;

public class Smarthphone {
    private String serialNumber;
    private String marca;

    public Smarthphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        Smarthphone smarthphone = (Smarthphone) obj;
        return serialNumber != null && serialNumber.equals(smarthphone.serialNumber);
    }

    @Override
    public String toString() {
        return "Smarthphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
