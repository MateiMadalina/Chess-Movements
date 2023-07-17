package com.codecool.chessmovements.logic.generator;

import com.codecool.chessmovements.data.Position;

import java.util.ArrayList;
import java.util.List;

public class RockMovements implements MovementGenerator{
    @Override
    public List<Position> generate(Position current) {
        List<Position> moves = new ArrayList<>();

        // Generate moves towards the top
        for (int y = current.y() + 1; y <= 7; y++) {
            moves.add(new Position(current.x(), y));
        }

        // Generate moves towards the bottom
        for (int y = current.y() - 1; y >= 0; y--) {
            moves.add(new Position(current.x(), y));
        }

        // Generate moves towards the right
        for (int x = current.x() + 1; x <= 7; x++) {
            moves.add(new Position(x, current.y()));
        }

        // Generate moves towards the left
        for (int x = current.x() - 1; x >= 0; x--) {
            moves.add(new Position(x, current.y()));
        }

        return moves;
    }

    @Override
    public String getType() {
        return "Rook";
    }
}
