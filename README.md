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

## Benefits of This Architecture

1. **Code Sharing**: Core business logic is written once in Kotlin and shared across platforms
2. **Platform-Native Feel**: Each platform uses its preferred reactive programming paradigm
3. **Clean Architecture**: Clear separation between shared business logic and platform-specific implementations
4. **Type Safety**: Interface-based approach ensures type safety across platforms
5. **Maintainability**: Single source of truth for business logic while maintaining platform-specific best practices
