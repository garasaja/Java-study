package trush;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;

public class BuildNative {
	public JComponent createWeb() {
		JPanel pnlCon = new JPanel(new BorderLayout());
		JPanel pnlWeb = new JPanel(new BorderLayout());
		pnlWeb.setBorder(BorderFactory.createTitledBorder("Native WEb Browser component"));
		final JWebBrowser webBrowser = new JWebBrowser();
		webBrowser.setBarsVisible(false);
		
		webBrowser.navigate("http://www.naver.com");
		pnlWeb.add(webBrowser, BorderLayout.CENTER);
		pnlCon.add(pnlWeb, BorderLayout.CENTER);
		
		return pnlCon;
		
	}
	
	public void open() {
		NativeInterface.open();
		
		JFrame frame = new JFrame("브라우저");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(createWeb(), BorderLayout.CENTER);
		frame.setSize(800,400);
		frame.setLocationByPlatform(true);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new BuildNative().open();
	}
}
