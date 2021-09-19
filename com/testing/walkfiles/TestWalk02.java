package com.testing.walkfiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class TestWalk02
{
    public static int modifiedCounter;

    public static void main(String[] args)
    {
        modifiedCounter = 0;
        walkAndRename("/home/david/MyData/DavidC/Cursos/Prog/Java/Mosh/Java",
                " - coursedownloader.net",
                "");
        System.out.println("\nTotal files modified: " + modifiedCounter);
    }

    public static void walkAndRename(String path, String oldSubStr, String newSubStr)
    {

        File root = new File(path);
        File[] list = root.listFiles();

        if (list == null) return;

        for (File f : list)
        {
            if (f.isDirectory())
            {
                walkAndRename(f.getAbsolutePath(), oldSubStr, newSubStr);
            }
            else
            {
                String oldFileName = f.getName();

                if (oldFileName.contains(oldSubStr))
                {
                    String newFileName = oldFileName.replace(oldSubStr, newSubStr);

                    //region Test if renaming is correct
//                    System.out.println("Rename: ");
//                    System.out.println("\t" + f.toPath());
//                    System.out.println("\t" + f.toPath().resolveSibling(newFileName));
//                    ++modifiedCounter;
                    //endregion

                    try
                    {
                        Files.move(f.toPath(), f.toPath().resolveSibling(newFileName));
                        ++modifiedCounter;
                    }
                    catch (IOException e)
                    {
                        System.out.println("Operation Failed: " + f.getAbsolutePath());
                    }
                }
            }
        }
    }
}
