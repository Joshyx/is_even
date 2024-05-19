/**
 * Returns true if the number is even, false otherwise.
 * @param {number} num - The number to check.
 * @returns {boolean} - True if the number is even, false otherwise.
 * @throws {TypeError} - If the argument is not a number.
 * @throws {RangeError} - If the number is not an integer.
 * @throws {RangeError} - If the number is not a valid number.
 */
exports.isEven = function(num) {
    if (typeof num !== 'number') {
        throw new TypeError('The argument must be a number.');
    }
    if (!Number.isInteger(num)) {
        throw new RangeError('The number must be an integer.');
    }
    if (isNaN(num)) {
        throw new RangeError('The number must be a valid number.');
    }
    return num % 2 === 0;
}
