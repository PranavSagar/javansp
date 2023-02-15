# EVENT MANAGEMENT SYSTEM

The code is a Java program that creates a user interface for a Lab Entry Pass registration. The interface is created using the Swing library, 
and it includes text fields, buttons, and labels for the user to input and display data. The program is connected to a SQLite database to store user information.
When the user clicks the "Create a pass" button, the program retrieves the information from the text fields, validates the mobile number,
and stores the data in the database. If the data is successfully stored, the program displays a message confirming that the pass has been created.
If the mobile number is invalid or the data already exists in the database,  
the program displays an appropriate error message. The program also includes a "show" button, but its function is not included in the code provided.  


The code is a Java program that creates a graphical user interface (GUI) using Swing library to display data from a SQLite database. 
The program defines a JFrame window, a JButton, and a JTextArea component, and adds them to a JPanel. The GUI is displayed when the main method is executed.

The program also implements the ActionListener interface to handle button clicks. When the user clicks the "show" button, the program uses JDBC to connect to a SQLite database and execute a SQL SELECT statement on a table named "section". The ResultSet is iterated through to retrieve the data from the table and displayed on the JTextArea. The database connection and other resources are properly closed using try-with-resources.
