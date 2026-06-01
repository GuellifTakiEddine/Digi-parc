package admingui;

import javax.swing.*;
import java.awt.*;

public class logout extends JPanel {

	private JPanel ShowPanel;

	public logout() {

		initComponents();

		JPanel panel_1 =
				new ImagePanel(
						logout.class.getResource(
								"/admingui/icons/walid1.jpg"
						)
				);

		panel_1.setLayout(null);

		JPanel lblda =
				new ImagePanel(
						logout.class.getResource(
								"/admingui/icons/b.jpg"
						)
				);

		lblda.setLayout(null);

		lblda.setBounds(340,120,835,600);

		panel_1.add(lblda);

		JLabel lblNewLabel =
				new JLabel("LOGIN");

		lblNewLabel.setForeground(Color.white);

		lblNewLabel.setFont(
				new Font(
						"Bookman Old Style",
						Font.BOLD,
						50
				)
		);

		lblNewLabel.setBounds(335,100,200,50);

		lblda.add(lblNewLabel);

RoundJTextField textField_1 =
					new RoundJTextField(
							15,
							getClass()
									.getResource(
											"/admingui/icons/icons8-user-24.png"
									)
									.getPath()
					);

		textField_1.setBounds(285,200,250,28);

		textField_1.setForeground(Color.black);

		textField_1.setPlaceholder(" Username");

		lblda.add(textField_1);

RoundJTextFieldd passwordField_1 =
					new RoundJTextFieldd(
							15,
							getClass()
									.getResource(
											"/images/icons8-lock-24.png"
									)
									.getPath()
					);

		passwordField_1.setBounds(284,265,250,28);

		passwordField_1.setPlaceholder(" Password");

		lblda.add(passwordField_1);

		MyButton btnLogin =
				new MyButton();

		btnLogin.setText("Login");

		btnLogin.setRadius(23);

		btnLogin.setBorderPainted(false);

		btnLogin.setBackground(Color.white);

		btnLogin.setForeground(Color.black);

		btnLogin.setBounds(310,360,200,30);

		btnLogin.setFocusPainted(false);

		lblda.add(btnLogin);

		JCheckBox showpass =
				new JCheckBox("Show password");

		showpass.setFont(
				new Font(
						"Sitka Small",
						Font.PLAIN,
						13
				)
		);

		showpass.setOpaque(false);

		showpass.setBorderPainted(false);

		showpass.setFocusPainted(false);

		showpass.setForeground(Color.white);

		showpass.setBounds(350,320,120,21);

		lblda.add(showpass);

		ShowPanel.setLayout(new BorderLayout());

		ShowPanel.removeAll();

		ShowPanel.add(panel_1, BorderLayout.CENTER);

		ShowPanel.revalidate();

		ShowPanel.repaint();
	}

	static class ImagePanel extends JPanel {

		private Image backgroundImage;

		public ImagePanel(java.net.URL imageURL) {

			this.backgroundImage =
					new ImageIcon(imageURL).getImage();
		}

		@Override
		protected void paintComponent(Graphics g) {

			super.paintComponent(g);

			g.drawImage(
					backgroundImage,
					0,
					0,
					getWidth(),
					getHeight(),
					this
			);
		}
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		ShowPanel = new JPanel();

		javax.swing.GroupLayout ShowPanelLayout =
				new javax.swing.GroupLayout(ShowPanel);

		ShowPanel.setLayout(ShowPanelLayout);

		ShowPanelLayout.setHorizontalGroup(
				ShowPanelLayout.createParallelGroup(
						javax.swing.GroupLayout.Alignment.LEADING
				).addGap(0, 400, Short.MAX_VALUE)
		);

		ShowPanelLayout.setVerticalGroup(
				ShowPanelLayout.createParallelGroup(
						javax.swing.GroupLayout.Alignment.LEADING
				).addGap(0, 300, Short.MAX_VALUE)
		);

		javax.swing.GroupLayout layout =
				new javax.swing.GroupLayout(this);

		this.setLayout(layout);

		layout.setHorizontalGroup(
				layout.createParallelGroup(
						javax.swing.GroupLayout.Alignment.LEADING
				).addComponent(
						ShowPanel,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE
				)
		);

		layout.setVerticalGroup(
				layout.createParallelGroup(
						javax.swing.GroupLayout.Alignment.LEADING
				).addComponent(
						ShowPanel,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE
				)
		);
	}
}