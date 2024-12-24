class report {
    int id;
    String name;
    int physics;
    int chemistry;
    int maths;
    int result;

    report() {
        System.out.println("****");
        id = 101;
        name = "priyanka ";
        physics = 85;
        chemistry = 90;
        maths = 80;
        result = 85;
    }

    void display() {
        System.out.println(id + "," + name + result);
    }
}

class main {
    public static void main(String[] args) {
        report r1 = new report();
        report r2 = new report();
        r1.display();
        r2.display();
    }
}