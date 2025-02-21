# Adding an Entry

## Outer `if` Statement

Let's break down the conceptual meaning of the control in this `if` statement:

> ***The real question boils down to, "when can we really add an entry?"***
> 1. ***When the scoreboard is not full***
> 2. ***When the scoreboard is full, but we can check the last entry.***

```java

if(numEntries < board.length || newScore > board[numEntries − 1].getScore()) {
    // Code to execute if the condition is true
}

```

### Understanding the Conditions:

1. **`numEntries < board.length`**:
    - **Concept**: This part checks if the number of entries is less than the length of the `board` array.
    - **Purpose**: This condition might be used to ensure that there's still space in the `board` array to add a new entry.

2. **`newScore > board[numEntries − 1].getScore()`**:
    - **Concept**: This part checks if the `newScore` is greater than the score of the last entry in the `board` array.
    - **Purpose**: This condition might be used to determine if the new score is high enough to replace the lowest score currently on the board.

### Logical OR (`||`):

The `||` operator means that if either of the conditions is true, the code block inside the `if` statement will execute. This can be understood as an "OR" condition:

- If there is still space to add a new entry (`numEntries < board.length`), the code block will execute.
- OR, if the new score is higher than the lowest score on the board (`newScore > board[numEntries − 1].getScore()`), the code block will also execute.

### Conceptual Meaning:

In summary, the `if` statement ensures that the subsequent code will run if there is either space available on the board for a new entry or if the new score is higher than the lowest score currently on the board. This kind of logic is typical in situations like maintaining a leaderboard or high score list, where you only want to add or replace entries based on certain criteria.

Does that clear things up? Let me know if you need any further explanation or examples!

## Inner `if` and `while` Statement

> The thing comes down to defining the two conditions separately.

Sure, let's break down the inner `if` and `while` statements in the context of adding a new high score to a leaderboard.

### Inner `if` Statement:

```java
if (numEntries < board.length) // no score drops from the board
    numEntries++; // so overall number increases
```

#### Concept:
- **Condition**: Checks if the current number of entries (`numEntries`) is less than the length of the leaderboard array (`board`).
- **Purpose**: This is used to determine if there is still room to add a new score without removing any existing scores.
- **Action**: If there is room, it increments `numEntries`, indicating that a new entry will be added, thus increasing the total number of scores on the leaderboard.

### Inner `while` Statement:

```java
int j = numEntries - 1;
while (j > 0 && board[j - 1].getScore() < newScore) {
    board[j] = board[j - 1]; // shift entry from j-1 to j
    j--; // and decrement j
}
board[j] = e; // when done, add new entry
```

#### Concept:
- **Initialization**: `int j = numEntries - 1;`
   - **Purpose**: Start from the position where the new entry would be placed if it is to be added (initially set to the last position of the array).

- **Condition**: `while (j > 0 && board[j - 1].getScore() < newScore)`
   - **Purpose**: The loop continues as long as `j` is greater than 0 and the score at position `j-1` is less than the new score.
   - **Action**: This ensures that the lower scores are shifted right to make space for the new higher score.

- **Body**:
   - **Shifting Scores**: `board[j] = board[j - 1];`
      - **Purpose**: Shift the score at position `j-1` to position `j` to create an empty spot for the new score.
   - **Decrement**: `j--;`
      - **Purpose**: Move the index `j` one position to the left.

- **Inserting New Score**: `board[j] = e;`
   - **Purpose**: Once the correct position is found (when the loop condition fails), the new entry (`e`) is placed in the correct position on the leaderboard.

### Combined Logic Flow:
1. **Outer `if`**: Determines if there is space on the board or if the new score qualifies to replace the lowest score.
2. **Inner `if`**: Checks if there is an available slot on the board. If so, increases the total number of entries (`numEntries`).
3. **Inner `while`**: Shifts lower scores to the right to make space for the new high score by moving higher scores left until the correct position is found for the new score.
4. **Insertion**: Places the new score in its appropriate position on the board.

This ensures that the leaderboard always maintains the highest scores in a sorted order, making room for new high scores as necessary.
