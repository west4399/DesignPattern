public class Singleton {
    public static void main(String[] args) {
        for (int i = 0; i < 9999; i++) {
            Renban renban = Renban.getInstance();
            System.out.println(renban.getNumber());
        }
    }
}

class Renban {
    private static Renban jittai = new Renban();
    private int num = 0;

    public static Renban getInstance()
    {
        return jittai;
    }

    public int getNumber()
    {
        num++;
        return num;
    }
}