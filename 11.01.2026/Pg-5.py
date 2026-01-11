import os
import shutil

def organize_folder(path):
    for filename in os.listdir(path):
        if os.path.isfile(os.path.join(path, filename)):
            ext = filename.split('.')[-1].upper()
            dest_dir = os.path.join(path, f"{ext}_Files")
            
            if not os.path.exists(dest_dir):
                os.makedirs(dest_dir)
            
            shutil.move(os.path.join(path, filename), os.path.join(dest_dir, filename))
            print(f"Moved: {filename} -> {dest_dir}")

