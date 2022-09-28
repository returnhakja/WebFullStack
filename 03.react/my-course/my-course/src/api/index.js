import data from './mock.json';

export function filterByKeyword(items, keyword) {
	const lowered = keyword.toLowerCase();
	return items.filter(({ title }) => title.toLowerCase().includes(lowered));
}

export function getCourses(keyword) {
	if (!keyword) return data;
	return filterByKeyword(data, keyword);
}

export function getCourseBySlug(courseSlug) {
	return data.find((course) => course.slug === courseSlug);
}

const WISHLIST_KEY = 'course-wishlist';
const wishlist = JSON.parse(localStorage.getItem(WISHLIST_KEY) || '{}');

export function addWishlist(courseSlug) {
	wishlist[courseSlug] = true;
	localStorage.setItem(WISHLIST_KEY, JSON.stringify(wishlist));
}

export function deleteWishlist(courseSlug) {
	delete wishlist[courseSlug];
	localStorage.setItem(WISHLIST_KEY, JSON.stringify(wishlist));
}

export function getWishlist() {
	return data.filter((course) => wishlist[course.slug]);
}
