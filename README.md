<div align="center">

  # Hangman Word Game

  ![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=java&logoColor=white)
  [![License](https://img.shields.io/badge/License-MIT-green?style=flat&logo=opensourceinitiative&logoColor=white)](LICENSE)
  [![Developed by](https://img.shields.io/badge/Developed%20by-Amey%20Thakur-blue.svg)](https://github.com/Amey-Thakur)

  A classic graphical Hangman game implemented using Java Applets and AWT/Swing components.

  **[Project Presentation](http://dx.doi.org/10.13140/RG.2.2.26806.22082)** • **[Source Code](http://dx.doi.org/10.13140/RG.2.2.20095.33446)** • **[Video Demo](https://youtu.be/JsT9KYKPUgs)**

  [![Demo](https://img.youtube.com/vi/JsT9KYKPUgs/0.jpg)](https://youtu.be/JsT9KYKPUgs)

</div>

---

<div align="center">

  [👥 Authors](#authors) &nbsp;·&nbsp; [📖 Overview](#overview) &nbsp;·&nbsp; [✨ Features](#features) &nbsp;·&nbsp; [📁 Structure](#project-structure) &nbsp;·&nbsp; [🚀 Quick Start](#quick-start) &nbsp;·&nbsp; [🖼️ Results](#results-gallery) &nbsp;·&nbsp; [📜 License](#license) &nbsp;·&nbsp; [ℹ️ About](#about-this-repository) &nbsp;·&nbsp; [🙏 Acknowledgments](#acknowledgments)

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
  <td align="center">
  <a href="https://www.linkedin.com/in/saakshideokar/">
  <img src="https://raw.githubusercontent.com/Amey-Thakur/HANGMAN-WORD-GAME/main/Mega/Saakshi.png" width="150px;" alt="Saakshi Deokar"/><br />
  <sub><b>Saakshi Deokar</b></sub>
  </a>
  </td>
  </tr>
  </table>

  *Special thanks to [Mega Satish](https://github.com/msatmod) and [Saakshi Deokar](https://www.linkedin.com/in/saakshideokar/) for their meaningful contributions, guidance, and support that helped shape this work.*

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
├── Source Code/                  # Java Source Files
│   └── Mega.java                 # Main Applet Class
│
├── Mini Project/                 # Documentation & Reports
│   ├── WordGame.pdf              # Project Report
│   ├── WordGame.pptx             # Presentation
│   ├── Applet.mp4                # Video Demo
│   └── Outputs/                  # Screenshots
│
├── Mega/                         # Game Assets (Images)
│
├── LICENSE                       # MIT License
└── README.md                     # This file
```

---

<!-- QUICK START -->
## Quick Start

### Prerequisites
- JDK 8 or higher (with Applet support or AppletViewer)

### Running the Game

1. **Clone the repository**
   ```bash
   git clone https://github.com/Amey-Thakur/HANGMAN-WORD-GAME.git
   cd HANGMAN-WORD-GAME/Source\ Code
   ```

2. **Compile the code**
   ```bash
   git checkout main
   javac Mega.java
   ```

3. **Run using AppletViewer**
   Create a simple HTML file `run.html`:
   ```html
   <applet code="Mega.class" width=1000 height=625></applet>
   ```

   Run it:
   ```bash
   appletviewer run.html
   ```

---

<!-- RESULTS -->
## Results Gallery

<div align="center">

  ### Startup Dialogs
  
  <table>
  <tr>
  <td align="center"><b>Welcome</b><br/><img src="Mini Project/Outputs/Welcome_Message.png" width="300"/></td>
  <td align="center"><b>Goal</b><br/><img src="Mini Project/Outputs/Instructions_Message.png" width="300"/></td>
  <td align="center"><b>Hint</b><br/><img src="Mini Project/Outputs/Hint_Message.png" width="300"/></td>
  </tr>
  <tr>
  <td align="center"><b>Player Registration</b><br/><img src="Mini Project/Outputs/Player_Name_Input.png" width="300"/></td>
  <td colspan="2" align="center"><b>Game Interface</b><br/><img src="Mini Project/Outputs/Game_Screen.png" width="600"/></td>
  </tr>
  </table>

  ### Gameplay Interaction
  
  <table>
  <tr>
  <td align="center"><b>Input Prompt</b><br/><img src="Mini Project/Outputs/Input_Window.png" width="400"/></td>
  <td align="center"><b>Submitting Answer</b><br/><img src="Mini Project/Outputs/Input_Answer.png" width="400"/></td>
  </tr>
  </table>

  ### Evolution of the Hangman (Misses 1-6)

  ````carousel
  ![1 Miss](Mini Project/Outputs/Missed_1.png)
  <!-- slide -->
  ![2 Misses](Mini Project/Outputs/Missed_2.png)
  <!-- slide -->
  ![3 Misses](Mini Project/Outputs/Missed_3.png)
  <!-- slide -->
  ![4 Misses](Mini Project/Outputs/Missed_4.png)
  <!-- slide -->
  ![5 Misses](Mini Project/Outputs/Missed_5.png)
  <!-- slide -->
  ![6 Misses](Mini Project/Outputs/Missed_6.png)
  ````

  ### The Hanging Animation (Final Miss)

  ````carousel
  ![Phase 1](Mini Project/Outputs/Missed_7.1.png)
  <!-- slide -->
  ![Phase 2](Mini Project/Outputs/Missed_7.2.png)
  <!-- slide -->
  ![Phase 3](Mini Project/Outputs/Missed_7.3.png)
  ````

  ### Game Outcomes

  <table>
  <tr>
  <td align="center"><b>Victory (In-Game)</b><br/><img src="Mini Project/Outputs/Win.png" width="400"/></td>
  <td align="center"><b>Victory (Dialog)</b><br/><img src="Mini Project/Outputs/Input_Win.png" width="400"/></td>
  </tr>
  <tr>
  <td colspan="2" align="center"><b>Defeat</b><br/><img src="Mini Project/Outputs/Lose.png" width="800"/></td>
  </tr>
  </table>

</div>

---

<!-- LICENSE -->
## License

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.

**Summary**: You are free to share and adapt this content for any purpose, even commercially, as long as you provide appropriate attribution to the original author.

**Copyright © 2019** [Amey Thakur](https://github.com/Amey-Thakur), [Mega Satish](https://github.com/msatmod), Saakshi Deokar

---

<!-- ABOUT -->
## About This Repository

**Created & Maintained by**: [Amey Thakur](https://github.com/Amey-Thakur)  
**Academic Journey**: Bachelor of Engineering in Computer Engineering (2018-2022)  
**Institution**: [Terna Engineering College](https://ternaengg.ac.in/), Navi Mumbai  
**University**: [University of Mumbai](https://mu.ac.in/)

This repository features the Hangman Word Game, a graphical Java application developed as a 3rd-semester mini-project for the Object-Oriented Programming Methodology (OOPM) course. It showcases the practical application of core Java concepts, graphics programming, and user-centric design.

**Connect**: [GitHub](https://github.com/Amey-Thakur) · [LinkedIn](https://www.linkedin.com/in/amey-thakur)

### Acknowledgments

Grateful acknowledgment to **[Mega Satish](https://github.com/msatmod)** and **[Saakshi Deokar](https://www.linkedin.com/in/saakshideokar/)** for their collaboration on this mini-project. Their meaningful contributions, guidance, and support were instrumental in shaping this work.

Special thanks to the faculty members of the Department of Computer Engineering at Terna Engineering College for their guidance during the course of this project. Gratitude is also extended to the mentors and peers who supported this learning endeavor.

---

<!-- FOOTER -->
<div align="center">

  **[⬆ Back to Top](#hangman-word-game)** &nbsp;·&nbsp; [👥 Authors](#authors) &nbsp;·&nbsp; [📖 Overview](#overview) &nbsp;·&nbsp; [✨ Features](#features) &nbsp;·&nbsp; [📁 Structure](#project-structure) &nbsp;·&nbsp; [🚀 Quick Start](#quick-start) &nbsp;·&nbsp; [🖼️ Results](#results-gallery) &nbsp;·&nbsp; [📜 License](#license) &nbsp;·&nbsp; [ℹ️ About](#about-this-repository) &nbsp;·&nbsp; [🙏 Acknowledgments](#acknowledgments)

  <br>

  **[🧪 OOPM Laboratory](https://github.com/Amey-Thakur/OOPM-JAVA-LAB)** &nbsp;·&nbsp; **[🎮 Hangman Word Game (Mini Project)](https://github.com/Amey-Thakur/OOPM-JAVA-LAB/tree/main/OOPM%20Mini%20Project)** &nbsp;·&nbsp; **[🔗 Game Repository](https://github.com/Amey-Thakur/HANGMAN-WORD-GAME)**

</div>

---

<div align="center">

  ### 🎓 [Computer Engineering Repository](https://github.com/Amey-Thakur/COMPUTER-ENGINEERING)

  **Computer Engineering (B.E.) - University of Mumbai**

  *Semester-wise curriculum, laboratories, projects, and academic notes.*

</div>
 
