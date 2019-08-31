package com.baidu.jelly;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.util.Arrays;

import org.apache.commons.jelly.JellyContext;
import org.apache.commons.jelly.JellyException;
import org.apache.commons.jelly.XMLOutput;

public class Main {
	private static URL getResourceFile(String filename) {
		URL url = Thread.currentThread().getContextClassLoader().getResource("jelly/" + filename);
		if (url == null) {
			throw new RuntimeException("can not found " + filename);
		}
		return url;
	}

	public static void main(String[] args) throws JellyException, IOException {
		OutputStream output = new FileOutputStream("demopage.html");
		JellyContext context = new JellyContext();
		context.setAllowDtdToCallExternalEntities(true);

		context.setVariable("name", "world");
		context.setVariable("background", "green");
		context.setVariable("url", "http://www.baidu.com");
		context.setVariable("hobbies", Arrays.asList("1", "2", "3"));

		XMLOutput xmlOutput = XMLOutput.createXMLOutput(output);
		context.runScript(getResourceFile("demopage.jelly"), xmlOutput, true, true);
		xmlOutput.flush();
	}
}
