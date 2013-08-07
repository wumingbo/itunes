package itunes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Driver {

	public static void main(String[] args) {
		
		String xmlFileLocation = "/Users/drewbrien/dev/itunes_app/data/xml/itunes_library_sample.xml";

		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		
		try {
			DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
			Document dom = docBuilder.parse(xmlFileLocation);
			parseXML(dom);
		}
		catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
		catch (SAXException saxe) {
			saxe.printStackTrace();
		}
	}
	
	private static void parseXML(Document dom) {
		Element elem = dom.getDocumentElement();
		
		ArrayList<Node> songList = getSongList(elem);
		HashMap<String,String> attr = new HashMap<String,String>();
		Song s;
		for (Node song : songList) {
			attr = getSongAttributes(song);
			s = new Song(attr);
			s.printSong();
		}
	}
	
	private static ArrayList<Node> getSongList(Element elem) {
		NodeList songDict = elem.getElementsByTagName("dict");
		Node node = songDict.item(1);
		NodeList children = node.getChildNodes();
		
		ArrayList<Node> songList = removeGarbage(children);
		songList = cleanSongList(songList);
	
		return songList;
	}
	
	private static HashMap<String,String> getSongAttributes(Node song) {
		NodeList attributes = song.getChildNodes();
		ArrayList<Node> attributesClean = removeGarbage(attributes);
		
		HashMap<String, String> attributeMap = new HashMap<String,String>();

		String key = "";
		String value = "";
		for (Node attribute : attributesClean) {
			String name = attribute.getNodeName();
			if (name.equals("key")) {
				key = attribute.getFirstChild().getNodeValue();
			}
			else {
				if (name.equals("true")) {
					value = "true";
				}
				else if (name.equals("false")) {
					value = "false";
				}
				else {
					value = attribute.getFirstChild().getNodeValue();
				}
				attributeMap.put(key, value);
			}
		}
		return attributeMap;
	}
	
	private static ArrayList<Node> removeGarbage(NodeList list) {
		ArrayList<Node> cleanedList = new ArrayList<Node>();
		for (int i = 0; i < list.getLength(); i++) {
			Node n = list.item(i);
			String name = n.getNodeName();
			if (!name.equals("#text")) {
				cleanedList.add(n);
			}
		}
		return cleanedList;
	}
	
	private static ArrayList<Node> cleanSongList(ArrayList<Node> list) {
		ArrayList<Node> cleanedList = new ArrayList<Node>();
		
		for (Node song : list) {
			if (song.)
		}
		
		return cleanedList;
	}

}
