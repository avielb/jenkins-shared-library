def call(String podLabel, code) {
	containerTemplate(name: 'maven', image: 'maven:3.6.0-jdk-8-alpine', ttyEnabled: true, command: 'cat') {
		code()
	}
}
