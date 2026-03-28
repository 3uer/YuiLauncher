<div align="center">
  <img src="app/src/main/res/mipmap-xxxhdpi/ic_launcher.png" width="128" height="128" alt="YinLauncher Logo">
  
  # YinLauncher ☯️
  
  [![Version](https://img.shields.io/badge/Release-v1.0.0--beta-black?style=for-the-badge)](https://github.com/3uer/YinLauncher/releases)
  [![Platform](https://img.shields.io/badge/Platform-Android_8.0+-black?style=for-the-badge&logo=android&logoColor=white)](https://www.android.com/)
  [![License](https://img.shields.io/badge/License-Apache_2.0-black?style=for-the-badge)](LICENSE)

  **A high-performance, monochromatic utility for Minecraft: Bedrock Edition.** *Built for those who demand minimalism and power.*
</div>

---

## The Concept

**YinLauncher** is a specialized environment for Minecraft Bedrock (MCBE) power users. Born as a refined fork of the LeviMC project, it strips away the clutter of standard launchers in favor of a brutalist, high-contrast UI and deep technical integration.

The philosophy is simple: **Balance.** Total control over your game files on one side, and a seamless, distraction-free interface on the other.

## Core Features

* **☯️ Yin-Yang Aesthetics:** A fully customized, system-wide monochromatic theme optimized for OLED displays.
* **🦊 Integrated CurseForge Browser:** Search, download, and inject Add-ons, Maps, and Resource Packs directly from the UI. No manual file moving required.
* **📦 Zero-Install Launching:** Import official APKs and run them in an isolated container. Keep your system clean and manage multiple versions simultaneously.
* **💉 Native Module Injection:** Full support for loading custom `.so` modules to extend game logic and optimize rendering.
* **☁️ Multi-Account Sync:** Seamlessly switch between various Microsoft/Xbox Live profiles without re-authenticating every time.

## Quick Setup

1.  **Download:** Grab the latest build from the [Releases](https://github.com/3uer/YinLauncher/releases) tab.
2.  **Verify:** Ensure you have a licensed copy of Minecraft installed from the Play Store (required for library verification).
3.  **Permissions:** Grant "All Files Access." YinLauncher needs this to manage the isolated game directories and inject modules.
4.  **Launch:** Import your APK and start playing.

## Technical Internals

YinLauncher leverages the **UnpairCore** framework to handle low-level process redirection. By isolating the game's data directory, we ensure that your resource packs and worlds never conflict between different versions.

### Building from Source
If you are a developer looking to contribute or audit the code:

```bash
git clone [https://github.com/3uer/YinLauncher.git](https://github.com/3uer/YinLauncher.git)
cd YinLauncher
# Ensure Android SDK & NDK are configured
./gradlew assembleDebug
