package use_case;
import api.GradeDB;
import entity.Grade;
import entity.Team;
import org.json.JSONException;

import java.io.IOException;

public final class GetAverageGradeUseCase {
    private final GradeDB gradeDB;

    public GetAverageGradeUseCase(GradeDB gradeDB) {
        this.gradeDB = gradeDB;
    }

    public float getAverageGrade(String course) {
        Team team = gradeDB.getMyTeam();
        int sum = 0;
        for (String utorid: team.getMembers()) {
            sum += gradeDB.getGrade(utorid, course).getGrade();
        }
        return (float)sum / (float)team.getMembers().length;
    }
}
