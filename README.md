# Internsavy_CurrencyConverter
## Currency Converter
This is a simple currency converter application built using Java and the ExchangeRatesAPI.io API. The application allows you to convert between different currencies using real-time exchange rates.

## Getting Started
To run the currency converter application, you need to have Java installed on your machine. If you don't have Java installed, you can download it from the official website: https://www.java.com/en/download/.

Once you have Java installed, follow these steps to run the application:

Download the CurrencyConverter.java file from this repository.
Open a command prompt or terminal window and navigate to the directory where you saved the CurrencyConverter.java file.
Compile the Java source code by running the following command:
Copy code
javac CurrencyConverter.java
Run the application by running the following command:
Copy code
java CurrencyConverter
The currency converter application should open in a new window.

## How to Use
The currency converter interface consists of two dropdown menus and a text field. To convert between currencies, follow these steps:

Select the currency you want to convert from in the first dropdown menu.
Select the currency you want to convert to in the second dropdown menu.
Enter the amount you want to convert in the text field.
Click on the "Convert" button to see the converted amount.
The exchange rates are updated every hour using the ExchangeRatesAPI.io API.

## Code Structure
The currency converter application is implemented in a single Java class, CurrencyConverter.java. The class extends the JFrame class to create a window for the application. The dropdown menus are implemented using the JComboBox class and the text field and button are implemented using the JTextField and JButton classes, respectively.

The application uses the ExchangeRatesAPI.io API to retrieve real-time exchange rates. The API is accessed using the URLConnection and BufferedReader classes in Java.

## Contributing
If you would like to contribute to this project, feel free to submit a pull request. All contributions are welcome!
