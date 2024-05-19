import unittest


def is_even(n: int) -> bool:
    """
    Return True if n is even, False otherwise.

    Takes:
        n: int
    Returns: bool
    """
    return n % 2 == 0


class TestStringMethods(unittest.TestCase):

    def test_even(self):
        self.assertTrue(is_even(0))
        self.assertTrue(is_even(2))
        self.assertTrue(is_even(4))
        self.assertTrue(is_even(62))
        self.assertTrue(is_even(-100))

    def test_odd(self):
        self.assertFalse(is_even(1))
        self.assertFalse(is_even(3))
        self.assertFalse(is_even(61))
        self.assertFalse(is_even(-101))


if __name__ == '__main__':
    unittest.main()
