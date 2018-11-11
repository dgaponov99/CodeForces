package Archive.C;

import java.util.HashMap;
import java.util.Scanner;

public class BookRequests {

    enum Side {L, R}

    static class Book {
        Side side;
        int order;

        Book(Side side, int order) {
            this.side = side;
            this.order = order;
        }
    }

    public static void main(String[] args) {
        int leftOrder = 0;
        int rightOrder = 0;

        HashMap<String, Book> shelf = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        int q = Integer.parseInt(scanner.nextLine());

        String command;
        String[] data;
        Book book;
        for (int i = 0; i < q; i++) {
            command = scanner.nextLine();
            data = command.split(" ");

            switch (data[0]) {
                case "L":
                    leftOrder++;
                    shelf.put(data[1], new Book(Side.L, leftOrder));
                    break;
                case "R":
                    rightOrder++;
                    shelf.put(data[1], new Book(Side.R, rightOrder));
                    break;
                case "?":
                    book = shelf.get(data[1]);
                    if (book.side == Side.L)
                        System.out.println(Integer.min(leftOrder - book.order, book.order + rightOrder - 1));
                    else
                        System.out.println(Integer.min(rightOrder - book.order, book.order + leftOrder - 1));
            }


        }
    }
}
