package graph;

import com.mathworks.engine.*;
public class FBA {
    public static void main(String[] args) throws Exception {
        // Start MATLAB asynchronously
        MatlabEngine eng = MatlabEngine.startMatlab();

        // Run a MATLAB script. Assuming you have a MATLAB script named 'myScript.m'
        //eng.eval("run('path/to/your/myScript.m')");

        // Alternatively, you can execute a simple MATLAB command
         eng.eval("disp('Hello from MATLAB')");

        // Close the MATLAB engine
        eng.close();
    }
}
