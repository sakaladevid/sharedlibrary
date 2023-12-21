def ContDownload(repo)
     {
            git "https://github.com/sakaladevid/${repo}.git"
     }
def ContBuild()
{
      sh 'mvn package'
}

def ContDeploy(jobname,ip,Context)
{
    sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war   ubuntu@${ip}:/var/lib/tomcat9/webapps/${Context}.war"
}































































  
