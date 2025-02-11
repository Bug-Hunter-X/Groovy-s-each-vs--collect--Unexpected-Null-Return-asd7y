# Groovy's `each` vs. `collect` Unexpected Null Return

This example demonstrates a common pitfall in Groovy when using the `each` method. Unlike `collect`, `each` doesn't return a modified collection, which can lead to unexpected `null` values if you're not careful.

The `bug.groovy` file showcases the problem. The solution in `bugSolution.groovy` demonstrates how to use `collect` to achieve the desired outcome. This is a great example of how to avoid this common error in groovy programming.