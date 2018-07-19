package top.houwing.SAX;

import java.io.File;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;
import javax.xml.transform.stream.StreamResult;

import org.xml.sax.helpers.AttributesImpl;


public class SAXBuilder {
	public static void main(String[] args) throws Exception {
		//��������XML�Ľ��������
		Result result=new StreamResult(new File("E:\\HomeWork\\JSP\\xml_execise\\teaching_plan_ouput_by_program.xml"));
		//��ȡsax���ɹ���ʵ��
		SAXTransformerFactory factory=(SAXTransformerFactory) SAXTransformerFactory.newInstance();
		//��ȡSAX���ɴ����߶���ʵ��
		TransformerHandler handler=factory.newTransformerHandler();
		handler.setResult(result);
		//��ȡSAX������
		Transformer transformer=handler.getTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		//�����ĵ�
		handler.startDocument();
		AttributesImpl atts = null;
		handler.startElement("", "", "��ѧ�ƻ�", atts);
		handler.startElement("", "", "�����γ�", atts);
		
		handler.startElement("", "", "��ѧӢ��", atts);
		handler.startElement("", "", "��ʱ", atts);
		handler.characters("36".toCharArray(), 0, "36".length());
		handler.endElement("", "", "��ʱ");
		handler.startElement("", "", "���˷�ʽ", atts);
		handler.characters("����".toCharArray(), 0, "����".length());
		handler.endElement("", "", "���˷�ʽ");
		handler.endElement("", "", "��ѧӢ��");
		
		handler.startElement("", "", "�ߵ���ѧ", atts);
		handler.startElement("", "", "��ʱ", atts);
		handler.characters("70".toCharArray(), 0, "70".length());
		handler.endElement("", "", "��ʱ");
		handler.startElement("", "", "���˷�ʽ", atts);
		handler.characters("����".toCharArray(), 0, "����".length());
		handler.endElement("", "", "���˷�ʽ");
		handler.endElement("", "", "�ߵ���ѧ");
		
		handler.startElement("", "", "�����Ӧ�û���", atts);
		handler.startElement("", "", "��ʱ", atts);
		handler.characters("108".toCharArray(), 0, "108".length());
		handler.endElement("", "", "��ʱ");
		handler.startElement("", "", "���˷�ʽ", atts);
		handler.characters("�ϻ�����".toCharArray(), 0, "�ϻ�����".length());
		handler.endElement("", "", "���˷�ʽ");
		handler.endElement("", "", "�����Ӧ�û���");

		handler.startElement("", "", "������ͼ", atts);
		handler.startElement("", "", "��ʱ", atts);
		handler.characters("60".toCharArray(), 0, "60".length());
		handler.endElement("", "", "��ʱ");
		handler.startElement("", "", "���˷�ʽ", atts);
		handler.characters("����".toCharArray(), 0, "����".length());
		handler.endElement("", "", "���˷�ʽ");
		handler.endElement("", "", "������ͼ");
		
		handler.endElement("", "", "�����γ�");
		handler.startElement("", "", "רҵ��", atts);
		
		handler.startElement("", "", "java��������", atts);
		handler.startElement("", "", "��ʱ", atts);
		handler.characters("72".toCharArray(), 0, "72".length());
		handler.endElement("", "", "��ʱ");
		handler.startElement("", "", "���˷�ʽ", atts);
		handler.characters("����".toCharArray(), 0, "����".length());
		handler.endElement("", "", "���˷�ʽ");
		handler.endElement("", "", "java��������");
		
		handler.startElement("", "", "MySQL���ݿ�����", atts);
		handler.startElement("", "", "��ʱ", atts);
		handler.characters("108".toCharArray(), 0, "108".length());
		handler.endElement("", "", "��ʱ");
		handler.startElement("", "", "���˷�ʽ", atts);
		handler.characters("����".toCharArray(), 0, "����".length());
		handler.endElement("", "", "���˷�ʽ");
		handler.endElement("", "", "MySQL���ݿ�����");
		
		handler.startElement("", "", "��ҳ���������", atts);
		handler.startElement("", "", "��ʱ", atts);
		handler.characters("74".toCharArray(), 0, "74".length());
		handler.endElement("", "", "��ʱ");
		handler.startElement("", "", "���˷�ʽ", atts);
		handler.characters("����".toCharArray(), 0, "����".length());
		handler.endElement("", "", "���˷�ʽ");
		handler.endElement("", "", "��ҳ���������");
		
		handler.endElement("", "", "רҵ��");
		handler.endElement("", "", "��ѧ�ƻ�");
		handler.endDocument();
		System.out.println("��ӡ���");
	}

}
