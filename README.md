<div align="center">

  # Hangman Word Game

  [![License](https://img.shields.io/badge/License-MIT-lightgrey)](LICENSE)
  ![Status](https://img.shields.io/badge/Status-Completed-success)
  ![Java JDK 8](https://img.shields.io/badge/Java-JDK%208-orange?style=flat&logo=java&logoColor=white)
  [![Developed by Amey Thakur and Mega Satish](https://img.shields.io/badge/Developed%20by-Amey%20Thakur%20%26%20Mega%20Satish-blue.svg)](https://github.com/Amey-Thakur/HANGMAN-WORD-GAME)

  A classic graphical Hangman game implemented using Java Applets and AWT/Swing components.

  **[Project Presentation](http://dx.doi.org/10.13140/RG.2.2.26806.22082)** &nbsp;·&nbsp; **[Source Code](http://dx.doi.org/10.13140/RG.2.2.20095.33446)** &nbsp;·&nbsp; **[Technical Specification](docs/SPECIFICATION.md)** &nbsp;·&nbsp; **[Video Demo](https://youtu.be/JsT9KYKPUgs)**

  [![Demo](https://img.youtube.com/vi/JsT9KYKPUgs/0.jpg)](https://youtu.be/JsT9KYKPUgs)

</div>

---

<div align="center">

  [Authors](#authors) &nbsp;·&nbsp; [Overview](#overview) &nbsp;·&nbsp; [Features](#features) &nbsp;·&nbsp; [Structure](#project-structure) &nbsp;·&nbsp; [Quick Start](#quick-start) &nbsp;·&nbsp; [Results](#results-gallery) &nbsp;·&nbsp; [Usage Guidelines](#usage-guidelines) &nbsp;·&nbsp; [License](#license) &nbsp;·&nbsp; [About](#about-this-repository) &nbsp;·&nbsp; [Acknowledgments](#acknowledgments)

</div>

---

<!-- AUTHORS -->
<div align="center">

  ## Authors

  **Terna Engineering College | Computer Engineering | Batch of 2022**

| <a href="https://github.com/Amey-Thakur"><img src="https://github.com/Amey-Thakur.png" width="150" height="150" alt="Amey Thakur"></a><br>[**Amey Thakur**](https://github.com/Amey-Thakur)<br><br>[![ORCID](https://img.shields.io/badge/ORCID-0000--0001--5644--1575-green.svg)](https://orcid.org/0000-0001-5644-1575) | <a href="https://github.com/msatmod"><img src="https://raw.githubusercontent.com/Amey-Thakur/HANGMAN-WORD-GAME/main/Mega/Mega.png" width="150" height="150" alt="Mega Satish"></a><br>[**Mega Satish**](https://github.com/msatmod)<br><br>[![ORCID](https://img.shields.io/badge/ORCID-0000--0002--1844--9557-green.svg)](https://orcid.org/0000-0002-1844-9557) |
| :---: | :---: |

</div>

> [!IMPORTANT]
> ### 🤝🏻 Special Acknowledgement
> *Special thanks to **[Mega Satish](https://github.com/msatmod)** for her meaningful contributions, guidance, and support that helped shape this work.*

---

<!-- OVERVIEW -->
## Overview

A classic Hangman Word Game developed as a mini-project for the Object-Oriented Programming Methodology (Java) Lab. The application challenges users to guess hidden words character by character within a limited number of attempts. It leverages **Java** for robust backend logic, utilizing fundamental **Object-Oriented Programming** principles like inheritance and encapsulation to structure the game's components effectively. This project showcases the practical application of Java syntax and logic to build an interactive and entertaining desktop application.

> [!NOTE]
> **Research Impact**: The source code, presentation, and project report are published on **ResearchGate**.
> - [ResearchGate Profile](https://www.researchgate.net/profile/Amey-Thakur)
> - [Presentation DOI](http://dx.doi.org/10.13140/RG.2.2.26806.22082)
> - [Source Code DOI](http://dx.doi.org/10.13140/RG.2.2.20095.33446)

### Resources

| # | Resource | Description |
|---|---|---|
| 1 | [Presentation](http://dx.doi.org/10.13140/RG.2.2.26806.22082) | Research paper presentation and visuals |
| 2 | [Source Code](http://dx.doi.org/10.13140/RG.2.2.20095.33446) | Original source code publication |
| 3 | [Game Repository](https://github.com/Amey-Thakur/HANGMAN-WORD-GAME) | Standalone repository for the game |
| 4 | [OOPM Laboratory](https://github.com/Amey-Thakur/OOPM-JAVA-LAB) | Academic repository for Java OOPM |

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

```bash
HANGMAN-WORD-GAME/
│
├── docs/                                    # Formal Documentation
│   └── SPECIFICATION.md                     # Technical Architecture & Spec
│
├── Mini-Project/                            # Academic Documentation & Results
│   ├── README.md                            # Mini-Project Overview
│   ├── WordGame.pdf                         # Technical Project Report
│   └── WordGame.pptx                        # Technical Presentation
│
├── Source Code/                             # Core Implementation
│   └── Mega.java                            # Main Game Logic (Applet)
│
├── .gitattributes                           # Git Configuration
├── .gitignore                               # Git Ignore Rules
├── CITATION.cff                             # Citation Metadata
├── codemeta.json                            # Project Metadata (JSON-LD)
├── LICENSE                                  # MIT License
├── README.md                                # Main Documentation
└── SECURITY.md                              # Security Policy & Posture
```

---

<!-- QUICK START -->
## Quick Start

### Prerequisites
- **Java Development Kit (JDK 8)** is required for Applet support.
- **AppletViewer** or a compatible browser plugin.

> [!WARNING]
> **Legacy Technology Implementation**
>
> As Java Applets are deprecated in modern browser environments, this project is primarily intended to be executed via the `appletviewer` utility included in the JDK. Attempts to run this in modern browsers (Chrome, Firefox, etc.) will fail without specialized legacy plugins.

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
  <img src="Mini-Project/Outputs/Welcome_Message.png" width="80%" alt="Welcome Message">

  ### Instructions Message
  <img src="Mini-Project/Outputs/Instructions_Message.png" width="80%" alt="Instructions Message">

  ### Hint Message
  <img src="Mini-Project/Outputs/Hint_Message.png" width="80%" alt="Hint Message">

  ### Player Name Input
  <img src="Mini-Project/Outputs/Player_Name_Input.png" width="80%" alt="Player Name Input">

  ### Game Screen
  <img src="Mini-Project/Outputs/Game_Screen.png" width="80%" alt="Game Screen">

  ### Input Window
  <img src="Mini-Project/Outputs/Input_Window.png" width="80%" alt="Input Window">

  ### Input Answer
  <img src="Mini-Project/Outputs/Input_Answer.png" width="80%" alt="Input Answer">

  ### Missed 1
  <img src="Mini-Project/Outputs/Missed_1.png" width="80%" alt="Missed 1">

  ### Missed 2
  <img src="Mini-Project/Outputs/Missed_2.png" width="80%" alt="Missed 2">

  ### Missed 3
  <img src="Mini-Project/Outputs/Missed_3.png" width="80%" alt="Missed 3">

  ### Missed 4
  <img src="Mini-Project/Outputs/Missed_4.png" width="80%" alt="Missed 4">

  ### Missed 5
  <img src="Mini-Project/Outputs/Missed_5.png" width="80%" alt="Missed 5">

  ### Missed 6
  <img src="Mini-Project/Outputs/Missed_6.png" width="80%" alt="Missed 6">

  ### Hanging Animation - Phase 1
  <img src="Mini-Project/Outputs/Missed_7.1.png" width="80%" alt="Missed 7.1">

  ### Hanging Animation - Phase 2
  <img src="Mini-Project/Outputs/Missed_7.2.png" width="80%" alt="Missed 7.2">

  ### Hanging Animation - Phase 3
  <img src="Mini-Project/Outputs/Missed_7.3.png" width="80%" alt="Missed 7.3">

  ### Win (Game Screen)
  <img src="Mini-Project/Outputs/Win.png" width="80%" alt="Win">

  ### Win (Input Window)
  <img src="Mini-Project/Outputs/Input_Win.png" width="80%" alt="Input Win">

  ### Lose
  <img src="Mini-Project/Outputs/Lose.png" width="80%" alt="Lose">

</div>

---

<!-- =========================================================================================
                                     USAGE SECTION
     ========================================================================================= -->
## Usage Guidelines

This repository is openly shared to support learning and knowledge exchange across the academic community.

**For Students**  
Use this mini-project as a reference for understanding Java Applets, AWT/Swing GUI development, and object-oriented game logic. The source code is documented to facilitate self-paced learning and exploration of graphical programming concepts.

**For Educators**  
This project may serve as a practical example or supplementary teaching resource for Object-Oriented Programming Methodology courses (`CSL304`). Attribution is appreciated when utilizing content.

**For Researchers**  
The documentation and organization provide insights into academic project curation and educational software structuring.

---

<!-- LICENSE -->
## License

This repository and all linked academic content are made available under the **MIT License**. See the [LICENSE](LICENSE) file for complete terms.

> [!NOTE]
> **Summary**: You are free to share and adapt this content for any purpose, even commercially, as long as you provide appropriate attribution to the original author.

Copyright © 2020 Amey Thakur, Mega Satish

---

<!-- ABOUT -->
## About This Repository

**Created & Maintained by**: [Amey Thakur](https://github.com/Amey-Thakur) & [Mega Satish](https://github.com/msatmod)  
**Academic Journey**: Bachelor of Engineering in Computer Engineering (2018-2022)  
**Institution**: [Terna Engineering College](https://ternaengg.ac.in/), Navi Mumbai  
**University**: [University of Mumbai](https://mu.ac.in/)

This project features the Hangman Word Game, a graphical Java application developed as a 3rd-semester mini-project for the Object-Oriented Programming Methodology (OOPM) course. It showcases the practical application of core Java concepts, graphics programming, and user-centric design.

**Connect:** [GitHub](https://github.com/Amey-Thakur) &nbsp;·&nbsp; [LinkedIn](https://www.linkedin.com/in/amey-thakur) &nbsp;·&nbsp; [ORCID](https://orcid.org/0000-0001-5644-1575)

### Acknowledgments

Grateful acknowledgment to [**Mega Satish**](https://github.com/msatmod) for her exceptional collaboration and scholarly partnership during the development of this project. Her constant support, technical clarity, and dedication to software quality were instrumental in achieving the project's functional objectives. Learning alongside her was a transformative experience; her thoughtful approach to problem-solving and encouragement turned challenges into meaningful learning moments. This work reflects the growth and insights gained from our side-by-side academic journey. Thank you, Mega, for everything you shared and taught along the way.

Grateful acknowledgment to the faculty members of the Department of Computer Engineering at Terna Engineering College for their guidance and instruction in Object-Oriented Programming Methodology. Their clear teaching and continued support helped me develop a strong understanding of object-oriented principles and Java programming.

Special thanks to the mentors and peers whose encouragement, discussions, and support contributed meaningfully to this learning experience.

---

<!-- FOOTER SECTION -->
<div align="center">

  [↑ Back to Top](#hangman-word-game)

  [Authors](#authors) &nbsp;·&nbsp; [Overview](#overview) &nbsp;·&nbsp; [Features](#features) &nbsp;·&nbsp; [Structure](#project-structure) &nbsp;·&nbsp; [Quick Start](#quick-start) &nbsp;·&nbsp; [Usage Guidelines](#usage-guidelines) &nbsp;·&nbsp; [License](#license) &nbsp;·&nbsp; [About](#about-this-repository) &nbsp;·&nbsp; [Acknowledgments](#acknowledgments)

  <br>

  🔬 **[OOPM Laboratory](https://github.com/Amey-Thakur/OOPM-JAVA-LAB)** &nbsp;·&nbsp; 🎮 **[HANGMAN-WORD-GAME](https://github.com/Amey-Thakur/HANGMAN-WORD-GAME)**

  ---

  #### Presented as part of the 3rd Semester Mini-Project @ Terna Engineering College

  ---

  ### 🎓 [Computer Engineering Repository](https://github.com/Amey-Thakur/COMPUTER-ENGINEERING)

  **Computer Engineering (B.E.) - University of Mumbai**

  *Semester-wise curriculum, laboratories, projects, and academic notes.*

</div>
