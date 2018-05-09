package com.xxjz.java.com.xxjz.java.util.FileFunc;


import ch.ethz.ssh2.Connection;
import ch.ethz.ssh2.SCPClient;
import ch.ethz.ssh2.SFTPv3Client;
import ch.ethz.ssh2.Session;

import javax.naming.NamingException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FileUtil {
///////////////////////////////////////////////////////////////////////////////////////////////////////
    private String SERVER_IP = "192.168.1.212";
    private final String SERVER_PORT = "8080";
    private final String USERNAME = "root";
    private final String PASSWORD = "bd666666";
    private Connection conn = null;
    private Session session = null;
    private int lastModifyTime = 0;

    /**
     * 文件工具
     * 读取指定路径下的文件属性
     */
    public List<Map> getFilePropsByPath(String path){
        List<Map> result = new ArrayList<>();

        try {
            conn = new Connection(SERVER_IP);
            conn.connect();
            boolean isAuthenticated = conn.authenticateWithPassword(USERNAME, PASSWORD);

            if (isAuthenticated) {
                SFTPv3Client sftpClient = new SFTPv3Client(conn);

                //SCPClient client = new SCPClient(conn);
                session = conn.openSession();

                return result;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            session.close();
            conn.close();
        }
        return result;
    }

    public static void main(String[] args){

    }
///////////////////////////////////////////////////////////////////////////////////////////////////////

}
