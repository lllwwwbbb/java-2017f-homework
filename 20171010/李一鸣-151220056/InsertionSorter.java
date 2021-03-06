
public class InsertionSorter implements Sorter {
    @Override
    public void sort(Field queue,int row) {
        Position[] positions = queue.getPositions(row);
        Creature creature = null;
        int j;
        for (int i = 5; i < 10; i++) {
            for (j = i; j > 4; j--) {
                if (!((Comparable) (positions[j].getHolder())).biggerThan((Comparable) (positions[j - 1].getHolder()))) {
                    creature = positions[j].getHolder();
                    positions[j - 1].getHolder().setPosition(positions[j]);
                    creature.setPosition(positions[j - 1]);
                }
            }
        }
    }
}
