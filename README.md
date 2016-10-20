JChroma - ChromaSDK for Java [WIP]
==================================

JChroma allows to use the Razer Chroma SDK for Razer devices with Java

Requirements
====

In order to use the library, one must:

1. Install the ChromaSDK (if not done already) [Link](http://developer.razerzone.com/chroma/)
2. Have a Razer device to test it on


Quick example
====

Showing the wave animation from left to right:

```java
chroma = JChroma.getInstance();
chroma.init();
chroma.createKeyboardEffect(new WaveKeyboardEffect(WaveDirection.LEFT_TO_RIGHT));

// ...
// Other awesome code
// ...

chroma.free();
```