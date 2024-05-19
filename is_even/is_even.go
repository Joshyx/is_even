package iseven

// IsEven checks if a given integer is even.
//
// This function takes an integer of type `int` and returns a boolean value.
// It returns `true` if the integer is even (i.e., divisible by 2 with no remainder), and `false` otherwise.
//
// Examples:
//
//	value := 4
//	fmt.Println(IsEven(value)) // Output: true
//
//	value = 3
//	fmt.Println(IsEven(value)) // Output: false
//
// Parameters:
// - value: The integer to check.
//
// Returns:
// - true if the integer is even.
// - false if the integer is odd.
//
// See: Number Parity (https://en.wikipedia.org/wiki/Parity_(mathematics))
func IsEven(value int) bool {
	return value%2 == 0
}
