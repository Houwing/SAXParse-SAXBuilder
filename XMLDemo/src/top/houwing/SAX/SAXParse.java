package top.houwing.SAX;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import top.houwing.SAXHandler.HouwingHandler;

public class SAXParse {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		//����sax��������
		SAXParserFactory factory= SAXParserFactory.newInstance();
		//����sax������
		SAXParser parse=factory.newSAXParser();
		//��ʼ����xml�ĵ�
		parse.parse("E:\\HomeWork\\JSP\\xml_execise\\teaching_plan.xml", new HouwingHandler());
	}
}
