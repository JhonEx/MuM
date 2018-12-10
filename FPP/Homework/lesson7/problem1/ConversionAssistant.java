package lesson7.problem1;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConversionAssistant extends JFrame {
	private static final double TO_GALLON = 3.78541;
	private static final double TO_KILOGRAM = 0.45359237;
	private static final double TO_MILE = 1.609344;
	
	private JTextField tfMile;
	private JTextField tfKilometer;
	private JTextField tfPound;
	private JTextField tfKilogram;
	private JTextField tfGalon;
	private JTextField tfLiter;
	private JTextField tfFahrenheit;
	private JTextField tfCentigrade;

	private JLabel lblMile;
	private JLabel lblKilometer;
	private JLabel lblPound;
	private JLabel lblKilogram;
	private JLabel lblGalon;
	private JLabel lblLiter;
	private JLabel lblFahrenheit;
	private JLabel lblCentigrade;

	private JButton btnConvert;

	public ConversionAssistant() {
	        super("Conversion Assistant");
	        setVisible(true);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(null);

	        setLayoutView();
	        addComponent();
	        setBounds(100, 100, 730, 400);
	    }

	private void setLayoutView() {
		lblMile = new JLabel("Mile:");
		lblMile.setBounds(52, 52, 78, 38);
		tfMile = new JTextField();
		tfMile.setBounds(152, 52, 202, 38);

		lblKilometer = new JLabel("Kilometer:");
		lblKilometer.setBounds(402, 52, 112, 38);
		tfKilometer = new JTextField();
		tfKilometer.setBounds(502, 55, 202, 38);

		lblPound = new JLabel("Pound:");
		lblPound.setBounds(52, 105, 102, 38);
		tfPound = new JTextField();
		tfPound.setBounds(152, 105, 202, 38);

		lblKilogram = new JLabel("Kilogram:");
		lblKilogram.setBounds(402, 105, 102, 38);
		tfKilogram = new JTextField();
		tfKilogram.setBounds(502, 105, 202, 38);

		lblGalon = new JLabel("Galon:");
		lblGalon.setBounds(52, 155, 102, 38);
		tfGalon = new JTextField();
		tfGalon.setBounds(152, 155, 202, 38);

		lblLiter = new JLabel("Liter:");
		lblLiter.setBounds(402, 155, 102, 38);
		tfLiter = new JTextField();
		tfLiter.setBounds(502, 155, 202, 38);

		lblFahrenheit = new JLabel("Fahrenheit:");
		lblFahrenheit.setBounds(52, 205, 102, 38);
		tfFahrenheit = new JTextField();
		tfFahrenheit.setBounds(152, 205, 202, 38);

		lblCentigrade = new JLabel("Centigrade:");
		lblCentigrade.setBounds(402, 205, 102, 38);
		tfCentigrade = new JTextField();
		tfCentigrade.setBounds(502, 205, 202, 38);

		btnConvert = new JButton("Convert");
		btnConvert.setBounds(332, 275, 150, 45);
		btnConvert.addActionListener(e -> {
			convert();
		});
	}
	
	private void addComponent() {
		Component[] components = { lblMile, lblKilometer, lblPound, lblKilogram, lblGalon, lblLiter,
				lblFahrenheit, lblCentigrade, tfMile, tfKilometer, tfPound, tfKilogram,
				tfGalon, tfLiter, tfFahrenheit, tfCentigrade, btnConvert };
		for (Component component : components) {
			add(component);
		}
	}
	
	private void convert() {
		double fahrenheit = Double.parseDouble(tfFahrenheit.getText());
		double centrigrade = (fahrenheit - 32) * 5 / 9;
		String centrigradeText = String.format("%.2f", centrigrade);
		tfCentigrade.setText(centrigradeText);
		
		double galon = Double.parseDouble(tfGalon.getText());
		double liter = galon * TO_GALLON;
		String literText = String.format("%.2f", liter);
		tfLiter.setText(literText);

		double pound = Double.parseDouble(tfPound.getText());
		double kilogram = pound * TO_KILOGRAM;
		String kilogramText = String.format("%.2f", kilogram);
		tfKilogram.setText(kilogramText);

		double mile = Double.parseDouble(tfMile.getText());
		double kilometer = mile * TO_MILE;
		String kilometerText = String.format("%.2f", kilometer);
		tfKilometer.setText(kilometerText);
	}
	
	public static void main(String[] args) {
		new ConversionAssistant();
	}
}
