module no.bekk.myapp {
	requires no.bekk.api;
	provides no.bekk.api.Api with no.bekk.myapp.MyApp;
}