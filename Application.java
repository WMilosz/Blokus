package sample;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class Application{

    private Board board;
    private Scene scene;
    private Player player1;
    private Player player2;
    private int playerRound;
    private int blocksIterator;
    private Block lastPickedBlock;
    private GridPane gridPane;
    private Player currentPlayer;

    public Application(Scene scene, GridPane gridPane)
    {
        this.gridPane = gridPane;
        this.blocksIterator = -1;
        this.lastPickedBlock = null;
        this.scene = scene;
        this.gridPane = gridPane;
        this.playerRound = 0;

        this.player1 = new Player(Color.RED, 1);
        this.player2 = new Player(Color.BLUE, 2);
        this.currentPlayer = player1;

        //game board
        board = new Board(gridPane,14, player1, player2);
        board.crateBoard(35);
        board.initTable();

        this.scene.setOnKeyPressed(new EventHandler<javafx.scene.input.KeyEvent>() {
            @Override
            public void handle(javafx.scene.input.KeyEvent event) {
                switch(event.getCode())
                {
                    case Q:
                    {
                        if(currentPlayer.getAmountOfBlocks()>0)
                        {
                            blocksIterator++;
                            Block playerBlock = currentPlayer.getBlocks().elementAt(Math.abs(blocksIterator % currentPlayer.getAmountOfBlocks()));
                            if(lastPickedBlock != null) {
                                board.clearFig(lastPickedBlock);
                                board.refreshBoard();
                            }
                            board.showFig(currentPlayer, playerBlock);
                            lastPickedBlock = playerBlock;
                        }
                        break;
                    }
                    case  E:
                    {
                        if(currentPlayer.getAmountOfBlocks()>0)
                        {
                            blocksIterator--;
                            Block playerBlock = currentPlayer.getBlocks().elementAt(Math.abs(blocksIterator % currentPlayer.getAmountOfBlocks()));
                            if(lastPickedBlock != null) {
                                board.clearFig(lastPickedBlock);
                                board.refreshBoard();
                            }
                            board.showFig(currentPlayer, playerBlock);
                            lastPickedBlock = playerBlock;
                        }
                        break;
                    }
                    case R:
                    {
                        if(lastPickedBlock != null) {
                            board.clearFig(lastPickedBlock);
                            board.rotateBlock(lastPickedBlock);
                            board.showFig(currentPlayer, lastPickedBlock);
                            board.showFig(currentPlayer, lastPickedBlock);
                        }
                        break;
                    }
                    case UP:
                    {
                        if(lastPickedBlock != null)
                        {
                            board.refreshBoard();
                            board.moveFig(currentPlayer,lastPickedBlock,Destination.UP);
                        }
                        break;
                    }
                    case  DOWN:
                    {
                        if(lastPickedBlock != null)
                        {
                            board.refreshBoard();
                            board.moveFig(currentPlayer,lastPickedBlock,Destination.DOWN);
                        }
                        break;
                    }
                    case LEFT:
                    {
                        if(lastPickedBlock != null)
                        {
                            board.refreshBoard();
                            board.moveFig(currentPlayer,lastPickedBlock,Destination.LEFT);
                        }
                        break;
                    }
                    case  RIGHT:
                    {
                        if(lastPickedBlock != null)
                        {
                            board.refreshBoard();
                            board.moveFig(currentPlayer,lastPickedBlock,Destination.RIGHT);
                        }
                        break;
                    }
                    case ENTER:
                    {
                        if(lastPickedBlock != null && board.checkIfClear(lastPickedBlock))
                        {
                            board.putBlock(currentPlayer, lastPickedBlock);
                            board.refreshBoard();
                            currentPlayer.delBlock(lastPickedBlock);
                            lastPickedBlock = null;
                            playerRound++;
                            if(playerRound % 2 == 0)
                                currentPlayer = player1;
                            else
                                currentPlayer = player2;
                        }
                        break;
                    }
                    default:
                    {
                        break;
                    }

                }

            }
        });
    }
}
