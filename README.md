# Polling System

## Overview
This Java program allows users to create and manage polls interactively via the console. Users can enter a poll title, add multiple options, and cast votes. The program also supports displaying all created polls and their options.

## Requirements
Java Development Kit (JDK) 8 or higher

## Components
The program consists of three main classes:

-Main: The entry point of the application.
-Poll: A class representing an individual poll.
-PollManager: A class for managing multiple polls.

## Notes
The program uses the Scanner class for user input, which is closed automatically using the try-with-resources statement.
A random vote is added to one of the poll options for demonstration purposes. This can be customized or removed as needed.
The Poll class uses a HashMap to store options and their respective votes, allowing efficient look-up and modification.
