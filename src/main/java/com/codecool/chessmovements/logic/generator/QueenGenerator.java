package com.codecool.chessmovements.logic.generator;

import com.codecool.chessmovements.data.Position;

import java.util.ArrayList;
import java.util.List;

public class QueenGenerator implements MovementGenerator{
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

        // Generate moves towards the top
        for (int i = current.y() + 1; i <= 7; i++) {
            moves.add(new Position(current.x(), i));
        }

        // Generate moves towards the bottom
        for (int i = current.y() - 1; i >= 0; i--) {
            moves.add(new Position(current.x(), i));
        }

        // Generate moves towards the right
        for (int i = current.x() + 1; i <= 7; i++) {
            moves.add(new Position(i, current.y()));
        }

        // Generate moves towards the left
        for (int i = current.x() - 1; i >= 0; i--) {
            moves.add(new Position(i, current.y()));
        }





        return moves;
    }

    @Override
    public String getType() {
        return "Queen";
    }
}
