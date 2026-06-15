import java.util.*;
public class MinHeap {
    int[] arr;
    int size;
    int capacity;
    MinHeap(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0;
    }
    int parent(int i) {
        return (i - 1) / 2;
    }
    int leftChild(int i) {
        return (2 * i) + 1;
    }
    int rightChild(int i) {
        return (2 * i) + 2;
    }
    void swap(int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    void insert(int val) {
        if (size == capacity) {
            System.out.println("Heap Overflow");
            return;
        }
        arr[size] = val;
        int curr = size;
        size++;
        while (curr != 0 && arr[curr] < arr[parent(curr)]) {
            swap(curr, parent(curr));
            curr = parent(curr);
        }
    }

    void heapify(int i) {
        int left = leftChild(i);
        int right = rightChild(i);
        int smallest = i;
        if (left < size && arr[left] < arr[smallest]) {
            smallest = left;
        }
        if (right < size && arr[right] < arr[smallest]) {
            smallest = right;
        }
        if (smallest != i) {
            swap(i, smallest);
            heapify(smallest);
        }
    }

    int extractMin() {
        if (size <= 0) {
            System.out.println("Heap Underflow");
            return Integer.MAX_VALUE;
        }
        if (size == 1) {
            size--;
            return arr[0];
        }
        int root = arr[0];
        arr[0] = arr[size - 1];
        size--;
        heapify(0);
        return root;
    }

    void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter capacity: ");
        int n = sc.nextInt();
        MinHeap h = new MinHeap(n);
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            h.insert(sc.nextInt());
        }
        System.out.println("Min Heap:");
        h.display();

        if (h.size > 0) {
            System.out.println("Extracted Min: " + h.extractMin());
            System.out.println("Min Heap after extraction:");
            h.display();
        }
        sc.close();
    }
}