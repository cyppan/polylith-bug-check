`poly check` considers the schema.core library as a Polylith component, and so prevents any use outside the "interface" namespace.

But the schema.core namespace is actually owned by an external library (prismatic/schema), it looks like there is a wrong mix with the local "schema" component (`me.cyppan.schema.interface`). 

```
->  clj -M:poly check
Error 101: Illegal dependency on namespace schema.core in api.core. Use schema.interface instead to fix the problem.
```