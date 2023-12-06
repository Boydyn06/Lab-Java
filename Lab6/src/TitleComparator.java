import java.util.Comparator;

class TitleComparator implements Comparator<MyData> {
    @Override
    public int compare(MyData data1, MyData data2) {
        return data1.getTitle().compareTo(data2.getTitle());
    }
}