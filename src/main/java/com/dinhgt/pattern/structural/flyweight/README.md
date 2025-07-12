# Flyweight

Flyweight reduces memory usage by sharing objects that are expensive to
create. `ShapeFactory` reuses `Circle` instances keyed by color. Execute
`Main` to draw many colored circles without creating a new object each time.
