# XPages Build Stubs

This project contains API-compatible-enough non-implementation stubs of various interfaces and classes commonly used to build projects that run in the XPages OSGi environment in HCL Domino. These are meant to be useful as provided dependencies of such projects to avoid the need to redistribute any proprietary code.

## Usage

Release versions are deployed to OpenNTF's Maven server, available as:

```xml
<repositories>
	<repository>
		<id>artifactory.openntf.org</id>
		<name>artifactory.openntf.org</name>
		<url>https://artifactory.openntf.org/openntf</url>
		<releases>
			<enabled>true</enabled>
		</releases>
		<snapshots>
			<enabled>true</enabled>
		</snapshots>
	</repository>
</repositories>
```

## License

The code in the project is licensed under the Apache License 2.0.