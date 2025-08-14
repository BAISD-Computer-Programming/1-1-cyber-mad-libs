# Assignment: Cyber Mad Libs – Java Variables & Scanner

## Objective
In this assignment, you will practice **declaring variables** and **collecting user input** using the `Scanner` class.  
You will fill in the blanks of a pre-written story with your own values to create a fun, cybersecurity-themed Mad Libs.

---

## Instructions

### 1. Open the Provided Java File
Download and open `CyberMadLibs.java` from GitHub Classroom in VS Code.

### 2. Declare the Variables
At the top of the `main` method, declare the following variables exactly as shown (names must match):

String adjective;
String verb;
String nounServer;
String pluralNoun;
String techTerm;
String exclamationPhrase;

### 3. Prompt for Input
Use Scanner to ask the user for each value.

Example:
System.out.print("Enter an adjective (e.g., glitchy): ");

adjective = in.nextLine();

Repeat for verb, nounServer, pluralNoun, techTerm, and exclamationPhrase.

### 4. Story Output
The story is already written for you and uses the variables you just created.  
Do not change the story text—your job is to make sure the program compiles and outputs a complete sentence.

When run, it should look like this:

Enter an adjective (e.g., glitchy): glitchy  
Enter a verb: hack  
Enter a type of server: server  
Enter a plural noun: pixels  
Enter a tech term: firewall  
Enter an exclamation phrase: Quick! Deploy the backup spaghetti code!  

Your story:  
It was a glitchy day in the Code Dojo. I was about to hack my server when suddenly the pixels crashed into the firewall. My instructor yelled, "Quick! Deploy the backup spaghetti code!"

---

## 💯 Grading Rubric
| Criteria | Points |
|----------|--------|
| Correct variable names and data types | 5 |
| All 6 prompts present and functioning | 5 |
| Uses Scanner correctly for all inputs | 5 |
| Program compiles without errors | 5 |
| Output matches story format exactly | 5 |

**Total:** 25 points

---

## Submission
1. Push your completed Java file to your GitHub Classroom repository.  
2. Verify that it compiles and runs before submission.  
