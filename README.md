<div align="center">

  # Hangman Word Game

  [![License](https://img.shields.io/badge/License-MIT-lightgrey)](LICENSE)
  ![Status](https://img.shields.io/badge/Status-Completed-success)
  ![Java JDK 8](https://img.shields.io/badge/Java-JDK%208-orange?style=flat&logo=java&logoColor=white)
  [![Developed by Amey Thakur and Mega Satish](https://img.shields.io/badge/Developed%20by-Amey%20Thakur%20%26%20Mega%20Satish-blue.svg)](https://github.com/Amey-Thakur/HANGMAN-WORD-GAME)

  A classic graphical Hangman game implemented using Java Applets and AWT/Swing components.

  **[Project Presentation](http://dx.doi.org/10.13140/RG.2.2.26806.22082)** &nbsp;&middot;&nbsp; **[Source Code](http://dx.doi.org/10.13140/RG.2.2.20095.33446)** &nbsp;&middot;&nbsp; **[Video Demo](https://youtu.be/JsT9KYKPUgs)**

  [![Demo](https://img.youtube.com/vi/JsT9KYKPUgs/0.jpg)](https://youtu.be/JsT9KYKPUgs)

</div>

---

<div align="center">

  [Authors](#authors) &nbsp;·&nbsp; [Overview](#overview) &nbsp;·&nbsp; [Features](#features) &nbsp;·&nbsp; [Structure](#project-structure) &nbsp;·&nbsp; [Quick Start](#quick-start) &nbsp;·&nbsp; [Results](#results-gallery) &nbsp;·&nbsp; [License](#license) &nbsp;·&nbsp; [About](#about-this-repository) &nbsp;·&nbsp; [Acknowledgments](#acknowledgments)

</div>

---

<!-- AUTHORS -->
<div align="center">

  ## Authors

  **Terna Engineering College | Computer Engineering | Batch of 2022**

  <table>
  <tr>
  <td align="center">
  <a href="https://github.com/Amey-Thakur">
  <img src="https://github.com/Amey-Thakur.png" width="150px;" alt="Amey Thakur"/><br />
  <sub><b>Amey Thakur</b></sub>
  </a>
  </td>
  <td align="center">
  <a href="https://github.com/msatmod">
  <img src="https://raw.githubusercontent.com/Amey-Thakur/HANGMAN-WORD-GAME/main/Mega/Mega.png" width="150px;" alt="Mega Satish"/><br />
  <sub><b>Mega Satish</b></sub>
  </a>
  </td>
  </tr>
  </table>

  *Special thanks to [Mega Satish](https://github.com/msatmod) for her meaningful contributions, guidance, and support that helped shape this work.*

</div>

---

<!-- OVERVIEW -->
## Overview

This project implements the classic Hangman word guessing game using Java Applets. It features a graphical user interface built with AWT and Swing components, providing an interactive experience where players guess words to save a stick figure from the gallows.

**Key Components:**
- Java Applet & AWT/Swing for GUI
- Event handling for keyboard and mouse interactions
- Custom drawing and animation for the hangman figure
- Object-Oriented Design

---

<!-- FEATURES -->
## Features

| Feature | Description |
|---------|-------------|
| **Graphical Interface** | Visual representation of gallows and hangman |
| **Word Database** | Predefined list of programming languages to guess |
| **Interactive Controls** | Mouse support for logic and keyboard for guessing |
| **Win/Loss States** | Clear visual feedback for game outcomes |
| **Animations** | Simple animation for the "hanging" sequence |

---

<!-- STRUCTURE -->
## Project Structure

```
HANGMAN-WORD-GAME/
│
├── Source Code/                     # Java Source Files
│   └── Mega.java                    # Main Game Logic
│
├── Mini Project/                    # Documentation & Reports
│   ├── WordGame.pdf                 # Comprehensive Project Report
│   ├── WordGame.pptx                # Technical Presentation
│   ├── Applet.mp4                   # Gameplay Video Demonstration
│   └── Outputs/                     # Visual Results (19 Screenshots)
│
├── Mega/                            # Game & Media Assets
│   ├── Mega.png                     # Author Profile Image
│   └── (Other Assets...)            # Project-related Media
│
├── docs/                            # Project Documentation
│   └── SPECIFICATION.md             # Formal Technical Specification
│
├── LICENSE                          # MIT License
├── CITATION.cff                     # Citation Metadata
├── SECURITY.md                      # Security Policy & Posture
├── codemeta.json                    # Project Metadata (JSON-LD)
└── README.md                        # Project Documentation
```

---

<!-- QUICK START -->
## Quick Start

### Prerequisites
- **Java Development Kit (JDK 8)** is required for Applet support.
- **AppletViewer** or a compatible browser plugin.

### Installation & Execution

1. **Clone the Repository**
   ```bash
   git clone https://github.com/Amey-Thakur/HANGMAN-WORD-GAME.git
   cd "HANGMAN-WORD-GAME"
   ```

2. **Compile the Main Class**
   Navigate to the source directory and compile:
   ```bash
   cd "Source Code"
   javac Mega.java
   ```

3. **Run the Application**
   Use `appletviewer` with a simple HTML entry point. Create a file named `index.html` in the same folder:
   ```html
   <!-- index.html -->
   <applet code="Mega.class" width="1000" height="625"></applet>
   ```
   
   Execute using the following command:
   ```bash
   appletviewer index.html
   ```

---

<!-- RESULTS -->
## Results Gallery

<div align="center">

  ### Welcome Message
  ![Welcome Message](Mini%20Project/Outputs/Welcome_Message.png)

  ### Instructions Message
  ![Instructions Message](Mini%20Project/Outputs/Instructions_Message.png)

  ### Hint Message
  ![Hint Message](Mini%20Project/Outputs/Hint_Message.png)

  ### Player Name Input
  ![Player Name Input](Mini%20Project/Outputs/Player_Name_Input.png)

  ### Game Screen
  ![Game Screen](Mini%20Project/Outputs/Game_Screen.png)

  ### Input Window
  ![Input Window](Mini%20Project/Outputs/Input_Window.png)

  ### Input Answer
  ![Input Answer](Mini%20Project/Outputs/Input_Answer.png)

  ### Missed 1
  ![Missed 1](Mini%20Project/Outputs/Missed_1.png)

  ### Missed 2
  ![Missed 2](Mini%20Project/Outputs/Missed_2.png)

  ### Missed 3
  ![Missed 3](Mini%20Project/Outputs/Missed_3.png)

  ### Missed 4
  ![Missed 4](Mini%20Project/Outputs/Missed_4.png)

  ### Missed 5
  ![Missed 5](Mini%20Project/Outputs/Missed_5.png)

  ### Missed 6
  ![Missed 6](Mini%20Project/Outputs/Missed_6.png)

  ### Hanging Animation - Phase 1
  ![Missed 7.1](Mini%20Project/Outputs/Missed_7.1.png)

  ### Hanging Animation - Phase 2
  ![Missed 7.2](Mini%20Project/Outputs/Missed_7.2.png)

  ### Hanging Animation - Phase 3
  ![Missed 7.3](Mini%20Project/Outputs/Missed_7.3.png)

  ### Win (Game Screen)
  ![Win](Mini%20Project/Outputs/Win.png)

  ### Win (Input Window)
  ![Input Win](Mini%20Project/Outputs/Input_Win.png)

  ### Lose
  ![Lose](Mini%20Project/Outputs/Lose.png)

</div>

---

<!-- LICENSE -->
## License

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.

**Summary**: You are free to share and adapt this content for any purpose, even commercially, as long as you provide appropriate attribution to the original author.

**Copyright © 2019** [Amey Thakur](https://github.com/Amey-Thakur), [Mega Satish](https://github.com/msatmod)

---

<!-- ABOUT -->
## About This Repository

**Created & Maintained by**: [Amey Thakur](https://github.com/Amey-Thakur) & [Mega Satish](https://github.com/msatmod)  
**Academic Journey**: Bachelor of Engineering in Computer Engineering (2018-2022)  
**Institution**: [Terna Engineering College](https://ternaengg.ac.in/), Navi Mumbai  
**University**: [University of Mumbai](https://mu.ac.in/)

This project features the Hangman Word Game, a graphical Java application developed as a 3rd-semester mini-project for the Object-Oriented Programming Methodology (OOPM) course. It showcases the practical application of core Java concepts, graphics programming, and user-centric design.

**Connect**: [GitHub](https://github.com/Amey-Thakur) · [LinkedIn](https://www.linkedin.com/in/amey-thakur)

### Acknowledgments

Grateful acknowledgment to **[Mega Satish](https://github.com/msatmod)** for her pivotal role and collaborative excellence during the development of this project. Her intellectual contributions, technical insights, and dedicated commitment to software quality were fundamental in achieving the project's analytical and functional objectives. This technical record serves as a testament to her scholarly partnership and significant impact on the final implementation.

Special thanks to the faculty members of the Department of Computer Engineering at Terna Engineering College for their guidance during the course of this project. Gratitude is also extended to the mentors and peers who supported this learning endeavor.

---

<!-- =========================================================================================
                                     FOOTER SECTION
     ========================================================================================= -->
<div align="center">

  [↑ Back to Top](#hangman-word-game)

  [Authors](#authors) &nbsp;·&nbsp; [Overview](#overview) &nbsp;·&nbsp; [Features](#features) &nbsp;·&nbsp; [Structure](#project-structure) &nbsp;·&nbsp; [Quick Start](#quick-start) &nbsp;·&nbsp; [Results](#results-gallery) &nbsp;·&nbsp; [License](#license) &nbsp;·&nbsp; [About](#about-this-repository) &nbsp;·&nbsp; [Acknowledgments](#acknowledgments)

  <br>

  🔬 **[OOPM Laboratory](https://github.com/Amey-Thakur/OOPM-JAVA-LAB)** &nbsp;·&nbsp; 🎮 **[Game Repository](https://github.com/Amey-Thakur/HANGMAN-WORD-GAME)**

  ---

  ### 🎓 [Computer Engineering Repository](https://github.com/Amey-Thakur/COMPUTER-ENGINEERING)

  **Computer Engineering (B.E.) - University of Mumbai**

  *Semester-wise curriculum, laboratories, projects, and academic notes.*

</div>
