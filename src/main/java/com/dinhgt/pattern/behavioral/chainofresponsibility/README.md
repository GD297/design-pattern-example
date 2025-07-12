# Chain of Responsibility

This example builds a chain of logger objects. Each logger checks if it can
handle a message; otherwise the request is forwarded to the next logger.
Run `Main` to see how messages pass through `ConsoleLogger`, `FileLogger`,
and `ErrorLogger`.
