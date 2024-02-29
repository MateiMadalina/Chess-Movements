# Chess Movements

## About project

This Java project implements a flexible chess engine capable of generating movements for various chess pieces. The project focuses on creating a simple yet extensible chess engine capable of generating movements for different chess pieces. Each piece's movement logic is encapsulated within dedicated classes, ensuring that the engine remains open for extension while closed for modification.

## Features

- **Basic Ground Movement:** The engine can generate simple movements like forward, backward, left, and right for pawns.
- **Diagonal Movement:** Functionality extends to include diagonal movements for certain pieces.
- **Air Movement:** The engine simulates flying movements for specific pieces, such as up and down.
- **Test Coverage:** Comprehensive unit tests ensure the functionality and maintainability of the codebase.

## Tasks
### Engine Closed for Modification
- The `MovementEngine` class serves as the core of the engine, providing possible moves for any piece at any position.
- The class is implemented to allow for easy extension to new piece types without modifying existing code.
- Moves outside the chessboard limits are appropriately filtered by the `MovementEngine`.

### Implemented Pawn
- The `PawnGenerator` class returns a single forward move for a white pawn.
- Moves outside the chessboard limits are filtered by the `MovementEngine`.

### Implemented King
- The `KingGenerator` class returns a single forward move in all directions for a king.
- Moves outside the chessboard limits are filtered by the `MovementEngine`.

### Implemented Knight
- The `KnightGenerator` class returns all possible "L-shaped" moves for a knight.
- Moves outside the chessboard limits are filtered by the `MovementEngine`.

### Implemented Bishop
- The `BishopGenerator` class returns all diagonal moves with the maximum length of the board size for a bishop.
- Moves outside the chessboard limits are filtered by the `MovementEngine`.

### Implemented Rook
- The `RookGenerator` class returns all horizontal and vertical moves with the maximum length of the board size for a rook.
- Moves outside the chessboard limits are filtered by the `MovementEngine`.

### Implemented Queen
- The `QueenGenerator` class returns all horizontal, vertical, and diagonal moves with the maximum length of the board size for a queen.
- Moves outside the chessboard limits are filtered by the `MovementEngine`.

### Tested the Engine
- The overall behavior of the `MovementEngine` is thoroughly tested with parameterized unit tests based on given parameters.

## Additional Notes
- The project focuses solely on generating movements without considering special rules or game logic beyond the basic movement rules of chess.

