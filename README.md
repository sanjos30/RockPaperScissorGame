# Rock Paper Scissor Game

Rock Paper Scissors is a hand game played between two people, where each player simultaneously forms one of three shapes with their hand: a rock (fist), paper (open hand), or scissors (index and middle fingers extended to form a V). The winner is determined by the rules: rock beats scissors, scissors beat paper, and paper beats rock. The game is often used as a playful way of making decisions or settling disputes. It is a simple and popular game that can be played by people of all ages.

# Rules

The rules of Rock Paper Scissors are simple:

Rock beats Scissors: The rock crushes the scissors.
Scissors beat Paper: The scissors cut the paper.
Paper beats Rock: The paper covers the rock.
In other words, if both players make the same choice, it's a tie. Otherwise, the winner is determined by the above hierarchy. Players usually count to three and then simultaneously display one of the three hand gestures, either rock, paper, or scissors.

For example, if one player shows a rock and the other shows scissors, the player with the rock wins. If one player shows paper and the other shows scissors, the player with the scissors wins. And if one player shows a rock and the other shows paper, the player with the paper wins.

The game is often played in a best-of-three or best-of-five format, where the first player to win a set number of rounds is declared the winner.


# What's implemented in this program?

Using this program, a player can play against a computer by starting a tournament.

The computer program initiates the total number of games in the tournament and also keeps a track of the winner.

The program also simulates the opponent and makes appropriate moves.

# Prerequisites:

The program can be run using Docker or standalone Java/Gradle.

Docker 20 or above

OR

Gradle 6.3 or above, 
Java 1.8 or above


# Setup Instructions


### Run with Docker

1.  Clone the project to a local workspace directory
    >git clone https://github.com/sanjos30/hirer-coding-challenge.git
2.  cd to the working directory
    >cd hirer-coding-challenge
3.  docker build
    >docker build . -t hirer-coding-challenge
4. docker run
   >docker run -it hirer-coding-challenge
5. Alternatively, run docker build & run in one command
   >docker build . -t hirer-coding-challenge && docker run -it hirer-coding-challenge


### Run without Docker (Need Java & Gradle) 
1.  Clone the project to a local workspace directory
    >git clone https://github.com/sanjos30/hirer-coding-challenge.git
2.  cd to the working directory
    >cd hirer-coding-challenge
3.  gradle clean build
    >gradle clean build
4.  gradle run
    >gradle run



# HOW TO PLAY

The following questions are asked

1. ENTER TOTAL NUMBER OF GAMES IN THIS TOURNAMENT OF ROCK PAPER SCISSOR:
    >enter the total number of games you wish to play against the computer. e.g. 5
2. PLAYER TURN
    >enter 0 to select a ROCK, 1 to select a PAPER, 2 to select a ROCK. 
    >9 to EXIT the program
3. PLAY THE GAMES FOR THE NUMBER OF GAMES YOU SELECTED IN THE TOURNAMENT
    >repeat step 2 until finished
4. WINNER IS DISPLAYED UNDER TOURNAMENT SCORE SUMMARY SECTION
    >e.g WON: COMPUTER
5. TOURNAMENT GAMES SCORE SECTION DISPLAYS THE RESULT AND MOVES OF ALL THE ATTEMPTS

