# State

The state pattern allows an object to change its behavior when its
internal state changes. `Context` holds a `State` that can be a
`StartState` or `StopState`. Running `Main` switches the context
between states and invokes behavior specific to each one.
