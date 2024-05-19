package iseven

import "testing"

func TestIsEven(t *testing.T) {
	tests := []struct {
		name  string
		value int
		want  bool
	}{
		{
			name:  "Even number",
			value: 4,
			want:  true,
		},
		{
			name:  "Odd number",
			value: 3,
			want:  false,
		},
		{
			name:  "Zero",
			value: 0,
			want:  true,
		},
		{
			name:  "Negative even number",
			value: -4,
			want:  true,
		},
		{
			name:  "Negative odd number",
			value: -3,
			want:  false,
		},
	}

	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			got := IsEven(tt.value)
			if got != tt.want {
				t.Errorf("IsEven(%d) = %v; want %v", tt.value, got, tt.want)
			}
		})
	}
}
