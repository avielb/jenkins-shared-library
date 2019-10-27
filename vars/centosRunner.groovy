def call(String podLabel, code) {
	podTemplate(label: podLabel, containers: [containerTemplate(name: 'centos', image: 'centos', ttyEnabled: true)]) {
		code()
	}
}
