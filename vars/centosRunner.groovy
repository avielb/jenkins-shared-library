def call(String podLabel, code) {
	podTemplate(containers: [containerTemplate(name: 'centos', image: 'centos', ttyEnabled: true, command: 'cat')]) {
		code()
	}
}
