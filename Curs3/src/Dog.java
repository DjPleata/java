public class Dog {
    int size;

    public void bark() {
        if (size > 60){
            bark(times, "Woff!" );
        }
        else if (size > 14) {
            bark(times, "Roff!");
        }
        else {
            bark(times, "Yip!");
        }
            }

    private void bark(int times, String sound) {
        for( int i=0; i<times; i++){
        System.out.println(sound);
        }
    }
}
