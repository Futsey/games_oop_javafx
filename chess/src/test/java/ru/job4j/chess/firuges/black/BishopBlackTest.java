package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack bishop = new BishopBlack(Cell.A1);
        BishopBlack expected = new BishopBlack(Cell.A1);
        assertThat(bishop.position(), is(expected.position()));
    }

    @Test
    public void copy() {
        BishopBlack bishop = new BishopBlack(Cell.A1);
        BishopBlack expected = new BishopBlack(Cell.A4);
        assertThat(bishop.copy(Cell.A4).position(), is(expected.position()));
    }

    @Test
    public void way() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        assertThat(bishop.way(Cell.G5), is(new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5}));
    }

    @Test
    public void anotherWay() {
        BishopBlack bishop = new BishopBlack(Cell.A1);
        assertThat(bishop.way(Cell.D4), is(new Cell[] {Cell.B2, Cell.C3, Cell.D4}));
    }
}