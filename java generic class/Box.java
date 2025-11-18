class Box<T> {
    private T value;
    void set(T value) {
        this.value = value;
    }
    T get() {
        return value;
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(10);
        System.out.println(intBox.get());

        Box<String> strBox = new Box<>();
        strBox.set("Hello");
        System.out.println(strBox.get());

        Box<Double> dblBox = new Box<>();
        dblBox.set(15.75);
        System.out.println(dblBox.get());
    }
}
