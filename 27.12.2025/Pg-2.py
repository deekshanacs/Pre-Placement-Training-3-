def analyze_grades(raw_scores):
    valid_scores = [score for score in raw_scores if 0 <= score <= 100]
    if not valid_scores:
        print("No valid scores found.")
        return

    average_score = sum(valid_scores) / len(valid_scores)
    highest_score = max(valid_scores)
    lowest_score = min(valid_scores)

    print(f"Raw Input: {raw_scores}")
    print(f"Valid Scores: {valid_scores}")
    print(f"Class Average: {average_score:.2f}")
    print(f"Range: {lowest_score} - {highest_score}")
class_scores = [85, 92, -5, 78, 105, 88, 90]
analyze_grades(class_scores)
