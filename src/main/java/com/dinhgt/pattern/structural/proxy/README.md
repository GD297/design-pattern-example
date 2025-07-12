# Proxy

A proxy controls access to another object. `ProxyImage` loads a `RealImage`
only when the image is actually displayed, demonstrating lazy
initialization. Run `Main` to see the proxy delaying the heavy loading
operation until needed.
