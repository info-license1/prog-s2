import javax.swing.JOptionPane;

class Exo1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        

        String name = JOptionPane.showInputDialog("Please enter your name:");
        String ageStr = JOptionPane.showInputDialog("Please enter your age:");
        int age = Integer.parseInt(ageStr);

        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }
}
