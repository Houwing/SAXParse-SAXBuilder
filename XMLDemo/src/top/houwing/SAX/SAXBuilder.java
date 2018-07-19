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
		//创建保存XML的结果流对象
		Result result=new StreamResult(new File("E:\\HomeWork\\JSP\\xml_execise\\teaching_plan_ouput_by_program.xml"));
		//获取sax生成工厂实例
		SAXTransformerFactory factory=(SAXTransformerFactory) SAXTransformerFactory.newInstance();
		//获取SAX生成处理者对象实例
		TransformerHandler handler=factory.newTransformerHandler();
		handler.setResult(result);
		//获取SAX生成器
		Transformer transformer=handler.getTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		//生成文档
		handler.startDocument();
		AttributesImpl atts = null;
		handler.startElement("", "", "教学计划", atts);
		handler.startElement("", "", "基础课程", atts);
		
		handler.startElement("", "", "大学英语", atts);
		handler.startElement("", "", "课时", atts);
		handler.characters("36".toCharArray(), 0, "36".length());
		handler.endElement("", "", "课时");
		handler.startElement("", "", "考核方式", atts);
		handler.characters("考试".toCharArray(), 0, "考试".length());
		handler.endElement("", "", "考核方式");
		handler.endElement("", "", "大学英语");
		
		handler.startElement("", "", "高等数学", atts);
		handler.startElement("", "", "课时", atts);
		handler.characters("70".toCharArray(), 0, "70".length());
		handler.endElement("", "", "课时");
		handler.startElement("", "", "考核方式", atts);
		handler.characters("考试".toCharArray(), 0, "考试".length());
		handler.endElement("", "", "考核方式");
		handler.endElement("", "", "高等数学");
		
		handler.startElement("", "", "计算机应用基础", atts);
		handler.startElement("", "", "课时", atts);
		handler.characters("108".toCharArray(), 0, "108".length());
		handler.endElement("", "", "课时");
		handler.startElement("", "", "考核方式", atts);
		handler.characters("上机操作".toCharArray(), 0, "上机操作".length());
		handler.endElement("", "", "考核方式");
		handler.endElement("", "", "计算机应用基础");

		handler.startElement("", "", "工程制图", atts);
		handler.startElement("", "", "课时", atts);
		handler.characters("60".toCharArray(), 0, "60".length());
		handler.endElement("", "", "课时");
		handler.startElement("", "", "考核方式", atts);
		handler.characters("考察".toCharArray(), 0, "考察".length());
		handler.endElement("", "", "考核方式");
		handler.endElement("", "", "工程制图");
		
		handler.endElement("", "", "基础课程");
		handler.startElement("", "", "专业课", atts);
		
		handler.startElement("", "", "java基础入门", atts);
		handler.startElement("", "", "课时", atts);
		handler.characters("72".toCharArray(), 0, "72".length());
		handler.endElement("", "", "课时");
		handler.startElement("", "", "考核方式", atts);
		handler.characters("考试".toCharArray(), 0, "考试".length());
		handler.endElement("", "", "考核方式");
		handler.endElement("", "", "java基础入门");
		
		handler.startElement("", "", "MySQL数据库入门", atts);
		handler.startElement("", "", "课时", atts);
		handler.characters("108".toCharArray(), 0, "108".length());
		handler.endElement("", "", "课时");
		handler.startElement("", "", "考核方式", atts);
		handler.characters("考试".toCharArray(), 0, "考试".length());
		handler.endElement("", "", "考核方式");
		handler.endElement("", "", "MySQL数据库入门");
		
		handler.startElement("", "", "网页设计与制作", atts);
		handler.startElement("", "", "课时", atts);
		handler.characters("74".toCharArray(), 0, "74".length());
		handler.endElement("", "", "课时");
		handler.startElement("", "", "考核方式", atts);
		handler.characters("考察".toCharArray(), 0, "考察".length());
		handler.endElement("", "", "考核方式");
		handler.endElement("", "", "网页设计与制作");
		
		handler.endElement("", "", "专业课");
		handler.endElement("", "", "教学计划");
		handler.endDocument();
		System.out.println("打印完成");
	}

}
