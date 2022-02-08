public class CommitNow {
    private String name;
    private Double time;

    public CommitNow(String name, Double time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public Double getTime() {
        return time;
    }

    public void setName(String name) {
        this.name = "Gabriel";
    }

    public void setTime(Double time) {
        this.time = time;
    }
}
