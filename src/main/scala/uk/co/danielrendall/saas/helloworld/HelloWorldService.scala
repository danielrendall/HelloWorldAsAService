package uk.co.danielrendall.saas.helloworld

import fi.iki.elonen.NanoHTTPD.Response
import fi.iki.elonen.NanoHTTPD.Response.Status
import uk.co.danielrendall.saas.interfaces.{ResponseFactory, ServiceMetadata, ServiceSession, ServiceableSupport}

class HelloWorldService extends ServiceableSupport:

  override val getMetadata: ServiceMetadata = ServiceMetadata("HelloWorld")

  override def get(session: ServiceSession, first: String, rest: List[String])
                  (implicit responseFactory: ResponseFactory): Response =
    responseFactory.newFixedLengthResponse(Status.OK, "text/plain", s"Hello World! You chose '$first'")
