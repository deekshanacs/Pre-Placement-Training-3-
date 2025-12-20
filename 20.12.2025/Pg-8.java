int low = 0, high = ids.length - 1;
while (low <= high) {
    int mid = low + (high - low) / 2;
    
    if (ids[mid] == target) return mid; 
    
    if (ids[mid] < target) low = mid + 1; 
    else high = mid - 1;
}
