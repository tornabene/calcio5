$(function() {

	function getContextPath() {
		   return window.location.pathname.substring(0, window.location.pathname.indexOf("/",2));
		}
 	var url = "/v2/api-docs";

	// Pre load translate...
	if (window.SwaggerTranslator) {
		window.SwaggerTranslator.translate();
	}
	window.swaggerUi = new SwaggerUi({
		url : url,
		dom_id : "swagger-ui-container",
		supportedSubmitMethods : [ 'get', 'post', 'put', 'delete', 'patch' ],
		onComplete : function(swaggerApi, swaggerUi) {
			if (typeof initOAuth === "function") {
				initOAuth({
					clientId : "your-client-id",
					clientSecret : "your-client-secret",
					realm : "your-realms",
					appName : "your-app-name",
					scopeSeparator : ","
				});
			}

			if (window.SwaggerTranslator) {
				window.SwaggerTranslator.translate();
			}

			$('pre code').each(function(i, e) {
				hljs.highlightBlock(e)
			});
		},
		onFailure : function(data) {
			log("Unable to Load SwaggerUI");
		},
		docExpansion : "none",
		apisSorter : "alpha",
		showRequestHeaders : false
	});

	function addApiKeyAuthorization() {

		var authToken = JSON.parse(localStorage.getItem("ls.token")).access_token; //NOSONAR
		var apiKeyAuth = new SwaggerClient.ApiKeyAuthorization("Authorization",
				"Bearer " + authToken, "header");
		window.swaggerUi.api.clientAuthorizations.add("key", apiKeyAuth);

	}

	function getCSRF() {
		var name = "CSRF-TOKEN=";
		var ca = document.cookie.split(';');
		for (var i = 0; i < ca.length; i++) {
			var c = ca[i];
			while (c.charAt(0) === ' ')
				c = c.substring(1);
			if (c.indexOf(name) !== -1)
				return c.substring(name.length, c.length);
		}
		return "";
	}

	window.swaggerUi.load();

	addApiKeyAuthorization();

	function log() {
		if ('console' in window) {
			console.log.apply(console, arguments);
		}
	}
});