package week3.day4.ooppractice;

public class ParseFromTo implements Parse<PopulationMove> {
    @Override
    public PopulationMove parsing(String str) {
        String[] arr = str.split(",");
        return new PopulationMove(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]));
    }
}
