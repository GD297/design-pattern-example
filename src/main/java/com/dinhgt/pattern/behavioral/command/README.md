# Command

Commands encapsulate a request as an object. Here `LightOnCommand` and
`LightOffCommand` implement the `Command` interface. `RemoteControl`
triggers commands without knowing the details of `Light`. Run `Main` to
switch the light on and off through the remote.
