# 🎁 Wish List App

The Wish List App is a simple and intuitive Android application that helps users keep track of their wishes or goals. Built using **Jetpack Compose**, **Room Database**, and **MVVM architecture**, it provides a clean and responsive UI for creating, editing, and deleting personal wishes.

---

## 📱 Features

- ✨ **Add Wish**  
  Users can quickly add new wishes with a title and description.

- ✏️ **Edit Wish**  
  Update existing wishes with new details.

- ❌ **Delete Wish**  
  Remove wishes that are no longer needed.

- 💾 **Offline Storage**  
  All data is stored locally using **Room DB**, ensuring offline access.

---

## 🛠️ Tech Stack

- **Kotlin**  
- **Jetpack Compose** for modern UI  
- **Room Database** for local data persistence  
- **ViewModel + LiveData** for state management (MVVM)  
- **Coroutines** for background operations  

---

## 🧱 Architecture

The app follows **MVVM (Model-View-ViewModel)** architecture for clear separation of concerns:

- `Model` — Data class (`Wish`) and Room database setup  
- `ViewModel` — Handles business logic and database interaction  
- `View` — Composables that observe state and render UI  

---


