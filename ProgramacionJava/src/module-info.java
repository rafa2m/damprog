module ProgramacionJava {
	requires java.base;		
	requires java.desktop;
	requires java.logging;
	requires org.apache.logging.log4j;
	requires org.eclipse.jdt.annotation;
	opens dam.temauno.cadenas;
	opens dam.temauno.fechahora;
	opens dam.tematres.logger;
	opens dam.tematres.logapache;
}