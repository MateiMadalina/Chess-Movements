package com.codecool.chessmovements.logic;

import com.codecool.chessmovements.data.Position;
import com.codecool.chessmovements.logic.generator.MovementGenerator;

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
        List<Position> moves = null;

        for (MovementGenerator movementGenerator : movementGenerators) {
            if (movementGenerator.getType().equals(type)) {
                moves = movementGenerator.generate(current);
            }
        }
        for (int i = 0; i < moves.size(); i++) {
            if(!boardBoundaries.fits(moves.get(i))){
                moves.remove(moves.get(i));
            }
        }
        return moves;
    }
}
