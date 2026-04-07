package com.osse.service;

import com.osse.domain.Planning;

public class PlanningService {

    public boolean publishPlanning(Planning planning, boolean hasRights, boolean hasBlockingConflict) {
        if (!hasRights) {
            return false;
        }
        if (hasBlockingConflict) {
            return false;
        }
        planning.publish();
        return true;
    }
}