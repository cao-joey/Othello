# Othello
A simple recreation of the classic game Othello using text symbols. 

### Built Using:
<ul>
  <li>Non OO Java</li>
  <li>OO Java</li>
</ul>

## How to play
<a href="https://www.youtube.com/watch?v=Ol3Id7xYsY4&ab_channel=Howcast"><strong>Video Tutorial</strong></a>

Othello is a strategetic board game designed for two players: one with black tiles, the other with white. In this case, our design includes the opportunity to play against a randomized computer. The player tiles are X and O, where X is the "black" tile and O is the "white" tile. 

#### Objective
The goal of Othello is simple, you want to have more of your coloured tiles on the board than the other player does. 

### Gameplay
As in a typical game of Othello, X (or black) will go first. Note that a player will only be able to place a tile IF there is a valid move on the board for them. We will discuss available moves in detail later. Do not be alarmed when the system skips a turn, as it might be the case that the skipped player has no move on the board!

#### Turns
When it is your turn to make a move:
<ol>
  <li>Find a valid move</li> The terminal will prompt first for a row. Notice that each row and column is numbered in the same way as a Cartesian plane.</li>
  <li>Type in the row number for your move, then press enter.</li>
  <li>Type in the column number for your move, then press enter.</li>
</ol>

The terminal will now print an updated board to the screen. If the board has changed, congratulations! You have successfully made a vaild move. If the board does not change, this means you have NOT made a valid move. The system will not allow you to retry, instead it will move directly into the next players move. 

#### Valid Moves
As mentioned earlier, in order to be able to play during your turn, you must be able to make a valid move on the board. So, what does this mean? A valid move MUST flip at least one of the oppositions discs that are currently already on the board. This means your disc must surround at least one of the oppositions either vertically, horizontally, or diagonally. 

The game ends naturally when there are either no free tiles left on the board or when there are no valid moves to be made from either player. The player with the most discs on the board wins. The system naturally prints a report at the end of the game and declares the winner. 

#### Example
Your board will look something like this:
```
0 1 2 3 4 5 6 7 
 +-+-+-+-+-+-+-+-+
0| | | | | | | | |0
 +-+-+-+-+-+-+-+-+
1| | | | | | | | |1
 +-+-+-+-+-+-+-+-+
2| | | | | | | | |2
 +-+-+-+-+-+-+-+-+
3| | | |X|O| | | |3
 +-+-+-+-+-+-+-+-+
4| | | |O|X| | | |4
 +-+-+-+-+-+-+-+-+
5| | | | | | | | |5
 +-+-+-+-+-+-+-+-+
6| | | | | | | | |6
 +-+-+-+-+-+-+-+-+
7| | | | | | | | |7
 +-+-+-+-+-+-+-+-+
  0 1 2 3 4 5 6 7
X:2 O:2  X moves next
row:
```
Here we can see that it is player X's turn. Player X will first find a valid move for them to play on. Let's say player X see's a valid turn on (2,4). They will then enter the following into the terminal. The system will then print an update:
```
row: 2
col: 4
X makes move (2,4)

 0 1 2 3 4 5 6 7 
 +-+-+-+-+-+-+-+-+
0| | | | | | | | |0
 +-+-+-+-+-+-+-+-+
1| | | | | | | | |1
 +-+-+-+-+-+-+-+-+
2| | | | |X| | | |2
 +-+-+-+-+-+-+-+-+
3| | | |X|X| | | |3
 +-+-+-+-+-+-+-+-+
4| | | |O|X| | | |4
 +-+-+-+-+-+-+-+-+
5| | | | | | | | |5
 +-+-+-+-+-+-+-+-+
6| | | | | | | | |6
 +-+-+-+-+-+-+-+-+
7| | | | | | | | |7
 +-+-+-+-+-+-+-+-+
  0 1 2 3 4 5 6 7 
X:4 O:1  O moves next
row:
```
Notice how the board update? This is because Player X has made a VALID move! In this case, the tile that was flipped was the disc at (3,4). Now it is player O's turn. Let's assume player O does not understand how the game works and decides to make a move on (7,7). The system will then print out an update:
```
row: 7
col: 7
O makes move (7,7)

  0 1 2 3 4 5 6 7 
 +-+-+-+-+-+-+-+-+
0| | | | | | | | |0
 +-+-+-+-+-+-+-+-+
1| | | | | | | | |1
 +-+-+-+-+-+-+-+-+
2| | | | |X| | | |2
 +-+-+-+-+-+-+-+-+
3| | | |X|X| | | |3
 +-+-+-+-+-+-+-+-+
4| | | |O|X| | | |4
 +-+-+-+-+-+-+-+-+
5| | | | | | | | |5
 +-+-+-+-+-+-+-+-+
6| | | | | | | | |6
 +-+-+-+-+-+-+-+-+
7| | | | | | | | |7
 +-+-+-+-+-+-+-+-+
  0 1 2 3 4 5 6 7 
X:4 O:1  X moves next
row: 
```
Nothing changed! This is because player O did not make a valid move. 

## Running the Game
First, you will need to find yourself an IDE. We recommend IntelliJ mainly because it was the IDE used to create the game. Once you have downloaded the files and have opened them on an IDE of your choosing, first take notice of all the "OthelloController" files we have created. 
<ol>
  <li>OthelloController</li>
  <li>OthelloControllerOut</li>
  <li>OthelloControllerHumanVSHuman</li>
  <li>OthelloControllerHumanVSRandom</li>
  <li>OthelloControllerHumanVSGreedy</li>
</ol>

Ignore `OthelloController` and `OthelloControllerOut`. These are just the abstract classes for all the other controllers. If you want to play with a friend, you will want to be running `OthelloControllerHumanVSHuman`. 

Otherwise, you may choose between either the random bot or the greedy bot. 
- `OthelloControllerHumanVSRandom` will run a game against a bot programmed to make any randomized valid move during its turn.
- `OthelloControllerHumanVSGreedy` will run a game against a bot programmed to make the best possible move during its turn.

It is up to you to decide which type of game you want to run. Once you have decided, go ahead and run it on your selected IDE! If you are using IntelliJ, you can run it by right-clicking the file and pressing "run OthelloControl....main()"
