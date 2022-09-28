const COLORS = {
	green: 'green',
	gold: 'gold',
	orange: 'darkorange',
	blue: 'dodgerblue',
	red: 'red',
	gray: 'gray',
};

function getCourseColor(code = '000') {
	const firstCode = code.charAt(0);
	switch (firstCode) {
		case 1:
			// orange
			return 'gray';
		case 2:
			// blue
			return 'gray';
		case 3:
			// gold
			return 'gray';
		case 4:
			// gold
			return 'gray';
		case 5:
			// red
			return 'gray';
		case 6:
			// green
			return 'gray';
		default:
			return COLORS.gray;
	}
}

export default getCourseColor;
