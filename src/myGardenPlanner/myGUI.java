package myGardenPlanner;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


//------------------PLANT CLASSES---------------------
interface Eatable {
	public abstract void chop();
	
	public abstract void eat();
}

class DayHr {

	String day;
	String month;
	String year;
	String hour;
	String duration;
}

abstract class Plant extends DayHr {
	String color;
	
	public abstract void setColor(String c);
	
	public abstract String getColor();
	
//	public String[] getWatered() {
//	 String[] getWatered = new String[] { day, hour, duration };
//	
//	 return getWatered;
//	}
	public String[] getWatered() {
		 String[] getWatered = new String[] { day, month, year, hour, duration };
		
		 return getWatered;
		}
	
	public void setWatered(String d, String h, String j) {
	 day = d;
	 hour = h;
	 duration = j;
	}
	public void setWatered(String d, String m, String y, String h, String j) {
	 day = d;
	 month = m;
	 year = y;
	 hour = h;
	 duration = j;
	}
	
	public void setWatered() {
	 day = "Monday";
	 hour = "10";
	 duration = "1";
	}

}

class Flower extends Plant {
	String name;
	int smell;
	
	public Flower(String n, String c) {
		name = n;
		color = c;
	}
	
	public Flower(String n) {
	 name = n;
	}
	
	public void setColor(String c) {
	 color = c;
	}
	
	public String getColor() {
	 return color;
	}
	
	public void setIntensity(int s) {
	 if (s > 0 && s < 6) {
	     smell = s;
	 }
	}

	public int getIntensity() {
	 return smell;
	}
	
	public String[] getWatered() {
		 String[] getWatered = new String[] { day, month, year, hour, duration };
		
		 return getWatered;
		}
	
	public void setWatered(String d, String m, String y, String h, String j) {
		 day = d;
		 month = m;
		 year = y;
		 hour = h;
		 duration = j;
	}

}

abstract class Fruit extends Plant implements Eatable {
	int price;
	
	public String getColor() {
	 return color;
	}
	
	public void setColor(String c) {
	 color = c;
	}
	
	public int getPrice() {
	 return price;
	}
	
	public void setPrice(int p) {
	 price = p;
	}
	
	public void chop() {
	 System.out.printf("Don't chop the fruit byte it");
	}
	
	public void eat() {
	 System.out.printf("You should eat fruits raw");
	}
}

class Vegetables extends Plant implements Eatable {
	public int weight;
	
	public void setWeight(int w) {
	 weight = w;
	}
	
	public int getWeight() {
	 return weight;
	}
	
	public void setColor(String c) {
	 color = c;
	}
	
	public String getColor() {
	 return color;
	}
	
	public void chop() {
	 System.out.printf("Chop the vegetable byte it");
	}
	
	public void eat() {
	 System.out.printf("You should eat vegetables cooked");
	}
}

class Citrus extends Fruit {

	String cname;
	
	public Citrus(String n) {
	 cname = n;
	}
	
	public Citrus(String n, String c) {
		 cname = n;
		 color = c;
		}
	
	public void setColor(String c) {
	 color = c;
	}
	
	public String getColor() {
	 return color;
	}

}

class Apple extends Fruit {

	String aname;
	
	public Apple(String n) {
	 aname = n;
	}
	public Apple(String n, String c) {
		 aname = n;
		 color = c;
	}
	
	public void setColor(String c) {
	 color = c;
	}
	
	public String getColor() {
	 return color;
	}

}

class Tomato extends Vegetables {
	String type;
//	public String[] getWatered() {
//		 String[] getWatered = new String[] { day, month, year, hour, duration };
//		
//		 return getWatered;
//		}
//	
//	public void setWatered(String d, String m, String y, String h, String j) {
//		 day = d;
//		 month = m;
//		 year = y;
//		 hour = h;
//		 duration = j;
//	}
}


public class myGUI extends JFrame implements ActionListener{
	
	JButton vegSubmitButton;
	JButton fruitSubmitButton;
	JButton flowerSubmitButton;
	JPanel flowerPanel;
	JPanel fruitPanel;
	JPanel vegPanel;
	JPanel blankPanel;
	JPanel resultsPanel;
	
	JButton flowerSearchButton;
	JButton fruitSearchButton;
	JButton vegSearchButton;
	
	JComboBox smellCombo;
	JComboBox plantsCombo;
	JComboBox day;
	JComboBox month;
	JComboBox year;
	JComboBox time;
	JComboBox duration;
	
	JComboBox fruitDayCombo;
	JComboBox fruitMonthCombo;
	JComboBox fruitYearCombo;
	JComboBox fruitTimeCombo;
	JComboBox fruitDurationCombo;
	
	JComboBox vegDayCombo;
	JComboBox vegMonthCombo;
	JComboBox vegYearCombo;
	JComboBox vegTimeCombo;
	JComboBox vegDurationCombo;
	
	
	static String flowerColor;
	static String flowerName;
	static String flowerDate;
	static String flowerMonth;
	static String flowerYear;
	static String flowerTime;
	static String flowerDuration;
	
	static String fruitColor;
	static String fruitName;
	static String fruitDate;
	static String fruitMonth;
	static String fruitYear;
	static String fruitTime;
	static String fruitDuration;
	
	static String vegColor;
	static String vegName;
	static String vegDate;
	static String vegMonth;
	static String vegYear;
	static String vegTime;
	static String vegDuration;
	
	JTextField fruitDateText;
	JTextField flowerText;
	JTextField flowerColorText;
	JTextField dateText;
	JTextField timeText;
	JTextField durationText;
	JTextField fruitText;
	JTextField fruitColorText;
	JTextField fruitTimeText;
	JTextField fruitDurationText;
	JTextField vegText;
	JTextField vegColorText;
	JTextField vegDateText;
	JTextField vegTimeText;
	JTextField vegDurationText;
	
	JTextArea flowerResultText;
	JTextArea fruitResultText;
	JTextArea vegResultText;
	
	public myGUI() {
		
//--------------------------GUI---------------------------
		
		//leftPanel
		JLabel selectPlant = new JLabel();
		selectPlant.setText("Select Plant :");
		selectPlant.setHorizontalAlignment(JLabel.LEFT);
		selectPlant.setBounds(30, 20, 100, 50);
		
		String[] myPlants = {"Flower", "Fruit", "Vegetable", "None"};
		plantsCombo = new JComboBox(myPlants);
		plantsCombo.setBounds(150,35,100,20);
		plantsCombo.addActionListener(this);
		
		JButton addButton = new JButton();
		addButton.setText("Add");
		addButton.setBounds(30, 400, 80,30);
		
		flowerSearchButton = new JButton();
		flowerSearchButton.setText("Search");
		flowerSearchButton.setBounds(200, 400, 80, 30);
		flowerSearchButton.addActionListener(this);
		flowerSearchButton.setVisible(true);
		
		fruitSearchButton = new JButton();
		fruitSearchButton.setText("Search");
		fruitSearchButton.setBounds(200, 400, 80, 30);
		fruitSearchButton.addActionListener(this);
		fruitSearchButton.setVisible(false);
		
		vegSearchButton = new JButton();
		vegSearchButton.setText("Search");
		vegSearchButton.setBounds(200, 400, 80, 30);
		vegSearchButton.addActionListener(this);
		vegSearchButton.setVisible(false);
		
		JPanel leftPanel = new JPanel();
//		leftPanel.setBackground(Color.red);
		leftPanel.setBounds(0, 0, 400, 800);
		leftPanel.setLayout(null);
		leftPanel.add(selectPlant);
		leftPanel.add(plantsCombo);
		leftPanel.add(addButton);
		leftPanel.add(flowerSearchButton);
		leftPanel.add(fruitSearchButton);
		leftPanel.add(vegSearchButton);
		leftPanel.setVisible(true);
		
			
		//rightPanel
		
		//blank Panel
		blankPanel = new JPanel();
		blankPanel.setBackground(Color.white);
		blankPanel.setBounds(400, 0, 600, 800);
		blankPanel.setLayout(null);
		blankPanel.setVisible(true);
		
		//results Panel
		flowerResultText = new JTextArea(); 
		flowerResultText.setBounds(50, 20, 500, 500);
		flowerResultText.setLineWrap(true);
		flowerResultText.setText("  ");
		flowerResultText.setWrapStyleWord(true);
		flowerResultText.setEditable(false);
		
		fruitResultText = new JTextArea(); 
		fruitResultText.setBounds(50, 20, 500, 500);
		fruitResultText.setLineWrap(true);
		fruitResultText.setText("  ");
		fruitResultText.setWrapStyleWord(true);
		fruitResultText.setEditable(false);
		
		vegResultText = new JTextArea(); 
		vegResultText.setBounds(50, 20, 500, 500);
		vegResultText.setLineWrap(true);
		vegResultText.setText("  ");
		vegResultText.setWrapStyleWord(true);
		vegResultText.setEditable(false);
		
		
		resultsPanel = new JPanel();
//		resultsPanel.setBackground(Color.blue);
		resultsPanel.setBounds(400, 0, 600, 800);
		resultsPanel.setLayout(null);
		resultsPanel.setVisible(false);
		resultsPanel.add(flowerResultText);
		resultsPanel.add(fruitResultText);
		resultsPanel.add(vegResultText);
		
		
		
	
		//----------FLOWER---------
		JLabel flowerNameText = new JLabel();
		flowerNameText.setText("Enter Flower Name :");
		flowerNameText.setHorizontalAlignment(JLabel.LEFT);
		flowerNameText.setBounds(30, 20, 150, 50);		
		flowerText = new JTextField();
		flowerText.setBounds(200 ,30, 150, 35);
		
		
		JLabel flowerColor = new JLabel();
		flowerColor.setText("Enter Flower Color :");
		flowerColor.setHorizontalAlignment(JLabel.LEFT);
		flowerColor.setBounds(30, 100, 150, 50);		
		flowerColorText = new JTextField();
		flowerColorText.setBounds(200 ,100, 150, 35);
		
		JLabel flowerIntensity = new JLabel();
		flowerIntensity.setText("Flower Intensity :");
		flowerIntensity.setHorizontalAlignment(JLabel.LEFT);
		flowerIntensity.setBounds(30, 200, 150, 50);
		String[] intensities = {"Very Intense", "Intense", "Midium", "Weak", "Very Weak"};
		smellCombo = new JComboBox(intensities);
		smellCombo.setBounds(220,220,100,20);

		
		JLabel waterTime = new JLabel();
		waterTime.setText("Time :");
		waterTime.setHorizontalAlignment(JLabel.LEFT);
		waterTime.setBounds(40, 428, 150, 50);
		timeText = new JTextField();
		timeText.setBounds(40 ,435, 40, 29);
		
		JLabel waterDuration = new JLabel();
		waterDuration.setText("Duration :");
		waterDuration.setHorizontalAlignment(JLabel.LEFT);
		waterDuration.setBounds(350, 420, 150, 50);
		durationText = new JTextField();
		durationText.setBounds(430 ,435, 40, 29);
		
		String[] days = {"1","2","3","4","4","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31",};
		String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		String[] years = {"2021","2022","2023","2024","2025","2026","2027","2028","2029","2030"};
		String[] times = {"0000hrs","0100hrs","0200hrs","0300hrs","0400hrs","0500hrs","0600hrs","0700hrs","0800hrs","0900hrs","1000hrs","1100hrs","1200hrs","1300hrs","1400hrs","1500hrs","1600hrs","1700hrs","1800hrs","1900hrs","2000hrs","2100hrs","2200hrs","2300hrs"};
		
		day = new JComboBox(days);
		month = new JComboBox(months);
		year = new JComboBox(years);
		time = new JComboBox(times);
		
		day.addActionListener(this);
		month.addActionListener(this);
		year.addActionListener(this);
		time.addActionListener(this);
		
		day.setBounds(80 ,335, 70, 29);
		month.setBounds(230 ,335, 70, 29);
		year.setBounds(410 ,335, 70, 29);
		time.setBounds(140 ,435, 90, 29);
		
		
		
		flowerSubmitButton = new JButton();
		flowerSubmitButton.setText("Submit");
		flowerSubmitButton.setBounds(200, 650, 80, 30);
		flowerSubmitButton.addActionListener(this);
		
		
		flowerPanel = new JPanel();
//		flowerPanel.setBackground(Color.green);
		flowerPanel.setBounds(400, 0, 600, 800);
		flowerPanel.setLayout(null);
		flowerPanel.add(flowerNameText);
		flowerPanel.add(flowerText);
		flowerPanel.add(flowerColor);
		flowerPanel.add(flowerColorText);
		flowerPanel.add(flowerIntensity);
		flowerPanel.add(smellCombo);
		flowerPanel.add(day);
		flowerPanel.add(month);
		flowerPanel.add(year);
		flowerPanel.add(time);
		flowerPanel.add(waterTime);
		flowerPanel.add(waterDuration);
		flowerPanel.add(durationText);
		flowerPanel.add(flowerSubmitButton);
		flowerPanel.setVisible(false);
		
		
		//----------FRUIT---------
		JLabel fruitNameText = new JLabel();
		fruitNameText.setText("Enter Fruit Name :");
		fruitNameText.setHorizontalAlignment(JLabel.LEFT);
		fruitNameText.setBounds(30, 20, 150, 50);	
		fruitText = new JTextField();
		fruitText.setBounds(200 ,30, 150, 35);
		
		JLabel fruitColor = new JLabel();
		fruitColor.setText("Enter Fruit Color :");
		fruitColor.setHorizontalAlignment(JLabel.LEFT);
		fruitColor.setBounds(30, 100, 150, 50);		
		fruitColorText = new JTextField();
		fruitColorText.setBounds(200 ,100, 150, 35);
		
		
		JLabel fruitWaterTime = new JLabel();
		fruitWaterTime.setText("Time :");
		fruitWaterTime.setHorizontalAlignment(JLabel.LEFT);
		fruitWaterTime.setBounds(40, 428, 150, 50);
		fruitTimeText = new JTextField();
		fruitTimeText.setBounds(250 ,335, 40, 29);
		
		JLabel fruitWaterDuration = new JLabel();
		fruitWaterDuration.setText("Duration :");
		fruitWaterDuration.setHorizontalAlignment(JLabel.LEFT);
		fruitWaterDuration.setBounds(350, 420, 150, 50);
		fruitDurationText = new JTextField();
		fruitDurationText.setBounds(430 ,435, 40, 29);
		
		String[] fruitDaysList = {"1","2","3","4","4","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31",};
		String[] fruitMonthsList = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		String[] fruitYearsList = {"2021","2022","2023","2024","2025","2026","2027","2028","2029","2030"};
		String[] fruitTimesList = {"0000hrs","0100hrs","0200hrs","0300hrs","0400hrs","0500hrs","0600hrs","0700hrs","0800hrs","0900hrs","1000hrs","1100hrs","1200hrs","1300hrs","1400hrs","1500hrs","1600hrs","1700hrs","1800hrs","1900hrs","2000hrs","2100hrs","2200hrs","2300hrs"};
		
		fruitDayCombo = new JComboBox(fruitDaysList);
		fruitMonthCombo = new JComboBox(fruitMonthsList);
		fruitYearCombo = new JComboBox(fruitYearsList);
		fruitTimeCombo = new JComboBox(fruitTimesList);
		
		fruitDayCombo.addActionListener(this);
		fruitMonthCombo.addActionListener(this);
		fruitYearCombo.addActionListener(this);
		fruitTimeCombo.addActionListener(this);
		
		fruitDayCombo.setBounds(80 ,335, 70, 29);
		fruitMonthCombo.setBounds(230 ,335, 70, 29);
		fruitYearCombo.setBounds(410 ,335, 70, 29);
		fruitTimeCombo.setBounds(140 ,435, 90, 29);

		
		fruitSubmitButton = new JButton();
		fruitSubmitButton.setText("Submit");
		fruitSubmitButton.setBounds(200, 650, 80, 30);
		fruitSubmitButton.addActionListener(this);
		
		fruitPanel = new JPanel();
//		fruitPanel.setBackground(Color.pink);
		fruitPanel.setBounds(400, 0, 600, 800);
		fruitPanel.setLayout(null);
		fruitPanel.add(fruitNameText);
		fruitPanel.add(fruitText);
		fruitPanel.add(fruitColor);
		fruitPanel.add(fruitColorText);
		fruitPanel.add(fruitDayCombo);
		fruitPanel.add(fruitMonthCombo);
		fruitPanel.add(fruitYearCombo);
		fruitPanel.add(fruitTimeCombo);
		fruitPanel.add(fruitWaterDuration);
		fruitPanel.add(fruitWaterTime);
		fruitPanel.add(fruitDurationText);
		fruitPanel.add(fruitSubmitButton);
		fruitPanel.setVisible(false);
		
		
		//----------VEGETABLE---------
		JLabel vegNameText = new JLabel();
		vegNameText.setText("Enter Vegetable Name :");
		vegNameText.setHorizontalAlignment(JLabel.LEFT);
		vegNameText.setBounds(30, 20, 150, 50);		
		vegText = new JTextField();
		vegText.setBounds(200 ,30, 150, 35);
		
		JLabel vegColor = new JLabel();
		vegColor.setText("Enter Vegetable Color :");
		vegColor.setHorizontalAlignment(JLabel.LEFT);
		vegColor.setBounds(30, 100, 150, 50);		
		vegColorText = new JTextField();
		vegColorText.setBounds(200 ,100, 150, 35);
		
		JLabel vegWaterDate = new JLabel();
		vegWaterDate.setText("Date :");
		vegWaterDate.setHorizontalAlignment(JLabel.LEFT);
		vegWaterDate.setBounds(30, 320, 150, 50);
		vegDateText = new JTextField();
		vegDateText.setBounds(100 ,335, 40, 29);
		
		JLabel vegWaterTime = new JLabel();
		vegWaterTime.setText("Time :");
		vegWaterTime.setHorizontalAlignment(JLabel.LEFT);
		vegWaterTime.setBounds(40, 428, 150, 50);
		vegTimeText = new JTextField();
		vegTimeText.setBounds(250 ,335, 40, 29);
		
		JLabel vegWaterDuration = new JLabel();
		vegWaterDuration.setText("Duration :");
		vegWaterDuration.setHorizontalAlignment(JLabel.LEFT);
		vegWaterDuration.setBounds(350, 420, 150, 50);
		vegDurationText = new JTextField();
		vegDurationText.setBounds(430 ,435, 40, 29);
		
		String[] vegDaysList = {"1","2","3","4","4","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31",};
		String[] vegMonthsList = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		String[] vegYearsList = {"2021","2022","2023","2024","2025","2026","2027","2028","2029","2030"};
		String[] vegTimesList = {"0000hrs","0100hrs","0200hrs","0300hrs","0400hrs","0500hrs","0600hrs","0700hrs","0800hrs","0900hrs","1000hrs","1100hrs","1200hrs","1300hrs","1400hrs","1500hrs","1600hrs","1700hrs","1800hrs","1900hrs","2000hrs","2100hrs","2200hrs","2300hrs"};
		
		vegDayCombo = new JComboBox(vegDaysList);
		vegMonthCombo = new JComboBox(vegMonthsList);
		vegYearCombo = new JComboBox(vegYearsList);
		vegTimeCombo = new JComboBox(vegTimesList);
		
		vegDayCombo.addActionListener(this);
		vegMonthCombo.addActionListener(this);
		vegYearCombo.addActionListener(this);
		vegTimeCombo.addActionListener(this);
		
		vegDayCombo.setBounds(80 ,335, 70, 29);
		vegMonthCombo.setBounds(230 ,335, 70, 29);
		vegYearCombo.setBounds(410 ,335, 70, 29);
		vegTimeCombo.setBounds(140 ,435, 90, 29);
		
		vegSubmitButton = new JButton();
		vegSubmitButton.setText("Submit");
		vegSubmitButton.setBounds(200, 650, 80, 30);
		vegSubmitButton.addActionListener(this);
		
		vegPanel = new JPanel();
//		vegPanel.setBackground(Color.yellow);
		vegPanel.setBounds(400, 0, 600, 800);
		vegPanel.setLayout(null);
		vegPanel.add(vegNameText);
		vegPanel.add(vegText);
		vegPanel.add(vegColor);
		vegPanel.add(vegColorText);
		vegPanel.add(vegDayCombo);
		vegPanel.add(vegMonthCombo);
		vegPanel.add(vegYearCombo);
		vegPanel.add(vegTimeCombo);
		vegPanel.add(vegWaterDuration);
		vegPanel.add(vegWaterTime);
		vegPanel.add(vegDurationText);
		vegPanel.add(vegSubmitButton);
		vegPanel.setVisible(false);
		
		
		
		//main frame
		
		JFrame frame = new JFrame();
		this.setTitle("My Garden Planner");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(1000, 800);
		this.setVisible(true);
		this.add(leftPanel);
		this.add(blankPanel);
		this.add(flowerPanel);
		this.add(fruitPanel);
		this.add(vegPanel);
		this.add(resultsPanel);
	}
	
//-----------------------ACTIONS---------------------------
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == plantsCombo) {
			if(plantsCombo.getSelectedIndex() == 0) {
				flowerSearchButton.setVisible(true);
				fruitSearchButton.setVisible(false);
				vegSearchButton.setVisible(false);
				flowerPanel.setVisible(true);
				fruitPanel.setVisible(false);
				vegPanel.setVisible(false);
				blankPanel.setVisible(false);
				
			}else if(plantsCombo.getSelectedIndex() == 1) {
				flowerSearchButton.setVisible(false);
				fruitSearchButton.setVisible(true);
				vegSearchButton.setVisible(false);
				flowerPanel.setVisible(false);
				fruitPanel.setVisible(true);
				vegPanel.setVisible(false);
				blankPanel.setVisible(false);
			}
			else if(plantsCombo.getSelectedIndex() == 2) {
				flowerSearchButton.setVisible(false);
				fruitSearchButton.setVisible(false);
				vegSearchButton.setVisible(true);
				flowerPanel.setVisible(false);
				fruitPanel.setVisible(false);
				vegPanel.setVisible(true);
				blankPanel.setVisible(false);
			}
			else {
				blankPanel.setVisible(true);
			}
		}
		
		//submits

		
		flowerName = flowerText.getText();
		flowerColor = flowerColorText.getText();
		flowerDate = day.getSelectedItem() + "";
		flowerMonth = month.getSelectedItem() + "";
		flowerYear = year.getSelectedItem() + "";
		flowerTime = time.getSelectedItem() + "";
 		flowerDuration = durationText.getText();

		
		fruitName = fruitText.getText();
		fruitColor = fruitColorText.getText();
		fruitDate = fruitDayCombo.getSelectedItem() + "";
		fruitMonth = fruitMonthCombo.getSelectedItem() + "";
		fruitYear = fruitYearCombo.getSelectedItem() + "";
		fruitTime = fruitTimeCombo.getSelectedItem() + "";
 		fruitDuration = fruitDurationText.getText();
 		
 		vegName = vegText.getText();
 		vegColor = vegColorText.getText();
 		vegDate = vegDayCombo.getSelectedItem() + "";
 		vegMonth = vegMonthCombo.getSelectedItem() + "";
 		vegYear = vegYearCombo.getSelectedItem() + "";
 		vegTime = vegTimeCombo.getSelectedItem() + "";
 		vegDuration = vegDurationText.getText();
		
		 if(e.getSource() == flowerSubmitButton) {
			System.out.println("flower clicked");

			
			Flower f1 = new Flower(flowerName,flowerColor);
			f1.setWatered(flowerDate,flowerMonth,flowerYear, flowerTime, flowerDuration);
			String[] wateringSchedule = f1.getWatered();

			flowerResultText.append(
					
					f1.name +" "+ 
					f1.color +", "+ 
					wateringSchedule[0] +" "+
					wateringSchedule[1] +" "+ 
					wateringSchedule[2] +", "+ 
					wateringSchedule[3] +", "+
					wateringSchedule[4] +" \n \n"
					
					);
			
//			resultsPanel.setVisible(true);
			flowerPanel.setVisible(true);
			fruitPanel.setVisible(false);
			vegPanel.setVisible(false);
			blankPanel.setVisible(false);
			resultsPanel.setVisible(false);
			
			
			
			
			
		}else if(e.getSource() == fruitSubmitButton) {
						
			System.out.println("fruit clicked");
			Flower f1 = new Flower(fruitName,fruitColor);
			f1.setWatered(fruitDate,fruitMonth,fruitYear, fruitTime, fruitDuration);
			String[] wateringSchedule = f1.getWatered();
			
			fruitResultText.append(
					
					f1.name +" "+ 
					f1.color +", "+ 
					wateringSchedule[0] +" "+
					wateringSchedule[1] +" "+ 
					wateringSchedule[2] +", "+ 
					wateringSchedule[3] +", "+
					wateringSchedule[4] +" \n \n"
					
					);
			
			//panels display
			resultsPanel.setVisible(false);
			flowerPanel.setVisible(false);
			fruitPanel.setVisible(true);
			vegPanel.setVisible(false);
			blankPanel.setVisible(false);
		}else if(e.getSource() == vegSubmitButton) {
			
			//actions
			Flower f1 = new Flower(vegName,vegColor);
			f1.setWatered(vegDate,vegMonth,vegYear, vegTime, vegDuration);
			String[] wateringSchedule = f1.getWatered();

			vegResultText.append(
					
					f1.name +" "+ 
					f1.color +", "+ 
					wateringSchedule[0] +" "+
					wateringSchedule[1] +" "+ 
					wateringSchedule[2] +", "+ 
					wateringSchedule[3] +", "+
					wateringSchedule[4] +" \n \n"
					
					);
			
			
			
			//panels display
			resultsPanel.setVisible(false);
			flowerPanel.setVisible(false);
			fruitPanel.setVisible(false);
			vegPanel.setVisible(true);
			blankPanel.setVisible(false);
		}
		
		//SUSUSUSUSSUSUSUS
		if(e.getSource() == flowerSearchButton) {
			System.out.println("flower search clicked");
			flowerPanel.setVisible(false);
			resultsPanel.setVisible(true);
			fruitResultText.setVisible(false);
			flowerResultText.setVisible(true);
			vegResultText.setVisible(false);
			
		}
		else if(e.getSource() == fruitSearchButton) {
			System.out.println("fruit search clicked");
			fruitPanel.setVisible(false);
			resultsPanel.setVisible(true);
			fruitResultText.setVisible(true);
			flowerResultText.setVisible(false);
			vegResultText.setVisible(false);
		}
		else if(e.getSource() == vegSearchButton) {
			System.out.println("veg search clicked");
			vegPanel.setVisible(false);
			resultsPanel.setVisible(true);
			fruitResultText.setVisible(false);
			flowerResultText.setVisible(false);
			vegResultText.setVisible(true);
		}
	}
	
	
	
//-------------------MAIN------------------------

	public static void main(String[] args) {
		
		//testing program
//		Flower f1 = new Flower("Rose Flower");
//		System.out.println(f1.name);
		myGUI gui = new myGUI();

	}




}
