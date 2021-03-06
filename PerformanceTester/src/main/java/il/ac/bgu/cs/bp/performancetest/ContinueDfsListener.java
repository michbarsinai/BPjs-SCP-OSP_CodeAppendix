package il.ac.bgu.cs.bp.performancetest;

import il.ac.bgu.cs.bp.bpjs.analysis.DfsBProgramVerifier;
import il.ac.bgu.cs.bp.bpjs.analysis.DfsTraversalNode;
import il.ac.bgu.cs.bp.bpjs.analysis.violations.Violation;
import java.util.List;

/**
 * A DfsBPprogramVerifier that keeps the verifier moving even
 * when it did discover a violation.
 * @author michael
 */
public class ContinueDfsListener implements DfsBProgramVerifier.ProgressListener {

    @Override
    public void started(DfsBProgramVerifier vfr) {}

    @Override
    public void iterationCount(long count, long statesHit, DfsBProgramVerifier vfr) {
        // print nothing.
    }

    @Override
    public void maxTraceLengthHit(List<DfsTraversalNode> aTrace, DfsBProgramVerifier vfr) {}

    @Override
    public boolean violationFound(Violation aViolation, DfsBProgramVerifier vfr) {
        return true;
    }

    @Override
    public void done(DfsBProgramVerifier vfr) {}
    
}
