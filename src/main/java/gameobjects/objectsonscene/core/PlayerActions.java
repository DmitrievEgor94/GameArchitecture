package gameobjects.objectsonscene.core;

import gameobjects.core.UnitGroup;
import gameobjects.objectsonscene.impl.BuildingOnMap;
import gameobjects.objectsonscene.impl.UnitOnMap;

import java.awt.*;

public interface PlayerActions {
    UnitOnMap chooseBuildingToProduceUnit(BuildingOnMap building, UnitGroup unit);

    boolean moveUnitOnMap(UnitOnMap unit, Point newPosition);

    boolean increaseSizeOfUnitGroup(UnitOnMap unit);
}
