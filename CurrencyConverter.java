import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;

public class CurrencyConverter extends JFrame implements ActionListener {

    private JLabel amountLabel, fromLabel, toLabel, resultLabel;
    private JTextField amountField, convertedField;
    private JComboBox<String> fromComboBox, toComboBox;
    private JButton convertButton;

    private final String[] CURRENCY_NAMES = {"INR", "BD", "USD", "EUR", "GBP", "CAD", "AUD", "JPY", "CHF", "CNY"};
    private final double[] EXCHANGE_RATES = {1, 1.28, 82.24, 87.89, 96.45, 62.49, 57.78, 0.63, 89.41, 11.98};

    private final Border BORDER = BorderFactory.createLineBorder(Color.green);

    public CurrencyConverter() {

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 15, 50));
        panel.setBorder(BORDER);
        panel.setBackground(new Color(95, 158, 160));

        amountLabel = new JLabel("Enter amount:");
        amountLabel.setFont(new Font("Arial", Font.BOLD, 17));

        fromLabel = new JLabel("From:");
        fromLabel.setFont(new Font("Arial", Font.BOLD, 17));

        toLabel = new JLabel("To:");
        toLabel.setFont(new Font("Arial", Font.BOLD, 17));

        resultLabel = new JLabel("Converted Currency:");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 17));

        amountField = new JTextField();
        amountField.setFont(new Font("Arial", Font.BOLD, 17));

        convertedField = new JTextField();
        convertedField.setFont(new Font("Arial", Font.BOLD, 17));
        convertedField.setEditable(false);

        fromComboBox = new JComboBox<>(CURRENCY_NAMES);
        fromComboBox.setFont(new Font("Arial", Font.BOLD, 17));

        toComboBox = new JComboBox<>(CURRENCY_NAMES);
        toComboBox.setFont(new Font("Arial", Font.BOLD, 17));

        convertButton = new JButton("Convert Currency");
        convertButton.setFont(new Font("Arial", Font.BOLD, 17));
        convertButton.addActionListener(this);

        panel.add(amountLabel);
        panel.add(amountField);
        panel.add(fromLabel);
        panel.add(fromComboBox);
        panel.add(toLabel);
        panel.add(toComboBox);
        panel.add(resultLabel);
        panel.add(convertedField);

        add(panel, BorderLayout.CENTER);
        add(convertButton, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent con) {
        if (con.getSource() == convertButton) {
            try {
                double amount = Double.parseDouble(amountField.getText());
                int fromIndex = fromComboBox.getSelectedIndex();
                int toIndex = toComboBox.getSelectedIndex();
                double result = amount * EXCHANGE_RATES[fromIndex] / EXCHANGE_RATES[toIndex];
                DecimalFormat decimalFormat = new DecimalFormat("#.###");
                convertedField.setText(decimalFormat.format(result));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please Enter Valid Amount!");
            }
        }
    }

    public static void main(String[] args) {
        try {
            CurrencyConverter currencyConverter = new CurrencyConverter();
            currencyConverter.setTitle("Currency Converter App");
            currencyConverter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            currencyConverter.setSize(550, 400);
            currencyConverter.setLocationRelativeTo(null);
            currencyConverter.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
