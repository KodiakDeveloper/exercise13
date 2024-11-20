package selectionStructures;

import javax.swing.JOptionPane;

public class Ex13 {

	public static void main(String[] args) {

		int quantity = 0;

		String productName;

		float price = 300f;

		float totalPrice;

		productName = JOptionPane.showInputDialog(null, "Input product name: ");

		productName = productName.toLowerCase();

		productName = productName.trim();

		if (productName.isEmpty()) {

			JOptionPane.showMessageDialog(null, "Product name cannot be a null value!");
		}

		else {

			quantity = Integer.parseInt(JOptionPane.showInputDialog(null, "Input quantity: "));

			if (quantity <= 0) {

				JOptionPane.showMessageDialog(null, "Invalid Quantity, try again!!");

			}

			else {

				switch (quantity) {

				case 1:

					totalPrice = price * quantity;

					JOptionPane.showMessageDialog(null, "Product Name: " + productName + "\nQuantity: " + quantity
							+ "\nTotal Price: " + totalPrice);

					break;

				case 2:

					totalPrice = price * quantity;

					JOptionPane.showMessageDialog(null, "Product Name: " + productName + "\nQuantity: " + quantity
							+ "\nTotal Price: " + totalPrice);

					break;

				case 3:

					totalPrice = price * quantity;

					JOptionPane.showMessageDialog(null, "Product Name: " + productName + "\nQuantity: " + quantity
							+ "\nTotal Price: " + totalPrice);

					break;

				case 4:

					totalPrice = price * quantity;

					JOptionPane.showMessageDialog(null, "Product Name: " + productName + "\nQuantity: " + quantity
							+ "\nTotal Price: " + totalPrice);

					break;

				default:

					JOptionPane.showMessageDialog(null, "Our stock has run out");

				}

			}

		}

	}

}
