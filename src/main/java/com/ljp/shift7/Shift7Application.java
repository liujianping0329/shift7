package com.ljp.shift7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.util.List;
import java.util.Map;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class Shift7Application {

	public static void main(String[] args) {
		SpringApplication.run(Shift7Application.class, args);

		List<Map<String, String>> def = Main.readFromExlDef();
		Map<String, String> names =Main. readFromExlName();
		String ans = Main.outPut(Main.readFromExl(def, names));
		System.out.println(ans);

		Clipboard systemClipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		Transferable tText = new StringSelection(ans);
		systemClipboard.setContents(tText,null);
	}

}
