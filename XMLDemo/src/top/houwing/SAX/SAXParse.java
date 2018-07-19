package top.houwing.SAX;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import top.houwing.SAXHandler.HouwingHandler;

public class SAXParse {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		//创建sax解析工厂
		SAXParserFactory factory= SAXParserFactory.newInstance();
		//创建sax解析器
		SAXParser parse=factory.newSAXParser();
		//开始解析xml文档
		parse.parse("E:\\HomeWork\\JSP\\xml_execise\\teaching_plan.xml", new HouwingHandler());
	}
}
