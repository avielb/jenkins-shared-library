def call(String podLabel, code) {
	podTemplate(containers: [containerTemplate(name: 'centos', image: 'centos:7', ttyEnabled: true, command: '/bin/bash')]) {
		code()
	}
}
