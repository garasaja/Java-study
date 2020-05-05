package ch14;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;
import javax.swing.JLabel;
import javax.swing.JList;

public class Sample extends JFrame {
	private JTextField textField;
	private JTextField textField_1;

	public Sample() {
		setTitle("문자전송 swing 예제");
		setSize(500, 500);
		setLocationRelativeTo(null); // 프레임이 화면 가운데 배치
		Container c = getContentPane();
		c.setLayout(null);

		textField = new JTextField();
		textField.setBounds(205, 51, 197, 21);
		c.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(205, 110, 197, 136);
		c.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel = new JLabel("\uC804\uD654\uBC88\uD638\uB97C \uC785\uB825\uD558\uC138\uC694");
		lblNewLabel.setBounds(28, 54, 165, 15);
		c.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("\uC804\uC1A1\uD560 \uBB38\uC790\uB97C \uC785\uB825\uD558\uC138\uC694");
		lblNewLabel_1.setBounds(28, 110, 165, 15);
		c.add(lblNewLabel_1);

		JList list = new JList();
		list.setBounds(340, 256, -130, -102);
		c.add(list);

		JButton btnNewButton = new JButton("\uC804\uC1A1");
		btnNewButton.setBounds(286, 328, 97, 23);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String api_key = "NCSKWHKZO30PTP90";
				String api_secret = "CJ9RAXGCLKSPCF59JCXUEMHZT0FLLYKQ";
				Message coolsms = new Message(api_key, api_secret);

				// 4 params(to, from, type, text) are mandatory. must be filled
				HashMap<String, String> params = new HashMap<String, String>();
				params.put("to", textField.getText());
				params.put("from", "01095253068");
				params.put("type", "SMS");
				params.put("text", textField_1.getText());
				params.put("app_version", "test app 1.2"); // application name and version

				try {
					JSONObject obj = (JSONObject) coolsms.send(params);
					System.out.println(obj.toString());
				} catch (CoolsmsException e1) {
					System.out.println(e1.getMessage());
					System.out.println(e1.getCode());
				}
			}

		});
		c.add(btnNewButton);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Sample();
	}
}
