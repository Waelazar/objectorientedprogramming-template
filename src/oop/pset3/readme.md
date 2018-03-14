# Rock, Paper, Scissors, Lizard, Spock.
## Problem Description
For those who are nerdy enough to like the Big Bang Theory, this is what happens in an episode. 
> Sheldon, Raj and Leonard are arguing about what to watch on TV. 
> Sheldon suggests Saturn 3. Raj wants Deep Space Nine. 
> Leonard, trying to be funny, suggests Babylon 5 as a compromise. 
> Raj suggests rock, paper, scissors. 
> Sheldon says there is too much chance of a tie, and suggests Rock Paper Scissors Lizard Spock. 
> As they tie anyway, Howard enters wearing an eye-patch; it's his latest technique for picking up chicks. 
> Howard explains that this costume along with his negs (Negative Compliments meant to throw a woman off their game) are all a part of his plan to pick up women. 
> He then tries it on Penny, but miserably fails.

For those who are not nerdy enough, this may indeed sound stupid. But you're now part of this subculture so you'll have to deal with that somehow, sorry!
For those interested, the rest of the episode goes like this:
> Howard accidentally gets the Mars rover stuck in a ditch while trying to impress Stephanie Barnett. 
> Stephanie finds herself more interested in Leonard than Howard and dates Leonard instead. 

Ok enough of this. You'll implement *Rock, Paper, Scissors, Lizard, Spock* in this pset. And for this, we will simply extend the work from the pset2 with polymorphism.
More on this game can be found [here, in a wiki page about Big Bang Theory with almost 1250 pages.](http://bigbangtheory.wikia.com/wiki/Rock_Paper_Scissors_Lizard_Spock).
Oh and in case you're wondering [what Spock is supposed to be](https://en.wikipedia.org/wiki/Vulcan_salute). He's a character from Star Trek that has a funny greeting that goes with "Live Long and Prosper".
## Requirements
* Add some abstractions.
* Make some abstractions more abstract.
* Add some functionality to certain abstractions, while removing it from others. 
* Making this blabla less abstract: Use polymorphism!
* The whole point of this is to *Don't Repeat Yourself* and creating classes from abstract classes that share similar functionality through polymorphism.
## Output
Your output should look something like this:
```
Host - Welcome to the Rock, Scissors, Paper tournament!
Write your move (Rock, Scissors, Paper, Lizard, Spock): rock
The result of this round is.... !
Player 1 move: Rock
Player 2 move: Lizard
Player 1 wins.
Do you want to play again? (y/n): y
Write your move (Rock, Scissors, Paper, Lizard, Spock): scissors
The result of this round is.... !
Player 1 move: Scissors
Player 2 move: Spock
Player 2 wins
Do you want to play again? (y/n): y
Write your move (Rock, Scissors, Paper, Lizard, Spock): spock
The result of this round is.... !
Player 1 move: Spock
Player 2 move: Spock
Nobody wins.
Do you want to play again? (y/n): n
Host - Goodbye!
```
## Constraints
* You're not allowed to change the judge's implementation. The judge shouldn't know who wins, it delegates the decision to the moves.
* The rest of the program shouldn't change. 
* Moves should know themselves if they defeat() another move. Maybe this interface gets another line of code?
## Submission
Go to Moodle -> OOP through Java -> Pset3 and "add submission" with a link to your github repository. 
## Where to start?
* Transform pset2 into Polymorphism. Once you do this, it may take only a few minutes to add two more classes! 
* Check out [the example code on Polymorphism](https://github.com/RefugeesCodeAT/objectorientedprogramming-lectures/tree/master/src/oop/polymorphism)
* Think about what the abstract class from which the five hand gestures come. (here are some more hand gestures, fresh from italy, in case these five are not enough)[https://www.youtube.com/watch?v=5wWhnFgSFMM]
  * it could follow the design principles ["factory"](https://en.wikipedia.org/wiki/Factory_method_pattern) and ["singleton"](https://en.wikipedia.org/wiki/Singleton_pattern)
  * if these wikipedia pages are to abstract (ha!) you can google for good videos and share them on Slack.
### Good luck with pset3!
