job ('nodejs')
{
    scm {
        git('https://github.com/jedrzwi1/node-training.git') { node ->
            node / gitConfigName('Some name')
            node / gitConfigEmail('jenkins@jenkins-dsl.com')
        }
    }

    triggers {
        scm('H/5 * * * *')
    }

    wrappers {
        nodejs('nodejs')
    }

    steps {
        shell('node app.js')
    }

}