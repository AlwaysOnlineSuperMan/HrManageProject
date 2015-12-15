package com.hr.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class DownLoadAction extends ActionSupport {
	private String fileName;
	private File attachment;
	
	public String getFileName() {
		return fileName;
	}


	public void setFileName(String fileName) {
		this.fileName = fileName;
	}


	public File getAttachment() {
		return attachment;
	}


	public void setAttachment(File attachment) {
		this.attachment = attachment;
	}


	public InputStream getInputStream() throws Exception{
		//org.apache.struts2.dispatcher.StreamResult
		System.out.println(fileName);
		String pathString = ServletActionContext.getServletContext().getRealPath(fileName);
		System.out.println(pathString);
		FileInputStream stream = new FileInputStream(new File(pathString));
		return stream;
	}
	public String getDownFileName(){
		return fileName.substring(fileName.lastIndexOf("/")+1);
	}
	
}
