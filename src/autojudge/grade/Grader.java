package autojudge.grade;

import autojudge.code.Teacher;
import autojudge.code.Student;

import static jbse.meta.Analysis.ass3rt;
import jbse.apps.run.Run;
import jbse.apps.run.RunParameters;

public class Grader {
    void PUT(int i) {
        ass3rt(Teacher.m(i) == Student.m(i));
    }

    public static void main(String[] args) {
        final RunParameters p = new RunParameters();
        set(p);
        final Run r = new Run(p);
        r.run();
    }

    private static void set(RunParameters p) {
        p.addUserClasspath("/home/lukeyi/auto-judge/classes", "/home/lukeyi/auto-judge/jbse-0.10.0-SNAPSHOT-shaded.jar");
        p.setMethodSignature("autojudge/grade/Grader", "(I)V", "PUT");
        p.setDecisionProcedureType(RunParameters.DecisionProcedureType.Z3);
        p.setExternalDecisionProcedurePath("/usr/bin/z3");
        p.setOutputFileName("/home/lukeyi/auto-judge/report.txt");
        p.setStateFormatMode(RunParameters.StateFormatMode.TEXT);
        p.setStepShowMode(RunParameters.StepShowMode.LEAVES);
    }
}
