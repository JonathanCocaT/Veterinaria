
package view;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import clases.*;
import javax.swing.DefaultListModel;
import controller.*;
import java.awt.HeadlessException;


public class frmPet extends javax.swing.JFrame {
    
    ctlPet ctlPet;
    LinkedList<clsDog>dogObjectList = new LinkedList<>();
     LinkedList<clsCat>catObjectList = new LinkedList<>();

    /**
     * Creates new form frmPet
     */
    public frmPet() {
        initComponents();
        this.ctlPet = new ctlPet();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PlanelGeneral = new javax.swing.JPanel();
        PetManager = new javax.swing.JTabbedPane();
        Petlist = new javax.swing.JPanel();
        List = new javax.swing.JScrollPane();
        PetList = new javax.swing.JList<>();
        CatManager = new javax.swing.JPanel();
        CodeCat = new javax.swing.JLabel();
        txtcodecat = new javax.swing.JTextField();
        SepaCodeCat = new javax.swing.JSeparator();
        BronYearCat = new javax.swing.JLabel();
        txtBronYearCat = new javax.swing.JTextField();
        SepaBronYearCat = new javax.swing.JSeparator();
        NameCat = new javax.swing.JLabel();
        txtNamecat = new javax.swing.JTextField();
        SepaNameCat = new javax.swing.JSeparator();
        ColorCat = new javax.swing.JLabel();
        txtColorcat = new javax.swing.JTextField();
        SepaColorCat = new javax.swing.JSeparator();
        HealthStatusCat = new javax.swing.JLabel();
        CbHealthStatusCat = new javax.swing.JComboBox<>();
        SepaHealthStatusCat = new javax.swing.JSeparator();
        BreedCat = new javax.swing.JLabel();
        CbBreedCat = new javax.swing.JComboBox<>();
        SepaBreedCat = new javax.swing.JSeparator();
        AgregarCat = new javax.swing.JButton();
        BuscarCat = new javax.swing.JButton();
        EliminaCat = new javax.swing.JButton();
        EditarCat = new javax.swing.JButton();
        DogManager = new javax.swing.JPanel();
        CodeDog = new javax.swing.JLabel();
        txtcodeDog = new javax.swing.JTextField();
        SepaCodeDog = new javax.swing.JSeparator();
        BronYearDog = new javax.swing.JLabel();
        txtBronYearDog = new javax.swing.JTextField();
        SepaBronYearDog = new javax.swing.JSeparator();
        NameDog = new javax.swing.JLabel();
        txtNameDog = new javax.swing.JTextField();
        SepaNameDog = new javax.swing.JSeparator();
        ColorDog = new javax.swing.JLabel();
        txtColorDog = new javax.swing.JTextField();
        SepaColorDog = new javax.swing.JSeparator();
        HealthStatusDog = new javax.swing.JLabel();
        CbHealthStatusDog = new javax.swing.JComboBox<>();
        SepaHealthStatusDog = new javax.swing.JSeparator();
        BreedDog = new javax.swing.JLabel();
        CbBreedDog = new javax.swing.JComboBox<>();
        SepaBreedDog = new javax.swing.JSeparator();
        AgregarDog = new javax.swing.JButton();
        BuscarDog = new javax.swing.JButton();
        EliminarDog = new javax.swing.JButton();
        EditarDog = new javax.swing.JButton();
        ChekPedigreeDog = new javax.swing.JCheckBox();
        PanelSuperior = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PlanelGeneral.setPreferredSize(new java.awt.Dimension(600, 450));
        PlanelGeneral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PetManager.setBackground(new java.awt.Color(102, 102, 102));
        PetManager.setForeground(new java.awt.Color(255, 255, 255));
        PetManager.setToolTipText("");
        PetManager.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N

        Petlist.setBackground(new java.awt.Color(204, 204, 204));
        Petlist.setForeground(new java.awt.Color(255, 255, 255));

        PetList.setBackground(new java.awt.Color(102, 102, 102));
        PetList.setForeground(new java.awt.Color(255, 255, 255));
        PetList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Pet ", " ", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        List.setViewportView(PetList);

        javax.swing.GroupLayout PetlistLayout = new javax.swing.GroupLayout(Petlist);
        Petlist.setLayout(PetlistLayout);
        PetlistLayout.setHorizontalGroup(
            PetlistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PetlistLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(List, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                .addContainerGap())
        );
        PetlistLayout.setVerticalGroup(
            PetlistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PetlistLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(List, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addContainerGap())
        );

        PetManager.addTab("Pet List", Petlist);

        CatManager.setBackground(new java.awt.Color(204, 204, 204));

        CodeCat.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        CodeCat.setText("Code");

        SepaCodeCat.setForeground(new java.awt.Color(51, 51, 51));

        BronYearCat.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        BronYearCat.setText("Bron Year");

        SepaBronYearCat.setForeground(new java.awt.Color(51, 51, 51));

        NameCat.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        NameCat.setText("Name");

        txtNamecat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamecatActionPerformed(evt);
            }
        });

        SepaNameCat.setForeground(new java.awt.Color(51, 51, 51));

        ColorCat.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        ColorCat.setText("Color");

        SepaColorCat.setForeground(new java.awt.Color(51, 51, 51));

        HealthStatusCat.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        HealthStatusCat.setText("Health Status");

        CbHealthStatusCat.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        CbHealthStatusCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Sano", "Enfermo", "Critico", "Muerto" }));
        CbHealthStatusCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbHealthStatusCatActionPerformed(evt);
            }
        });

        SepaHealthStatusCat.setForeground(new java.awt.Color(51, 51, 51));

        BreedCat.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        BreedCat.setText("Breed");

        CbBreedCat.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        CbBreedCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Siamés", "Persa", "Bengalí", "Abisinio", "Azul RusoRagDoll", "Javanès" }));

        SepaBreedCat.setForeground(new java.awt.Color(51, 51, 51));

        AgregarCat.setBackground(new java.awt.Color(102, 102, 102));
        AgregarCat.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        AgregarCat.setForeground(new java.awt.Color(255, 255, 255));
        AgregarCat.setText("AGREGAR");
        AgregarCat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AgregarCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarCatActionPerformed(evt);
            }
        });

        BuscarCat.setBackground(new java.awt.Color(102, 102, 102));
        BuscarCat.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        BuscarCat.setForeground(new java.awt.Color(255, 255, 255));
        BuscarCat.setText("BUSCAR");
        BuscarCat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BuscarCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarCatActionPerformed(evt);
            }
        });

        EliminaCat.setBackground(new java.awt.Color(102, 102, 102));
        EliminaCat.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        EliminaCat.setForeground(new java.awt.Color(255, 255, 255));
        EliminaCat.setText("ELIMINAR");
        EliminaCat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EliminaCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminaCatActionPerformed(evt);
            }
        });

        EditarCat.setBackground(new java.awt.Color(102, 102, 102));
        EditarCat.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        EditarCat.setForeground(new java.awt.Color(255, 255, 255));
        EditarCat.setText("EDITAR");
        EditarCat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EditarCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarCatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CatManagerLayout = new javax.swing.GroupLayout(CatManager);
        CatManager.setLayout(CatManagerLayout);
        CatManagerLayout.setHorizontalGroup(
            CatManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CatManagerLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(CatManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CatManagerLayout.createSequentialGroup()
                        .addComponent(SepaHealthStatusCat)
                        .addGap(43, 43, 43))
                    .addGroup(CatManagerLayout.createSequentialGroup()
                        .addGroup(CatManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CatManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(SepaCodeCat)
                                .addComponent(SepaBronYearCat)
                                .addGroup(CatManagerLayout.createSequentialGroup()
                                    .addGroup(CatManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(CatManagerLayout.createSequentialGroup()
                                            .addComponent(CodeCat, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtcodecat, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(CatManagerLayout.createSequentialGroup()
                                            .addComponent(BronYearCat, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                            .addComponent(txtBronYearCat, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(24, 24, 24)))
                            .addGroup(CatManagerLayout.createSequentialGroup()
                                .addComponent(HealthStatusCat, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CbHealthStatusCat, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(CatManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CatManagerLayout.createSequentialGroup()
                        .addGroup(CatManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(CatManagerLayout.createSequentialGroup()
                                .addComponent(ColorCat, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtColorcat, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(CatManagerLayout.createSequentialGroup()
                                .addComponent(NameCat, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                                .addComponent(txtNamecat, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                            .addComponent(SepaColorCat)
                            .addComponent(SepaNameCat))
                        .addGap(74, 74, 74))
                    .addGroup(CatManagerLayout.createSequentialGroup()
                        .addGroup(CatManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CatManagerLayout.createSequentialGroup()
                                .addComponent(BreedCat, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CbBreedCat, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SepaBreedCat, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE))
                        .addGap(31, 31, 31))))
            .addGroup(CatManagerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AgregarCat, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BuscarCat, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EliminaCat, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EditarCat, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );
        CatManagerLayout.setVerticalGroup(
            CatManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CatManagerLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(CatManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CatManagerLayout.createSequentialGroup()
                        .addGroup(CatManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CodeCat)
                            .addComponent(txtcodecat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SepaCodeCat, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CatManagerLayout.createSequentialGroup()
                        .addGroup(CatManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NameCat)
                            .addComponent(txtNamecat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SepaNameCat, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(CatManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CatManagerLayout.createSequentialGroup()
                        .addGroup(CatManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BronYearCat)
                            .addComponent(txtBronYearCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SepaBronYearCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CatManagerLayout.createSequentialGroup()
                        .addGroup(CatManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ColorCat)
                            .addComponent(txtColorcat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SepaColorCat, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(CatManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CatManagerLayout.createSequentialGroup()
                        .addGroup(CatManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HealthStatusCat)
                            .addComponent(CbHealthStatusCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SepaHealthStatusCat, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CatManagerLayout.createSequentialGroup()
                        .addGroup(CatManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BreedCat)
                            .addComponent(CbBreedCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SepaBreedCat, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53)
                .addGroup(CatManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgregarCat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarCat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EliminaCat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditarCat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        PetManager.addTab("Cat Manager", CatManager);

        DogManager.setBackground(new java.awt.Color(204, 204, 204));

        CodeDog.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        CodeDog.setText("Code");

        txtcodeDog.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N

        SepaCodeDog.setForeground(new java.awt.Color(51, 51, 51));

        BronYearDog.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        BronYearDog.setText("Bron Year");

        txtBronYearDog.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N

        SepaBronYearDog.setForeground(new java.awt.Color(51, 51, 51));

        NameDog.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        NameDog.setText("Name");

        txtNameDog.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtNameDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameDogActionPerformed(evt);
            }
        });

        SepaNameDog.setForeground(new java.awt.Color(51, 51, 51));

        ColorDog.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        ColorDog.setText("Color");

        txtColorDog.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N

        SepaColorDog.setForeground(new java.awt.Color(51, 51, 51));

        HealthStatusDog.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        HealthStatusDog.setText("Health Status");

        CbHealthStatusDog.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        CbHealthStatusDog.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Sano", "Enfermo", "Critico", "Muerto" }));

        SepaHealthStatusDog.setForeground(new java.awt.Color(51, 51, 51));

        BreedDog.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        BreedDog.setText("Breed");

        CbBreedDog.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        CbBreedDog.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Affenpinscher", "Afgano", "Akita japonés", "Basenji", "Basset Azul de Gascuña", "Galgo italiano", "Shiba Inu", "Pomeriana", "Cocker Spaniel", "Bulldog francés", "Beagle" }));

        SepaBreedDog.setForeground(new java.awt.Color(51, 51, 51));

        AgregarDog.setBackground(new java.awt.Color(102, 102, 102));
        AgregarDog.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        AgregarDog.setForeground(new java.awt.Color(255, 255, 255));
        AgregarDog.setText("AGREGAR");
        AgregarDog.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AgregarDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarDogActionPerformed(evt);
            }
        });

        BuscarDog.setBackground(new java.awt.Color(102, 102, 102));
        BuscarDog.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        BuscarDog.setForeground(new java.awt.Color(255, 255, 255));
        BuscarDog.setText("BUSCAR");
        BuscarDog.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BuscarDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarDogActionPerformed(evt);
            }
        });

        EliminarDog.setBackground(new java.awt.Color(102, 102, 102));
        EliminarDog.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        EliminarDog.setForeground(new java.awt.Color(255, 255, 255));
        EliminarDog.setText("ELIMINAR");
        EliminarDog.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EliminarDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarDogActionPerformed(evt);
            }
        });

        EditarDog.setBackground(new java.awt.Color(102, 102, 102));
        EditarDog.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        EditarDog.setForeground(new java.awt.Color(255, 255, 255));
        EditarDog.setText("EDITAR");
        EditarDog.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EditarDog.setMaximumSize(new java.awt.Dimension(80, 23));
        EditarDog.setMinimumSize(new java.awt.Dimension(80, 23));
        EditarDog.setPreferredSize(new java.awt.Dimension(80, 23));
        EditarDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarDogActionPerformed(evt);
            }
        });

        ChekPedigreeDog.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        ChekPedigreeDog.setText("Pedigree");

        javax.swing.GroupLayout DogManagerLayout = new javax.swing.GroupLayout(DogManager);
        DogManager.setLayout(DogManagerLayout);
        DogManagerLayout.setHorizontalGroup(
            DogManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DogManagerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AgregarDog, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BuscarDog, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EliminarDog, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EditarDog, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
            .addGroup(DogManagerLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(DogManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DogManagerLayout.createSequentialGroup()
                        .addComponent(SepaHealthStatusDog)
                        .addGap(43, 43, 43))
                    .addGroup(DogManagerLayout.createSequentialGroup()
                        .addGroup(DogManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DogManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(SepaCodeDog)
                                .addComponent(SepaBronYearDog)
                                .addGroup(DogManagerLayout.createSequentialGroup()
                                    .addGroup(DogManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(DogManagerLayout.createSequentialGroup()
                                            .addComponent(CodeDog, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtcodeDog, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(DogManagerLayout.createSequentialGroup()
                                            .addComponent(BronYearDog, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                            .addComponent(txtBronYearDog, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(24, 24, 24)))
                            .addGroup(DogManagerLayout.createSequentialGroup()
                                .addComponent(HealthStatusDog, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CbHealthStatusDog, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(DogManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DogManagerLayout.createSequentialGroup()
                        .addGroup(DogManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(DogManagerLayout.createSequentialGroup()
                                .addComponent(ColorDog, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtColorDog, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(DogManagerLayout.createSequentialGroup()
                                .addComponent(NameDog, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                                .addComponent(txtNameDog, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                            .addComponent(SepaColorDog)
                            .addComponent(SepaNameDog))
                        .addGap(74, 74, 74))
                    .addGroup(DogManagerLayout.createSequentialGroup()
                        .addGroup(DogManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DogManagerLayout.createSequentialGroup()
                                .addComponent(BreedDog, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CbBreedDog, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ChekPedigreeDog, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SepaBreedDog, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE))
                        .addGap(31, 31, 31))))
        );
        DogManagerLayout.setVerticalGroup(
            DogManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DogManagerLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(DogManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DogManagerLayout.createSequentialGroup()
                        .addGroup(DogManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CodeDog)
                            .addComponent(txtcodeDog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SepaCodeDog, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DogManagerLayout.createSequentialGroup()
                        .addGroup(DogManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NameDog)
                            .addComponent(txtNameDog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SepaNameDog, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(DogManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DogManagerLayout.createSequentialGroup()
                        .addGroup(DogManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BronYearDog)
                            .addComponent(txtBronYearDog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SepaBronYearDog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DogManagerLayout.createSequentialGroup()
                        .addGroup(DogManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ColorDog)
                            .addComponent(txtColorDog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SepaColorDog, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(DogManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DogManagerLayout.createSequentialGroup()
                        .addGroup(DogManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HealthStatusDog)
                            .addComponent(CbHealthStatusDog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SepaHealthStatusDog, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DogManagerLayout.createSequentialGroup()
                        .addGroup(DogManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BreedDog)
                            .addComponent(CbBreedDog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ChekPedigreeDog))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SepaBreedDog, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53)
                .addGroup(DogManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgregarDog, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarDog, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EliminarDog, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditarDog, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        PetManager.addTab("Dog Manager", DogManager);

        PlanelGeneral.add(PetManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 602, 420));

        PanelSuperior.setBackground(new java.awt.Color(102, 102, 102));

        Titulo.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Pet Manager");

        javax.swing.GroupLayout PanelSuperiorLayout = new javax.swing.GroupLayout(PanelSuperior);
        PanelSuperior.setLayout(PanelSuperiorLayout);
        PanelSuperiorLayout.setHorizontalGroup(
            PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSuperiorLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(234, Short.MAX_VALUE))
        );
        PanelSuperiorLayout.setVerticalGroup(
            PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSuperiorLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        PlanelGeneral.add(PanelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 600, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PlanelGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PlanelGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamecatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamecatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamecatActionPerformed

    private void AgregarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarCatActionPerformed
       
        try{
            String code = txtcodecat.getText();
            String name = txtNamecat.getText();
            String color = txtColorcat.getText();
            int bornYear = Integer.parseInt(txtBronYearCat.getText());
            String breed = CbBreedCat.getSelectedItem().toString();
            String healtStatus = CbHealthStatusCat.getSelectedItem().toString();
            
            
            if(code.equals("")||name.equals("")||color.equals("")){
                JOptionPane.showMessageDialog(this,"Registro Guardado");
            }else{
                clsCat Cat = new clsCat(code,name,bornYear,color,healtStatus,breed);
                        catObjectList.add(Cat);
                        this.FillJListCat();
                        JOptionPane.showMessageDialog(this,"Registro Guardado");
            }
        }catch(HeadlessException e){
            JOptionPane.showMessageDialog(this,"Digite un valor valido");
        }
        NuevoCat();
    }//GEN-LAST:event_AgregarCatActionPerformed

    private void BuscarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarCatActionPerformed
                try{
    
            String code=txtcodecat.getText();
            clsCat cat= (clsCat) ctlPet.searchPet(code, "Gato");
            if (code.equals("")){
                
                //JOptionPane.showMessageDialog(this, "Por favor ingrese un codigo");

            }else{
          
                        txtNamecat.setText(cat.getName());
                        txtColorcat.setText(cat.getColor());
                        txtBronYearCat.setText (Integer.toString(cat.getBorn_year()));
                        CbBreedCat.setSelectedItem(cat.getBreed());
                        CbHealthStatusCat.setSelectedItem(cat.getHealthStatus());

                    }

        }catch(HeadlessException e){
        
        JOptionPane.showMessageDialog(this, "Digite un valor valido");
           
        }
    }//GEN-LAST:event_BuscarCatActionPerformed

    private void EditarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarCatActionPerformed
        try{
            String code = txtcodecat.getText();
            String name = txtNamecat.getText();
            String color = txtColorcat.getText();
            int bornYear = Integer.parseInt(txtBronYearCat.getText());
            String breed = CbBreedCat.getSelectedItem().toString();
            String healtStatus = CbHealthStatusCat.getSelectedItem().toString();
            
            
            if(code.equals("")||name.equals("")||color.equals("")){
                JOptionPane.showMessageDialog(this,"Registro Guardado");
            }else{
                for (clsCat cat : catObjectList){
                
                    if(cat.getCode().equals(code)){
                        
                        cat.setName(name);
                        cat.setColor(color);
                        cat.setBreed(breed);
                        cat.setBorn_year(bornYear);
                        cat.setHealthStatus(healtStatus);
                        
                        FillJListCat();
                        JOptionPane.showMessageDialog(this,"Registro Guardado");
            }
                }
            }
        }catch(HeadlessException e){
            JOptionPane.showMessageDialog(this,"Digite un valor valido");
        }
        NuevoCat();
         
    }//GEN-LAST:event_EditarCatActionPerformed

    private void txtNameDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameDogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameDogActionPerformed

    private void AgregarDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarDogActionPerformed
        try{
            String code = txtcodeDog.getText();
            String name = txtNameDog.getText();
            String color = txtColorDog.getText();
            int bornYear = Integer.parseInt(txtBronYearDog.getText());
            String breed = CbBreedDog.getSelectedItem().toString();
            String healtStatus = CbHealthStatusDog.getSelectedItem().toString();
            boolean pedigree = ChekPedigreeDog.isSelected();
            
            
            if(code.equals("")||name.equals("")||color.equals("")){
                JOptionPane.showMessageDialog(this,"Registro Guardado");
            }else{
                clsDog Dog = new clsDog(code,name,bornYear,color,healtStatus,breed,pedigree);
                        dogObjectList.add(Dog);
                        this.FillJListDog();
                        ctlPet.CreatePet(Dog);
                        JOptionPane.showMessageDialog(this,"Registro Guardado");
                        
            }
        }catch(HeadlessException e){
            JOptionPane.showMessageDialog(this,"Digite un valor valido");
        }
        NuevoDog();
    }//GEN-LAST:event_AgregarDogActionPerformed

    private void BuscarDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarDogActionPerformed
        
        try{
    
            String code=txtcodeDog.getText();
            clsDog dog= (clsDog) ctlPet.searchPet(code, "Perro");
            if (code.equals("")){
                
                //JOptionPane.showMessageDialog(this, "Por favor ingrese un codigo");

            }else{

                        txtNameDog.setText(dog.getName());
                        txtColorDog.setText(dog.getColor());
                        txtBronYearDog.setText (Integer.toString(dog.getBorn_year()));
                        CbBreedDog.setSelectedItem(dog.getBreed());
                        CbHealthStatusDog.setSelectedItem(dog.getHealthStatus());
                        ChekPedigreeDog.setSelected(dog.getPedigree());
                        
            }
        }catch(Exception e){
        
        JOptionPane.showMessageDialog(this, "Digite un valor valido");
            
        }
                
    }//GEN-LAST:event_BuscarDogActionPerformed

    private void EditarDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarDogActionPerformed
     
                    try{
            String code= txtcodeDog.getText();
            String name= txtNameDog.getText();
            String color= txtColorDog.getText();
            int bornYear=Integer.parseInt(txtBronYearDog.getText());
            String breed= CbBreedDog.getSelectedItem().toString();
            String health=CbHealthStatusDog.getSelectedItem().toString();
            boolean pedigree = ChekPedigreeDog.isSelected();
            if(breed.equals("")|| name.equals("")||color.equals("")){
                JOptionPane.showMessageDialog(this, "Por favor llene todos los campos");
            }else{
                    clsDog dog= new clsDog(code,name,bornYear,color,health,breed,pedigree);
                    ctlPet.EditPet(dog);
                    FillJListDog();
                    NuevoDog();
                    JOptionPane.showMessageDialog(this,"Mascota actualizada");
        }
        }catch(Exception e){    
        JOptionPane.showMessageDialog(this,"Digite un valor valido");
        }
    }//GEN-LAST:event_EditarDogActionPerformed

    private void CbHealthStatusCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbHealthStatusCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbHealthStatusCatActionPerformed

    private void EliminarDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarDogActionPerformed
     try{
            String code=txtcodeDog.getText();
        if(code.equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese codigo");
        } else {
            boolean found=false; 
            found=ctlPet.DeletePet(code,"Perro");
            this.FillJListDog();
            FillJListDog();
            JOptionPane.showMessageDialog(this, "Mascota Eliminada");
            if(!found){
                JOptionPane.showMessageDialog(this,"Codigo no encontrado");
            }
        }
        }catch(Exception e){    
        JOptionPane.showMessageDialog(this,"Digite un valor valido");
        }
    NuevoDog();
    }//GEN-LAST:event_EliminarDogActionPerformed

    private void EliminaCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminaCatActionPerformed
        try{
            String code=txtcodecat.getText();
            if(code.equals("")){
            JOptionPane.showMessageDialog(this, "Por favot ingrese un codigo");
            }else{
                boolean found=false;
                for (clsCat cat:catObjectList ){
                if(cat.getCode().equals(code)){
                    catObjectList.remove(cat);
                    FillJListDog();
                    JOptionPane.showMessageDialog(this,"Registro eliminado");
                    found=true;
                    break;
            }
            }
                if(!found){
                    JOptionPane.showMessageDialog(this,"Codigo no encontrado");
                }
            }
        }catch(HeadlessException e){
            JOptionPane.showMessageDialog(this,"Digite un valor valido");
        }
        NuevoDog();
    }//GEN-LAST:event_EliminaCatActionPerformed

    
    private void FillJListCat(){
            DefaultListModel model = new DefaultListModel();
            int index = 0;
            for (clsCat cat:catObjectList ){
                String data = cat.getName() + "  -  "+cat.getBreed()+"  - Gato";
                model.add(index, data);
                index++;
            }
            PetList.setModel(model);
        }
    
   
    private void FillJListDog(){
            DefaultListModel model = new DefaultListModel();
            int index = 0;
            for (clsDog dog:dogObjectList ){
                String data = dog.getName() + "  -  "+dog.getBreed()+"  - Perro";
                model.add(index, data);
                index++;
            }
            PetList.setModel(model);
        }
    
    
    private void NuevoDog(){
        txtNameDog.setText("");
        txtColorDog.setText("");
        txtBronYearDog.setText ("");
        CbBreedDog.setSelectedItem("Seleccionar");
        CbHealthStatusDog.setSelectedItem("Seleccionar");
        ChekPedigreeDog.setSelected(false);
            }
    
    private void NuevoCat(){
        txtNamecat.setText("");
        txtColorcat.setText("");
        txtBronYearCat.setText ("");
        CbBreedCat.setSelectedItem("Seleccionar");
        CbHealthStatusCat.setSelectedItem("Seleccionar");
            }

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarCat;
    private javax.swing.JButton AgregarDog;
    private javax.swing.JLabel BreedCat;
    private javax.swing.JLabel BreedDog;
    private javax.swing.JLabel BronYearCat;
    private javax.swing.JLabel BronYearDog;
    private javax.swing.JButton BuscarCat;
    private javax.swing.JButton BuscarDog;
    private javax.swing.JPanel CatManager;
    private javax.swing.JComboBox<String> CbBreedCat;
    private javax.swing.JComboBox<String> CbBreedDog;
    private javax.swing.JComboBox<String> CbHealthStatusCat;
    private javax.swing.JComboBox<String> CbHealthStatusDog;
    private javax.swing.JCheckBox ChekPedigreeDog;
    private javax.swing.JLabel CodeCat;
    private javax.swing.JLabel CodeDog;
    private javax.swing.JLabel ColorCat;
    private javax.swing.JLabel ColorDog;
    private javax.swing.JPanel DogManager;
    private javax.swing.JButton EditarCat;
    private javax.swing.JButton EditarDog;
    private javax.swing.JButton EliminaCat;
    private javax.swing.JButton EliminarDog;
    private javax.swing.JLabel HealthStatusCat;
    private javax.swing.JLabel HealthStatusDog;
    private javax.swing.JScrollPane List;
    private javax.swing.JLabel NameCat;
    private javax.swing.JLabel NameDog;
    private javax.swing.JPanel PanelSuperior;
    private javax.swing.JList<String> PetList;
    private javax.swing.JTabbedPane PetManager;
    private javax.swing.JPanel Petlist;
    private javax.swing.JPanel PlanelGeneral;
    private javax.swing.JSeparator SepaBreedCat;
    private javax.swing.JSeparator SepaBreedDog;
    private javax.swing.JSeparator SepaBronYearCat;
    private javax.swing.JSeparator SepaBronYearDog;
    private javax.swing.JSeparator SepaCodeCat;
    private javax.swing.JSeparator SepaCodeDog;
    private javax.swing.JSeparator SepaColorCat;
    private javax.swing.JSeparator SepaColorDog;
    private javax.swing.JSeparator SepaHealthStatusCat;
    private javax.swing.JSeparator SepaHealthStatusDog;
    private javax.swing.JSeparator SepaNameCat;
    private javax.swing.JSeparator SepaNameDog;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextField txtBronYearCat;
    private javax.swing.JTextField txtBronYearDog;
    private javax.swing.JTextField txtColorDog;
    private javax.swing.JTextField txtColorcat;
    private javax.swing.JTextField txtNameDog;
    private javax.swing.JTextField txtNamecat;
    private javax.swing.JTextField txtcodeDog;
    private javax.swing.JTextField txtcodecat;
    // End of variables declaration//GEN-END:variables
}
