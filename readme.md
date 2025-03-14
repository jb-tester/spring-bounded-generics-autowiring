injection of generic-type components (by type or by type+name):

https://youtrack.jetbrains.com/issue/IDEA-358446/Spring-support-the-bounded-generics-injection-properly - mostly fixed;

Actually:

- for all beans injected as bounded generics there is no navigation from bean to injection point:
  AutowiredIn list is empty, NavigateToAutowiredCandidates does nothing
  https://youtrack.jetbrains.com/issue/IDEA-358446/Spring-support-the-bounded-generics-injection-properly
- autowiring problems for qualified nested generics 
  https://youtrack.jetbrains.com/issue/IDEA-369255/Spring-autowiring-problems-in-case-of-qualified-collections-of-generics
