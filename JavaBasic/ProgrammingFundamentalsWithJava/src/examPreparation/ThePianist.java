package examPreparation;

import java.util.*;

public class ThePianist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfPieces = Integer.parseInt(in.nextLine());

        Map<String, List<String>> allPieces = new LinkedHashMap<>();

        for (int i = 1; i <= numberOfPieces; i++) {
            String[] arrPieces = in.nextLine().split("\\|");
            String piece = arrPieces[0];
            String composer = arrPieces[1];
            String key = arrPieces[2];

            List<String> pieceInfo = new ArrayList<>();
            pieceInfo.add(composer);
            pieceInfo.add(key);
            allPieces.put(piece, pieceInfo);
        }

        String command = in.nextLine();

        while (!command.equals("Stop")) {
            //"Add|{piece}|{composer}|{key}"
            if (command.contains("Add")) {
                String addPiece = command.split("\\|")[1];
                String addComposer = command.split("\\|")[2];
                String addKey = command.split("\\|")[3];
                if (!allPieces.containsKey(addPiece)) {
                    List<String>addNewList= new ArrayList<>();
                    addNewList.add(addComposer);
                    addNewList.add(addKey);
                    allPieces.put(addPiece,addNewList);
//                    allPieces.put(addPiece, new ArrayList<>());
//                    allPieces.get(addPiece).add(addComposer);
//                    allPieces.get(addPiece).add(addKey);
                    System.out.printf("%s by %s in %s added to the collection!%n", addPiece, addComposer, addKey);
                } else {
                    System.out.printf("%s is already in the collection!%n", addPiece);
                }
            } else if (command.contains("Remove")) {
                //"Remove|{piece}":
                String removePiece = command.split("\\|")[1];
                if (allPieces.containsKey(removePiece)) {
                    allPieces.remove(removePiece);
                    System.out.printf("Successfully removed %s!%n", removePiece);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", removePiece);
                }
            } else if (command.contains("ChangeKey")) {
                //"ChangeKey|{piece}|{new key}":
                String changeKeyPiece = command.split("\\|")[1];
                String newKey = command.split("\\|")[2];

                if (allPieces.containsKey(changeKeyPiece)) {
                    List<String>changeKeyList = allPieces.get(changeKeyPiece);
                   // changeKeyList =
                    changeKeyList.remove(1);
                    changeKeyList.add(newKey);
                    allPieces.put(changeKeyPiece,changeKeyList);

                    System.out.printf("Changed the key of %s to %s!%n", changeKeyPiece, newKey);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.", changeKeyPiece);
                }
            }


            command = in.nextLine();
        }

//"{Piece} -> Composer: {composer}, Key: {key}"
        allPieces.entrySet().forEach(entry -> System.out.printf("%s -> Composer: %s, Key: %s%n",
                entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));

    }
}

