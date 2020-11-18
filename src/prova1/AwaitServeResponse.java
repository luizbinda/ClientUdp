/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

/**
 *
 * @author luizn
 */
public class AwaitServeResponse implements Runnable{
    private final int port;
    private JRootPane rootPane;
    public AwaitServeResponse(int port, JRootPane rootPane) {
        this.port = port;
        this.rootPane = rootPane;
    }
    
    @Override
    public void run() {
        try (DatagramSocket clientSocket =  new DatagramSocket(port)){
            byte[] buffer = new byte[1024];
            /*
            clientSocket.setSoTimeout(3000);
            */
            
            while(true){
                DatagramPacket datagramPacket = new DatagramPacket(buffer, 0, buffer.length);
                clientSocket.receive(datagramPacket);
                
                String recivedMessage = new String(datagramPacket.getData());
                showDoenca(recivedMessage);
            }
        } catch (SocketException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println("timeout. Client is Closing");
        }
    }
    
    private void showDoenca(String Doenca){
        JOptionPane.showMessageDialog(rootPane, Doenca);
    }
    
}
