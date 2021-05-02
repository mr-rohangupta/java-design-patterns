**Facade Pattern**

**_A Facade Pattern says that just "just provide a unified and simplified interface to a set of interfaces in a subsystem, therefore it hides the complexities of the subsystem from the client"._**

In short Facade Pattern describes a higher-level interface that makes the sub-system easier to use.

**_Every Abstract factory is a Facade._**

**Implementation Details:**

**_We have Codec interface with two concrete implementations such as MovCompressionCodec and MPEG4CompressionCodec._**

**_Some utilities such as VideoFile class which will accept the fileName in constructor, BitrateReader class which is used to read and convert the files and AudioSoundMixer to fix audio issues._**

**_CodecFactory is the factory class which will return the type of file converter the user provides._**

**_Then finally we have the VideoConversionFacade which is the actual Facade here in this example, It will create the VideoFile by accepting the filename, then use the utilities and convert the video for the end user._**

**_So here the VideoConversionFacade will do the conversion, and the FacadeDemo (Client) is only interested in getting the result._**

