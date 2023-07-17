package com.codecool.chessmovements.logic.generator;

import com.codecool.chessmovements.data.Position;

import java.util.ArrayList;
import java.util.List;

public class BishopGenerator implements MovementGenerator{
    @Override
    public List<Position> generate(Position current) {
        List<Position> moves = new ArrayList<>();

        // Generate moves towards the top-right diagonal
        int x = current.x() + 1;
        int y = current.y() + 1;
        while (x <= 7 && y <= 7) {
            moves.add(new Position(x, y));
            x++;
            y++;
        }

        // Generate moves towards the top-left diagonal
        x = current.x() - 1;
        y = current.y() + 1;
        while (x >= 0 && y <= 7) {
            moves.add(new Position(x, y));
            x--;
            y++;
        }

        // Generate moves towards the bottom-left diagonal
        x = current.x() - 1;
        y = current.y() - 1;
        while (x >= 0 && y >= 0) {
            moves.add(new Position(x, y));
            x--;
            y--;
        }

        // Generate moves towards the bottom-right diagonal
        x = current.x() + 1;
        y = current.y() - 1;
        while (x <= 7 && y >= 0) {
            moves.add(new Position(x, y));
            x++;
            y--;
        }

        return moves;
    }

    @Override
    public String getType() {
        return "Bishop";
    }
}
