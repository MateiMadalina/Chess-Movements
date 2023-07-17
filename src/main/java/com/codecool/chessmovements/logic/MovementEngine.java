package com.codecool.chessmovements.logic;

import com.codecool.chessmovements.data.Position;
import com.codecool.chessmovements.logic.generator.MovementGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovementEngine {

    private final List<MovementGenerator> movementGenerators;
    private final ChessBoardBoundaries boardBoundaries;

    public MovementEngine(List<MovementGenerator> movementGenerators, ChessBoardBoundaries boardBoundaries) {
        this.movementGenerators = movementGenerators;
        this.boardBoundaries = boardBoundaries;
    }

    public List<Position> generate(String type, Position current) {
        List<Position> moves = new ArrayList<>();

        for (MovementGenerator movementGenerator : movementGenerators) {
            if (movementGenerator.getType().equals(type)) {
                moves.addAll(movementGenerator.generate(current));
            }
        }

        List<Position> validMoves = new ArrayList<>();
        for (Position move : moves) {
            if (boardBoundaries.fits(move)) {
                validMoves.add(move);
            }
        }

        return validMoves;
    }

}
