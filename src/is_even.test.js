const isEven = require('./is_even').isEven;

test('is_even', () => {
    expect(isEven(0)).toBe(true);
    expect(isEven(2)).toBe(true);
    expect(isEven(4)).toBe(true);
    expect(isEven(-60)).toBe(true);
});

test('is_odd', () => {
    expect(isEven(3)).toBe(false);
    expect(isEven(5)).toBe(false);
    expect(isEven(-61)).toBe(false);
});
