Stack<File> stack = new Stack<>();
stack.push(rootDirectory);

while (!stack.isEmpty()) {
    File current = stack.pop();
    
    if (current.isFile()) {
        System.out.println(current.getName());
    } else if (current.isDirectory()) {
        for (File file : current.listFiles()) {
            stack.push(file); 
        }
    }
}
