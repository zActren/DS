package wk;
import java.io.*;
import java.util.stream.Collectors;

public class CCodeExecutor {

    public String executeCCode(String code) {
        StringBuilder output = new StringBuilder();
        try {
            // Create a temporary C source file
            File tempCFile = File.createTempFile("tempCProgram", ".c");
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempCFile))) {
                writer.write(code);
            }

            // Compile the C source file using GCC
            String cFilePath = tempCFile.getAbsolutePath();
            String outputFilePath = tempCFile.getParent() + "/tempCProgram.out";
            Process compileProcess = new ProcessBuilder("gcc", cFilePath, "-o", outputFilePath).start();
            compileProcess.waitFor();

            // Check for compilation errors
            if (compileProcess.exitValue() != 0) {
                BufferedReader errorReader = new BufferedReader(new InputStreamReader(compileProcess.getErrorStream()));
                String error = errorReader.lines().collect(Collectors.joining("\n"));
                output.append("Compilation Error:\n").append(error);
                return output.toString();
            }

            // Execute the compiled program
            Process executeProcess = new ProcessBuilder(outputFilePath).start();
            BufferedReader outputReader = new BufferedReader(new InputStreamReader(executeProcess.getInputStream()));
            output.append(outputReader.lines().collect(Collectors.joining("\n")));

            // Clean up temporary files
            tempCFile.delete();
            new File(outputFilePath).delete();
        } catch (Exception ex) {
            output.append("Error: ").append(ex.getMessage());
        }
        return output.toString();
    }
}


