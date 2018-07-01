/* Data Structures CA2

Tudor Chiribes

NCI 2018 */

import java.util.ArrayList;

public class MyArrayList<T> extends ArrayList<T> {

    public void bubbleSortDesc() {

        Comparable firstElement, secondElement;

        for (int i = 0; i < size(); i++) {
            for (int j = 1; j < size()-i; j++) {

                firstElement = (Comparable)get(j-1);
                secondElement = (Comparable)get(j);

                if (firstElement.compareTo(secondElement) < 0) {
                    T first = get(j-1);
                    T second = get(j);
                    set((j-1), second);
                    set(j, first);
                }
            }
        }
    }

    public void bubbleSortAsc() {

        Comparable firstElement, secondElement;

        for (int i = 0; i < size(); i++) {
            for (int j = 1; j < size()-i; j++) {

                firstElement = (Comparable)get(j-1);
                secondElement = (Comparable)get(j);

                if (firstElement.compareTo(secondElement) > 0) {
                    T first = get(j-1);
                    T second = get(j);
                    set((j-1), second);
                    set(j, first);
                }
            }
        }
    }

    public void insertionSortDesc() {

        int position;
        T keyElement;

        for(int i = 1; i < size(); i++) {

            keyElement = get(i);
            position = i;

            while(position > 0 && ((Comparable)get(position-1)).compareTo((Comparable)keyElement) < 0) {

                T previousElement = get(position - 1);
                set(position, previousElement);
                position = position - 1;
            }

            set(position,keyElement);
        }
    }

    public void insertionSortAsc() {

        int position;
        T keyElement;

        for(int i = 1; i < size(); i++) {

            keyElement = get(i);
            position = i;

            while(position > 0 && ((Comparable)get(position-1)).compareTo((Comparable)keyElement) > 0) {

                T previousElement = get(position - 1);
                set(position, previousElement);
                position = position - 1;
            }

            set(position,keyElement);
        }
    }
}
