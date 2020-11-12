## Scan project by Sonar

[Installing a local instance of SonarQube](https://docs.sonarqube.org/latest/setup/get-started-2-minutes/)

Download and run Sonar:
1. Download the SonarQube Community Edition zip file.
1. As a non-root user, unzip it, let's say in `C:\sonarqube` or `/opt/sonarqube`.
1. As a non-root user, start the SonarQube Server:
1. On Windows, execute: `C:\sonarqube\bin\windows-x86-64\StartSonar.bat`
1. On other operating systems, as a non-root user execute: `/opt/sonarqube/bin/[OS]/sonar.sh console`
1. Wait message in log `SonarQube is up`

If your instance fails to start, check your logs to find the cause.
1. Log in to `http://localhost:9000` using System Administrator credentials (login=admin, password=admin).

***

Run project scan locally:
1. `mvn clean verify sonar:sonar`
1. Open `http://localhost:9000` and choose `Projects` and see: Bugs, Vulnerabilities, Security Hotspots, Code Smells, Coverage, Duplications

[sonar-scanning-examples](https://github.com/SonarSource/sonar-scanning-examples/tree/master/sonarqube-scanner-maven/maven-basic)