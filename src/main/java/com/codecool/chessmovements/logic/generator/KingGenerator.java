package com.codecool.chessmovements.logic.generator;

import com.codecool.chessmovements.data.Position;

import java.util.List;

public class KingGenerator implements MovementGenerator{
    @Override
    public List<Position> generate(Position current) {
        List<Position> moves = List.of(
                                new Position(current.x() - 1, current.y() -1),
                                new Position(current.x(), current.y() -1),
                                new Position(current.x() + 1, current.y() -1),
                                new Position(current.x() - 1, current.y()),
                                new Position(current.x(), current.y()),
                                new Position(current.x() + 1, current.y()),
                                new Position(current.x() - 1, current.y() + 1),
                                new Position(current.x(), current.y() + 1),
                                new Position(current.x() + 1, current.y() + 1)
                                );
        return moves;
    }

    @Override
    public String getType() {
        return "King";
    }
}
