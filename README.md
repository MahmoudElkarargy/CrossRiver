# CrossRiver
(college project) IQ Logic Puzzles require you to get all of the characters across a river in a small boat. It’s fully animated with a 2D graphics and Audio files, using online designs and editing them using Adobe illustrator. The user have the verity of choosing the characters to play with and also the game mode.




**Problem Description:
        River Crossing IQ Logic Puzzles require you to get all of the characters(crossers) across a river in a small boat. The boat can cross the river many times to get anyone across. In our game each character(crosser) has some properties, the most important are:
        ● Weight​: This property represents the weight of a crosser.
        ● Eating Rank​: This property represents the eating rank of a crosser. Crossers with higher
        eating ranks can eat crossers with lower eating ranks.
        We have three major categories of crossers in our game(farmers, animals, plants). Farmers don’t eat any crosser, can’t be eaten by any crosser and can raft the boat. Animals and plants cannot raft the boat. There are two major types of animals (carnivorous and herbivorous). Carnivorous can only eat herbivorous but can’t eat plants. Herbivorous can only eat plants. This game has many challenging stories, for this assignment you have to implement at least 2 stories.
        **Story1:
        “A farmer wants to cross a river and take with him a carnivorous, a herbivorous and
        plant.”
        Rules:
        1.​ ​The farmer is the only one who can sail the boat. He can only take one passenger, in addition to himself.
        2.​ ​You can not leave any two crossers on the same bank if they can harm(eat) each other
        How can the farmer get across the river with all the 2 animals and the plant without any losses?

**Story2:
    “Four farmers and their animal need to cross a river in a small boat. The weights of the farmers are 90 kg, 80 kg,60 kg and 40 kg respectively, and the weight of the animal is 20 kg.”
    Rules:
    1.​ ​The boat cannot bear a load heavier than 100 kg.
    2.​ ​All farmers can raft, while the animal cannot.
    How can they all get to the other side with their animal?


**2) Tasks:
1) Implement the ​ICrosser​ interface to represent the entities which will cross the river
e.g. Persons, Animals and Plants, and make sure you have logical assumptions. ​You
must create at least two animals of each category​.
2) Implement the ​IGameController​ interface to be the game engine
3) Each Level must implement the interface ​ICrossingStrategy
4) You must use the ​first four​ design patterns at least, for example:
○ Singleton
○ Command
○ Strategy
○ MVC
○ Observer
○ Factory
○ Snapshot (Memento)
○ Iterator
5) Design user friendly GUI for this game, which uses only the controller that implements the ​IGameController ​interface.
6) This user interface must have:
○ Levels menu at the beginning of the game, enables the user to choose which
story to play
○ Label showing score for the current game, the score is the number of boat
crosses
○ Two riverbanks with characters on them, addition to the boat
○ User can select any character to ride the boat
○ Undo & Redo for all user sails (i.e. complete sail from one bank to another)
○ User can save the game, and load it any time later
○ New game, reset, and exit game options
○ Show instructions of the current level
○ Showing alert when the user move is invalid
7) For saving & loading the game
○ Save your game state in XML files
○ You should use SAX or DOM, or StAX parsers to write & read the XML files
8) Bonus points:
○ (Bonus) Solve button, which solves the puzzle for the user, no need to solve it in
minimum number of steps, but make sure that your algorithm finds a solution
○ Implementing more design patterns than the mandatory ones
○ Extra Bonus for implementing all the suggested design patterns
○ Implementing extra level(s) from your design
○ Good UI design for the game
