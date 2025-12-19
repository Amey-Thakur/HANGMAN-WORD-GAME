<!-- HEADER -->
<div align="center">

  # Hangman Word Game (Source Code)

  ### Java Applet Implementation · AWT/Swing Graphics

  [![Source File](https://img.shields.io/badge/📂-Mega.java-orange.svg)](Mega.java)
  [![JDK Version](https://img.shields.io/badge/JDK-8-blue.svg)](https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html)
  [![Build Status](https://img.shields.io/badge/Status-Review--Ready-green.svg)](Mega.java)

  **The core logic and graphical implementation of the Hangman Word Game, optimized for educational review.**

</div>

---

<!-- NAVIGATION -->
<div align="center">

  **[💻 Codebase](#-codebase)** &nbsp;·&nbsp; **[🚀 How to Run](#-how-to-run)** &nbsp;·&nbsp; **[🛠️ Technologies](#-technologies)** &nbsp;·&nbsp; **[📁 Project Home](../../README.md)**

</div>

---

<!-- CODEBASE -->
## 💻 Codebase

| File | Description |
| :--- | :--- |
| [**Mega.java**](Mega.java) | **Main Game Engine**: Contains the Applet initialization, game state logic, event handlers (keyboard/mouse), and custom rendering (`paint` method) for the game environment. |

### Technical Highlights:
- **Clean Structure**: Refactored logic for improved readability.
- **Detailed Comments**: Javadoc-compliant documentation for all methods and variables.
- **Graphical Fidelity**: Custom-drawn gallows and hangman progression with a color-fading animation.

---

<!-- HOW TO RUN -->
## 🚀 How to Run

### Prerequisites
- **JDK 8**: Required for native Applet support.
- **Command Line**: Terminal or PowerShell.

### Compilation and Execution

1. **Compile the Java File**
   ```bash
   javac Mega.java
   ```

2. **Create a Run Script (HTML)**
   Since Applets are browser-based, create a file named `index.html` in this directory:
   ```html
   <html>
   <head><title>Hangman Game</title></head>
   <body>
       <applet code="Mega.class" width="1000" height="625"></applet>
   </body>
   </html>
   ```

3. **Launch the Game**
   Execute using the `appletviewer` tool:
   ```bash
   appletviewer index.html
   ```

---

<!-- TECHNOLOGIES -->
## 🛠️ Technologies

- **Java Development Kit 8**: Core platform.
- **AWT (Abstract Window Toolkit)**: Used for graphics rendering and event handling.
- **Swing**: Utilized for user-input dialogs (`JOptionPane`).
- **Java Applets**: The fundamental wrapper for the graphical lifecycle.

---

<!-- FOOTER -->
<div align="center">

  **[⬆ Back to Top](#hangman-word-game-source-code)** &nbsp;·&nbsp; **[🏠 Project Home](../../README.md)** &nbsp;·&nbsp; **[📄 Documentation](../../Mini%20Project)**

  <br>

  **[🎮 Hangman Word Game](https://github.com/Amey-Thakur/HANGMAN-WORD-GAME)**

</div>

---

<div align="center">

  ### 🎓 [Computer Engineering Repository](https://github.com/Amey-Thakur/COMPUTER-ENGINEERING)

  **Computer Engineering (B.E.) - University of Mumbai**

  *Semester-wise curriculum, laboratories, projects, and academic notes.*

</div>
