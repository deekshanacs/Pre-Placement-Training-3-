from multiprocessing import Pool
from PIL import Image, ImageFilter

def process_image(img_path):
    with Image.open(img_path) as img:
        img = img.filter(ImageFilter.GAUSSIAN_BLUR)
        img.save(f"processed_{img_path}")

if __name__ == "__main__":
    images = ["img1.jpg", "img2.jpg", "img3.jpg"]
    with Pool() as pool:
        pool.map(process_image, images)
