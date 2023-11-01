def build() {
  sh 'mvn clean install'
}

def clone(String url, String branch, String projectDirectory) {
    git branch: "${branch}", url: "${url}"

    // Change the working directory to the project directory
    dir("${projectDirectory}") {
        // Execute the 'git clone' command
        bat "git clone ${url}"
    }
}
