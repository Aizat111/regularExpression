
import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

public class regular_expression extends javax.swing.JFrame {

    public regular_expression() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        txt3_lbl = new javax.swing.JLabel();
        conWord_text = new javax.swing.JTextField();
        conWord_btn = new javax.swing.JButton();
        txt4_lbl = new javax.swing.JLabel();
        alphabet_txt = new javax.swing.JTextField();
        alphabet_lbl = new javax.swing.JLabel();
        alphabet_btn = new javax.swing.JButton();
        rexpression_lbl = new javax.swing.JLabel();
        rexpression_txt = new javax.swing.JTextField();
        rexpression_btn = new javax.swing.JButton();
        lbl_kelimesayisi = new javax.swing.JLabel();
        countWord_txt = new javax.swing.JTextField();
        countWord_btn = new javax.swing.JButton();
        txt1_lbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        result_area = new javax.swing.JTextArea();
        txt2_lbl = new javax.swing.JLabel();
        navConWord_btn = new javax.swing.JButton();

        jDialog1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialog1.setBounds(new java.awt.Rectangle(280, 180, 400, 270));

        txt3_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt3_lbl.setText("Kontrol etmek istediginiz kelimeyi giriniz");

        conWord_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conWord_textActionPerformed(evt);
            }
        });

        conWord_btn.setText("OK");
        conWord_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conWord_btnActionPerformed(evt);
            }
        });

        txt4_lbl.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txt4_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt4_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(txt3_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(conWord_text, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(41, 41, 41)
                .addComponent(conWord_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txt3_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conWord_text, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conWord_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(txt4_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(250, 150, 500, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        alphabet_lbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        alphabet_lbl.setText("Alfabenızdeki harfleri virgullerle ayırarak giriniz:");

        alphabet_btn.setText("OK");
        alphabet_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alphabet_btnActionPerformed(evt);
            }
        });

        rexpression_lbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rexpression_lbl.setText("Düzenli ifadeyi giriniz:");

        rexpression_btn.setText("OK");
        rexpression_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rexpression_btnActionPerformed(evt);
            }
        });

        lbl_kelimesayisi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_kelimesayisi.setText("L dilinin kaç kelimesini görmek istiyorsunuz? ");

        countWord_btn.setText("OK");
        countWord_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countWord_btnActionPerformed(evt);
            }
        });

        txt1_lbl.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        txt1_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt1_lbl.setText("Hoş geldiniz!");

        result_area.setColumns(20);
        result_area.setRows(5);
        jScrollPane1.setViewportView(result_area);

        txt2_lbl.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        txt2_lbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt2_lbl.setText("Çıktınız:");

        navConWord_btn.setText("Kelime kontrolü yapmak istiyorum");
        navConWord_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navConWord_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txt1_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt2_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(159, 159, 159))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_kelimesayisi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rexpression_lbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(alphabet_lbl, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(alphabet_txt)
                                .addComponent(rexpression_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                            .addComponent(alphabet_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rexpression_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(countWord_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(countWord_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(navConWord_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txt1_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(alphabet_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(alphabet_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(rexpression_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(rexpression_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(countWord_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(alphabet_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(rexpression_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                        .addGap(78, 78, 78)
                        .addComponent(lbl_kelimesayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt2_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(countWord_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(navConWord_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String alphabet;
    String rexpression; 
    int countWord;
    String backword = "", bracketWord = "", resultWord = "",tempWord=""; //variables for get word
    int []star;//for starring
    int starCounter=0,tempStarCount;
    String [] words;
    ArrayList<String> list = new ArrayList<String>();//for delete used words without star
    private void alphabet_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alphabet_btnActionPerformed

        alphabet = alphabet_txt.getText();
        alphabet_txt.setEnabled(false);
        rexpression_txt.setEnabled(true);
        if (alphabet.length() == 0)//is alphabet empty?
            JOptionPane.showMessageDialog(rootPane, " Alfabeniz bos kalamaz!", "Uyarı!", JOptionPane.ERROR_MESSAGE);
        else
            result_area.setText("Alfabeniz şu şekilde oluşturuldu: L={" + alphabet + "}");
    }//GEN-LAST:event_alphabet_btnActionPerformed

    private void rexpression_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rexpression_btnActionPerformed
        countWord_txt.setEnabled(true);
        countWord_txt.setEditable(true);
        rexpression = rexpression_txt.getText();// get regular expression
        for(int i=0;i<rexpression.length();i++)
        {
            if(rexpression.charAt(i)=='*') starCounter++;//how many stars in the rexpression?
        }
        star=new int[starCounter];// create new counter for each star
        alphaControl(alphabet, rexpression);//rexpression formed from the correct alphabet?
        bracketsControl(rexpression);
        expOrderControl(rexpression);//like "+*"

        //just one word
        if (!rexpression.contains("*") && !rexpression.contains("+") && rexpression != "0") {
            countWord_txt.setText("1");
            countWord_txt.setEditable(false);
            countWord_txt.setEnabled(false);
            result_area.setText("Girdiginiz rexpressionyle sadece 1 kelime uretilebilir.\n");
            result_area.append(rexpression);
        }

    }//GEN-LAST:event_rexpression_btnActionPerformed
    
    
    private void countWord_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countWord_btnActionPerformed
        countWord = Integer.parseInt(countWord_txt.getText());//get countWORD
        result_area.setText("");// refresh the result's screen
        produceWords(countWord);
        for(int i=0;i<words.length;i++)//print all produced words
        {
            result_area.append(words[i]+"\n");
        }
       
    }//GEN-LAST:event_countWord_btnActionPerformed

    private void produceWords(int countWord)
    {
        for(int i=0;i<starCounter;i++)//refresh starCounters for each expression
        {
            star[i]=0;
        }
        words=new String[countWord];// determine words'size
        for (int t = 0; t < countWord; t++) {
            tempStarCount=0;
            resultWord = "";//refreshing for new words
            for (int p = rexpression.length() - 1; p >= 0; p--) {
                bracketWord = "";
                backword = "";
                //////////////////1//////////////
                 if (rexpression.charAt(p) == ')') {
                    p = p - 1;
                    while (rexpression.charAt(p) != '(')// get word between brackets
                    {
                        bracketWord = rexpression.charAt(p) + bracketWord;
                        p -= 1;
                    }
                    backword = spliting(bracketWord);//spliting with or
                    if (backword.contains("*")) 
                    {
                        for (int l = backword.length() - 1; l >= 0; l--) 
                        {
                            if (backword.charAt(l) == '*') 
                            {
                                resultWord = starCount(String.valueOf(backword.charAt(l - 1))) + resultWord;//star letter before star
                                l = l - 1;
                                if (l == 0) 
                                        break;
                                else 
                                        continue;//if it is not last letter control expression again
                            }
                            resultWord = backword.charAt(l) + resultWord;
                        }
                    } 
                    else 
                    {
                        resultWord = backword + resultWord;//if there is no star just get word
                    }
                }
                 /////////////////////////////2////////////////////////////
                if (((rexpression.contains("+") || rexpression.contains("*")) && !rexpression.contains("(") && !rexpression.contains(")")))//there is no brackets in expression
                {
                    if (p == (rexpression.length() - 1) && t == 0) //first word get expession to list
                    {
                        list.removeAll(list);
                        String[] b = rexpression.split("[\\+]");
                        for (int g = 0; g < b.length; g++) {
                            list.add(b[g]);
                        }
                    }
                    resultWord = split() + resultWord;
                    break;
                }
                /////////////////////////////3//////////////////////////////////
                else {
                    if (rexpression.charAt(p) == '*') {

                        if (rexpression.charAt(p - 1) == ')')//if star is after brackets
                        {
                            p = p - 2;
                            while (rexpression.charAt(p) != '(')//get word between brackets
                            {
                                bracketWord = rexpression.charAt(p) + bracketWord;
                                p -= 1;
                            }
                            if (bracketWord.contains("+")) {//if there are(is) + sembol(s)
                                resultWord = starCountOr(bracketWord) + resultWord;
                            } else {
                                resultWord = starCount(bracketWord) + resultWord;//just letters between brackets
                            }
                            if (p == 0) {
                                break;//if expression finished
                            } else {
                                continue;//if not 
                            }
                        } 
                        else//stars without brackets
                        {
                            resultWord = starCount(String.valueOf(rexpression.charAt(p - 1))) + resultWord;//star letter before star
                            p = p - 1;
                            if (p == 0) {
                                break;//if expression finished
                            } else {
                                continue;// if not
                            }
                        }

                    }
                    if (rexpression.charAt(p) != '(' && rexpression.charAt(p) != ')') 
                        resultWord = rexpression.charAt(p) + resultWord;// just letter without anything
                }
            }
            words[t]=resultWord;//get result word
        }
    }
    private String starCount(String word) {
        tempWord = "";
        for (int i = 0; i <star[tempStarCount] ; i++) {
            tempWord += word;
        }
        star[tempStarCount]++;
        tempStarCount++;
        return tempWord;
    }
    private String starCountOr(String word) {
        String s = "";
        tempWord="";
        for (int i = 0; i < star[tempStarCount]; i++) 
        {
            tempWord = spliting(word);
            if (tempWord.contains("*")) 
                s=starControl(tempWord);
            else //if there is no star in subword
                s = tempWord + s;
        }
        star[tempStarCount]++;
        tempStarCount++;
        return s;
    }

    private String whichOne(String w1, String w2) {//or for words with stars
        Random r = new Random();
        int rand = r.nextInt(2);
        if (rand == 0) {
            tempWord = w1;
        } else {
            tempWord = w2;
        }
        return tempWord;

    }

    private String spliting(String word) {

        String[] fin = word.split("[//+]");
        String w = fin[0];

        for (int k = 1; k < fin.length; k++) {
            w = whichOne(w, fin[k]);
        }
        return w;
    }

    private String split() {
        Random rand = new Random();
        String word = "", w2 = "";

        if (!list.isEmpty()) {
            int index = rand.nextInt(list.size());
            word = list.get(index);
            if (!list.get(index).contains("*")) {
                w2 = word;
                list.remove(index);
            } else {

                w2 = starControl(word) + w2;
            }

        }
        return w2;
    }

    private String starControl(String w) {
        String w2 = "";
        for (int l = w.length() - 1; l >= 0; l--) {
            if (w.charAt(l) == '*') {
                w2 = starCount(String.valueOf(w.charAt(l - 1))) + w2;//starin onundeki harfi starla 
                l = l - 1;
                if (l == 0) {

                    break;
                } else {
                    continue;
                }
            } else {
                w2 = w.charAt(l) + w2;
            }
        }
        return w2;
    }

    private void bracketsControl(String expression) {
        int control1 = 0, control2 = 0;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(') {
                control1++;
            } else if (expression.charAt(i) == ')') {
                control2++;
            }
        }
        if (control1 != control2) {
            JOptionPane.showMessageDialog(rootPane, " Düzenli ifedenizde parantez eksikliği var.\n İfadenizi baştan oluşturunuz...", "Uyarı!", JOptionPane.ERROR_MESSAGE);
            rexpression_txt.setText("");
        }
    }

    private void alphaControl(String alphabet, String expression) {
        for (int i = 0; i < expression.length(); i++) {
            int status = 0;
            for (int j = 0; j < alphabet.length(); j++) {
                if (alphabet.charAt(j) != ',') {
                    if (expression.charAt(i) == alphabet.charAt(j)) {
                        status = 1;
                    }
                }
            }
            if (status == 0) {
                if (expression.charAt(i) == '(' || expression.charAt(i) == ')'
                        || expression.charAt(i) == '*' || expression.charAt(i) == '+') {
                    status = 1;
                }
            }

            if (status == 0) {
                JOptionPane.showMessageDialog(rootPane, " İfadeniz alfabe dışında veya düzenli rexpression kuralları dışında sembol içeriyor!\n İfadenizi baştan oluşturunuz..", "Uyarı!", JOptionPane.ERROR_MESSAGE);
                rexpression_txt.setText("");
                rexpression = "0";
            }
        }
    }

    private void expOrderControl(String expression) {
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '+' && expression.charAt(i + 1) == '*') {
                JOptionPane.showMessageDialog(rootPane, " Düzenli rexpressionnizin oluşturulma şekli kurala uymuyor.İfadenizi baştan oluşturunuz...", "Uyarı!", JOptionPane.ERROR_MESSAGE);
                rexpression_txt.setText("");
                break;
            }
        }
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        rexpression_txt.setEnabled(false);
        countWord_txt.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void conWord_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conWord_btnActionPerformed
        String conWord=conWord_text.getText();
        int status=0;
        for(int j=0;j<10;j++)
        {   
            produceWords(30);
            for(int i=0;i<30;i++)
            {
            if(words[i].equals(conWord))
                {
                    status=1; break;
                } 
            }
        if(status==1){
            txt4_lbl.setText("Kelime L dilinde var.");
            break;
        }
        else continue;
        }
        if(status==0) txt4_lbl.setText("Kelime L dilinde yok.");
    }//GEN-LAST:event_conWord_btnActionPerformed

    private void conWord_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conWord_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conWord_textActionPerformed

    private void navConWord_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navConWord_btnActionPerformed
       jDialog1.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_navConWord_btnActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(regular_expression.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(regular_expression.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(regular_expression.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(regular_expression.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new regular_expression().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alphabet_btn;
    private javax.swing.JLabel alphabet_lbl;
    private javax.swing.JTextField alphabet_txt;
    private javax.swing.JButton conWord_btn;
    private javax.swing.JTextField conWord_text;
    private javax.swing.JButton countWord_btn;
    private javax.swing.JTextField countWord_txt;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_kelimesayisi;
    private javax.swing.JButton navConWord_btn;
    private javax.swing.JTextArea result_area;
    private javax.swing.JButton rexpression_btn;
    private javax.swing.JLabel rexpression_lbl;
    private javax.swing.JTextField rexpression_txt;
    private javax.swing.JLabel txt1_lbl;
    private javax.swing.JLabel txt2_lbl;
    private javax.swing.JLabel txt3_lbl;
    private javax.swing.JLabel txt4_lbl;
    // End of variables declaration//GEN-END:variables
}
