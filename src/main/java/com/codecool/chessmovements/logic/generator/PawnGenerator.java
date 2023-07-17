package com.codecool.chessmovements.logic.generator;

import com.codecool.chessmovements.data.Position;

import java.util.Collections;
import java.util.List;

public class PawnGenerator implements MovementGenerator{
    @Override
    public List<Position> generate(Position current) {
        Position move = new Position(current.x(), current.y() + 1);
        return Collections.singletonList(move);
    }

    @Override
    public String getType() {
        return "Pawn";
    }
}
