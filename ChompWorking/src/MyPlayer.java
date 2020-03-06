    public class MyPlayer {
		//MyPlayer is the player template
		public int[] column = new int[10];
		public int[] row = new int[10];
		public Chip[] gameBoard = new Chip[100];
		public int counter;
		public allBoards makeBoards = new allBoards();


		MyPlayer() {
			makeBoards.printAllBoards();
			makeBoards.learnToWin();

		}




		public int move(Chip[] chip) {

			column = new int[10];
			String boardString = ("" + column[0] + "" + column[1] + "" + column[2] + "" + column[3] + "" + column[4] +  "" + column[5] + "" + column[6] + "" + column[7] + "" + column[8] + "" + column[9]);
			gameBoard = chip;

			for(int i = 0; i <10;i++){
				if(gameBoard[i].isAlive){
					column[0]++;
				}
			}
			for(int i = 10; i <20;i++){
				if(gameBoard[i].isAlive){
					column[1]++;
				}
			}
			for(int i = 20; i <30;i++){
				if(gameBoard[i].isAlive){
					column[2]++;
				}
			}
			for(int i = 30; i <40;i++){
				if(gameBoard[i].isAlive){
					column[3]++;
				}
			}
			for(int i = 40; i <50;i++){
				if(gameBoard[i].isAlive){
					column[4]++;
				}
			}
			for(int i = 50; i <60;i++){
				if(gameBoard[i].isAlive){
					column[5]++;
				}
			}
			for(int i = 60; i <70;i++){
				if(gameBoard[i].isAlive){
					column[6]++;
				}
			}
			for(int i = 70; i <80;i++){
				if(gameBoard[i].isAlive){
					column[7]++;
				}
			}
			for(int i = 80; i <90;i++){
				if(gameBoard[i].isAlive){
					column[8]++;
				}
			}
			for(int i = 90; i <100;i++){
				if(gameBoard[i].isAlive){
					column[9]++;
				}
			}
			boardString = ("" + column[0] + "" + column[1] + "" + column[2] + "" + column[3] + "" + column[4] +  "" + column[5] + "" + column[6] + "" + column[7] + "" + column[8] + "" + column[9]);
			System.out.println(boardString);
			if(makeBoards.winningMap.containsKey(boardString)){
				System.out.println(makeBoards.winningMap.get(boardString).move);
				return(makeBoards.winningMap.get(boardString).move);
			}
			else{
				System.out.println(makeBoards.arrayHashMap.get(boardString).move);
				return(makeBoards.arrayHashMap.get(boardString).move);

			}

		}
		public void countCols ()
			{
				System.out.print("Column counter:");
				for (int i = 0; i < 10; i++) {
				for (int a = 0; a < 10; a++) {
					if (gameBoard[i * 10 + a].isAlive) {
						counter++;
					}
				}
				column[i] = counter;
				System.out.print("" + column[i] + " ");
				counter = 0;
			}
				System.out.println("");
			}
			public void countRows()
			{
				System.out.print("Row counter:");
				for (int i = 0; i < 10; i++) {
					for (int a = 0; a < 10; a++) {

						if (gameBoard[i + 10 * a].isAlive) {
							counter++;
						}
					}
					row[i] = counter;
					System.out.print("" + row[i] + " ");
					counter = 0;
				}
				System.out.println("");
			}//countRows


		}//class

