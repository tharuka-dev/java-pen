<div align="center">

# ✒️ Object-Oriented Pen Simulation in Java

A robust, real-world object-oriented simulation modeling physical pen mechanics, ink consumption dynamics, cap status states, and intelligent partial-writing degradation.

![Pen Write Logic Flowchart](pen-simulator-banner.png)

</div>

---

## ✨ Core Features

* **🔬 Precise Ink Consumption:** Computes exact ink usage down to the individual character level based on standard pen capacity ($0.25\text{ ml}$ for ~150,000 characters).
* **🔒 Cap State Validation:** Enforces physical rules—the pen refuses to write if the cap is secured (`isCapOff` safety checks).
* **✂️ Intelligent Partial-Writing Logic:** If the remaining ink is insufficient to complete a full word, the program dynamically calculates how many characters *can* be written, outputs the written portion, displays the unwritten remainder, and safely depletes the remaining ink tank to zero.

---
