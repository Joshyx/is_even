//! A module that provides a function to check if a number is even.
const std = @import("std");
const testing = std.testing;

/// Check if a number is even.
/// arg value: The number to check.
/// return: True if the number is even, false otherwise.
///
/// # Example
/// ```zig
/// const is_even = @import("is_even");
/// const std = @import("std");
/// const assert = std.testing;
/// assert.expect(is_even.isEven(2));
/// assert.expect(!is_even.isEven(3));
/// ```
export fn isEven(value: i32) bool {
    return @rem(value, 2) == 0;
}

test "is the number even" {
    try testing.expect(isEven(2));
    try testing.expect(!isEven(3));
    try testing.expect(isEven(48));
    try testing.expect(!isEven(49));
    try testing.expect(isEven(0));
    try testing.expect(isEven(-2));
    try testing.expect(!isEven(-3));
}
