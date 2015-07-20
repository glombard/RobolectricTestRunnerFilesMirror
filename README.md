# Gradle task to update maven settings

This shows how to create a custom gradle task(s) to automatically update your `~/.m2/settings.xml` file to add a mirror for sonatype.

See [app/build.gradle](app/build.gradle).

The problem is that Robolectric's test runner [downloads](https://github.com/robolectric/robolectric/blob/master/robolectric/src/main/java/org/robolectric/internal/dependency/MavenDependencyResolver.java)
files from https://oss.sonatype.org/content/groups/public/ at run-time. This can be a problem if your CI server doesn't have access the internet and you want to download the Robolectric run-time files via your own local Artifactory/Nexus mirror server.

See other options [here](http://codeblast.com/2015/05/13/using-robolectric-in-offline-mode/).
