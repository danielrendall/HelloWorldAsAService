# Hello World as a Service

A sample Hello World service which can be deployed to the  [Services-as-a-Service server](https://github.com/danielrendall/ServicesAsAService)

## Usage

More documentation to come, but essentially you run the sbt "assembly" task to
create an "assembled" version of this JAR, which you can then PUT to the
_service endpoint on your running server thus:

```shell
curl -XPUT --data-binary @the_assembled_jar.jar http://localhost:1810/_service/hello
```

Having done that, you should be able to retrieve a Hello World message with:

```shell
curl http://localhost:1810/hello/
```

## Status

* Write extensive unit tests and exquisitely detailed documentation
