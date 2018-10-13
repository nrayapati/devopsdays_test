def prepare() {
    echo "Prepare: ${whoAreYou}! You loaded this from Git!"
}

def release(String whoAreYou) {
    echo "Release: ${whoAreYou}! You loaded this from Git!"
}

def clean() {
    echo "Clean: You loaded this from Git!"
}

return this;