File buildLog = new File( basedir, 'build.log' )
assert buildLog.exists()
assert buildLog.text.contains( "[INFO] Starting plantuml sequence diagram generation " )
File buildDiagram = new File( basedir.absolutePath+'/target/generated-docs/testsequencediagram1.txt' )
assert buildDiagram.exists()
assert buildDiagram.text.contains( "ChildA" )
assert buildDiagram.text.contains( "ChildB" )
assert buildDiagram.text.contains( "doSomethingWithReturnValue" )
assert buildDiagram.text.contains( "jpg")