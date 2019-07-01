package com.cg.pos.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.cg.pos.exceptions.InvalidItemQuantityException;
import com.cg.pos.service.PizzaService;
import com.cg.pos.service.impl.PizzaServiceImpl;

/**
 * 
 * @author trainee
 *
 */
public class PizzaOrderingSystem {

	public static void main(String[] args) {

		PizzaService operation = new PizzaServiceImpl();
		// ArrayList<PizzaDetailsDTO> list;
		//
		// System.out.println("Existing data.......");
		// System.out.println(operation.getDetails());
		// System.out.println('\n');
		do {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			String choice;

			System.out.println("**********************************************************");
			System.out.println();
			System.out.println("Enter 1 to modify pizza details");
			System.out.println("Enter 2 to delete pizza details");
			System.out.println("Enter 3 to exit");
			System.out.println();
			System.out.println("**********************************************************");

			choice = scanner.next();
			try {
				int pizzaId, storeId;
				switch (choice) {
				case "1":
					System.out.println("**********************************************************");
					System.out.println("enter 1 to modify itemName ");
					System.out.println("enter 2 to modify quantity ");
					System.out.println("enter 3 to modify cost ");
					System.out.println("enter 4 to modify addOns");
					System.out.println("enter 5 to exit");
					System.out.println("**********************************************************");

					String modifyChoice = scanner.next();

					switch (modifyChoice) {

					case "1":
						try {
							System.out.println("enter store Id");
							storeId = scanner.nextInt();
							System.out.println("enter item Id");
							pizzaId = scanner.nextInt();
							System.out.println("enter new name");
							String newName = scanner.next();
							String result = operation.modifyName(storeId, pizzaId, newName);
							System.out.println(result);
							break;
						} catch (InputMismatchException e) {
							throw new InvalidItemQuantityException("please quantity must be the number.....try again");
						}
					case "2":

						try {
							System.out.println("enter store Id");
							storeId = scanner.nextInt();
							System.out.println("enter item Id");
							pizzaId = scanner.nextInt();
							System.out.println("enter new name");
							int newQuantity = scanner.nextInt();
							String result = operation.modifyQuantity(storeId, pizzaId, newQuantity);
							System.out.println(result);
							break;
						} catch (InputMismatchException e) {
							throw new InvalidItemQuantityException("please quantity must be the number.....try again");
						}
					case "3":
						try {
							System.out.println("enter store Id");
							storeId = scanner.nextInt();
							System.out.println("enter item Id");
							pizzaId = scanner.nextInt();
							System.out.println("enter new cost");
							int cost = scanner.nextInt();
							String result = operation.modifyCost(storeId, pizzaId, cost);
							System.out.println(result);
							break;
						} catch (InputMismatchException e) {
							throw new InvalidItemQuantityException("please quantity must be the number.....try again");
						}

					case "4":
						try {
							System.out.println("enter store Id");
							storeId = scanner.nextInt();
							System.out.println("enter item Id");
							pizzaId = scanner.nextInt();
							System.out.println("enter new addON");
							String newAddOn = scanner.next();
							String result = operation.modifyAddOns(storeId, pizzaId, newAddOn);
							System.out.println(result);
							break;
						} catch (InputMismatchException e) {
							throw new InvalidItemQuantityException("please quantity must be the number.....try again");
						}
					case "5":
						System.out.println("Thank you..........");
						System.exit(0);
					default:
						System.out.println("enter valid options");

					}

					System.out.println("do you wants to continue again??? if Yes");
					System.out.println("type yes");
					System.out.println("or else press anything to exit");
					String response;
					response = scanner.next();
					String responseCaptured = response.toLowerCase();

					if (response.equals("yes"))
						break;

					else {
						System.out.println("Thank you... changes has been saved");
						System.exit(0);
					}
					break;
				case "2":

					System.out.println("enter storeId  to delete details");
					int storeId1 = scanner.nextInt();
					System.out.println("Enter pizza id to delete");
					int pizzaId1 = scanner.nextInt();
						String result = operation.deletePizzaDetails(storeId1,pizzaId1);
						System.out.println(result);
						System.out.println("you have deleted the pizza details......... ");
						System.out.println("do you wants to continue again?? if yes... ");
						System.out.println("type yes");
						System.out.println("or else press anything to exit");
						response = scanner.next();
						String responseCaptured1 = response.toLowerCase();
						if (response.equals("yes"))
							break;

						else {
							System.out.println("Thank you!! changes has been saved");
							System.exit(0);
						}
					
					break;

				case "3":
					System.out.println("Thank you!! ");
					System.exit(0);
				default:
					System.err.println("please enter valid options...");
					break;

				}
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}while(true);

}}
