This is a simple command-line Rock Paper Scissors game written in Java. The user plays against the computer, and the first to win the round is declared the winner!

📋 Features
Play Rock, Paper, Scissors against the computer

Random computer moves

Input validation for incorrect choices

Simple, interactive CLI interface

🚀 Getting Started
Prerequisites
Java JDK installed (version 8 or later)

Text editor or IDE (e.g., VS Code, IntelliJ IDEA)

🛠 How to Run
Clone the repository or copy the code file.

Open your terminal/command prompt.

Compile the program:

bash
Copy
Edit
javac RockPaperScissors.java
Run the program:

bash
Copy
Edit
java RockPaperScissors
Follow the on-screen instructions to play!

💻 Sample Code Snippet
java
Copy
Edit
Scanner scanner = new Scanner(System.in);
Random random = new Random();
String[] options = {"Rock", "Paper", "Scissors"};
🧠 How It Works
The user is prompted to choose between Rock (0), Paper (1), or Scissors (2).

The computer randomly selects one of the three options.

The winner is determined based on the classic rules:

Rock beats Scissors

Scissors beats Paper

Paper beats Rock

The result is displayed and the game can be repeated.

📦 Example Output
java
Copy
Edit

Enter your choice (0 = Rock, 1 = Paper, 2 = Scissors): 1
Computer chose Rock
You win!

🧑‍💻 Author
Developed by Mohit Pandey
Java Developer | Learner | Enthusiast
