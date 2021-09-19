package com.testing.walkfiles;

import java.io.File;

public class TestWalk01
{
    public static void main(String[] args)
    {
        walk("/home/david/MyData/DavidC/Cursos/Prog/Java/Mosh/Java");
    }

    public static void walk(String path) {

        File root = new File(path);
        File[] list = root.listFiles();

        if (list == null) return;

        for (File f : list) {
            if (f.isDirectory()) {
                walk( f.getAbsolutePath() );
                System.out.println("Dir:" + f.getAbsoluteFile());
            }
            else {
                System.out.println("File:" + f.getAbsoluteFile());
            }
        }
    }
}
