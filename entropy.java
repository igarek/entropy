import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Entropy extends Frame {
FileDialog dialogLoad;

    protected TextField inFileName;
    protected TextField outFileName;
    public TextField znachennya;

    public static void main (String [] argv){
Entropy h = new Entropy();

    }

    TextField surname;
    public class Listener1 implements ActionListener{
	public void actionPerformed(ActionEvent e) {
	surname.setText("енко");
//System.exit(0);
	}
   }

	Frame myWindow;

    public Entropy(){
	setTitle("Сalculate the Entropy");	
	setSize(800, 600);
        GridLayout grid1= new GridLayout(6,3);// кількість стовбців, кількість рядків
        setLayout(grid1);

       add(new Label("Завантажити вхідний ряд"));
	 inFileName=new TextField("..");
        add(inFileName);
	Button BtDownload = new Button("Обзор");
        add(BtDownload );

       add(new Label("Розмір вікна"));
	 znachennya=new TextField("250");
        add(znachennya);
//Button BtName = new Button("SetSurname ");
        //add(BtName);
       
  
	add(new Label(""));
       add(new Label("Завантажити вихідний ряд"));
	 outFileName=new TextField("..");
        add(outFileName);
	Button BtDownload2 = new Button("Обзор");
        add(BtDownload2 );

      add(new Label(""));

Button BtResult = new Button("Порахувати ентропію");
        add(new Label(""));
        add(BtResult);

	Panel hello = new Panel();
	add("Center", hello);
        myWindow=this;
        
	BtDownload.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	dialogLoad = new FileDialog(myWindow, "Вибір файла", FileDialog.LOAD);
	dialogLoad.show();
	String file = dialogLoad.getFile();
	String directory = dialogLoad.getDirectory();
	String fullFileName = directory + file;
	inFileName.setText(fullFileName);
   	}
	});


        BtDownload2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	dialogLoad = new FileDialog(myWindow, "Вибір файла", FileDialog.SAVE);
	dialogLoad.show();
	String file = dialogLoad.getFile();
	String directory = dialogLoad.getDirectory();
	String fullFileName = directory + file;
	 outFileName.setText(fullFileName);

//System.exit(0);
	   }
	});

	setVisible(true);
	//grid1.setRows(6);
	//grid1.setColumns(6);


	addWindowListener(new WindowAdapter(){
	    public void windowClosing(WindowEvent e){ 
		System.exit(0);
	    }
	});
    }
}
