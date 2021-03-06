/**
 Following JGibbLabeledLDA and JGibbLDA, this code is licensed under the GPLv2.
 Please see the LICENSE file for the full license.
 */
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;


/** Main. */
public class LLDA {
    public static void main(String[] args) {
        Options o = new Options();
        CmdLineParser clp = new CmdLineParser(o);

        try {
            clp.parseArgument(args);

            if (o.estimation) {
                Estimation e = new Estimation(o);
            }
            else if (o.inference) {
                Inference i = new Inference(o);
            }
        } catch (CmdLineException cle) {
            cle.printStackTrace();
        }
    }
}
