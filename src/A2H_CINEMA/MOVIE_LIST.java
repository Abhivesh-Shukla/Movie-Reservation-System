package A2H_CINEMA;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class MOVIE_LIST extends javax.swing.JFrame {

    Timer t;
    int i = 1;

    public MOVIE_LIST() {
        movie.conn();

        initComponents();

        t = new Timer(2000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String sql;
                if (i == 5) {
                    i = 1;
                } else {
                    if (i == 1) {
                        ImageIcon icon = new ImageIcon("/Users/abhivesh/Abhivesh/A2HCINEMA/190454_Untitled-6.gif");
                        Image image = icon.getImage();
                        Image scaledImage = image.getScaledInstance(moviep.getWidth(), moviep.getHeight(), Image.SCALE_SMOOTH);
                        moviep.setIcon(new ImageIcon(scaledImage));
                        movies.setText("Screen 1");
                    movien.setText("Padmavat");
                    movied.setText("10-10-23");
                        movie.ic = 1;
                        try {
                            sql = "select curdate()";
                            movie.rs = movie.st.executeQuery(sql);
                            movie.rs.next();
                            movie.sdt = movie.rs.getString(1);
                            movied.setText(movie.sdt);
                            sql = "select * from  movie where date='" + movie.sdt + "' and screen='screen 1'";
                            movie.rs = movie.st.executeQuery(sql);

                            movie.rs.next();
                            movie.movienm = movie.rs.getString(1);

                            movie.sc = movie.rs.getString(2);
                            movie.rating = movie.rs.getString(3);

                            movien.setText(movie.rs.getString(1));
                            movies.setText(movie.rs.getString(2));

                        } catch (Exception a) {
                            System.out.print(a.getMessage());
                        }
                    }

                    if (i == 2) {
                        ImageIcon icon = new ImageIcon("/Users/abhivesh/Abhivesh/A2HCINEMA/2point0_1_IT_1536382553110.jpg");
                        Image image = icon.getImage();
                        Image scaledImage = image.getScaledInstance(moviep.getWidth(), moviep.getHeight(), Image.SCALE_SMOOTH);
                        moviep.setIcon(new ImageIcon(scaledImage));
                        movies.setText("Screen 2");
                    movien.setText("Robot 2");
                    movied.setText("9-10-23");
                        movie.ic = 2;
                        try {
                            sql = "select curdate()";
                            movie.rs = movie.st.executeQuery(sql);
                            movie.rs.next();
                            movie.sdt = movie.rs.getString(1);
                            movied.setText(movie.sdt);
                            sql = "select * from  movie where date='" + movie.sdt + "' and screen='screen 2'";
                            movie.rs = movie.st.executeQuery(sql);
                            movie.rs.next();
                            movie.movienm = movie.rs.getString(1);
                            movie.sc = movie.rs.getString(2);
                            movie.rating = movie.rs.getString(3);

                            movien.setText(movie.rs.getString(1));
                            movies.setText(movie.rs.getString(2));
                        } catch (Exception a) {
                            System.out.print(a.getMessage());
                        }
                    }
                    if (i == 3) {
                        movie.ic = 3;
                        ImageIcon icon = new ImageIcon("/Users/abhivesh/Abhivesh/A2HCINEMA/MV5BMTllZDJhMTAtMjhmZi00MzBjLTljMmQtMmNlYTAwYmY0Y2Q0XkEyXkFqcGdeQXVyNDUzOTQ5MjY@._V1_.jpg");

                        Image image = icon.getImage();
                        Image scaledImage = image.getScaledInstance(moviep.getWidth(), moviep.getHeight(), Image.SCALE_SMOOTH);
                        moviep.setIcon(new ImageIcon(scaledImage));
                        
                        movies.setText("Screen 3");
                    movien.setText("Golmaal 3");
                    movied.setText("8-10-23");
                        try {
                            sql = "select curdate()";
                            movie.rs = movie.st.executeQuery(sql);
                            movie.rs.next();
                            movie.sdt = movie.rs.getString(1);
                            movied.setText(movie.sdt);
                            sql = "select * from  movie where date='" + movie.sdt + "' and screen='screen 3'";
                            movie.rs = movie.st.executeQuery(sql);
                            movie.rs.next();
                            movie.movienm = movie.rs.getString(1);
                            movie.sc = movie.rs.getString(2);
                            movie.rating = movie.rs.getString(3);

                            movien.setText(movie.rs.getString(1));
                            movies.setText(movie.rs.getString(2));
                        } catch (Exception a) {
                            System.out.print(a.getMessage());
                        }
                    }
                    if (i == 4) {
                        movie.ic = 4;
                        ImageIcon icon = new ImageIcon("/Users/abhivesh/Abhivesh/A2HCINEMA/MV5BNzVhZGRlMzktNzY1Yy00OTU1LWI1ODQtMjExOGU5MmQyMTY4XkEyXkFqcGdeQXVyMTA4NjE0NjEy._V1_.jpg");

                        Image image = icon.getImage();
                        Image scaledImage = image.getScaledInstance(moviep.getWidth(), moviep.getHeight(), Image.SCALE_SMOOTH);
                        moviep.setIcon(new ImageIcon(scaledImage));
                        movies.setText("Screen 4");
                    movien.setText("Judwaa 2");
                    movied.setText("7-10-23");
                      
                        try {
                            sql = "select curdate()";
                            movie.rs = movie.st.executeQuery(sql);
                            movie.rs.next();
                            movie.sdt = movie.rs.getString(1);
                            movied.setText(movie.sdt);
                            sql = "select * from  movie where date='" + movie.sdt + "' and screen='screen 4'";
                            movie.rs = movie.st.executeQuery(sql);
                            movie.rs.next();
                            movie.movienm = movie.rs.getString(1);
                            movie.sc = movie.rs.getString(2);
                            movie.rating = movie.rs.getString(3);

                            movien.setText(movie.rs.getString(1));
                            movies.setText(movie.rs.getString(2));
                        } catch (Exception a) {
                            System.out.print(a.getMessage());
                        }
                    }
                    ++i;
                }
            }
        });
        t.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        moviep = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        movies = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        movien = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        movied = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setBackground(new java.awt.Color(153, 153, 255));
        jLayeredPane1.setOpaque(true);

        moviep.setAlignmentX(0.1F);
        moviep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        moviep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moviepMouseClicked(evt);
            }
        });
        moviep.setBounds(150, 20, 300, 400); // Increased spacing and dimensions for the movie image
        jLayeredPane1.add(moviep, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton1.setText(">");
        jButton1.setBounds(500, 220, 60, 30); // Precisely positioned "Next" button
        jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton2.setText("<");
        jButton2.setBounds(20, 220, 60, 30); // Precisely positioned "Previous" button
        jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        backbtn.setFont(new java.awt.Font("Tahoma", 1, 11));
        backbtn.setText("BACK");
        backbtn.setBounds(580, 470, 80, 30); // Precisely positioned "Back" button
        jLayeredPane1.add(backbtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel3.setText("SCREEN");
        jLabel3.setBounds(50, 430, 100, 22); // Adjusted dimensions and spacing
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        movies.setBackground(new java.awt.Color(255, 255, 255));
        movies.setText(" ");
        movies.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));
        movies.setOpaque(true);
        movies.setBounds(170, 430, 300, 20); // Adjusted dimensions and spacing
        jLayeredPane1.add(movies, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel4.setText("NAME");
        jLabel4.setBounds(50, 460, 100, 22); // Adjusted dimensions and spacing
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        movien.setBackground(new java.awt.Color(255, 255, 255));
        movien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));
        movien.setOpaque(true);
        movien.setBounds(170, 460, 300, 20); // Adjusted dimensions and spacing
        jLayeredPane1.add(movien, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel5.setText("DATE");
        jLabel5.setBounds(50, 490, 100, 22); // Adjusted dimensions and spacing
        jLayeredPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        movied.setBackground(new java.awt.Color(255, 255, 255));
        movied.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));
        movied.setOpaque(true);
        movied.setBounds(170, 490, 300, 20); // Adjusted dimensions and spacing
        jLayeredPane1.add(movied, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE) // Adjusted width
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE) // Adjusted height
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //t.start();
        --i;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // t.stop();
        ++i;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        this.dispose();
        new LOGIN_FRAME().setVisible(true);
    }//GEN-LAST:event_backbtnActionPerformed

    private void moviepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moviepMouseClicked
        t.stop();
        this.dispose();
        new movie1().setVisible(true);
    }//GEN-LAST:event_moviepMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MOVIE_LIST().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel movied;
    private javax.swing.JLabel movien;
    private javax.swing.JLabel moviep;
    private javax.swing.JLabel movies;
    // End of variables declaration//GEN-END:variables
}
