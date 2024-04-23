# Trim Art CSV Converter

### Getting Started
Download the latest release jar [here](https://github.com/bradykurtz/trimart-csv-converter/releases)

You will then run:

```shell
java -jar <Path to Jar> <parameter1> <parameter2>
```

The Jar takes two parameters

| Parameter | Description |
| --------- | ----------- |
| Location of Initial CSV | Needs to be the fully qualified path to the location of the csv.  Wrap in quotes if there are spaces in the path|
 | Directory Location Where to Save The New CSV | Fully qualified location of where to save the csv.  Must end in a directory not a file name|


#### Full Example
```shell
java -jar /Users/bradykurtz/Projects/trimArt/csvConverter/build/libs/trimArtCsvConverter.jar "/Users/bradykurtz/Projects/trimArt/csvConverter/src/test/resources/4_18 Benches/CncRun492.csv" ~/Downloads
```

### To Build the Project / Make Changes

1. Checkout project
2. Make changes
3. Run ./gradlew clean build
4. The jar is located under build/libs