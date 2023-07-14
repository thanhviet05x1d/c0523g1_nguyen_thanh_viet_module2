package ss09_dsa.exercise.array_list;

import java.util.Arrays;

public class MyList<E> {
    //1. Khai báo các thuộc tính lớp
    private int size = 0;
    private static int DEFAULT_CAPACITY = 4;
    private Object[] elements;

    // 2. Constructor khởi tạo tham số hằng
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    // 3. Constructor khởi tạo tham số nhập vào
    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    // 4. Phương thức thêm phần tử trí bất kỳ
    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        elements = Arrays.copyOf(elements, elements.length + 1);
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    // 5. Phương thức lấy thông tin
    public E get(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + "Size " + index);
        }
        return (E) elements[index];
    }

    // 6. Phương thức loại bỏ phần tử
    public E remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println(index + " bạn nhập vào nằm ngoài mảng");
        }
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return (E) elements;
    }

    // 7. Phương thức trả về của mảng
    public int size() {
        return size;
    }

    // 8. Phương thức sao chép mảng
    public E clone() {
        Object[] elementsClone = new Object[elements.length];
        for (int i = 0; i < elements.length; i++) {
            elementsClone[i] = elements[i];
        }
        return (E) elementsClone;
    }

    // 9. Phương thức kiểm tra phần tử được chứa trong mảng không?
    public boolean contains(E element) {
        return indexOf(element) != -1;
    }

    // 9a. Phương thức phụ kiểm tra chứa loẳng ngoằng
    public int indexOf(E element) {
        if (element == null) {
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (element.equals(elements[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    // 10. Phương thức thêm phần tử vào cuối mảng và báo thành công
    public boolean add(E element) {
        add(size, element);
        return true;
    }
}
