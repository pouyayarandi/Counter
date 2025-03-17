# Counter - Kotlin Multiplatform Mobile App

This is a Kotlin Multiplatform project targeting Android and iOS, demonstrating a clean architecture approach to share business logic while leveraging platform-specific reactive programming patterns.

## Architecture

The project uses a shared ViewModel architecture with platform-specific state management:

- **Shared Business Logic**: Common Kotlin code defines the core functionality through interfaces
- **Platform-Specific State Management**: 
  - Android: Uses Kotlin StateFlow for reactive state updates
  - iOS: Uses Combine Publishers for reactive state updates

### Key Components

- `CounterViewModel`: Shared business logic implementation
- `CounterViewModelState`: Interface that abstracts platform-specific state management
- Platform-specific implementations of `CounterViewModelState`:
  - Android: Uses `StateFlow` for reactive updates
  - iOS: Uses Combine `Publisher` for reactive updates

## Project Structure

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that's common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple's CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you're sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.

* `/shared` is for the code that will be shared between all targets in the project.
  The most important subfolder is `commonMain`. If preferred, you can add code to the platform-specific folders here too.

Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…

## Benefits of This Architecture

1. **Code Sharing**: Core business logic is written once in Kotlin and shared across platforms
2. **Platform-Native Feel**: Each platform uses its preferred reactive programming paradigm
3. **Clean Architecture**: Clear separation between shared business logic and platform-specific implementations
4. **Type Safety**: Interface-based approach ensures type safety across platforms
5. **Maintainability**: Single source of truth for business logic while maintaining platform-specific best practices
