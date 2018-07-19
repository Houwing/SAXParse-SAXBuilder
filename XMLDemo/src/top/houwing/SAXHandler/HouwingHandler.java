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
			System.out.println("<"+CurrentTag+">Ԫ�ص�������: "+content.trim());
		}
	}

	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("�ĵ��������");
	}

	@Override
	public void endElement(String arg0, String arg1, String arg2) throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("�˴�Uri�ǣ�"+arg0+" �˴�localName�ǣ�"+arg0+" �˴�Ԫ���ǣ�"+arg2);
	}

	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("��ʼ�����ĵ�");
	}

	@Override
	public void startElement(String arg0, String arg1, String arg2, Attributes arg3) throws SAXException {
		// TODO Auto-generated method stub
		CurrentTag=arg2;
		System.out.println("�˴������Ԫ���ǣ�"+arg2);
	}
	

}
