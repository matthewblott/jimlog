# Jimlog

The project name is a play on the words Gym and log. This is a pretty basic gym logging application.

To get started first clone the repository:
```bash
git clone https://github.com/matthewblott/jimlog
```

The back end server is a Rails application in the `web` folder, `cd` into this folder first:
```bash
cd jimlog/web
```

First install the dependencies:
```bash
bundle install
```

Perform the necessary migrations:
```bash
rails db:migrate:auth
rails db:migrate:tenant
```

Now you should be good to go:
```
rails server
```

Browse to the default Rails development endpoint `http://localhost:3000` and you will see Jimlog's splash page.

The `ios` and `android` projects should just work if you have up to date Xcode and Android Studio versions installed.
