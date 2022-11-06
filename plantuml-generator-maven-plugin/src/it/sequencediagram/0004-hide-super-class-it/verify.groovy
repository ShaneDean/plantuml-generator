File buildLog = new File( basedir, 'build.log' )
assert buildLog.exists()
assert buildLog.text.contains( "[INFO] Starting plantuml sequence diagram generation" )

File buildDiagram = new File( basedir.absolutePath+'/target/generated-docs/testsequencediagram1.txt' )
File testDiagram = new File( basedir.absolutePath+'/../../../../../plantuml-generator-util/src/test/resources/sequence/0002_basic_super_class_sequence_diagram_with_hide_super_class.txt' )
assert buildDiagram.exists()
assert testDiagram.exists()
String buildDiagramText = buildDiagram.text 
String testDiagramText =  testDiagram.text
assert testDiagramText.replaceAll("\\s+", "").equals(buildDiagramText.replaceAll("\\s+", "")) 
