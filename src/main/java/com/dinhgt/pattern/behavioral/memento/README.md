# Memento

Memento captures an object's internal state so it can be restored later.
`Editor` saves text inside a `TextWindow` and can revert to previous states
stored as `TextWindowState` objects. Running `Main` demonstrates undoing
changes by restoring a saved state.
