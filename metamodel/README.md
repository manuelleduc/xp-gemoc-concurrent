# Metamodel
## Definition


### Primitives de définition de flot d'execution
**Concurrent A B =** Non déterminisme entre A et B (facile a définir en SOS)
**Message A X =** Envoie du message X au bloc concurrent A
**Receive A =** Attend un message, pattern matching pour savoir qu'en faire.
            Attendre plusieurs message se fait de manière récursive.

**Finish Z** où Z est un ensemble d'expressions = attend la fin de TOUTES les expressions sous-jacentes avant de donner la main


Un message envoyé a une address qui n'existe pas est ignoré.

### Example GX10


Async A; B = Concurrent A B

Finish = #TODO





### Example Erlang

Actor = #TODO

### Example ReactiveML
