package com.codecool.chessmovements.logic;

import com.codecool.chessmovements.data.Position;
import com.codecool.chessmovements.logic.generator.MovementGenerator;

import java.util.List;

public class MovementEngine {

    private final MovementGenerator generator;
    private final ChessBoardBoundaries boardBoundaries;

    public MovementEngine(MovementGenerator generator, ChessBoardBoundaries boardBoundaries) {
        this.generator = generator;
        this.boardBoundaries = boardBoundaries;
    }

    public List<Position> generate(String type, Position current) {
     List<Position> possibleMoves = generator.generate(current);
     List<Position> finalMoves = null;

        for (int i = 0; i < possibleMoves.size(); i++) {
            if(boardBoundaries.fits(possibleMoves.get(i))){
                finalMoves.add(possibleMoves.get(i));
            }
        }

        return finalMoves;
    }
}
