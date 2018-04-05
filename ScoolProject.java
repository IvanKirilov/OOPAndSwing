package School.src.Project;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

import org.omg.Messaging.SyncScopeHelper;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class ScoolProject extends JFrame {

	private JFrame frame;

	private JTextField discName, numberOfLessons,
		numberOfExercises, teacherName,
		teachingDiscipline, pupilClas,
		pupilName, numberInClass;

	private ListenForButton lb;

	private JButton btnAddDiscipline, btnAddPupil,
		btnSeeInfo, btnAddTeacher;

	private JInternalFrame infoFrame;
	private JTextArea textArea;

	private List<Discipline> discipline;
	private List<Teacher> teacher = new ArrayList<>();
	private List<Pupil> pupil = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScoolProject window = new ScoolProject();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ScoolProject() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 850, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("School");
		frame.getContentPane().setLayout(null);

		lb = new ListenForButton();
		discipline = new ArrayList<>();
		///...

		JPanel panel = new JPanel();
		panel.setBounds(10, 0, 834, 561);
		panel.setLayout(null);
		frame.getContentPane().add(panel);

		infoFrame = new JInternalFrame();
		infoFrame.setBounds(123, 319, 339, 231);
		infoFrame.setTitle("Information");
		infoFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		infoFrame.getContentPane().setLayout(null);
		infoFrame.setVisible(false);
		panel.add(infoFrame);

		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setBounds(10, 11, 252, 179);
		infoFrame.getContentPane().add(textArea);

		JLabel lblDiscipline = new JLabel("Discipline");
		lblDiscipline.setBounds(10, 0, 101, 22);
		lblDiscipline.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblDiscipline.setForeground(Color.BLUE);
		panel.add(lblDiscipline);

		discName = new JTextField();
		discName.setBounds(10, 58, 86, 20);
		discName.setColumns(10);
		panel.add(discName);

		numberOfLessons = new JTextField();
		numberOfLessons.setBounds(144, 58, 86, 20);
		panel.add(numberOfLessons);
		numberOfLessons.setColumns(10);

		numberOfExercises = new JTextField();
		numberOfExercises.setBounds(265, 58, 86, 20);
		panel.add(numberOfExercises);
		numberOfExercises.setColumns(10);

		JLabel lblDisciplName = new JLabel("Name");
		lblDisciplName.setBounds(36, 33, 46, 14);
		panel.add(lblDisciplName);

		JLabel lblNumberOfLessons = new JLabel("Number of lessons");
		lblNumberOfLessons.setBounds(138, 33, 116, 14);
		panel.add(lblNumberOfLessons);

		JLabel lblNumberOfExercises = new JLabel("Number of exercises");
		lblNumberOfExercises.setBounds(264, 33, 126, 14);
		panel.add(lblNumberOfExercises);

		btnAddDiscipline = new JButton("Add discipline");
		btnAddDiscipline.setBounds(472, 57, 126, 23);
		btnAddDiscipline.setBackground(Color.lightGray);
		btnAddDiscipline.addActionListener(lb);
		panel.add(btnAddDiscipline);

		JLabel lblTeacher = new JLabel("Teacher");
		lblTeacher.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblTeacher.setBounds(10, 108, 86, 22);
		lblTeacher.setForeground(Color.BLUE);
		panel.add(lblTeacher);

		teacherName = new JTextField();
		teacherName.setBounds(10, 170, 86, 20);
		panel.add(teacherName);
		teacherName.setColumns(10);

		JLabel lblName = new JLabel("Name");
		lblName.setBounds(36, 145, 46, 14);
		panel.add(lblName);

		teachingDiscipline = new JTextField();
		teachingDiscipline.setBounds(144, 170, 86, 20);
		panel.add(teachingDiscipline);
		teachingDiscipline.setColumns(10);

		JLabel lblTeachingDiscipline = new JLabel("Teaching discipline");
		lblTeachingDiscipline.setBounds(144, 145, 110, 14);
		panel.add(lblTeachingDiscipline);

		btnAddTeacher = new JButton("Add teacher");
		btnAddTeacher.setBounds(472, 169, 126, 23);
		btnAddTeacher.addActionListener(lb);
		btnAddTeacher.setBackground(Color.lightGray);
		panel.add(btnAddTeacher);

		JLabel lblPupil = new JLabel("Pupil");
		lblPupil.setForeground(Color.BLUE);
		lblPupil.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblPupil.setBounds(10, 208, 72, 22);
		panel.add(lblPupil);

		pupilClas = new JTextField();
		pupilClas.setBounds(265, 257, 86, 20);
		panel.add(pupilClas);
		pupilClas.setColumns(10);

		pupilName = new JTextField();
		pupilName.setBounds(10, 257, 86, 20);
		panel.add(pupilName);
		pupilName.setColumns(10);

		numberInClass = new JTextField();
		numberInClass.setBounds(144, 257, 86, 20);
		panel.add(numberInClass);
		numberInClass.setColumns(10);

		JLabel lblClass = new JLabel("Class");
		lblClass.setBounds(289, 232, 46, 14);
		panel.add(lblClass);

		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setBounds(36, 232, 46, 14);
		panel.add(lblName_1);

		JLabel lblNumber = new JLabel("Number");
		lblNumber.setBounds(168, 232, 46, 14);
		panel.add(lblNumber);

		btnAddPupil = new JButton("Add pupil");
		btnAddPupil.setBackground(Color.LIGHT_GRAY);
		btnAddPupil.setBounds(472, 256, 126, 23);
		panel.add(btnAddPupil);
		btnAddPupil.addActionListener(lb);

		btnSeeInfo = new JButton("See Info");
		btnSeeInfo.setBounds(472, 319, 126, 23);
		panel.add(btnSeeInfo);
		btnSeeInfo.addActionListener(lb);
	}

	private class ListenForButton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnAddDiscipline) {
				int numberLessons = Integer.parseInt(numberOfLessons.getText());
				int numberExercises = Integer.parseInt(numberOfExercises.getText());
				Discipline disc = new Discipline(discName.getText(), numberLessons, numberExercises);
				discipline.add(disc);
				System.out.println(discipline);
				
				discName.setText("");
				numberOfLessons.setText("");
				numberOfExercises.setText("");
			}

			if (e.getSource() == btnAddTeacher) {
				Teacher teach = new Teacher(teacherName.getText(), teachingDiscipline.getText());
				teacher.add(teach);

				System.out.println(teacher);
				
				teacherName.setText("");
				teachingDiscipline.setText("");
			}

			if (e.getSource() == btnAddPupil) {
				int pupilNumber = Integer.parseInt(numberInClass.getText());
				Pupil pup = new Pupil(pupilName.getText(), pupilNumber, pupilClas.getText());
				pupil.add(pup);
				System.out.println(pupil);
				
				pupilName.setText("");
				numberInClass.setText("");
				pupilClas.setText("");
			}
			if (e.getSource() == btnSeeInfo) {
				
				if (infoFrame.isVisible()) {
					infoFrame.setVisible(false);
					btnSeeInfo.setText("See Info");
					textArea.setText("");
				} else {
					infoFrame.setVisible(true);
					btnSeeInfo.setText("Close Info");
					textArea.append(discipline.toString());
					textArea.append(teacher.toString());
					textArea.append(pupil.toString());
				}
			}
		}

	}
}
