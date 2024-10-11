package CS_homework.DesignPatterns.Facade;

public class Classes {
    
    //These are some of the classes of a complex 3-rd party video
    //conversion framework. We don't control that code, therefore can't simplify it

    // class VideoFile

    // Class OggCompressionCodec

    // class MPEG4CompressionCodec

    // class CodecFactore

    // class BitrateReader

    // class AudioMixer



    //We create a facade class to hide the framework's complexity 
    //behind a simple interface. It's a trade-off between functionality and simplicity

    // class VideoConverter is methos convert(filename, format) : File is file = new VideCodec

    // if (format == "mp4")







    // Usage
    // //Applicaion classes don't depend on billion classes
    // //provided by the complex fremework.also, if you decide to 
    // //switch frameworks you only need to rewrite the facede class

    // class Appplication is methos main() is 
    // convertor  = new VideoConverter()
    // mp4 = convertor.convert("funny-cats, "mp4")
    // mp4.save;







}
