import gleeunit
import gleeunit/should
import is_even

pub fn main() {
    gleeunit.main()
}

pub fn is_even_test() {
    is_even.is_even(0)
    |> should.equal(True)

    is_even.is_even(2)
    |> should.equal(True)

    is_even.is_even(4)
    |> should.equal(True)

    is_even.is_even(-60)
    |> should.equal(True)
}

pub fn is_even_test_odd() {
    is_even.is_even(1)
    |> should.equal(False)

    is_even.is_even(3)
    |> should.equal(False)

    is_even.is_even(5)
    |> should.equal(False)

    is_even.is_even(-61)
    |> should.equal(False)
}
