/// Checks if a given integer is even.
///
/// This function takes an integer of type `isize` and returns a boolean value.
/// It returns `true` if the integer is even (i.e., divisible by 2 with no remainder), and `false` otherwise.
///
/// # Examples
///
/// ```
/// use is_even::is_even;
/// let value = 4;
/// assert!(is_even(value));
///
/// let value = 3;
/// assert!(!is_even(value));
/// ```
///
/// # Parameters
/// - `value`: The integer to check.
///
/// # Returns
/// - `true` if the integer is even.
/// - `false` if the integer is odd.
///
/// # Panics
/// The function does not panic under any circumstances.
///
/// # Errors
/// The function does not return a `Result` type and does not return an error.
///
/// # Safety
/// The function does not use unsafe code.
///
/// # Mutability
/// The function does not require mutable arguments.
///
/// # Performance
/// The function is optimized for performance and does not allocate memory on the heap.
/// It uses the modulo operator to check if the integer is even.
/// The function is expected to run in constant time, O(1).
/// The function is expected to run in constant space, O(1).
///
/// See: Number parity, https://en.wikipedia.org/wiki/Parity_(mathematics)
pub fn is_even(value: isize) -> bool {
    value % 2 == 0
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn number_is_event() {
        assert!(is_even(22), "22 should be even");
        assert!(is_even(0), "0 should be even");
        assert!(is_even(-4), "-4 should be even");
    }
    #[test]
    fn number_is_not_even() {
        assert!(!is_even(1), "1 should not be even");
        assert!(!is_even(3), "3 should not be even");
        assert!(!is_even(-5), "-5 should not be even");
    }
}
