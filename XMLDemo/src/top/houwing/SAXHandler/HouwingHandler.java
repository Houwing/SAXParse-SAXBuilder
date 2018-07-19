package top.houwing.SAXHandler;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class HouwingHandler extends DefaultHandler {

	private String CurrentTag;
	@Override
	public void characters(char[] arg0, int arg1, int arg2) throws SAXException {
		// TODO Auto-generated method stub
		String content=new String(arg0,arg1,arg2);
		if(content.length()>0) {
			System.out.println("<"+CurrentTag+">元素的内容是: "+content.trim());
		}
	}

	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("文档解析完成");
	}

	@Override
	public void endElement(String arg0, String arg1, String arg2) throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("此处Uri是："+arg0+" 此处localName是："+arg0+" 此处元素是："+arg2);
	}

	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("开始解析文档");
	}

	@Override
	public void startElement(String arg0, String arg1, String arg2, Attributes arg3) throws SAXException {
		// TODO Auto-generated method stub
		CurrentTag=arg2;
		System.out.println("此处处理的元素是："+arg2);
	}
	

}
