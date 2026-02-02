import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CoffeeShopGUI {
    
    static ArrayList<Product> orderList = new ArrayList<>();
    
    static JTextArea billArea = new JTextArea(15, 30); 

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Coffee Shop System");
        frame.setSize(450, 700); 
        frame.setLayout(new FlowLayout());

        Font myFont = new Font("Myanmar Text", Font.BOLD, 14); 
        billArea.setFont(myFont);
        billArea.setEditable(false); 

        JButton btnEspresso = new JButton("1. Espresso (Hot) - $2.5");
        JButton btnLatte = new JButton("2. Latte (Iced) - $3.5");
        JButton btnBurmese = new JButton("3. Burmese Tea (Hot) - $4.5");
        JButton btnGreen = new JButton("4. Green Tea (Iced) - $4.0");
        JButton btnCheckout = new JButton("5. 💰 Bill (Checkout)");

        btnEspresso.addActionListener(e -> {
            orderList.add(new Coffee("Espresso", 2.5, "Hot"));
            JOptionPane.showMessageDialog(frame, "Espresso Yort! ☕");
        });

        btnLatte.addActionListener(e -> {
            orderList.add(new Coffee("Latte", 3.5, "Iced"));
            JOptionPane.showMessageDialog(frame, "Latte Yort! 🥛");
        });

        btnBurmese.addActionListener(e -> {
            orderList.add(new Coffee("Burmese Tea", 4.5, "Hot"));
            JOptionPane.showMessageDialog(frame, "Burmese Tea Yort! 🍵");
        });

        btnGreen.addActionListener(e -> {
            orderList.add(new Coffee("Green Tea", 4.0, "Iced"));
            JOptionPane.showMessageDialog(frame, "Green Tea Yort! 🌿");
        });

        btnCheckout.addActionListener(e -> {

            System.out.println("Checkout button clicked!"); 

            StringBuilder bill = new StringBuilder("=== 🧾 သင့်ဘေလ် ===\n\n");
            double total = 0;
            
            for (Product p : orderList) {
                bill.append("- ").append(p.getDescription()).append("\n");
                total += p.getPrice();
            }
            bill.append("\n----------------\n");
            bill.append("Total: $").append(total).append("\n\n");
            bill.append("Fuck You Bitch!");
            
            billArea.setText(bill.toString());
        });

        frame.add(new JLabel("=== ☕ Welcome to Coffee Shop === "));
        frame.add(btnEspresso);
        frame.add(btnLatte);
        frame.add(btnBurmese);
        frame.add(btnGreen);
        frame.add(btnCheckout);

        JScrollPane scrollPane = new JScrollPane(billArea);
        frame.add(scrollPane);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}