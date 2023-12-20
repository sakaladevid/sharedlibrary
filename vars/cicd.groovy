def ContDownload(repo)
     {
            git "https://github.com/sakaladevid/${repo}.git"
     }
def ContBuild()
{
      sh 'mvn package'
}





























































  
