# Lint Git
With [conventional commit](https://conventionalcommits.org/) rules
Branch:
 - master: for production (protect)
 - canary: for beta (protect)
 - staging: for testing (protect)
 - develop: for dev (protect). Create PR befor merge branches
 - feature/***: for dev
 - hotfixes/v{version}: for hot hotfixes
 - bugfix/branch_name: for fix bug

---

## Conventional commit
```
<type>[optional scope]: <description>

[optional body]

[optional footer]
```
- *type* must be one of `build, chore, ci, docs, feat, fix, perf, refactor, revert, style, test`
- *scope* would be context of commit:
```
feat(lang): added polish language
refactor(home): cleanup dashboard service
```
- *description* is a short description of the code changes, no more than 50 chars


**Language:**
- Kotlin
- Convention: https://kotlinlang.org/docs/reference/coding-conventions.html

**Architecture:**
- MVVM 
- Clean Architecture
https://proandroiddev.com/multiple-ways-of-defining-clean-architecture-layers-bbb70afa5d4a

**Resource Naming**
- https://jeroenmols.com/blog/2016/03/07/resourcenaming/
- https://github.com/ribot/android-guidelines/blob/master/project_and_code_guidelines.md

**Dependency Injection:**
- Koin 
- https://insert-koin.io

**MQTT:**
- Paho Eclipse
- https://github.com/eclipse/paho.mqtt.android

**Networking:**
- Glide ( https://github.com/bumptech/glide )
- Retrofit ( https://square.github.io/retrofit )

**ReactiveX**
- Rxjava, RxKotlin

**Analytics, Tracking, Bug-report**
- Firebase
- Crashlytics
- Firebase Performance

**Android Jetpack Component:**
*  Room - Local database
*  Databinding
*  Live data
*  Notifications
*  Android KTX
*  Work Manager
*  Coroutines
*  Navigation

**Module graph:**
* MacOS:
* 1. Install: `brew install graphviz`
* 2. Run command: `./gradlew projectDependencyGraph`

* Window:
* 1. Install: Download here: https://graphviz.gitlab.io/download/
  2. Setup env:
![EVN](/readme/graphviz_1.png)

![EVN](/readme/graphviz_2.png)

  3. Run command: `gradlew projectDependencyGraph`

* Project module dependency graph created at ~/build/reports/dependency-graph/project.dot.png

**Check update dependencies**
* Run command: `./gradlew dependencyUpdates`
* File report created at ~/build/dependencyUpdates/report.txt

